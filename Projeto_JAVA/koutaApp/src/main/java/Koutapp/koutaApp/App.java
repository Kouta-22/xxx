package Koutapp.koutaApp;

import java.sql.Connection;

import controller.ProjectController;
import model.Project;
import utils.ConnectionFactory;

public class App 
{
    public static void main( String[] args ){
    	Connection c = ConnectionFactory.getConnection();
		ProjectController projectController = new ProjectController();;
		
		Project project =  new Project();
		project.setNome("projeto de teste");
		project.setDescricao("Descrição");
		projectController.save(project);
		
    	
    	ConnectionFactory.closeConnection(c);

    }
}
