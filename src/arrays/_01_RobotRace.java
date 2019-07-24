package arrays;

import org.jointheleague.graphical.robot.Robot;
import java.util.Random;

public class _01_RobotRace {
	
	static Random random = new Random();
	
	//1. make a main method
	public static void main(String[] args) throws InterruptedException {
	
	//2. create an array of 5 robots.
	Robot[] fiveRob = new Robot[5];

	//3. use a for loop to initialize the robots.
	for (int i = 0; i < fiveRob.length; i++) {
		fiveRob[i] = new Robot();
		
		//4. make each robot start at the bottom of the screen, side by side, facing up
		fiveRob[i].setX(90 + (175 * i));
		fiveRob[i].setY(475);
		
	}	
	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 10.
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	
	boolean finish = false;
	String winner = null;
	while (!finish) {
		Thread.sleep(1);
		for (int i = 0; i < fiveRob.length; i++) {
			fiveRob[i].setY(fiveRob[i].getY() - random.nextInt(2));
			if (fiveRob[i].getY() <= 70) {
				finish = true;
				winner = "Robot " + String.valueOf(i);
			}
		}
	}
	
	//7. declare that robot the winner and throw it a party!
	System.out.println(winner + " is the winner");

	//8. try different races with different amounts of robots.
	//No thanks
	
	//9. make the robots race around a circular track.
	}
}