package no.hib.dat100;

import javax.swing.*;

public class ForsteVindu extends JFrame {

  // Konstruktør. Lager og viser fram et vindu.
  ForsteVindu() {
    setTitle("Første vindu");
    setSize(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater
      (new Runnable() {
      public void run() {
        new ForsteVindu();
      }
    });
  }
}