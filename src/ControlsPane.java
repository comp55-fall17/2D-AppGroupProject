import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect; 

public class ControlsPane extends GraphicsPane{
	
	private MainApplication program; 
	private GButton Up_Key; 
	private GButton Right_Key;
	private GButton Left_Key;
	private GButton Down_Key; 
	private GButton Spacebar; 
	private GButton attack; 
	private GImage background;
	private GButton back; 

	// labels and lines 
	private GLabel jumpUp;
	private GLabel moveLeft;
	private GLabel moveRight;
	private GLabel jumpDown;
	private GLabel attackLabel; 
	
	public ControlsPane(MainApplication app)
	{
		program = app;
		Up_Key = new GButton ("^", 900, 150, 50, 50); 
		jumpUp = new GLabel ("Jump Up", 900, 125);
		Right_Key = new GButton (">", 950, 200, 50, 50); 
		moveRight = new GLabel ("Move right", 1010, 230); 
		Left_Key = new GButton ("<", 850, 200, 50, 50); 
		moveLeft = new GLabel ("Move left", 790, 230); 
		Down_Key = new GButton("v", 900, 200, 50, 50);
		jumpDown = new GLabel("Jump down", 900, 275);
		
		Spacebar = new GButton("Spacebar - Jump", 425, 300, 200, 50);
		
		attack = new GButton ("Z", 50, 200, 50, 50); 
		attackLabel = new GLabel("Attack", 60, 260);
		
		back = new  GButton("back to menu", 0, 0, 100, 50); 
		
		background = new GImage("OptionsBackground.jpg", 0, 0); 
		background.setSize(1080, 600);
		
	}
	
	
	@Override
	public void showContents() {
		// TODO Auto-generated method stub
		program.add(background);
		program.add(Up_Key);
		program.add(Right_Key);
		program.add(Left_Key);
		program.add(Down_Key);
		program.add(Spacebar);
		program.add(attack);
		program.add(back);
		program.add(jumpUp);
		program.add(moveLeft);
		program.add(moveRight);
		program.add(jumpDown);
		program.add(attackLabel);
		
	}

	@Override
	public void hideContents() {
		// TODO Auto-generated method stub
		program.remove(background);
		program.remove(Up_Key);
		program.remove(Right_Key);
		program.remove(Left_Key);
		program.remove(Down_Key);
		program.remove(Spacebar);
		program.remove(attack);
		program.remove(back);
		program.remove(jumpUp);
		program.remove(moveLeft);
		program.remove(moveRight);
		program.remove(jumpDown);
		program.remove(attackLabel);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if(obj == back) {
			program.switchToMenu();
		}
	}
	

}
