package no.hib.dat100;
import javax.swing.*;
import java.awt.*;

public class Firkant extends JPanel {
	Firkant(){
		setPreferredSize(new Dimension(200,200));
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawRect(50, 50, 100, 100);
	}


}
