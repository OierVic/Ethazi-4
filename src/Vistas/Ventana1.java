package Vistas;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana1 extends JFrame {


	private static final long serialVersionUID = 1L;

	private JLabel lblOngiEtorri = new JLabel("Ongi Etorri");
	private JLabel lblTxrtelSaltzailera = new JLabel("Bidai-Onera");

	public Ventana1() {

		this.setBounds(275,100,700,600);
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);

		//LABEL ONGI ETORRI

		lblOngiEtorri.setFont(new Font("Arial", Font.PLAIN, 46));
		lblOngiEtorri.setBounds(208, 51, 239, 54);
		getContentPane().add(lblOngiEtorri);
		//LABEL TXARTEL SALTZAILEA

		lblTxrtelSaltzailera.setFont(new Font("Arial", Font.PLAIN, 46));
		lblTxrtelSaltzailera.setBounds(195, 135, 252, 44);
		getContentPane().add(lblTxrtelSaltzailera);


	}

}