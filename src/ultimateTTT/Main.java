package ultimateTTT;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Intro();
		Board bigBoard = new Board();
		int bigBoardChoice = 0;
		int littleBoardChoice=0;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Player one please input the Bigboard number followed by the littleboard number you want to play at");
		System.out.println("Big Board Number:");
		while(!scan.hasNextInt()){
		scan.nextLine();
		System.out.println("This is an invalid input, please enter a number from 0-8");
		}bigBoardChoice = scan.nextInt();
		
			while(outOfBounds(bigBoardChoice)){
			System.out.println("That choice is out of bounds, please pick again");
			System.out.println("Big Board Number: ");
			while(!scan.hasNextInt()){
				scan.nextLine();
				System.out.println("This is an invalid input, please enter a number from 0-8");
				}
			bigBoardChoice = scan.nextInt();
			}
			
		System.out.println("Little Board Number:");
		while(!scan.hasNextInt()){
			scan.nextLine();
			System.out.println("This is an invalid input, please enter a number from 0-8");
			}
		littleBoardChoice = scan.nextInt();
		while(outOfBounds(littleBoardChoice)){
			System.out.println("That choice is out of bounds, please pick again");
			System.out.println("Little Board Number: ");
			while(!scan.hasNextInt()){
				scan.nextLine();
				System.out.println("This is an invalid input, please enter a number from 0-8");
				}
			littleBoardChoice = scan.nextInt();
			}
			
		Move current = Move.X;
		bigBoard.writeGuess(current,bigBoardChoice,littleBoardChoice);
		String turn ="";
		while(bigBoard.checkWin()==false){
			
			bigBoardChoice = littleBoardChoice;
			if (bigBoard.checkBoardPlayable(bigBoardChoice)==false){
				bigBoardChoice=-1;
			}
			bigBoard.printBoard();
			if(current.equals(Move.O)){
				current = Move.X;
						turn = "X";
			}else if(current.equals(Move.X)){
				current = Move.O;
				turn = "O";
			}
			System.out.println("It is now " + turn + "'s turn");
			if(bigBoardChoice==-1){
				System.out.println("You may play anywhere else");
				System.out.println("Pick a new BigBoard spot");
				while(!scan.hasNextInt()){
					scan.nextLine();
					System.out.println("This is an invalid input, please enter a number from 0-8");
					}
				bigBoardChoice = scan.nextInt();
			}
				
				while(outOfBounds(bigBoardChoice) || bigBoard.beenWon(bigBoardChoice)){
					if(outOfBounds(bigBoardChoice)){
					
					System.out.println("That choice is out of bounds, please pick again");
					System.out.println("Big Board Number: ");
					while(!scan.hasNextInt()){
						scan.nextLine();
						System.out.println("This is an invalid input, please enter a number from 0-8");
						}
					bigBoardChoice = scan.nextInt();
					}else if (bigBoard.beenWon(bigBoardChoice)){
						System.out.println("This board has already been won");
						System.out.println("You may play anywhere else");
						System.out.println("Pick a new BigBoard spot");
						while(!scan.hasNextInt()){
							scan.nextLine();
							System.out.println("This is an invalid input, please enter a number from 0-8");
							}
						bigBoardChoice = scan.nextInt();
					}
			}
				
			System.out.println("Player you are playing at big board number " + bigBoardChoice);
			System.out.println("Player input the little board number you want to play at");
			System.out.println("Little Board Number:");
			while(!scan.hasNextInt()){
				scan.nextLine();
				System.out.println("This is an invalid input, please enter a number from 0-8");
				}
			littleBoardChoice=scan.nextInt();
			while(outOfBounds(littleBoardChoice)){
				System.out.println("That choice is out of bounds, please pick again");
				System.out.println("Little Board Number: ");
				while(!scan.hasNextInt()){
					scan.nextLine();
					System.out.println("This is an invalid input, please enter a number from 0-8");
					}
				littleBoardChoice = scan.nextInt();
			}
				
			bigBoard.writeGuess(current,bigBoardChoice,littleBoardChoice);

			/*if(bigBoard.returnBoardStatus()){
			bigBoardChoice=-1;
			}*/
		}
		bigBoard.printBoard();
		System.out.println("YOU HAVE WON THE GAME!!");
		
			
		
	}

			
			
		public static  boolean outOfBounds(int choice){
			if(choice<0 || choice>8){
				return true;
			}	
			return false;
		}
		
		public static void Intro(){
		System.out.println("=====================================");
		System.out.println("       ULTIMATE TIC TAC TOE");
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("  Welcome to ULTIMATE TIC TAC TOE");
		System.out.println("=====================================\n");
		System.out.println("================RULES================");
		System.out.println("Player 1 is represented by X and \nPlayer 2 is represented by O");
		System.out.println("At the start of the game player 1 chooses a Big Box to play in");
		System.out.println("These are numbered 0-8, \nwith 0 being the far top left \nand 8 being the far bottom right");
		System.out.println("Then the player selects a small tic tac toe square to play in that big box");
		System.out.println("These are also numbered 0-8 \nwith 0 being the far top left \nand 8 being the far bottom right");
		System.out.println("The next player has to play in the big box that correlates \nwith the little box the previous player played in");
		System.out.println("For example: \nIf Player One plays in Big Box 4 and Little Box 3, \nPlayer Two will have to play in Big Box three next turn");
		System.out.println("Then if Player Two plays in Little Box 5, \nPlayer One will have to play in Big Box 5.");
		System.out.println("If a player gets a regular tic tac toe in a little box \nhe wins that big box");
		System.out.println("If a player wins three big boxes he wins the game");
		System.out.println("There are some other rules however...");
		System.out.println("If a player has to play in a big box that has already been won \nor resulted in a draw, \nthen that player must select a new big box to play in");
		System.out.println("Thats all!");
		System.out.println("Enjoy!");
		System.out.println("=====================================\n\n\n\n\n");
		
		
		}
		
		
}
		
		
	


		
	