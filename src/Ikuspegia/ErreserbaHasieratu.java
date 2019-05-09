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
import Kontrolatzailea.OheMotak;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class ErreserbaHasieratu extends JFrame{
	
	private JButton btnHurrengoa = new JButton("Hurrengoa");
	private JLabel aukeratutakoOstatua;
	private JLabel lblSartzeData = new JLabel("Sartze data");
	private JLabel lblJoateData = new JLabel("Joate data");
	private JDateChooser dateJoan = new JDateChooser();
	private JDateChooser dateSartu = new JDateChooser();
	private Date joan_Data = new Date();
	private Date sartu_Data = new Date();
	private Date gaur = new Date();
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnEzeztatu = new JButton("Ezeztatu");
	private JButton btnAtzeraErreserba = new JButton("Atzera");;
	private JButton btnEzeztatuErreserba = new JButton("Ezeztatu");
	private JButton btnDatakEgiaztatu = new JButton("Datak egiaztatu");
	private JButton btnBalidatu = new JButton("Balidatu");
	private JLabel lblLogelaMotak = new JLabel("Logela motak:");
	private JLabel lblOheSipleBat = new JLabel("Ohe sinple bat:");
	private JLabel lblOheSinpleBi = new JLabel("Ohe sinple 2:");
	private JLabel lblOheBikoitzBat = new JLabel("Ohe bikoitz bat:");
	private JLabel lblOheBikoitzBatEtaSinpleBat = new JLabel("Ohe bikoitz bat eta ohe Simple bat :");
	private JLabel lblSehaska = new JLabel("Sehaska :");
//	private SpinnerNumberModel oheakSpinner = new SpinnerNumberModel(0, 0, 2, 1);
//	private SpinnerNumberModel sehaskaSpinner = new SpinnerNumberModel(0, 0, 4, 1);
	//Spinnerrak
	private JSpinner spinner_OheSimpleBat = new JSpinner();
	private JSpinner spinner_OheSimpleBi = new JSpinner();
	private JSpinner spinner_OheBikoitzBat = new JSpinner();
	private JSpinner spinner_OheBikoitzBatEtaOheSimpleBat = new JSpinner();
	private JSpinner spinner_Sehaska = new JSpinner();
	//Date formatutik String-era aldatzeko
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	
	//Bariableak
	private String joan_Data_string="";
	private String sartu_Data_string="";
	private Boolean jarraituBotoia=false;
	
	
	public ErreserbaHasieratu(String hotelak, double PrezioHotel) {
		
		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);
		
		aukeratutakoOstatua = new JLabel(hotelak);
		aukeratutakoOstatua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		aukeratutakoOstatua.setBounds(10, 25, 664, 29);
		getContentPane().add(aukeratutakoOstatua);
		
		lblSartzeData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSartzeData.setBounds(40, 83, 107, 28);
		getContentPane().add(lblSartzeData);
		
		dateJoan = new JDateChooser();
		dateJoan.setBounds(217, 122, 118, 20);
		dateJoan.setEnabled(false);
		getContentPane().add(dateJoan);
		((JTextField) this.dateJoan.getDateEditor()).setEditable(false); 

		
		dateJoan.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				sartu_Data = (Date) dateSartu.getDate();
				if(sartu_Data == null) {
					JOptionPane.showMessageDialog(null,"Lehenengo sartze data bat aukeratu, mesedez.");
					dateJoan.setEnabled(false);
				} else { 
					dateJoan.setMinSelectableDate(Metodoak.gehituEguna(sartu_Data, 1));
				}
				
			}
		});
		
		lblJoateData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJoateData.setBounds(232, 83, 107, 28);
		getContentPane().add(lblJoateData);
		
		dateSartu = new JDateChooser();
		dateSartu.setBounds(29, 122, 118, 20);
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
		
		btnAtzeraErreserba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.hotelakaukeratuleihora();
				
			}
		});
		
		btnHurrengoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHurrengoa.setBounds(484, 490, 157, 46);
		getContentPane().add(btnHurrengoa);
		btnHurrengoa.setEnabled(false);
		
		
		btnAtzeraErreserba.setFont(new Font("Arial", Font.PLAIN, 18));
		btnAtzeraErreserba.setBounds(65, 496, 105, 43);
		getContentPane().add(btnAtzeraErreserba);
		
		btnEzeztatuErreserba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.ongietorrileihora();
			}
		});
		btnEzeztatuErreserba.setFont(new Font("Arial", Font.PLAIN, 18));
		btnEzeztatuErreserba.setBounds(275, 494, 112, 41);
		getContentPane().add(btnEzeztatuErreserba);
		
		lblLogelaMotak.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogelaMotak.setBounds(40, 219, 157, 29);
		getContentPane().add(lblLogelaMotak);
		
		lblOheSipleBat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOheSipleBat.setBounds(65, 259, 132, 28);
		getContentPane().add(lblOheSipleBat);
		
		lblOheSinpleBi.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOheSinpleBi.setBounds(65, 298, 118, 29);
		getContentPane().add(lblOheSinpleBi);
		
		lblOheBikoitzBat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOheBikoitzBat.setBounds(65, 338, 123, 25);
		getContentPane().add(lblOheBikoitzBat);
		
		lblOheBikoitzBatEtaSinpleBat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOheBikoitzBatEtaSinpleBat.setBounds(65, 374, 264, 34);
		getContentPane().add(lblOheBikoitzBatEtaSinpleBat);
		
		lblSehaska.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSehaska.setBounds(65, 435, 80, 20);
		getContentPane().add(lblSehaska);
		
		spinner_OheSimpleBat = new JSpinner();
		spinner_OheSimpleBat.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		spinner_OheSimpleBat.setBounds(217, 265, 40, 20);
		getContentPane().add(spinner_OheSimpleBat);
		
		spinner_OheSimpleBi = new JSpinner();
		spinner_OheSimpleBi.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		spinner_OheSimpleBi.setBounds(217, 304, 40, 20);
		getContentPane().add(spinner_OheSimpleBi);
		
		spinner_OheBikoitzBat = new JSpinner();
		spinner_OheBikoitzBat.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		spinner_OheBikoitzBat.setBounds(217, 342, 40, 20);
		getContentPane().add(spinner_OheBikoitzBat);
		
		spinner_OheBikoitzBatEtaOheSimpleBat = new JSpinner();
		spinner_OheBikoitzBatEtaOheSimpleBat.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		spinner_OheBikoitzBatEtaOheSimpleBat.setBounds(339, 383, 48, 20);
		getContentPane().add(spinner_OheBikoitzBatEtaOheSimpleBat);
		
		spinner_Sehaska = new JSpinner();
		spinner_Sehaska.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_Sehaska.setBounds(154, 437, 43, 20);
		getContentPane().add(spinner_Sehaska);
		
		btnDatakEgiaztatu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDatakEgiaztatu.setBounds(125, 160, 132, 23);
		getContentPane().add(btnDatakEgiaztatu);
		
		btnDatakEgiaztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		
		btnBalidatu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBalidatu.setBounds(498, 259, 132, 43);
		getContentPane().add(btnBalidatu);
		
		btnBalidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jarraituBotoia=true;
				//Hoteletik joateko data balidatzeko
				try {
					joan_Data= dateJoan.getDate();
					joan_Data_string=dateFormat.format(joan_Data);
				}catch (Exception e1) {
					btnBalidatu.setEnabled(true);
					btnHurrengoa.setEnabled(false);
					jarraituBotoia=false;
					JOptionPane.showMessageDialog(null, "Sartzeko data hutsik dago. Mesedez osotu");
				}
				//Hotelera sartzeko data balidatzeko
				try {
					sartu_Data= dateSartu.getDate();
					sartu_Data_string=dateFormat.format(sartu_Data);
				}catch (Exception e1) {
					btnBalidatu.setEnabled(true);
					btnHurrengoa.setEnabled(false);
					jarraituBotoia=false;
					JOptionPane.showMessageDialog(null, "Sartzeko data hutsik dago. Mesedez osotu");
				}
				if ( (int) spinner_OheSimpleBat.getValue()==0 && (int) spinner_OheSimpleBi.getValue()==0 && (int) spinner_OheBikoitzBat.getValue()==0 && (int) spinner_OheBikoitzBatEtaOheSimpleBat.getValue()==0) {
					btnBalidatu.setEnabled(true);
					btnHurrengoa.setEnabled(false);
					jarraituBotoia=false;
					JOptionPane.showMessageDialog(null, "Logelaren bat aukeratu behar duzu. Sehaskarik ez nahi baduzu ez da derrigorrezkoa");
				}
				
				if (jarraituBotoia==true) {
					btnBalidatu.setEnabled(false);
					btnHurrengoa.setEnabled(true);
					
					//JDateChooserrak desaktibatu
					dateJoan.getCalendarButton().setEnabled(false);
					dateSartu.getCalendarButton().setEnabled(false);
					
					//Spinnerrak desaktibatu
					spinner_OheSimpleBat.setEnabled(false);
					spinner_OheSimpleBi.setEnabled(false);
					spinner_OheBikoitzBat.setEnabled(false);
					spinner_OheBikoitzBatEtaOheSimpleBat.setEnabled(false);
					spinner_Sehaska.setEnabled(false);
					
				}
				
				//Hotela beteta dagoen edo ez balidatzeko
				
				
				
				
			}
		});
		
		btnHurrengoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				int OheSimpleBat = (int) spinner_OheSimpleBat.getValue();
				int OheSimpleBi = (int) spinner_OheSimpleBi.getValue();
				int OheBikoitzBat = (int) spinner_OheBikoitzBat.getValue();
				int OheBikoitzBatEtaOheSimpleBat = (int) spinner_OheBikoitzBatEtaOheSimpleBat.getValue();
				int Sehaska = (int) spinner_Sehaska.getValue();
				
				OheMotak o1 = new OheMotak(OheSimpleBat, OheSimpleBi, OheBikoitzBat, OheBikoitzBatEtaOheSimpleBat, Sehaska);

				

				
				joan_Data = (Date) dateJoan.getDate();
				sartu_Data = (Date) dateSartu.getDate();
				
				if(dateSartu != null && dateJoan != null) {
					Metodoak.ordainduleihora(hotelak, PrezioHotel, sartu_Data, joan_Data, o1);
					dispose();
				}
				
			}
		});
	}
}