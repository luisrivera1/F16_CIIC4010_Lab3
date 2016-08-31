import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;
//
		//Paint the background
		//g.setColor(Color.BLUE);
		//g.fillRect(x1, y1, width , height);
		//g.setColor(Color.RED);
		//g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
		//Draw a border
		//g.setColor(Color.YELLOW);
		//g.drawRect(x1, y1, width + 1, height + 1);
		//Question 7

		//g.setColor(Color.WHITE);
		//g.drawLine(x1, y1, x2, y2);
		//g.drawLine(x2,y1,x1,y2);
		//g.setColor(Color.LIGHT_GRAY);
		//g.drawOval((x2 - 55)/2, (y2 - 55)/2, 55, 55);
		// g.fillOval ((x2 - 55)/2, (y2 - 55)/ 2, 55, 55 );


		// Polygon p = new Polygon();
		//p.addPoint(x1 + 5, y1 + 25);
		//p.addPoint(x1 + 20, y1 + 10);
		//p.addPoint(x1 + 35, y1 + 25);
		//p.addPoint(x1 + 25, y1 + 25);
		//p.addPoint(x1 + 25, y1 + 45);
		//p.addPoint(x1 + 15, y1 + 45);
		// p.addPoint(x1 + 15, y1 + 25);
		//g.setColor(Color.YELLOW);
		// g.drawPolygon(p);
		// g.fillPolygon(p);

		// Second Polygon




		Polygon p3 = new Polygon ();

		p3.addPoint(x1 , y1);
		p3.addPoint(x2 , y1 );
		p3.addPoint(x2, y2);
		p3.addPoint(x1, y2);
		g.setColor(Color.RED);
		g.fillPolygon(p3);
		g.drawPolygon(p3);

		// First  Rectangle

		g.setColor(Color.WHITE);
		g.fillRect(x1, y1+40, width + 1 , (height)/5);

		// Second Rectangle


		g.setColor(Color.WHITE);
		g.fillRect(x1,115, width + 1 , (height)/5);
		
		//Triangulo Azul
		
		Polygon p4 = new Polygon ();
		p4.addPoint(x1, y1);
		p4.addPoint(x1 + 115, y1 + 100);
		p4.addPoint(x1, y2);
		g.setColor(Color.BLUE);
		g.fillPolygon(p4);
		
		
		
		








		Polygon p2 = new Polygon();
		p2.addPoint(x1 + 25, y1 + 73);
		p2.addPoint(x1 + 41, y1 + 73);
		p2.addPoint(x1 + 47, y1 + 58);
		p2.addPoint(x1 + 53, y1 + 73);
		p2.addPoint(x1 + 69, y1 + 73);
		p2.addPoint(x1 + 56, y1 + 83);
		p2.addPoint(x1 + 61, y1 + 98);
		p2.addPoint(x1 + 47, y1 + 88);
		p2.addPoint(x1 + 34, y1 + 98);
		p2.addPoint(x1 + 38, y1 + 83);
		g.setColor(Color.WHITE);
//		g.drawPolygon(p2);
//		g.fillPolygon(p2);

// Star Transfer 
		
		
Polygon p6 = p2;
p6.translate(-8,15);
g.drawPolygon(p6);
g.fillPolygon(p6);

	}



}