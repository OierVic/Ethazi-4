package Vistas;

import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;

public class Ventana2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	
	public Ventana2() {
		
		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);
		
		JLabel lblHotelak = new JLabel("Hotelak");
		lblHotelak.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHotelak.setBounds(73, 24, 121, 59);
		getContentPane().add(lblHotelak);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(56, 122, 105, 29);
		getContentPane().add(comboBox);
		
		
	}
}
