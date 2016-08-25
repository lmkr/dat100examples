package no.hib.dat100;
import javax.swing.*;
import java.awt.*;

public class FirkantDemo extends JFrame {

  FirkantDemo() {
    setTitle("Firkantdemo");
    JPanel firkant = new Firkant();
    add(firkant, BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater
      (new Runnable() {
      public void run() {
        new FirkantDemo();
      }
    });
  }
}