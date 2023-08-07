package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Task;
import utils.ConnectionFactory;

public class TaskController {

	public void save(Task task) {
		String sql = "INSERT INTO tasks (idProject," + "nome," + "descricao," + "completed," + "notes," + "deadline,"
				+ "createAT," + "updateAT) VALUES (?,?,?,?,?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, task.getIdProject());
			statement.setString(2, task.getNome());
			statement.setString(3, task.getDescricao());
			statement.setBoolean(4, task.isCompleted());
			statement.setString(5, task.getNotes());
			statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
			statement.setDate(7, new java.sql.Date(task.getCreateAT().getTime()));
			statement.setDate(8, new java.sql.Date(task.getUpdateAT().getTime()));
			statement.execute();
		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao SALVAR tarefa" , ex);
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}

	}

	public void update(Task task) {

		String sql = "UPDATE tasks SET idProject = ?, nome = ?, descricao = ?, completed = ?, notes = ?, deadline = ?, createAT = ?, updateAT = ?  WHERE id =?";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// Estabalencendo_aconexão_com_o_banco_de_dados
			connection = ConnectionFactory.getConnection();
			// Preparando_a_QUERY
			statement = connection.prepareStatement(sql);
			// Setando_valores_do_statement
			statement.setInt(1, task.getIdProject());
			statement.setString(2, task.getNome());
			statement.setString(3, task.getDescricao());
			statement.setBoolean(4, task.isCompleted());
			statement.setString(5, task.getNotes());
			statement.setDate(6, new Date(task.getDeadline().getTime()));
			statement.setDate(7, new Date(task.getCreateAT().getTime()));
			statement.setDate(8, new Date(task.getUpdateAT().getTime()));
			statement.setInt(9, task.getId());
			// Executa_QUERY
			statement.execute();

		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao executar o UPDATE", ex);
		} finally {
			ConnectionFactory.closeConnection(connection, statement);

		}
	}

	
	
	
	public List<Task> getAll(int idProject) {

		String sql = "SELECT * FROM tasks WHERE idProject = ?";

		List<Task> tasks = new ArrayList<Task>();
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		// tarefa_que _sera _devolvida _quando _chamar _o _metodo _acontecer
		

		try {
			// Estabalencendo_aconexão_com_o_banco_de_dados
			connection = ConnectionFactory.getConnection();
			// Preparando_a_QUERY
			statement = connection.prepareStatement(sql);
			// setando_o_valor_que_corresponde_ao_filtro_de_busca
			statement.setInt(1, idProject);

			// Valor_retornado_pela_execuxão_QUERY
			resultSet = statement.executeQuery();
			// Enquanto_houver_valores_no_ResultSet
			while (resultSet.next()) {
				
				Task task = new Task();
				
				task.setId(resultSet.getInt("id"));
				task.setIdProject(resultSet.getInt("idProject"));
				task.setNome(resultSet.getString("nome"));
				task.setDescricao(resultSet.getString("descricao"));
				task.setNotes(resultSet.getString("notes"));
				task.setCompleted(resultSet.getBoolean("completed"));
				task.setDeadline(resultSet.getDate("deadline"));
				task.setCreateAT(resultSet.getDate("createAT"));
				task.setUpdateAT(resultSet.getDate("updateAT"));

				tasks.add(task);/**/

			}

		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao executar TAREFA" , ex);

		} finally {
			ConnectionFactory.closeConnection(connection, statement, resultSet);
		}
		// Lista_de _tarefa _que _foi _criada e _carregada _do _banco _de _dados
		return tasks;
	}
	
	

	public void RemoveById(int taskId) throws SQLException {
		String sql = "DELETE FROM tasks WHERE id = ? ";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// Estabalencendo_aconexão_com_o_banco_de_dados
			connection = ConnectionFactory.getConnection();
			// Preparando_a_QUERY
			statement = connection.prepareStatement(sql);
			// Setando_valores_do_statement
			statement.setInt(1, taskId);
			// Executa_QUERY
			statement.execute();

		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao DELETAR a tarefa" , ex);
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
	}

}
