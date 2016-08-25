package no.hib.dat100;
import javax.swing.*;

public class ElementDemo extends JFrame {

  ElementDemo() {
    super("Elementdemo");

    // Først lages elementene:
    JButton knapp = new JButton("Trykk her");
    JLabel etikett = new JLabel("Skriv inn navn");
    JTextField tekstfelt = new JTextField(30);
    etikett.setLabelFor(tekstfelt);
    JTextArea tekstvindu = new JTextArea(10, 30);
    JScrollPane rullevindu = new JScrollPane(tekstvindu);

    // Lager et nytt panel og legger elementene til dette.
    JPanel panel = new JPanel();
    panel.add(knapp);
    panel.add(etikett);
    panel.add(tekstfelt);
    panel.add(rullevindu);

    // Legger panelet inn i JFrame-en.
    add(panel);

    // Avsluttende besvergelser:
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater
      (new Runnable() {
      public void run() {
        new ElementDemo();
      }
    });
  }
}