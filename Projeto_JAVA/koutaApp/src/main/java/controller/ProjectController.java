package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Project;
import utils.ConnectionFactory;

public class ProjectController {

	public void save(Project project) {
		String sql = "INSERT INTO projects (nome," + "descricao," + "createAT," + "updateAT) VALUES (?,?,?,?)";

		Connection connection = null;
		PreparedStatement statement = null;

		try {

			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(sql);

			statement.setString(1, project.getNome());
			statement.setString(2, project.getDescricao());
			statement.setDate(3, new java.sql.Date (project.getCreateAT().getTime()));// O_get.Time_trasforma_o_DATE_em_long
			statement.setDate(4, new java.sql.Date(project.getUpdateAT().getTime()));// Tem_que_converter_em_java_do_mysql
			statement.execute();

		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao salvar tarefa", ex);
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
	}

	public void update(Project project) {
//------
		//////=---=
		///----"UPDATE projects SET nome = ?, descricao = ?, createAT = ?, updateAT = ? WHERE id = ?";
		String sql = "UPDATE projects SET nome = ?, descricao = ?, createAT = ?, updateAT = ? WHERE id = ?";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, project.getNome());
			statement.setString(2, project.getDescricao());
			statement.setDate(3, new java.sql.Date(project.getCreateAT().getTime()));
			statement.setDate(4, new java.sql.Date(project.getUpdateAT().getTime()));
			statement.setInt(5,project.getId());
			statement.execute();
			
		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao ATUALIZAR tarefa" , ex);
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
	}


	public List<Project> getAll() {

		String sql = "SELECT * FROM projects";
		//*******
		List<Project> projects = new ArrayList<Project>();
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		
		try {
			// Estabalencendo_aconexão_com_o_banco_de_dados
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(sql);

			resultSet = statement.executeQuery();
		
			
			while (resultSet.next()) {
				
				Project project = new Project();
						
				
				project.setId(resultSet.getInt("id"));
				project.setNome(resultSet.getString("nome"));
				project.setDescricao(resultSet.getString("descricao"));
				project.setCreateAT(resultSet.getDate("createAT"));
				project.setUpdateAT(resultSet.getDate("updateAT"));

				projects.add(project);/*******/

			}

		} catch (Exception ex) {
			throw new RuntimeException("Erro ao Buscar PROJETO" , ex);

		} finally {
			ConnectionFactory.closeConnection(connection, statement, resultSet);
		}
		return projects;
	}

	
	public void RemoveById(int idProject) {
		//------------
		//----
		String sql = "DELETE FROM projects WHERE id = ? ";

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// Estabalencendo_aconexão_com_o_banco_de_dados
			connection = ConnectionFactory.getConnection();
			// Preparando_a_QUERY
			statement = connection.prepareStatement(sql);
			// Setando_valores_do_statement
			statement.setInt(1, idProject);
			// Executa_QUERY
			statement.execute();
		} catch (SQLException ex) {
			throw new RuntimeException("Erro ao DELETAR a tarefa", ex);
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
	}
	
	
	
}
