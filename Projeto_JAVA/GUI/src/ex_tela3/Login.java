package ex_tela3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Login {

	private JFrame frame;
	private JTextField tfLogin;
	private JTextField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(217, 12, 21));
		frame.setBounds(100, 100, 453, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		tfLogin = new JTextField();
		tfLogin.setDragEnabled(true);
		tfLogin.setDoubleBuffered(true);
		tfLogin.setFocusTraversalPolicyProvider(true);
		tfLogin.setMinimumSize(new Dimension(7, 2147483647));
		tfLogin.setMaximumSize(new Dimension(7, 2147483647));
		tfLogin.setBorder(new TitledBorder(null, "Login", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(153, 204, 204)));
		tfLogin.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setDragEnabled(true);
		tfSenha.setDoubleBuffered(true);
		tfSenha.setFocusTraversalPolicyProvider(true);
		tfSenha.setMinimumSize(new Dimension(7, 2147483647));
		tfSenha.setMaximumSize(new Dimension(7, 2147483647));
		tfSenha.setBorder(new TitledBorder(null, "Login", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(153, 204, 204)));
		tfSenha.setColumns(10);
		
		JButton btEntrar = new JButton("Entrar");
		
		JButton btEsqSenha = new JButton("Esqueceu a senha");
		
		JLabel nwBemVindo = new JLabel("Seja bem vindo");
		nwBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		nwBemVindo.setFont(new Font("Segoe UI", Font.BOLD, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(39)
					.addComponent(nwBemVindo, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
					.addGap(37))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(39)
					.addComponent(tfLogin, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
					.addGap(26))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(39)
					.addComponent(tfSenha, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
					.addGap(26))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(37)
					.addComponent(btEntrar, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
					.addGap(26))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(39)
					.addComponent(btEsqSenha, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
					.addGap(26))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(9)
					.addComponent(nwBemVindo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(tfLogin, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(tfSenha, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btEntrar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btEsqSenha, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		
		JLabel Cadastro = new JLabel("Cadastre-se");
		Cadastro.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Logo = new JLabel("Kouta App");
		Logo.setVerticalAlignment(SwingConstants.TOP);
		Logo.setBackground(new Color(221, 0, 0));
		Logo.setIcon(new ImageIcon("C:\\Users\\guilh\\Downloads\\Meu projeto.png"));
		Logo.setFont(new Font("Segoe UI", Font.BOLD, 30));
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
					.addGap(34))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(113)
					.addComponent(Cadastro, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addGap(110))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(116)
					.addComponent(Logo, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addGap(107))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(Logo)
					.addGap(27)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(Cadastro)
					.addContainerGap(30, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
