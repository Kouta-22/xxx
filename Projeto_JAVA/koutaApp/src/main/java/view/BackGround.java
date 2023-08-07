package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class BackGround extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BackGround frame = new BackGround();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BackGround() {
		setBounds(100, 100, 450, 300);
		
		JPanel JPemptyList = new JPanel();
		JPemptyList.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(JPemptyList, BorderLayout.CENTER);
		
		JLabel JLemptyListTitle = new JLabel("Nem uma tarefa por aqui :D");
		JLemptyListTitle.setBounds(0, 129, 433, 20);
		JLemptyListTitle.setHorizontalAlignment(SwingConstants.CENTER);
		JLemptyListTitle.setFont(new Font("Segoe UI", Font.BOLD, 14));
		
		JLabel JLemptyListSubTitle = new JLabel("Clique no botão \"+\" para adicionar uma tarefa");
		JLemptyListSubTitle.setBounds(0, 160, 433, 15);
		JLemptyListSubTitle.setHorizontalAlignment(SwingConstants.CENTER);
		JLemptyListSubTitle.setForeground(new Color(128, 0, 0));
		JLemptyListSubTitle.setFont(new Font("Segoe UI", Font.BOLD, 11));
		JPemptyList.setLayout(null);
		JPemptyList.add(JLemptyListTitle);
		JPemptyList.add(JLemptyListSubTitle);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\guilh\\eclipse-workspace\\koutaApp\\src\\main\\icons\\cronograma.png"));
		lblNewLabel.setBounds(0, 65, 433, 64);
		JPemptyList.add(lblNewLabel);

	}
}
