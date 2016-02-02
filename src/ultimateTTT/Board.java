package ultimateTTT;

import java.util.ArrayList;

public class Board {
	private ArrayList<InnerBoard> bigBoard;
	
	public Board(){
		this.bigBoard = new ArrayList<InnerBoard>();
		for (int i=0;i<9;i++){
			this.bigBoard.add(new InnerBoard());
		}
	}
	
	public boolean writeGuess(Move move, int bigBoard, int littleBoard){
		if (bigBoard<0 || bigBoard>8){
			System.out.println("Big Board out of bounds");
			return false;}
		return this.bigBoard.get(bigBoard).writeMove(move, littleBoard);
	}
	public boolean beenWon(int location){
		return this.bigBoard.get(location).returnWon();
	}

	public boolean checkWin(){
		if (this.bigBoard.get(0).returnWinner()!=Move.E && this.bigBoard.get(0).returnWinner()== this.bigBoard.get((1)).returnWinner()&& this.bigBoard.get(1).returnWinner()==this.bigBoard.get(2).returnWinner()){
			return true;
		}
		if (this.bigBoard.get(3).returnWinner()!=Move.E &&this.bigBoard.get((3)).returnWinner()==this.bigBoard.get((4)).returnWinner()&&this.bigBoard.get(5).returnWinner()==this.bigBoard.get((4)).returnWinner()){
			return true;
		}
		if (this.bigBoard.get(6).returnWinner()!=Move.E &&this.bigBoard.get((6)).returnWinner()==this.bigBoard.get((7)).returnWinner()&&this.bigBoard.get(8).returnWinner()==this.bigBoard.get((7)).returnWinner()){
			return true;
		}
		if (this.bigBoard.get(0).returnWinner()!=Move.E &&this.bigBoard.get((0)).returnWinner()==this.bigBoard.get((3)).returnWinner()&&this.bigBoard.get(6).returnWinner()==this.bigBoard.get((3)).returnWinner()){
			return true;
		}
		if (this.bigBoard.get(1).returnWinner()!=Move.E &&this.bigBoard.get((1)).returnWinner()==this.bigBoard.get((4)).returnWinner()&&this.bigBoard.get(7).returnWinner()==this.bigBoard.get((4)).returnWinner()){
			return true;
		}
		if (this.bigBoard.get(2).returnWinner()!=Move.E &&this.bigBoard.get((2)).returnWinner()==this.bigBoard.get((5)).returnWinner()&&this.bigBoard.get(8).returnWinner()==this.bigBoard.get((5)).returnWinner()){
			return true;
		}
		if (this.bigBoard.get(0).returnWinner()!=Move.E &&this.bigBoard.get((0)).returnWinner()==this.bigBoard.get((4)).returnWinner()&&this.bigBoard.get(8).returnWinner()==this.bigBoard.get((4)).returnWinner()){
			return true;
		}
		if (this.bigBoard.get(2).returnWinner()!=Move.E &&this.bigBoard.get((2)).returnWinner()==this.bigBoard.get((4)).returnWinner()&&this.bigBoard.get(6).returnWinner()==this.bigBoard.get((4)).returnWinner()){
			return true;
		}
		
		return false;
	}
	
	public void printBoard(){
		for (int i = 0; i<3 ; i++ ){
			for (int j=0; j<3;j++){
				InnerBoard lilBoard1 = bigBoard.get(3*i);
				InnerBoard lilBoard2 = bigBoard.get(3*i+1);
				InnerBoard lilBoard3 = bigBoard.get(3*i+2);
				lilBoard1.printRow(j);
				lilBoard2.printRow(j);
				lilBoard3.printRow(j);
				System.out.println();
			}
			System.out.print("_________\n");
		}
		
	}
	
	public boolean checkBoardPlayable(int boardNum){
		return !(bigBoard.get(boardNum).returnBoardStatus() || bigBoard.get(boardNum).returnWon());
	}
	
	public boolean playableInnerLocation(int big, int inner){
		return this.bigBoard.get(big).playable(inner);
	}
	
}
