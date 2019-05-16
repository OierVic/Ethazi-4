package Ikuspegia;

import java.awt.GridBagConstraints;

import javax.swing.JFrame;

public class Frame extends JFrame {


	private static final long serialVersionUID = 1L;
	GridBagConstraints config = new GridBagConstraints();

	public Frame() {
		this.setTitle("Bidai-On");
		this.setResizable(false);
		this.setSize(770,670);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

	}

}