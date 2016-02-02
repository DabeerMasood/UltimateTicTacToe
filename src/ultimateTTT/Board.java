package ultimateTTT;

import java.util.ArrayList;

public class Board {
	private ArrayList<InnerBoard> bigBoard;
	
	public Board(){
		bigBoard = new ArrayList<InnerBoard>(9);
	}
	
	public boolean writeGuess(Move move, int bigBoard, int littleBoard){
		if (bigBoard<0 || bigBoard>8){return false;}
		return this.bigBoard.get(bigBoard).writeMove(move, littleBoard);
	}
	

	public boolean checkWin(Move move){
		if (this.bigBoard.get((0)).equals(move)&&this.bigBoard.get((1)).equals(move)&&this.bigBoard.get(2).equals(move)){
			return true;
		}
		if (this.bigBoard.get((3)).equals(move)&&this.bigBoard.get((4)).equals(move)&&this.bigBoard.get(5).equals(move)){
			return true;
		}
		if (this.bigBoard.get((6)).equals(move)&&this.bigBoard.get((7)).equals(move)&&this.bigBoard.get(8).equals(move)){
			return true;
		}
		if (this.bigBoard.get((0)).equals(move)&&this.bigBoard.get((3)).equals(move)&&this.bigBoard.get(6).equals(move)){
			return true;
		}
		if (this.bigBoard.get((1)).equals(move)&&this.bigBoard.get((4)).equals(move)&&this.bigBoard.get(7).equals(move)){
			return true;
		}
		if (this.bigBoard.get((2)).equals(move)&&this.bigBoard.get((5)).equals(move)&&this.bigBoard.get(8).equals(move)){
			return true;
		}
		if (this.bigBoard.get((0)).equals(move)&&this.bigBoard.get((4)).equals(move)&&this.bigBoard.get(8).equals(move)){
			return true;
		}
		if (this.bigBoard.get((2)).equals(move)&&this.bigBoard.get((4)).equals(move)&&this.bigBoard.get(6).equals(move)){
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
			}
			System.out.print("_________");
		}
		
	}
	
}
