package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String a = in.next();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		boolean e = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfwidth = in.nextDouble();
		double halflength = in.nextDouble();
		System.out.print(a +" " + b +" " + c + " " + d + " " + e + " " + x + " " + y);
		
		if (a.equals ("rectangle")) {
			Color black = new Color(b, c, d);
			StdDraw.setPenColor(black);
			if (e == true) {
				StdDraw.filledRectangle(x, y,halfwidth, halflength); 
			} else {
				StdDraw.rectangle(x, y,halfwidth, halflength);
			}
			
		} else if (a.equals ("ellipse")) {
			Color rgb = new Color(b,c,d);
			StdDraw.setPenColor(rgb);
			StdDraw.filledEllipse(x, y,halfwidth, halflength);
		}
		

	}
}
