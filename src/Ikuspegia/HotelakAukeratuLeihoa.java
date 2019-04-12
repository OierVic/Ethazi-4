package Ikuspegia;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Kontrolatzailea.Hotel;
import Kontrolatzailea.Metodoak;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class HotelakAukeratuLeihoa extends JFrame {

	private static final long serialVersionUID = 1L;
	JLabel lblHotelak = new JLabel("Hotelak");
	JComboBox<String> comboBoxNombreHoteles = new JComboBox<String>();
	JButton btnHurrengoa = new JButton("Hurrengoa");
	JLabel lblHelbideak = new JLabel("Helbideak");
	JComboBox comboBoxHelbideak = new JComboBox();
	ArrayList<Hotel>HotelCombobox = new ArrayList<Hotel>();
	JButton btnEzeztatu = new JButton("Ezeztatu");
	JButton btnAtzera = new JButton("Atzera");




	public Double PrezioHotel;
	public int aukera;

	public HotelakAukeratuLeihoa(ArrayList <Hotel> Hoteles,ArrayList<String> Helbideak) {

		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);

		lblHotelak.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblHotelak.setBounds(58, 203, 121, 59);
		getContentPane().add(lblHotelak);
		
		comboBoxHelbideak.setBounds(58, 107, 196, 39);
		getContentPane().add(comboBoxHelbideak);
		comboBoxHelbideak.addItem("");
		comboBoxHelbideak.setSelectedIndex(0);
		for (int i=0;i<Helbideak.size();i++) {
			System.out.println(Helbideak);
			comboBoxHelbideak.addItem(Helbideak.get(i));
		}
		comboBoxHelbideak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxNombreHoteles.removeAllItems();
				String helbideakSelected = (String) comboBoxHelbideak.getSelectedItem();
				HotelCombobox=Eredua.Kontsulta_Hoteles.HotelakHelbidearekinAtera(helbideakSelected);
				for (int i = 0; i < HotelCombobox.size(); i++) {
					comboBoxNombreHoteles.addItem(HotelCombobox.get(i).comboboxIzena());
					
				}
				
			}

			
		});
		

		comboBoxNombreHoteles.setToolTipText("Aukeratu hotel bat");
		comboBoxNombreHoteles.setBounds(40, 284, 542, 29);
		getContentPane().add(comboBoxNombreHoteles);

		comboBoxNombreHoteles.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				System.out.println(PrezioHotel);
				btnHurrengoa.setEnabled(true);
				
			}
		});
		btnHurrengoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String hotelak = (String) comboBoxNombreHoteles.getSelectedItem();
				int PosicionSelected = comboBoxNombreHoteles.getSelectedIndex();
				if (hotelak==(null)) {
					btnHurrengoa.setEnabled(false);
					JOptionPane.showMessageDialog(null,"Ez duzu hotelik aukeratu. Mezedez, Hotel bat aukeratu.");
				}
				else if(!(hotelak==(null))) {
					System.out.println(PrezioHotel);
					dispose();
					PrezioHotel = HotelCombobox.get(PosicionSelected).getPrezioHotel();
							
					
					Metodoak.ordainduleihora(Hoteles, PrezioHotel);
					
				}
				
			}
		});
		btnHurrengoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHurrengoa.setBounds(473, 497, 167, 39);
		getContentPane().add(btnHurrengoa);
		
		lblHelbideak.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHelbideak.setBounds(74, 36, 105, 39);
		getContentPane().add(lblHelbideak);
		
		btnEzeztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.ongietorrileihora();
				
			}
		});
		btnEzeztatu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEzeztatu.setBounds(252, 498, 128, 41);
		getContentPane().add(btnEzeztatu);
		
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.loginleihora();
				
			}
		});
		btnAtzera.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAtzera.setBounds(40, 499, 121, 39);
		getContentPane().add(btnAtzera);
		
		
		



	}
}