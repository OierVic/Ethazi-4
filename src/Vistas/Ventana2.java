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
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;

	int NumHoteldelArray=0;
	private JTextField textFieldPrezioa;

	public Ventana2(ArrayList <Hotel> Hoteles) {

		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);

		JLabel lblHotelak = new JLabel("Hotelak");
		lblHotelak.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHotelak.setBounds(73, 24, 121, 59);
		getContentPane().add(lblHotelak);

		JComboBox<String> comboBoxNombreHoteles = new JComboBox<String>();
		comboBoxNombreHoteles.setBounds(40, 122, 133, 29);
		getContentPane().add(comboBoxNombreHoteles);
		comboBoxNombreHoteles.addItem("Hotel bat aukeratu");
		for (int i=0;i<Hoteles.size();i++) {
			comboBoxNombreHoteles.addItem(Hoteles.get(i).getOstatu_Izena());

		}

		comboBoxNombreHoteles.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String hotelak = (String) comboBoxNombreHoteles.getSelectedItem();
				if (hotelak.equals("Hotel bat aukeratu")) {
					textFieldPrezioa.setText("");
				}
				for (int i=0;i<Hoteles.size();i++) {
					if (hotelak.equals(Hoteles.get(i).getOstatu_Izena())) {
						// Prezioa String-era pasatu behar da zeren setText egiterakoan eskatzen duelako
						String PrezioHotel = String.valueOf(Hoteles.get(i).getPrezioHotel());
						//Mirar haber si funciona para saber que numero es del array para llevarlo a la ventana3 de pagar
						NumHoteldelArray=i;
						textFieldPrezioa.setText(PrezioHotel+" €");
					}

				}
			}
		});
		JButton btnHurrengoa = new JButton("Hurrengoa");
		btnHurrengoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.hirugarrenLeihoa(Hoteles);
			}
		});
		btnHurrengoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHurrengoa.setBounds(487, 503, 157, 29);
		getContentPane().add(btnHurrengoa);

		JLabel lblPrezioa = new JLabel("Prezioa");
		lblPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrezioa.setBounds(463, 41, 76, 29);
		getContentPane().add(lblPrezioa);

		textFieldPrezioa = new JTextField();
		textFieldPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldPrezioa.setBounds(432, 107, 150, 59);
		getContentPane().add(textFieldPrezioa);
		textFieldPrezioa.setColumns(10);

		//Mirar haber si funciona para saber que numero es del array para llevarlo a la ventana3 de pagar
		System.out.println(NumHoteldelArray);


	}
}


