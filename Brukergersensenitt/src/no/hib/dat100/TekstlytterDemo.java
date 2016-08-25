package no.hib.dat100;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TekstlytterDemo extends JFrame {

  TekstlytterDemo() {
    setTitle("TekstlytterDemo");

    // Lager komponentene
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

    // Registrerer et lytteobjekt til tekstfeltet.
    tekstfelt.addKeyListener
    (new TFeltLytter(tekstfelt, tekstvindu));

    // Legger komponentene i JFrame-en
    add(tekstPanel, BorderLayout.NORTH);
    add(rullevindu, BorderLayout.CENTER);

    // Avsluttende besvergelser:
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater
      (new Runnable() {
      public void run() {
        new TekstlytterDemo();
      }
    });
  }
}