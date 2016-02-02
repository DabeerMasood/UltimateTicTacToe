package ultimateTTT;

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
		
		while(bigBoard.checkWin(current)==false){
		
			
			
		}
		
	}

}
