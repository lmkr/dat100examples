package no.hib.dat100;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LayoutMangerDemo extends JFrame {

	  LayoutMangerDemo() {
	    setTitle("LayoutManagerdemo");

	    // Lager komponentene
	    JButton knapp = new JButton("Trykk her");
	    JLabel etikett = new JLabel("Skriv inn navn");
	    JTextField tekstfelt = new JTextField(30);
	    etikett.setLabelFor(tekstfelt);
	    JTextArea tekstvindu = new JTextArea(10, 30);

	    JScrollPane rullevindu = new JScrollPane(tekstvindu);

	    // Lager en ny komponent for tekstfelt og etikett.
	    // Benytter GridLayout.
	    JPanel tekstPanel = new JPanel();
	    tekstPanel.setLayout(new GridLayout(2, 1));
	    tekstPanel.add(etikett);
	    tekstPanel.add(tekstfelt);

	    // Legger komponentene i JFrame-en
	    add(tekstPanel, BorderLayout.NORTH);
	    add(rullevindu, BorderLayout.CENTER);
	    add(knapp, BorderLayout.WEST);

	    // Avsluttende besvergelser:
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    pack();
	    setVisible(true);
	  }

	  public static void main(String[] args) {
	    SwingUtilities.invokeLater
	      (new Runnable() {
	      public void run() {
	        new LayoutMangerDemo();
	      }
	    });
	  }
	}