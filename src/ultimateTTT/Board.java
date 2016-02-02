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
	
	
}
