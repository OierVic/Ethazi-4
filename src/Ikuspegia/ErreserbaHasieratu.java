package Ikuspegia;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import com.toedter.calendar.JCalendar;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import Kontrolatzailea.Hotel;
import Kontrolatzailea.Metodoak;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class ErreserbaHasieratu extends JFrame{
	
	JButton btnHurrengoa;
	JLabel aukeratutakoOstatua;
	JLabel lblSartzeData, lblJoateData;
	JDateChooser dateJoan, dateSartu;
	Date gaur = new Date();
	Date joanData = new Date();
	Date sartuData = new Date();
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnEzeztatu = new JButton("Ezeztatu");
	private JButton btnAtzeraErreserba;
	private JButton btnEzeztatuErreserba;
	private JLabel lblSinpleak;
	private JLabel lblOheSimpleBat;
	private JLabel lblOheSimpleBi;
	private JLabel lblOheBikoitzBat;
	private JLabel lblOheBikoitzBatEtaSimpleBat;
	private JLabel lblSehaska;
	private SpinnerNumberModel oheakSpinner = new SpinnerNumberModel(0, 0, 2, 1);
	private SpinnerNumberModel sehaskaSpinner = new SpinnerNumberModel(0, 0, 4, 1);
	private JSpinner spinner_OheSimpleBat = new JSpinner(oheakSpinner);
	private JSpinner spinner_OheSimpleBi = new JSpinner(oheakSpinner);
	private JSpinner spinner_OheBikoitzBat = new JSpinner(oheakSpinner);
	private JSpinner spinner_OheBikoitzBatEtaOheSimpleBat = new JSpinner(oheakSpinner);
	private JSpinner spinner_Sehaska = new JSpinner(sehaskaSpinner);
	
	public ErreserbaHasieratu(String hotelak, ArrayList <Hotel> Hoteles, double PrezioHotel) {
		
		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);
		
		aukeratutakoOstatua = new JLabel(hotelak);
		aukeratutakoOstatua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		aukeratutakoOstatua.setBounds(10, 55, 664, 29);
		getContentPane().add(aukeratutakoOstatua);
		
		lblSartzeData = new JLabel("Sartze data");
		lblSartzeData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSartzeData.setBounds(65, 119, 107, 28);
		getContentPane().add(lblSartzeData);
		
		dateJoan = new JDateChooser();
		dateJoan.setBounds(249, 158, 118, 20);
		dateJoan.setEnabled(false);
		getContentPane().add(dateJoan);
		((JTextField) this.dateJoan.getDateEditor()).setEditable(false); 

		
		dateJoan.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				sartuData = (Date) dateSartu.getDate();
				if(sartuData == null) {
					JOptionPane.showMessageDialog(null,"Lehenengo sartze data bat aukeratu, mesedez.");
					dateJoan.setEnabled(false);
				} else { 
					dateJoan.setMinSelectableDate(Metodoak.gehituEguna(sartuData, 1));
				}		
				
			}
		});
		
		lblJoateData = new JLabel("Joate data");
		lblJoateData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJoateData.setBounds(280, 119, 107, 28);
		getContentPane().add(lblJoateData);
		
		dateSartu = new JDateChooser();
		dateSartu.setBounds(54, 160, 118, 20);
		getContentPane().add(dateSartu);
		((JTextField) this.dateSartu.getDateEditor()).setEditable(false); 

		//hola
		
		dateSartu.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dateSartu.setMinSelectableDate(gaur);
				dateJoan.setEnabled(true);
				dateJoan.setCalendar(null);
				
			}
		});
		
		getContentPane().add(btnEzeztatu);
		btnAtzera.setBounds(176, 490, 105, 43);
		//String nan = Hotel.getDni();
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.hotelakaukeratuleihora();
				
			}
		});
		
		btnAtzeraErreserba = new JButton("Atzera");
		btnAtzeraErreserba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.hotelakaukeratuleihora();
				
			}
		});
		
		btnHurrengoa = new JButton("Hurrengoa");
		btnHurrengoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHurrengoa.setBounds(484, 490, 157, 46);
		getContentPane().add(btnHurrengoa);
		
		
		btnAtzeraErreserba.setFont(new Font("Arial", Font.PLAIN, 18));
		btnAtzeraErreserba.setBounds(65, 496, 105, 43);
		getContentPane().add(btnAtzeraErreserba);
		
		btnEzeztatuErreserba = new JButton("Ezeztatu");
		btnEzeztatuErreserba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.ongietorrileihora();
			}
		});
		btnEzeztatuErreserba.setFont(new Font("Arial", Font.PLAIN, 18));
		btnEzeztatuErreserba.setBounds(275, 494, 112, 41);
		getContentPane().add(btnEzeztatuErreserba);
		
		lblSinpleak = new JLabel("Logela motak:");
		lblSinpleak.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSinpleak.setBounds(40, 219, 157, 29);
		getContentPane().add(lblSinpleak);
		
		lblOheSimpleBat = new JLabel("Ohe sinple bat:");
		lblOheSimpleBat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOheSimpleBat.setBounds(65, 259, 132, 28);
		getContentPane().add(lblOheSimpleBat);
		
		lblOheSimpleBi = new JLabel("Ohe sinple 2:");
		lblOheSimpleBi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOheSimpleBi.setBounds(65, 298, 118, 29);
		getContentPane().add(lblOheSimpleBi);
		
		lblOheBikoitzBat = new JLabel("Ohe bikoitz bat:");
		lblOheBikoitzBat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOheBikoitzBat.setBounds(65, 338, 123, 25);
		getContentPane().add(lblOheBikoitzBat);
		
		lblOheBikoitzBatEtaSimpleBat = new JLabel("Ohe bikoitz bat eta ohe Simple bat :");
		lblOheBikoitzBatEtaSimpleBat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOheBikoitzBatEtaSimpleBat.setBounds(65, 374, 264, 34);
		getContentPane().add(lblOheBikoitzBatEtaSimpleBat);
		
		lblSehaska = new JLabel("Sehaska :");
		lblSehaska.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSehaska.setBounds(65, 435, 80, 20);
		getContentPane().add(lblSehaska);
		
		spinner_OheSimpleBat = new JSpinner();
		spinner_OheSimpleBat.setBounds(217, 265, 29, 20);
		getContentPane().add(spinner_OheSimpleBat);
		
		spinner_OheSimpleBi = new JSpinner();
		spinner_OheSimpleBi.setBounds(217, 304, 29, 20);
		getContentPane().add(spinner_OheSimpleBi);
		
		spinner_OheBikoitzBat = new JSpinner();
		spinner_OheBikoitzBat.setBounds(217, 342, 29, 20);
		getContentPane().add(spinner_OheBikoitzBat);
		
		spinner_OheBikoitzBatEtaOheSimpleBat = new JSpinner();
		spinner_OheBikoitzBatEtaOheSimpleBat.setBounds(339, 383, 29, 20);
		getContentPane().add(spinner_OheBikoitzBatEtaOheSimpleBat);
		
		spinner_Sehaska = new JSpinner();
		spinner_Sehaska.setBounds(154, 437, 29, 20);
		getContentPane().add(spinner_Sehaska);
		
		btnHurrengoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				joanData = (Date) dateJoan.getDate();
				sartuData = (Date) dateSartu.getDate();
				
				if(dateSartu != null && dateJoan != null) {
					Metodoak.ordainduleihora(hotelak, Hoteles, PrezioHotel, sartuData, joanData);
					dispose();
				}
				
			}
		});
	}
}
