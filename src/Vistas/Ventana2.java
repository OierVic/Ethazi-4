package Vistas;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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


	private JTextField textFieldPrezioa;
	JLabel lblHotelak = new JLabel("Hotelak");
	JComboBox<String> comboBoxNombreHoteles = new JComboBox<String>();
	JButton btnHurrengoa = new JButton("Hurrengoa");
	JLabel lblPrezioa = new JLabel("Prezioa");
	JLabel lblHelbideak = new JLabel("Helbideak");
	JComboBox comboBoxHelbideak = new JComboBox();



	public Double PrezioHotel;

	public Ventana2(ArrayList <Hotel> Hoteles,ArrayList<String> Helbideak) {

		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);

		lblHotelak.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHotelak.setBounds(58, 203, 121, 59);
		getContentPane().add(lblHotelak);

		comboBoxNombreHoteles.setToolTipText("Aukeratu hotel bat");
		comboBoxNombreHoteles.setBounds(40, 284, 542, 29);
		getContentPane().add(comboBoxNombreHoteles);
		comboBoxNombreHoteles.addItem("Hotel bat aukeratu");
		for (int i=0;i<Hoteles.size();i++) {
			System.out.println("holaaaaaaaaaa");
			comboBoxNombreHoteles.addItem(Hoteles.get(i).comboboxIzena());
		}

		comboBoxNombreHoteles.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String hotelak = (String) comboBoxNombreHoteles.getSelectedItem();
				if (hotelak.equals("Hotel bat aukeratu")) {
					textFieldPrezioa.setText("");
				}
				for (int i=0;i<Hoteles.size();i++) {
					if (hotelak.equals(Hoteles.get(i).comboboxIzena())) {
						// Prezioa String-era pasatu behar da zeren setText egiterakoan eskatzen duelako
						PrezioHotel = Hoteles.get(i).getPrezioHotel();
						String PrezioHotel = String.valueOf(Hoteles.get(i).getPrezioHotel());
						//Mirar haber si funciona para saber que numero es del array para llevarlo a la ventana3 de pagar

						textFieldPrezioa.setText(PrezioHotel+" €");
						btnHurrengoa.setEnabled(true);
						break;
					}

				}
			}
		});
		btnHurrengoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String hotelak = (String) comboBoxNombreHoteles.getSelectedItem();
				if (hotelak.equals("Hotel bat aukeratu")) {
					btnHurrengoa.setEnabled(false);
					JOptionPane.showMessageDialog(null,"Ez duzu hotelik aukeratu. Mezedez, Hotel bat aukeratu.");
				}
				else if(!(hotelak.equals("Hotel bat aukeratu"))) {
					System.out.println(PrezioHotel);
					dispose();
					Metodoak.hirugarrenLeihoa(Hoteles,PrezioHotel);
				}
			}
		});
		btnHurrengoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHurrengoa.setBounds(487, 503, 157, 29);
		getContentPane().add(btnHurrengoa);

		lblPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrezioa.setBounds(463, 41, 76, 29);
		getContentPane().add(lblPrezioa);

		textFieldPrezioa = new JTextField();
		textFieldPrezioa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldPrezioa.setBounds(432, 107, 150, 59);
		getContentPane().add(textFieldPrezioa);
		textFieldPrezioa.setColumns(10);
		textFieldPrezioa.setEditable(false);
		
		lblHelbideak.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHelbideak.setBounds(74, 36, 105, 39);
		getContentPane().add(lblHelbideak);
		
		
		comboBoxHelbideak.setBounds(58, 107, 196, 39);
		getContentPane().add(comboBoxHelbideak);
		for (int i=0;i<Helbideak.size();i++) {
			System.out.println(Helbideak);
			comboBoxHelbideak.addItem(Helbideak.get(i));
		}
		comboBoxHelbideak.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				/* Se pasarian los hoteles que hayamos seleccionado en el Combobox de helbideak y
				se verian los de ese Helbide seleccionado en los que serian iguales a los hoteles */
				
			}
		});



	}
}