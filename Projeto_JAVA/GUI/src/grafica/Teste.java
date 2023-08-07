package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Teste {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste window = new Teste();
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
	public Teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double resultado;
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				resultado = num1 + num2;
				
				tfResultado.setText("" + resultado);
				
			}
		});
		btnNewButton.setBounds(198, 41, 77, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Numero 1;");
		lblNewLabel.setBounds(26, 29, 67, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(90, 26, 98, 20);
		frame.getContentPane().add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2;");
		lblNewLabel_1.setBounds(26, 60, 67, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tfNum2 = new JTextField();
		tfNum2.setBounds(90, 57, 98, 20);
		frame.getContentPane().add(tfNum2);
		tfNum2.setColumns(10);
		
		JLabel aa = new JLabel("Resultado");
		aa.setBounds(26, 126, 59, 14);
		frame.getContentPane().add(aa);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(90, 123, 86, 20);
		frame.getContentPane().add(tfResultado);
		tfResultado.setColumns(10);
	}
}
