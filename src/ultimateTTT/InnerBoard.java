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
			
			if (!this.boardArray.contains(null)){//checks to see if little board is full
				this.winner = move;
			}
			return true;
		}
		
	}
	
	public boolean checkWin(Move move){
		if (this.boardArray.get((0)).equals(move)&&this.boardArray.get((1)).equals(move)&&this.boardArray.get(2).equals(move)){
			return true;
		}
		if (this.boardArray.get((3)).equals(move)&&this.boardArray.get((4)).equals(move)&&this.boardArray.get(5).equals(move)){
			return true;
		}
		if (this.boardArray.get((6)).equals(move)&&this.boardArray.get((7)).equals(move)&&this.boardArray.get(8).equals(move)){
			return true;
		}
		if (this.boardArray.get((0)).equals(move)&&this.boardArray.get((3)).equals(move)&&this.boardArray.get(6).equals(move)){
			return true;
		}
		if (this.boardArray.get((1)).equals(move)&&this.boardArray.get((4)).equals(move)&&this.boardArray.get(7).equals(move)){
			return true;
		}
		if (this.boardArray.get((2)).equals(move)&&this.boardArray.get((5)).equals(move)&&this.boardArray.get(8).equals(move)){
			return true;
		}
		if (this.boardArray.get((0)).equals(move)&&this.boardArray.get((4)).equals(move)&&this.boardArray.get(8).equals(move)){
			return true;
		}
		if (this.boardArray.get((2)).equals(move)&&this.boardArray.get((4)).equals(move)&&this.boardArray.get(6).equals(move)){
			return true;
		}
		
		return false;
		
		
	
	}
	
	
	public boolean returnBoardStatus(){
		return this.fullBoard;
	}
	
	public Move returnWinner(){
		return this.winner;
	}
}
