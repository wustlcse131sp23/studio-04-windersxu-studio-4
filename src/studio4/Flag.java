package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color orange = new Color(255, 151, 0);
		StdDraw.setPenColor(orange);
		StdDraw.filledRectangle(.2,.5,.2 ,.3); 
		
		Color blue = new Color(50, 50, 255);
		StdDraw.setPenColor(blue);
		StdDraw.filledRectangle(.6, .5, .2, .3);
		//StdDraw.setPenColor(Color.BLUE);
		//StdDraw.filledCircle(.4, .5, .15);
		
		//StdDraw.setPenColor(orange);
		//StdDraw.filledRectangle(.4, .5, .15, .15);
		
		//StdDraw.setPenColor(blue);
		//StdDraw.filledRectangle(.325, .5, .15/2, .15);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(.4, .5, .2);
		
	}
}