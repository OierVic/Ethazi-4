package Ikuspegia;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ApartamentuakAukeratuLeihoa extends JFrame {
	private static final long serialVersionUID = 1L;
	JLabel lblHelbideak = new JLabel("Helbideak:");
	JComboBox comboBoxHelbideakApartamentuak = new JComboBox();
	JLabel lblApartamentuak = new JLabel("Apartamentuak:");
	JComboBox comboBox = new JComboBox();
	JButton btnHurrengoaApartamentua = new JButton("Hurrengoa");
	JButton btnEzeztatuApartamentua = new JButton("Ezeztatu");
	JButton btnAtzeraApartamentua = new JButton("Atzera");

	
	public ApartamentuakAukeratuLeihoa(ArrayList<String> Helbideak) {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);
		
		lblHelbideak.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHelbideak.setBounds(51, 31, 105, 41);
		getContentPane().add(lblHelbideak);
		
		comboBoxHelbideakApartamentuak.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxHelbideakApartamentuak.setBounds(51, 95, 180, 30);
		getContentPane().add(comboBoxHelbideakApartamentuak);
		
		lblApartamentuak.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblApartamentuak.setBounds(69, 210, 162, 30);
		getContentPane().add(lblApartamentuak);
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(49, 277, 371, 30);
		getContentPane().add(comboBox);
		
		btnHurrengoaApartamentua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHurrengoaApartamentua.setBounds(520, 497, 127, 41);
		getContentPane().add(btnHurrengoaApartamentua);
		
		btnEzeztatuApartamentua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEzeztatuApartamentua.setBounds(262, 497, 115, 41);
		getContentPane().add(btnEzeztatuApartamentua);
		
		btnAtzeraApartamentua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAtzeraApartamentua.setBounds(22, 497, 105, 41);
		getContentPane().add(btnAtzeraApartamentua);



	}
}
