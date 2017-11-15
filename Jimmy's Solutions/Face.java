import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Face extends Applet {
	Graphics g;
	public void paint(Graphics g) {	}
	public void update(Graphics g) {
		g.setColor(Color.red);
	}
	public void start() {
		int pageWidth = 600;
		int pageHeight = 400;
		Image i = null;
		try {
			i = ImageIO.read(new File("vish.JPG"));
		}
		catch(Exception e) {
			System.err.println("Error thrown: "+e);	
		}
		g.drawImage(i,pageWidth/2-150,pageHeight/2-150,300,300,null);
		try {
			while (true) {
			g.setColor(Color.red);
			Thread.sleep(100);
			g.setColor(Color.orange);
			Thread.sleep(100);
			g.setColor(Color.yellow);
			Thread.sleep(100);
			g.setColor(Color.green);
			Thread.sleep(100);
			g.setColor(Color.cyan);
			Thread.sleep(100);
			g.setColor(Color.blue);
			Thread.sleep(100);
			}
		}
		catch(Exception e) {
			System.err.println("Error thrown: "+e);	
		}
		paint(g);
		update(g);
	}

}
