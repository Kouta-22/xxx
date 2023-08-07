package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TaskDialogScreen extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextPane textPane_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextPane textPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TaskDialogScreen dialog = new TaskDialogScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TaskDialogScreen() {
		setBounds(100, 100, 450, 580);
		{
			panel_1 = new JPanel();
			panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel_1.setBackground(new Color(218, 12, 21));
			{
				lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\guilh\\eclipse-workspace\\koutaApp\\src\\main\\icons\\marca-de-verificacao (1).png"));
			}
			{
				lblNewLabel_1 = new JLabel("Tarefas");
				lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
			}
			GroupLayout gl_panel_1 = new GroupLayout(panel_1);
			gl_panel_1.setHorizontalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addGap(9)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
						.addGap(10)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
			);
			gl_panel_1.setVerticalGroup(
				gl_panel_1.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_1.createSequentialGroup()
						.addGap(11)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
			);
			panel_1.setLayout(gl_panel_1);
		}
		{
			panel = new JPanel();
			panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel.setBackground(Color.LIGHT_GRAY);
			{
				lblNewLabel_2 = new JLabel("Nome");
				lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			}
			{
				textField = new JTextField();
				textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				textField.setColumns(10);
			}
			{
				lblNewLabel_3 = new JLabel("Descrição");
				lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			}
			{
				textPane = new JTextPane();
				textPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				textPane.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			}
			{
				lblNewLabel_4 = new JLabel("Prazo");
				lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			}
			{
				textField_1 = new JTextField();
				textField_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				textField_1.setColumns(10);
			}
			{
				lblNewLabel_5 = new JLabel("Notas");
				lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			}
			{
				textPane_1 = new JTextPane();
				textPane_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				textPane_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			}
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(9)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
							.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
						.addGap(9))
					.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
						.addGap(8)
						.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
						.addContainerGap())
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(25)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
						.addGap(30))
			);
			panel.setLayout(gl_panel);
		}
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
					.addGap(1))
		);
		getContentPane().setLayout(groupLayout);
	}

}
