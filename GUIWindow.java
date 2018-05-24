import javax.swing.*;
import java.awt.*;

public class GUIWindow{

	public static void main(String[] args){

   		JFrame theGUI = new JFrame();

		theGUI.setTitle("Dodge Balls");

		theGUI.setSize(700, 400);

		ColorPanel panel = new ColorPanel(Color.white, 700, 400);

		Container pane = theGUI.getContentPane();

   		pane.add(panel);

   		theGUI.setVisible(true);

		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 	}

}