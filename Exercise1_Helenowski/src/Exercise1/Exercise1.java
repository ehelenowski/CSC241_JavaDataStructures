package Exercise1;

import java.util.Scanner;

import Bowling.*;

public class Exercise1 {

	/*
	 * Can uncomment the commented and comment the uncommented section if you would like to see the example requested.
	 * Otherwise, the driver program takes inputs as described in the book. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter you name: ");
		BowlingGame game = new BowlingGame(in.nextLine());
		int cFrame = 1;
		while (cFrame != 11){
			System.out.print("Pins knocked over: ");
			if (!game.shot(in.nextInt())){
				System.out.print("Pins knocked over: ");
				if (!game.shot(in.nextInt())){
					System.out.print("Pins knocked over: ");
					game.shot(in.nextInt());}}
			System.out.println(game);
			cFrame++;
		}
		System.out.println("\nThe game is now over. The final line is: \n");
		System.out.println(game);
		in.close();
//		String name = "Ivan";
//		BowlingGame game = new BowlingGame("Ivan");
//		game.shot(2); game.shot(6);
//		System.out.println(game);
//		game.shot(10);
//		System.out.println(game); 
//		game.shot(10);
//		System.out.println(game);
//		game.shot(5); 
//		game.shot(5);
//		System.out.println(game);
//		game.shot(2); 
//		game.shot(0);
//		System.out.println(game);
//		game.shot(7); game.shot(1);
//		System.out.println(game);
//		game.shot(10);  
//		System.out.println(game); 
//		game.shot(10);
//		System.out.println(game);
//		game.shot(5); game.shot(5);
//		System.out.println(game);
//		game.shot(10); 
//		game.shot(3); game.shot(5);
//		System.out.println(game);
	}

}