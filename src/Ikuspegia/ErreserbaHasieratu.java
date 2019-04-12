package Ikuspegia;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.toedter.calendar.JCalendar;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;

import Kontrolatzailea.Hotel;
import Kontrolatzailea.Metodoak;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class ErreserbaHasieratu extends JFrame{
	
	JButton btnHurrengoa;
	JLabel aukeratutakoOstatua;
	JLabel lblSartzeData, lblJoateData;
	JDateChooser dateSartu, dateJoan;
	Date gaur = new Date();
	Date sartuData = new Date();
	Date joanData = new Date();
	
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
		lblSartzeData.setBounds(49, 262, 107, 28);
		getContentPane().add(lblSartzeData);
		
		dateSartu = new JDateChooser();
		dateSartu.setBounds(262, 289, 118, 20);
		getContentPane().add(dateSartu);
		
		dateSartu.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dateSartu.setMinSelectableDate(gaur);
				
			}
		});
		
		lblJoateData = new JLabel("Joate data");
		lblJoateData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJoateData.setBounds(277, 262, 107, 28);
		getContentPane().add(lblJoateData);
		
		dateJoan = new JDateChooser();
		dateJoan.setBounds(35, 289, 118, 20);
		getContentPane().add(dateJoan);
		
		dateJoan.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				sartuData = (Date) dateSartu.getDate();
				dateJoan.setMinSelectableDate(gaur);
				if(sartuData != null) {
					dateJoan.setMinSelectableDate(sartuData);
				}
			}
		});
		
		btnHurrengoa = new JButton("Hurrengoa");
		btnHurrengoa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHurrengoa.setBounds(489, 490, 157, 29);
		getContentPane().add(btnHurrengoa);
		
		btnHurrengoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sartuData = (Date) dateSartu.getDate();
				joanData = (Date) dateJoan.getDate();
				
				if(dateJoan != null && dateSartu != null) {
					Metodoak.ordainduleihora(Hoteles, PrezioHotel, sartuData, joanData);
					dispose();
				}
				
			}
		});
	}
}
