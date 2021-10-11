package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method

	public static void main(String[] args) {
		
	//2. create an array of 5 robots.

		Robot[] rob = new Robot[5];
		
	//3. use a for loop to initialize the robots.

		for (int i = 0; i < rob.length; i++) {
			
			rob[i] = new Robot();
			
			rob[i].setSpeed(60);
			
		}
		
		//4. make each robot start at the bottom of the screen, side by side, facing up

		int x = 50;
		
		for (int i = 0; i < rob.length; i++) {
			
			rob[i].moveTo(x, 550);
			
			x += 200;
			
		}
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

		Random ran = new Random();
		
		boolean running = true;
		
		while (running) {
		
		for (int i = 0; i < rob.length; i++) {
						
			rob[i].move(ran.nextInt(50));
			
			if (rob[i].getY() < 0) {
				
				running = false;
				
				JOptionPane.showMessageDialog(null, i + " is the winner!");
				
				break;
				
			}
			
		}
		
		}
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
		
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

	}
	
	}
