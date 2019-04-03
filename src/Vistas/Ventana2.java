package Vistas;

import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Ventana2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	
	public Ventana2() {
		
		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);
		
		JLabel lblHotelak = new JLabel("Hotelak");
		lblHotelak.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHotelak.setBounds(49, 57, 103, 50);
		getContentPane().add(lblHotelak);
		
		
	}
}
