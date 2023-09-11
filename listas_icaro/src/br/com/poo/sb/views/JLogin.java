package br.com.poo.sb.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class JLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textcpf;
	private final JLabel lblNewLabel_1 = new JLabel("Login");
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
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
	public JLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1.setBounds(180, 11, 56, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(147, 91, 19, 14);
		contentPane.add(lblNewLabel);
		
		textcpf = new JTextField();
		textcpf.setHorizontalAlignment(SwingConstants.CENTER);
		textcpf.setBounds(168, 88, 86, 20);
		contentPane.add(textcpf);
		textcpf.setColumns(10);
		
		JLabel senha = new JLabel("Senha");
		senha.setBounds(136, 144, 30, 14);
		contentPane.add(senha);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(168, 141, 86, 20);
		contentPane.add(textField);
	}
}
