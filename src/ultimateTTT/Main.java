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
		int nextBoard= littleBoardChoice;
		int turn =2;
		while(bigBoard.checkWin(current)==false){
		if(turn=2){
		current = Move.O;
		}else if(turn==1){
		current = Move.X;
		
		if(nextBoard==-1){
		System.out.println("You may play anywhere else");
		System.out.println("Pick a new BigBoard spot");
		
		bigBoardChoice = scan.nextInt();
		}
		
		System.out.println("Player you are playing at " + nextBoard);
		System.out.println("Player input the little board number you want to play at");
		System.out.println("Little Board Number:");
		littleBoardChoice=scan.nextInt();
		bigBoard.writeGuess(current,bigBoardChoice,littleBoardChoice);
		
		
			
			
			
			
			
		}
		}
		
	}

}
