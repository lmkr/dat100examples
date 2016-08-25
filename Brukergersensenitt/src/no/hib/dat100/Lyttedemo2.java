package no.hib.dat100;

import javax.swing.*;
import java.awt.event.*;

class Lyttedemo2 extends JFrame {

  Lyttedemo2() {
    setTitle("Lyttedemo");
    JButton knapp = new JButton("Pip");

    // Registrere lytteobjekt med anonym klasse.
    knapp.addActionListener(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        System.out.print("\007");
      }
    });

    // Legg knapp i vinduet og tegn det opp.
    add(knapp);
    pack();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater
      (new Runnable() {
      public void run() {
        new Lyttedemo2();
      }
    });
  }
}