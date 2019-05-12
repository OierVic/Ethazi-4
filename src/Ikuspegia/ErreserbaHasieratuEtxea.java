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

import Eredua.Kontsulta_Erreserba;
import Eredua.Kontsulta_Hoteles;
import Kontrolatzailea.Hotel;
import Kontrolatzailea.Metodoak;
import Kontrolatzailea.OheMotak;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class ErreserbaHasieratuEtxea extends JFrame{
	
	private JButton btnHurrengoa = new JButton("Hurrengoa");
	private JLabel aukeratutakoOstatua;
	private JLabel lblSartzeData = new JLabel("Sartze data");
	private JLabel lblJoateData = new JLabel("Joate data");
	private JDateChooser dateJoan = new JDateChooser();
	private JDateChooser dateSartu = new JDateChooser();
	private Date joan_Data = new Date();
	private Date sartu_Data = new Date();
	private Date gaur = new Date();
	private Date urtea = new Date();
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnEzeztatu = new JButton("Ezeztatu");
	private JButton btnAtzeraErreserba = new JButton("Atzera");;
	private JButton btnEzeztatuErreserba = new JButton("Ezeztatu");
	private JButton btnDatakEgiaztatu = new JButton("Datak egiaztatu");
	private JButton btnBalidatu = new JButton("Balidatu");
	//Date formatutik String-era aldatzeko
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	
	//Bariableak
	private String joan_Data_string="";
	private String sartu_Data_string="";
	private Boolean jarraituBotoia=false;
	
	//variables de que recogen de los spinners para que se puedan utilizar fuera del boton
	
	public ErreserbaHasieratuEtxea(String etxeak, double PrezioEtxea) {
		
		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);
		
		aukeratutakoOstatua = new JLabel(etxeak);
		aukeratutakoOstatua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		aukeratutakoOstatua.setBounds(10, 25, 664, 29);
		getContentPane().add(aukeratutakoOstatua);
		
		lblSartzeData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSartzeData.setBounds(40, 83, 107, 28);
		getContentPane().add(lblSartzeData);
		
		urtea = Metodoak.gehituUrtea(sartu_Data, 1); 
		
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
					dateJoan.setMaxSelectableDate(Metodoak.gehituEguna(urtea, 1));
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
				dateSartu.setMaxSelectableDate(urtea);
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
		
		btnDatakEgiaztatu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDatakEgiaztatu.setBounds(125, 160, 132, 23);
		getContentPane().add(btnDatakEgiaztatu);
		
		
		btnBalidatu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBalidatu.setBounds(498, 259, 132, 43);
		getContentPane().add(btnBalidatu);
		btnBalidatu.setEnabled(false);
		//lblOheSipleBat.g
		
		btnDatakEgiaztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnBalidatu.setEnabled(true);
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

			}
		});
		
		/*btnBalidatu.addActionListener(new ActionListener() {
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
				
				
				
				
				
				int i = 0;
				boolean libre;
				
				
				
				//Data haietan lekurik ez badago
				
				
				do {
					ArrayList<java.sql.Date> dataJoan = new ArrayList<java.sql.Date>();
					ArrayList<java.sql.Date> dataEtorri = new ArrayList<java.sql.Date>();
					ArrayList<java.sql.Date>[] dataArray = new ArrayList[i]; 
					
					dataJoan = dataArray[0];
					dataEtorri = dataArray[1];
				
				
				libre = Metodoak.DataKalkulatu(sartu_Data, joan_Data, dataJoan, dataEtorri, i);
				if (libre== false) {
					break;
				}
				++i;
				}while(i!=4);
				
				System.out.println("Ya en la ventana: "+libre);
				if(libre==false) {
					System.out.println("Ya en la ventana: "+libre);

					btnBalidatu.setEnabled(true);
					btnHurrengoa.setEnabled(false);
					jarraituBotoia=false;
					JOptionPane.showMessageDialog(null, "Hotelan ez dago lekurik");
					
				}
				
		
				
				if (jarraituBotoia==true) {
					btnBalidatu.setEnabled(false);
					btnHurrengoa.setEnabled(true);
					
					//JDateChooserrak desaktibatu
					dateJoan.getCalendarButton().setEnabled(false);
					dateSartu.getCalendarButton().setEnabled(false);
					
					
				}
				
				
				
				
			}
		});
		
		btnHurrengoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

				
				joan_Data = (Date) dateJoan.getDate();
				sartu_Data = (Date) dateSartu.getDate();
				
				if(dateSartu != null && dateJoan != null) {
					Metodoak.ordainduleihora(etxeak, PrezioEtxea, sartu_Data, joan_Data);
					dispose();
				}
				
			}
		});*/
	}
}