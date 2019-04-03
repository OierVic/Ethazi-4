package Vistas;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Controlador.Hotel;
import Controlador.Metodoak;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	
	public Ventana2(ArrayList <Hotel> Hoteles) {
		
		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);
		
		JLabel lblHotelak = new JLabel("Hotelak");
		lblHotelak.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHotelak.setBounds(73, 24, 121, 59);
		getContentPane().add(lblHotelak);
		
		JComboBox<String> comboBoxNombreHoteles = new JComboBox<String>();
		comboBoxNombreHoteles.setBounds(56, 122, 105, 29);
		getContentPane().add(comboBoxNombreHoteles);
		for (int i=0;i<Hoteles.size();i++) {
			comboBoxNombreHoteles.addItem(Hoteles.get(i).getOstatu_Izena());

		}
		
		JButton btnHurrengoa = new JButton("Hurrengoa");
		btnHurrengoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Metodoak.hirugarrenLeihoa(Hoteles);
			}
		});
		btnHurrengoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHurrengoa.setBounds(487, 503, 157, 29);
		getContentPane().add(btnHurrengoa);
		
		
	}
}


