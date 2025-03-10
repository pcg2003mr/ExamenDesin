package Clase;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Pantalla {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
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
	public Pantalla() {
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
		
		JLabel lblNewLabel = new JLabel("-¿Pepito y tu lápiz? ");
		lblNewLabel.setBounds(20, 10, 416, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblloPerdiProfe = new JLabel("-Lo perdi profe");
		lblloPerdiProfe.setBounds(20, 67, 416, 60);
		frame.getContentPane().add(lblloPerdiProfe);
		
		JLabel lblyNoSe = new JLabel("-¿Y no se lo has dicho a tus padres?");
		lblyNoSe.setBounds(20, 123, 416, 60);
		frame.getContentPane().add(lblyNoSe);
		
		JLabel lblloPerdiProfe_1_1 = new JLabel("-Ni loco, mi hermana perdio la regla hace tres meses y que problema ");
		lblloPerdiProfe_1_1.setBounds(20, 179, 416, 60);
		frame.getContentPane().add(lblloPerdiProfe_1_1);
	}
}
