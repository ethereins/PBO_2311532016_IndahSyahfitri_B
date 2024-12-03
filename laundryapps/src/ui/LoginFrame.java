package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import error.ValidationException;
import model.User;
import service.LoginService;
import util.ValidationUtil;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setForeground(new Color(128, 128, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 452);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(184, 184, 220));
		contentPane.setForeground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(212, 35, 203, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblKamuMalesAja = new JLabel("Kamu males aja, biar kami yang cuciin!");
		lblKamuMalesAja.setHorizontalAlignment(SwingConstants.CENTER);
		lblKamuMalesAja.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblKamuMalesAja.setBounds(189, 64, 253, 20);
		contentPane.add(lblKamuMalesAja);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblUsername.setBounds(231, 117, 131, 20);
		contentPane.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtUsername.setBounds(231, 136, 159, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password\r\n");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblPassword.setBounds(231, 167, 131, 20);
		contentPane.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtPassword.setColumns(10);
		txtPassword.setBounds(231, 188, 159, 20);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userValue = txtUsername.getText();
				String passValue = txtPassword.getText();
				
				User user = new User(userValue, passValue);
				
				try {
					ValidationUtil.validate(user);
					LoginService loginService = new LoginService();
					if(loginService.authenticate(user)) {
						System.out.println("Login sukses!");
						new MainFrame().setVisible(true);
						dispose();
					}
					else {
						System.out.println("Username atau password tidak valid.");
						JOptionPane.showMessageDialog(null, "Login gagal, Username atau password tidak valid.");
					}
				} catch (ValidationException | NullPointerException exception) {
					System.out.println("Data tidak valid: " + exception.getMessage());
					JOptionPane.showMessageDialog(null, "Login gagal: " + exception.getMessage());
				} finally {
					System.out.println("Selalu dieksekusi.");
				}
				
			}});
		btnLogin.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		btnLogin.setBounds(262, 232, 89, 23);
		contentPane.add(btnLogin);
	}
}
