package Vistas;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Ventana4 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lblEskerrikAsko = new JLabel("Eskerrik asko erosteagatik ");
	private JLabel lblZureTxartelaOrain = new JLabel("Zure txartela orain aterako da");
	private JLabel icono = new JLabel();

	public Ventana4() {
		
		
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		//LABEL ESKERRIK ASKO
		lblEskerrikAsko.setFont(new Font("Arial", Font.PLAIN, 46));
		lblEskerrikAsko.setBounds(70, 95, 565, 78);
		getContentPane().add(lblEskerrikAsko);
		
		//LABEL ZURE ERRESERBA ORAIN
		lblZureTxartelaOrain.setFont(new Font("Arial", Font.PLAIN, 41));
		lblZureTxartelaOrain.setBounds(70, 198, 555, 45);
		getContentPane().add(lblZureTxartelaOrain);
		
		
	}
}