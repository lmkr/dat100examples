package no.hib.dat100;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TFeltLytter extends KeyAdapter {
	JTextField tfelt;
	JTextArea tVindu;
	private JTextField tFelt;
	private JTextArea TVindu;

	TFeltLytter(JTextField tFelt, JTextArea tVindu) {
		this.tFelt = tFelt;
		this.TVindu = tVindu;
	}

public void keyReleased(KeyEvent e){
	if(e.getKeyCode() == KeyEvent.VK_ENTER){
		tVindu.append(tFelt.getText());
		tFelt.setText("");;
	}
}
}
