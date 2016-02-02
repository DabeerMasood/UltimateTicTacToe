package ultimateTTT;

public class Main {

	public static void main(String[] args) {
		Board bigBoard = new Board();
		int bigBoardChoice = 0;
		int littleBoardChoice=0;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner();
		System.out.println("Player one please input the Bigboard number followed by the littelboard number you want to play at");
		System.out.println("Big Board Number:");
		bigBoardChoice = scan.nextInt();
		System.out.println("Little Board Number:");
		littleBoardChoice = scan.nextInt();
		Move current = Move.x;
		bigBoard.writeGuess(current,bigBoardChoice,littleBoardChoice);
		
		while(bigBoard.checkWin()==false){
		
			
			
			
			
			
			
		}
		}
	}

}
