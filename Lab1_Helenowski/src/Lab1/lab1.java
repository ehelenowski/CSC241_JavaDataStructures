package Lab1;

//import java.util.Scanner;

import Bowling.*;

/*The problem for lab one is exercise 25A on page 55.
*This is the driver program used to show that the methods in the BowlingGame class work as desired
*Just by running the program, you can see the scoring for a game with randomized shot values (set in the correct ranges).
*You can uncomment the commented part and comment out the while loop part if you would like to test your own inputs.
*Note that as .getIsFrameOver() returns the boolean created by the last .getShot() method.
*Also note that the use of the toString method uses all of the getters, demonstrating that they work.
*The use of .getShotNum() isn't very interesting to the user.
*/

public class lab1 {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter the name you would like to use: ");
		String name = "NoName";
//		name = in.nextLine();
		BowlingGame game = new BowlingGame(name);
		System.out.println("\n");
		
		//Comment out this part and uncomment out the other while loop to enter custom inputs.
		int cFrame = 1;
		while (cFrame != 11){
			System.out.println("The frame is: "+game.getFrame());
			int f = (int) (Math.random()*11);
			int s = (int) (Math.random()*(11-f));
			int t = (f == 10) ? (int) (Math.random()*(11-s)) :(int) (Math.random()*11); ;
			System.out.println("The shots are: "+f+" and "+s);
			System.out.println("After the first shot is the frame is over? "+game.shot(f));
			System.out.println("Unless there is a strike, the .getShotNum() method returns that a shot has been made: "+game.getShotNum());
			System.out.println("The .getFirstBowl() method returns the first bowl of the frame: "+game.getFirstBowl());
			if (!game.getIsFrameOver()) {
				System.out.println("After the second shot is the frame is over? "+game.shot(s));
				if (!game.getIsFrameOver()){
					System.out.println("The third shot is: "+t);
					System.out.println("After the third shot is the frame is over? "+game.shot(t));
				}
			}
			System.out.println("The .getShotsTaken() method returns the number of shots taken: "+game.getShotsTaken());
			System.out.println("The .getScore() method returns the current score: "+game.getScore());
			System.out.println("The .getStrikes() method returns the number of strikes "+game.getStrikes());
			System.out.println("The .getSpares() method returns the number of spares "+game.getSpares());
			System.out.println("The .getGutterBalls() method returns the number of gutter balls "+game.getGutterBalls());
			System.out.println("The .toString() method utilizes the rest of the getters, formatting them into a nice string: ");
			System.out.println(game+System.lineSeparator()+System.lineSeparator());
			cFrame++;
		}
		
		System.out.println("\n\n");
		
// Uncomment this part to enter custom inputs
//		outer:
//		while (true){
//			System.out.println("The .getFrame() method returns the current frame: "+game.getFrame());
//			System.out.print("Enter a number of pins knocked down on the first bowl: ");
//			System.out.println("When you shoot, a boolean is returned whether the frame is over: "+game.shot(in.nextInt()));
//			System.out.println("Unless there is a strike, the .getShotNum() method returns that a shot has been made: "+game.getShotNum());
//			System.out.println("The .getFirstBowl() method returns the first bowl of the frame: "+game.getFirstBowl());
//			System.out.println("The .getIsFrameOver() returns whether the frame is over: "+game.getIsFrameOver());
//
//			while ( !game.getIsFrameOver()){
//				System.out.print("Enter a number of pins knocked down on the next bowl: ");
//				System.out.println("When you shoot, a boolean is returned whether the frame is over: "+game.shot(in.nextInt()));
//				System.out.println("The .getIsFrameOver() returns whether the frame is over: "+ game.getIsFrameOver());
//			}
//			
//			System.out.println("The .getScore() method returns the current score: "+game.getScore());
//			System.out.println("The .getStrikes() method returns the number of strikes "+game.getStrikes());
//			System.out.println("The .getSpares() method returns the number of spares "+game.getSpares());
//			System.out.println("The .getGutterBalls() method returns the number of gutter balls "+game.getGutterBalls());
//			System.out.println("The .toString() method returns a nicely formatted string: "+game);
//			
//			System.out.print("Enter q to quit or anything else to continue: ");
//
//			if (in.next().toUpperCase().equals("Q")) break outer;
//			else if (game.getIsFrameOver() && game.getFrame() == 10){
//				System.out.println("The game cannot be longer than 10 frames");
//				break outer;
//			}
//			
//			System.out.println(System.lineSeparator());
//		}
		
		System.out.println("The final line is: ");
		System.out.println(game);
//		in.close();
		System.out.println("The game is over.");
		

	}

}
