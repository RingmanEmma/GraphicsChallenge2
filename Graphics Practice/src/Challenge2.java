import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
public class Challenge2 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        Challenge2 canvas = new Challenge2();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(true);
	        frame.setVisible(true);
	        
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		System.out.println("How large of a square would you like to make?");
    		System.out.println("Please keep the dimensions below 1000.");
    		System.out.println("Please input the width");
    		Scanner userInput = new Scanner(System.in);
    		int width = userInput.nextInt();
    		System.out.println("Please input the height");
    		int height = userInput.nextInt();
    		System.out.println("What color would you like the square to be?");
    		System.out.println("blue or red?");
    		Scanner userInput2 = new Scanner(System.in);
    		String userColor = userInput2.nextLine();
    		if (userColor.equals("blue"))
    			{
    			graphics.setColor(Color.blue);
    		    graphics.fillRect(200, 200, width, height);
    			}
    		else if (userColor.equals("red"))
    			{
    			graphics.setColor(Color.red);
    			graphics.fillRect(200, 200, width, height);
    			}
    		
    		graphics.setColor(new Color(0, 0, 255));
	        graphics.fillRect(20, 20, 20, 20);
    		}
	}