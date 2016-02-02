package ultimateTTT;

import java.util.ArrayList;

public class InnerBoard {
	public enum Move{
		X, O
	}
	
	private ArrayList<Move> boardArray; 
	private boolean wonBoard;
	private boolean fullBoard;
	private Move winner;
	
	public InnerBoard(){
		this.boardArray= new ArrayList<Move>(9);
		for (int i=0; i<9; i++){
			this.boardArray.set(i, null);
		}
		this.fullBoard=false;
	}
	
	public boolean writeMove(Move move, int location){
		if (location<0 || location>8){return false;}
		if (this.boardArray.get(location) != null){return false;}
		else{
			boardArray.set(location, move);
			
			if (!this.boardArray.contains(null)){
				this.fullBoard = true;
				this.winner = move;
			}
			return true;
		}
		
	}
	
	public boolean returnBoardStatus(){
		return this.fullBoard;
	}
	
	public Move returnWinner(){
		return this.winner;
	}
}
