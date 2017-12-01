import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Circle {
	int radius,x,y,color;
	private static Random generator = new Random();
	Circle(){
		radius=generator.nextInt(100)+100;
		x=generator.nextInt(600);
		y=generator.nextInt(400);
		color=generator.nextInt((int)(Math.pow(2, 24)-1));
	}
	public Graphics draw(Graphics g) {
		g.setColor(new Color(color));
		g.fillOval(x, y, radius*2, radius*2);
		return g;
	}
}
