package main;






import java.sql.SQLException;
import java.util.Date;
//import java.util.List;
import java.util.List;

//import controller.ProjectController;
import controller.TaskController;
//import model.Project;
import model.Task;

public class Main {

	public Main() {
	}

	public static void main(String[] args)throws SQLException {
		/** 
		ProjectController projectController = new ProjectController();;
		Project project =  new Project();
		project.setNome("projeto de teste");
		project.setDescricao("Descrição");
		projectController.save(project);
	
		
		Project project = new Project();
		projectController.RemoveById(3);
		project.setNome("NovoNome");
		project.setDescricao("DESCRIÇÃO NOVA");
		project.setId(3);
		projectController.update(project);
		List<Project> projects = projectController.getAll();
		System.out.println("Total _de _projetos no _banco = "+ projects.size());
		
		
		
		TaskController taskController = new TaskController();;
		Task task = new Task();
		task.setIdProject(1);
		task.setNome("CRIAR TELAS");
		task.setDescricao("aaaaa");
		task.setNotes("Sem notas");
		task.setCompleted(false);
		task.setDeadline(new Date());
		taskController.save(task);
		
		task.setNome("Alterar tela");
		taskController.update(task);
		taskController.save(task);
		
		List<Task> tasks = taskController.getAll(5);
		System.out.println("Total de tarefas cadastradas = "+ tasks.size());

		TaskController  taskController = new TaskController();;
		Task task = new Task();
		
		
		task.setIdProject(1);
		task.setNome("BBB");
		taskController.update(task);
		taskController.save(task);
		
		*/
		
		
		
	}

}
