package view;

import java.awt.EventQueue;
import javax.swing.JRootPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.plaf.RootPaneUI;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import javax.swing.RootPaneContainer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainScreen {

	private JFrame frame;
	private JPanel panel;
	private JTable jTableTasks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
		decorateTableTask();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1244, 793);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Title = new JPanel();
		Title.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Title.setForeground(new Color(0, 0, 0));
		Title.setBackground(new Color(217, 12, 21));
		
		JLabel TitleApp = new JLabel("Kouta App");
		TitleApp.setBounds(82, 42, 199, 48);
		TitleApp.setIcon(null);
		TitleApp.setFont(new Font("Segoe UI", Font.BOLD, 36));
		
		JLabel Subtitle = new JLabel("Anote Seus Projetos :D");
		Subtitle.setBounds(92, 96, 152, 20);
		Subtitle.setFont(new Font("Segoe UI", Font.BOLD, 14));
		
		JPanel JPprojects = new JPanel();
		JPprojects.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		JPprojects.setBackground(new Color(192, 192, 192));
		
		JLabel JLprojects = new JLabel("Projetos");
		JLprojects.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JLabel JLaddProjects = new JLabel("");
		JLaddProjects.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen();
				projectDialogScreen.setVisible(true);
			}
		});
		JLaddProjects.setToolTipText("");
		JLaddProjects.setIcon(new ImageIcon("C:\\Users\\guilh\\eclipse-workspace\\koutaApp\\src\\main\\icons\\cruz-vermelha (2).png"));
		GroupLayout gl_JPprojects = new GroupLayout(JPprojects);
		gl_JPprojects.setHorizontalGroup(
			gl_JPprojects.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPprojects.createSequentialGroup()
					.addGap(30)
					.addComponent(JLprojects, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
					.addComponent(JLaddProjects)
					.addGap(22))
		);
		gl_JPprojects.setVerticalGroup(
			gl_JPprojects.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_JPprojects.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_JPprojects.createParallelGroup(Alignment.TRAILING)
						.addComponent(JLaddProjects)
						.addComponent(JLprojects, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
					.addContainerGap())
		);
		JPprojects.setLayout(gl_JPprojects);
		
		JPanel JPtasks = new JPanel();
		JPtasks.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		JPtasks.setBackground(new Color(192, 192, 192));
		
		JLabel JLtasks = new JLabel("Tarefas");
		JLtasks.setFont(new Font("Segoe UI", Font.BOLD, 18));
		
		JLabel JLaddTask = new JLabel("");
		JLaddTask.setIcon(new ImageIcon("C:\\Users\\guilh\\eclipse-workspace\\koutaApp\\src\\main\\icons\\cruz-vermelha (2).png"));
		GroupLayout gl_JPtasks = new GroupLayout(JPtasks);
		gl_JPtasks.setHorizontalGroup(
			gl_JPtasks.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPtasks.createSequentialGroup()
					.addContainerGap()
					.addComponent(JLtasks, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
					.addComponent(JLaddTask)
					.addContainerGap())
		);
		gl_JPtasks.setVerticalGroup(
			gl_JPtasks.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_JPtasks.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_JPtasks.createParallelGroup(Alignment.LEADING)
						.addComponent(JLaddTask, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(JLtasks, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		JPtasks.setLayout(gl_JPtasks);
		
		JPanel JPprojectList = new JPanel();
		JPprojectList.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		JPprojectList.setBackground(new Color(192, 192, 192));
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(192, 192, 192));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(Title, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(JPprojectList, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
						.addComponent(JPprojects, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(JPtasks, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(Title, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(JPtasks, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(JPprojects, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
						.addComponent(JPprojectList, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JScrollPane jScrollPaneTasks = new JScrollPane();
		jScrollPaneTasks.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		jScrollPaneTasks.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		jScrollPaneTasks.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		jTableTasks = new JTable();
		jTableTasks.setRowHeight(50);
		jTableTasks.setShowVerticalLines(false);
		jTableTasks.setSelectionBackground(new Color(217, 12, 21));
		jTableTasks.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		jTableTasks.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		jTableTasks.setModel(new DefaultTableModel(
				new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome", "Descricao", "Prazo", "Tarefa Concluida"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jTableTasks.getColumnModel().getColumn(0).setResizable(false);
		jTableTasks.getColumnModel().getColumn(0).setPreferredWidth(147);
		jTableTasks.getColumnModel().getColumn(1).setResizable(false);
		jTableTasks.getColumnModel().getColumn(1).setPreferredWidth(272);
		jTableTasks.getColumnModel().getColumn(2).setResizable(false);
		jTableTasks.getColumnModel().getColumn(2).setPreferredWidth(90);
		jTableTasks.getColumnModel().getColumn(3).setResizable(false);
		jTableTasks.getColumnModel().getColumn(3).setPreferredWidth(92);
		jScrollPaneTasks.setViewportView(jTableTasks);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(9)
					.addComponent(jScrollPaneTasks, GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
					.addGap(9))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(jScrollPaneTasks, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
					.addGap(10))
		);
		panel.setLayout(gl_panel);
		JPprojectList.setLayout(null);
		
		JList JL_listProjects = new JList();
		JL_listProjects.setFixedCellHeight(40);
		JL_listProjects.setSelectionForeground(new Color(255, 255, 255));
		JL_listProjects.setSelectionBackground(new Color(218, 12, 21));
		JL_listProjects.setValueIsAdjusting(true);
		JL_listProjects.setForeground(new Color(0, 0, 0));
		JL_listProjects.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JL_listProjects.setFont(new Font("Segoe UI", Font.BOLD, 16));
		JL_listProjects.setBorder(null);
		JL_listProjects.setModel(new AbstractListModel() {
			String[] values = new String[] {"ITEM 1", "ITEM 2", "ITEM 3", "ITEM 4", "ITEM 5"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		JL_listProjects.setBackground(new Color(192, 192, 192));
		JL_listProjects.setBounds(10, 11, 245, 259);
		JPprojectList.add(JL_listProjects);
		Title.setLayout(null);
		Title.add(TitleApp);
		Title.add(Subtitle);
		
		JLabel TitleIcom = new JLabel("");
		TitleIcom.setIcon(new ImageIcon("C:\\Users\\guilh\\eclipse-workspace\\koutaApp\\src\\main\\icons\\Meu projeto.png"));
		TitleIcom.setBounds(32, 11, 50, 115);
		Title.add(TitleIcom);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	public void decorateTableTask() {
		jTableTasks.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
		jTableTasks.getTableHeader().setBackground(new Color(217,12,21));
		jTableTasks.getTableHeader().setForeground(new Color(0,0,0));
		jTableTasks.setAutoCreateRowSorter(true);
	}
	
	
}
