package ultimateTTT;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Board bigBoard = new Board();
		int bigBoardChoice = 0;
		int littleBoardChoice=0;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Player one please input the Bigboard number followed by the littelboard number you want to play at");
		System.out.println("Big Board Number:");
		bigBoardChoice = scan.nextInt();
			while(outOfBounds(bigBoardChoice)){
			System.out.println("That choice is out of bounds, please pick again");
			System.out.println("Big Board Number: ");
			bigBoardChoice = scan.nextInt();
			}
			
		System.out.println("Little Board Number:");
		littleBoardChoice = scan.nextInt();
		while(outOfBounds(littleBoardChoice)){
			System.out.println("That choice is out of bounds, please pick again");
			System.out.println("Little Board Number: ");
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
				
				bigBoardChoice = scan.nextInt();
			}
				
				while(outOfBounds(bigBoardChoice) || bigBoard.beenWon(bigBoardChoice)){
					if(outOfBounds(bigBoardChoice)){
					
					System.out.println("That choice is out of bounds, please pick again");
					System.out.println("Big Board Number: ");
					bigBoardChoice = scan.nextInt();
					}else if (bigBoard.beenWon(bigBoardChoice)){
						System.out.println("This board has already been won");
						System.out.println("You may play anywhere else");
						System.out.println("Pick a new BigBoard spot");
						
						bigBoardChoice = scan.nextInt();
					}
			}
				
			System.out.println("Player you are playing at big board number " + bigBoardChoice);
			System.out.println("Player input the little board number you want to play at");
			System.out.println("Little Board Number:");
			littleBoardChoice=scan.nextInt();
			while(outOfBounds(littleBoardChoice)){
				System.out.println("That choice is out of bounds, please pick again");
				System.out.println("Little Board Number: ");
				littleBoardChoice = scan.nextInt();
				}
				
			bigBoard.writeGuess(current,bigBoardChoice,littleBoardChoice);

			/*if(bigBoard.returnBoardStatus()){
			bigBoardChoice=-1;
			}*/
			
			if(bigBoard.checkWin()){
				System.out.println("YOU HAVE WON THE GAME!!");
				break;
			}
			
		
			
			}
		}
			
			
		public static  boolean outOfBounds(int choice){
		if(choice<0 || choice>8){
			return true;
		}
		return false;
		}
		
		}
		
		
	


		
	