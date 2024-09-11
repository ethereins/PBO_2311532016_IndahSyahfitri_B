package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class Membership{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Membership window = new Membership();
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
	public Membership() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 848, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 164, 603);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmail = new JLabel("Rekap Data Transaksi");
		lblEmail.setBounds(10, 164, 144, 20);
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		panel.add(lblEmail);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 254, 175, 20);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblStatusPesanan = new JLabel("Membership");
		lblStatusPesanan.setBounds(10, 0, 121, 20);
		panel_3.add(lblStatusPesanan);
		lblStatusPesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblStatusPesanan.setForeground(new Color(0, 128, 128));
		lblStatusPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("SonicWash");
		lblNewLabel.setBounds(10, 47, 144, 27);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBounds(121, 31, 10, 10);
		panel.add(panel_4_2);
		panel_4_2.setLayout(null);
		
		JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setBounds(133, 20, 10, 10);
		panel.add(panel_4_2_1);
		
		JPanel panel_4_3_1 = new JPanel();
		panel_4_2_1.add(panel_4_3_1);
		
		JPanel panel_4_2_2 = new JPanel();
		panel_4_2_2.setBounds(43, 76, 10, 10);
		panel.add(panel_4_2_2);
		
		JPanel panel_4_2_2_1 = new JPanel();
		panel_4_2_2_1.setBounds(30, 84, 10, 10);
		panel.add(panel_4_2_2_1);
		
		JLabel lblAntrianPesanan = new JLabel("Input Pengeluaran");
		lblAntrianPesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblAntrianPesanan.setForeground(Color.WHITE);
		lblAntrianPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblAntrianPesanan.setBounds(10, 224, 121, 20);
		panel.add(lblAntrianPesanan);
		
		JLabel lblDashboard_1 = new JLabel("Dashboard");
		lblDashboard_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDashboard_1.setForeground(Color.WHITE);
		lblDashboard_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblDashboard_1.setBounds(10, 134, 86, 20);
		panel.add(lblDashboard_1);
		
		JLabel lblPembayaran = new JLabel("Karyawan");
		lblPembayaran.setBounds(10, 194, 86, 20);
		panel.add(lblPembayaran);
		lblPembayaran.setHorizontalAlignment(SwingConstants.LEFT);
		lblPembayaran.setForeground(new Color(255, 255, 255));
		lblPembayaran.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(146, 0, 827, 19);
		frame.getContentPane().add(panel_2);
		
		JLabel lblHaiKasir = new JLabel("Membership");
		lblHaiKasir.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiKasir.setForeground(new Color(0, 128, 128));
		lblHaiKasir.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblHaiKasir.setBackground(new Color(0, 128, 128));
		lblHaiKasir.setBounds(188, 40, 353, 34);
		frame.getContentPane().add(lblHaiKasir);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBounds(771, 62, 53, 26);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ID", "EN"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
		JLabel lblSaturday = new JLabel("Saturday,\r\n 24/08/2024");
		lblSaturday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaturday.setForeground(new Color(0, 128, 128));
		lblSaturday.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblSaturday.setBounds(590, 23, 234, 40);
		frame.getContentPane().add(lblSaturday);
		
		JLabel lblTransaksi = new JLabel("ID Pengguna");
		lblTransaksi.setHorizontalAlignment(SwingConstants.LEFT);
		lblTransaksi.setForeground(new Color(0, 128, 128));
		lblTransaksi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblTransaksi.setBounds(188, 121, 144, 20);
		frame.getContentPane().add(lblTransaksi);
		
		JButton btnRekap = new JButton("Cek");
		btnRekap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRekap.setForeground(Color.WHITE);
		btnRekap.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnRekap.setBackground(new Color(0, 128, 128));
		btnRekap.setBounds(342, 152, 95, 40);
		frame.getContentPane().add(btnRekap);
		
		JLabel lblDownloadRekapData = new JLabel("Total Poin:");
		lblDownloadRekapData.setHorizontalAlignment(SwingConstants.CENTER);
		lblDownloadRekapData.setForeground(new Color(0, 128, 128));
		lblDownloadRekapData.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblDownloadRekapData.setBounds(392, 499, 131, 20);
		frame.getContentPane().add(lblDownloadRekapData);
		
		JLabel lblListPemasukanLaundry = new JLabel("Jumlah Transaksi Pengguna");
		lblListPemasukanLaundry.setHorizontalAlignment(SwingConstants.CENTER);
		lblListPemasukanLaundry.setForeground(new Color(0, 128, 128));
		lblListPemasukanLaundry.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblListPemasukanLaundry.setBounds(344, 218, 301, 20);
		frame.getContentPane().add(lblListPemasukanLaundry);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(174, 243, 650, 246);
		frame.getContentPane().add(panel_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 128, 128));
		textField.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField.setDropMode(DropMode.INSERT);
		textField.setColumns(10);
		textField.setBounds(342, 123, 116, 19);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 128, 128));
		textField_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField_1.setDropMode(DropMode.INSERT);
		textField_1.setColumns(10);
		textField_1.setBounds(499, 499, 59, 19);
		frame.getContentPane().add(textField_1);
	}
}
