package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;

import controller.ProjectController;
import model.Project;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.naming.InitialContext;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProjectDialogScreen extends JDialog {
	 JTextField TFnomeProject;
	 JTextPane TFdescricaoProcjet;
	
	
	
	ProjectController controller;

    public ProjectDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        controller = new ProjectController(); 
        

    }
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProjectDialogScreen dialog = new ProjectDialogScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProjectDialogScreen() {
		getContentPane().setEnabled(false);
		getContentPane().setIgnoreRepaint(true);
		setAutoRequestFocus(false);
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 450, 401);
		
		JPanel JPtoolBaarProjects = new JPanel();
		JPtoolBaarProjects.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		JPtoolBaarProjects.setBackground(new Color(218, 12, 21));
		
		JLabel JLicomSave = new JLabel("");
		JLicomSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Project project = new Project();
					project.setNome(TFnomeProject.getText());
					System.out.println(TFnomeProject.getText());
					project.setDescricao(TFdescricaoProcjet.getText());
					System.out.println(TFdescricaoProcjet.getRootPane());
					controller.save(project);
					JOptionPane.showMessageDialog(rootPane, "Projeto salvo com sucesso");
					dispose();
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(rootPane, ex.getMessage());
				}
				
			}
		});
		JLicomSave.setHorizontalAlignment(SwingConstants.CENTER);
		JLicomSave.setIcon(new ImageIcon("C:\\Users\\guilh\\eclipse-workspace\\koutaApp\\src\\main\\icons\\marca-de-verificacao (1).png"));
		
		JLabel JLtitle = new JLabel("Projetos");
		JLtitle.setFont(new Font("Segoe UI", Font.BOLD, 24));
		
		JPanel JPprojects = new JPanel();
		JPprojects.setVerifyInputWhenFocusTarget(false);
		JPprojects.setIgnoreRepaint(true);
		JPprojects.setInheritsPopupMenu(true);
		JPprojects.setBackground(Color.LIGHT_GRAY);
		JPprojects.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JTextPane TFdescricaoProject = new JTextPane();
		TFdescricaoProject.setFocusCycleRoot(false);
		TFdescricaoProject.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		TFdescricaoProject.setBackground(Color.WHITE);
		TFdescricaoProject.setDisabledTextColor(Color.BLACK);
		TFdescricaoProject.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		TFnomeProject = new JTextField();
		TFnomeProject.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		TFnomeProject.setBackground(Color.WHITE);
		TFnomeProject.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		TFnomeProject.setColumns(10);
		
		JLabel JBnome = new JLabel("Nome");
		JBnome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		JLabel JLdescricao = new JLabel("Descrição");
		JLdescricao.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(JPtoolBaarProjects, GroupLayout.PREFERRED_SIZE, 434, Short.MAX_VALUE)
				.addComponent(JPprojects, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(JPtoolBaarProjects, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addComponent(JPprojects, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
		);
		GroupLayout gl_JPprojects = new GroupLayout(JPprojects);
		gl_JPprojects.setHorizontalGroup(
			gl_JPprojects.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPprojects.createSequentialGroup()
					.addGap(12)
					.addComponent(JBnome, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_JPprojects.createSequentialGroup()
					.addGap(9)
					.addComponent(TFnomeProject, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_JPprojects.createSequentialGroup()
					.addGap(9)
					.addComponent(JLdescricao, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_JPprojects.createSequentialGroup()
					.addGap(9)
					.addComponent(TFdescricaoProject, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addGap(9))
		);
		gl_JPprojects.setVerticalGroup(
			gl_JPprojects.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPprojects.createSequentialGroup()
					.addGap(23)
					.addComponent(JBnome, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(TFnomeProject, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(JLdescricao, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(TFdescricaoProject, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE))
		);
		JPprojects.setLayout(gl_JPprojects);
		GroupLayout gl_JPtoolBaarProjects = new GroupLayout(JPtoolBaarProjects);
		gl_JPtoolBaarProjects.setHorizontalGroup(
			gl_JPtoolBaarProjects.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPtoolBaarProjects.createSequentialGroup()
					.addGap(9)
					.addComponent(JLtitle, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(JLicomSave, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
		);
		gl_JPtoolBaarProjects.setVerticalGroup(
			gl_JPtoolBaarProjects.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPtoolBaarProjects.createSequentialGroup()
					.addGap(11)
					.addComponent(JLtitle, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addComponent(JLicomSave, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
		);
		JPtoolBaarProjects.setLayout(gl_JPtoolBaarProjects);
		getContentPane().setLayout(groupLayout);
	}
}
