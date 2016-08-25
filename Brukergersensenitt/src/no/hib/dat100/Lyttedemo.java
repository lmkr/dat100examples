package no.hib.dat100;
import java.awt.event.*;
import javax.swing.*;


// Hovedklassen:

public class Lyttedemo extends JFrame {

	Lyttedemo() {
		setTitle("Lyttedemo");
		JButton knapp = new JButton("Pip");

		// Registrere lytteobjekt:
		knapp.addActionListener(new Lytter());

		// Legg knapp i vinduet og tegn det opp.
		add(knapp);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Lyttedemo();
			}
		});
	}
}