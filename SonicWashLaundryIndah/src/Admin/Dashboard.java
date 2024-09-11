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

public class Dashboard{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
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
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		panel.add(lblEmail);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 134, 175, 20);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setBounds(10, 0, 62, 20);
		panel_3.add(lblDashboard);
		lblDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		lblDashboard.setForeground(new Color(0, 128, 128));
		lblDashboard.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
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
		
		JLabel lblPembayaran = new JLabel("Karyawan");
		lblPembayaran.setHorizontalAlignment(SwingConstants.LEFT);
		lblPembayaran.setForeground(Color.WHITE);
		lblPembayaran.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblPembayaran.setBounds(10, 194, 86, 20);
		panel.add(lblPembayaran);
		
		JLabel lblAntrianPesanan = new JLabel("Input Pengeluaran");
		lblAntrianPesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblAntrianPesanan.setForeground(Color.WHITE);
		lblAntrianPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblAntrianPesanan.setBounds(10, 224, 121, 20);
		panel.add(lblAntrianPesanan);
		
		JLabel lblStatusPesanan = new JLabel("Membership");
		lblStatusPesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblStatusPesanan.setForeground(Color.WHITE);
		lblStatusPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblStatusPesanan.setBounds(10, 254, 121, 20);
		panel.add(lblStatusPesanan);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(146, 0, 827, 19);
		frame.getContentPane().add(panel_2);
		
		JLabel lblAplikasiManajemenLaundry = new JLabel("Sudah siap untuk bekerja hari ini?");
		lblAplikasiManajemenLaundry.setHorizontalAlignment(SwingConstants.LEFT);
		lblAplikasiManajemenLaundry.setForeground(new Color(0, 128, 128));
		lblAplikasiManajemenLaundry.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblAplikasiManajemenLaundry.setBounds(184, 62, 234, 40);
		frame.getContentPane().add(lblAplikasiManajemenLaundry);
		
		JLabel lblHaiKasir = new JLabel("Halo, Admin#1!");
		lblHaiKasir.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiKasir.setForeground(new Color(0, 128, 128));
		lblHaiKasir.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblHaiKasir.setBackground(new Color(0, 128, 128));
		lblHaiKasir.setBounds(184, 29, 298, 34);
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
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(new Color(0, 128, 128));
		panel_2_1_1_1.setBounds(383, 182, 204, 74);
		frame.getContentPane().add(panel_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Rp1.056.500,-");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
		lblNewLabel_1_1_2.setBackground(new Color(0, 128, 128));
		lblNewLabel_1_1_2.setBounds(0, 10, 204, 30);
		panel_2_1_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblPesananDiproses = new JLabel("Omzet Hari Ini");
		lblPesananDiproses.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesananDiproses.setForeground(Color.WHITE);
		lblPesananDiproses.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblPesananDiproses.setBounds(45, 34, 120, 30);
		panel_2_1_1_1.add(lblPesananDiproses);
		
		JLabel lblJakartaBarat = new JLabel("Kec. Pauh, Kota Padang");
		lblJakartaBarat.setHorizontalAlignment(SwingConstants.LEFT);
		lblJakartaBarat.setForeground(new Color(0, 128, 128));
		lblJakartaBarat.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblJakartaBarat.setBounds(174, 563, 227, 40);
		frame.getContentPane().add(lblJakartaBarat);
		
		JLabel lblSaturday_1_1 = new JLabel("10:23:09");
		lblSaturday_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaturday_1_1.setForeground(new Color(0, 128, 128));
		lblSaturday_1_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblSaturday_1_1.setBounds(750, 563, 74, 40);
		frame.getContentPane().add(lblSaturday_1_1);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBackground(new Color(0, 128, 128));
		panel_2_1_1_1_1.setBounds(383, 299, 204, 74);
		frame.getContentPane().add(panel_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Rp17.476.000,-");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
		lblNewLabel_1_1_2_1.setBackground(new Color(0, 128, 128));
		lblNewLabel_1_1_2_1.setBounds(0, 10, 204, 30);
		panel_2_1_1_1_1.add(lblNewLabel_1_1_2_1);
		
		JLabel lblPemasukanBulanIni = new JLabel("Pemasukan Bulan Ini");
		lblPemasukanBulanIni.setHorizontalAlignment(SwingConstants.CENTER);
		lblPemasukanBulanIni.setForeground(Color.WHITE);
		lblPemasukanBulanIni.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblPemasukanBulanIni.setBounds(10, 41, 184, 23);
		panel_2_1_1_1_1.add(lblPemasukanBulanIni);
		
		JPanel panel_2_1_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBackground(new Color(0, 128, 128));
		panel_2_1_1_1_1_1.setBounds(383, 420, 204, 74);
		frame.getContentPane().add(panel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Rp6.947.500,-");
		lblNewLabel_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
		lblNewLabel_1_1_2_1_1.setBackground(new Color(0, 128, 128));
		lblNewLabel_1_1_2_1_1.setBounds(0, 10, 204, 30);
		panel_2_1_1_1_1_1.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblPengeluaranBulanIni = new JLabel("Pengeluaran Bulan Ini");
		lblPengeluaranBulanIni.setHorizontalAlignment(SwingConstants.CENTER);
		lblPengeluaranBulanIni.setForeground(Color.WHITE);
		lblPengeluaranBulanIni.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblPengeluaranBulanIni.setBounds(10, 41, 184, 23);
		panel_2_1_1_1_1_1.add(lblPengeluaranBulanIni);
		
		JLabel lblCatatanKeuangan = new JLabel("Catatan Keuangan");
		lblCatatanKeuangan.setHorizontalAlignment(SwingConstants.CENTER);
		lblCatatanKeuangan.setForeground(new Color(0, 128, 128));
		lblCatatanKeuangan.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		lblCatatanKeuangan.setBackground(new Color(0, 128, 128));
		lblCatatanKeuangan.setBounds(359, 126, 263, 34);
		frame.getContentPane().add(lblCatatanKeuangan);
	}
}
