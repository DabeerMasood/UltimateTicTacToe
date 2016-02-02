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
		System.out.println("Little Board Number:");
		littleBoardChoice = scan.nextInt();
		Move current = Move.X;
		bigBoard.writeGuess(current,bigBoardChoice,littleBoardChoice);
		int nextBoard= littleBoardChoice;
		String turn ="";
		while(bigBoard.checkWin(current)==false){
			
				
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
				
			System.out.println("Player you are playing at big board number " + bigBoardChoice);
			System.out.println("Player input the little board number you want to play at");
			System.out.println("Little Board Number:");
			littleBoardChoice=scan.nextInt();
			bigBoard.writeGuess(current,bigBoardChoice,littleBoardChoice);
			System.out.println("check");

			/*if(bigBoard.returnBoardStatus()){
			bigBoardChoice=-1;
			}*/
			bigBoardChoice = littleBoardChoice;
			
			if(bigBoard.checkWin(current)){
				System.out.println("YOU HAVE WON THE GAME!!");
				break;
			}
			
		
			
			}
		}
			
			
		}
		
		
	


		
	