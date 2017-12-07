import java.applet.Applet;
import java.awt.*;

public class DrawCircles extends Applet{
	public void paint(Graphics g){
		Circle c[] = new Circle[10];
		for (Circle a:c) {
			a = new Circle();
			a.draw(g);
		}
	}
}
