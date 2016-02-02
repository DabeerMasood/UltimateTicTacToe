package ultimateTTT;

import java.util.ArrayList;

public class InnerBoard {
	
	private ArrayList<Move> boardArray; 
	private boolean wonBoard;
	private boolean fullBoard;
	private Move winner;
	
	public InnerBoard(){
		this.boardArray= new ArrayList<Move>();
		//System.out.print(this.boardArray.size());
		for (int i=0; i<9; i++){
			this.boardArray.add(Move.E);
		}
		this.fullBoard=false;
		this.winner=Move.E;
	}
	
	public boolean writeMove(Move move, int location){
		if (location<0 || location>8){
			System.out.println("Little board out of bounds");
			return false;}
		if (this.boardArray.get(location) != Move.E){return false;}
		else{
			boardArray.set(location, move);
			if (checkWin(move)==true){
				wonBoard=true;
				this.winner=move;
			}
			if (!this.boardArray.contains(Move.E)){//checks to see if little board is full
				this.fullBoard=true;
			}
			return true;
		}
		
	}
	
	public boolean checkWin(Move move){
		if (this.boardArray.get(0)!=Move.E &&this.boardArray.get((0)).equals(move)&&this.boardArray.get((1)).equals(move)&&this.boardArray.get(2).equals(move)){
			return true;
		}
		if (this.boardArray.get(3)!=Move.E && this.boardArray.get((3)).equals(move)&&this.boardArray.get((4)).equals(move)&&this.boardArray.get(5).equals(move)){
			return true;
		}
		if (this.boardArray.get(6)!=Move.E && this.boardArray.get((6)).equals(move)&&this.boardArray.get((7)).equals(move)&&this.boardArray.get(8).equals(move)){
			return true;
		}
		if (this.boardArray.get(0)!=Move.E && this.boardArray.get((0)).equals(move)&&this.boardArray.get((3)).equals(move)&&this.boardArray.get(6).equals(move)){
			return true;
		}
		if (this.boardArray.get(1)!=Move.E && this.boardArray.get((1)).equals(move)&&this.boardArray.get((4)).equals(move)&&this.boardArray.get(7).equals(move)){
			return true;
		}
		if (this.boardArray.get(2)!=Move.E && this.boardArray.get((2)).equals(move)&&this.boardArray.get((5)).equals(move)&&this.boardArray.get(8).equals(move)){
			return true;
		}
		if (this.boardArray.get(0)!=Move.E && this.boardArray.get((0)).equals(move)&&this.boardArray.get((4)).equals(move)&&this.boardArray.get(8).equals(move)){
			return true;
		}
		if (this.boardArray.get(2)!=Move.E && this.boardArray.get((2)).equals(move)&&this.boardArray.get((4)).equals(move)&&this.boardArray.get(6).equals(move)){
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
	
	public boolean returnWon(){
		return this.wonBoard;
	}
	
	public boolean playable(int location){
		if (this.boardArray.get(location)!=Move.E){
			return false;
		}
		return true;
	}
	
	public void printRow(int row){
		for (int i=3*row; i<(3*row+3); i++){
			if (boardArray.get(i)==Move.X){
				System.out.print('X');

			} else if(boardArray.get(i)==Move.O){
				System.out.print('O');

			} else if (boardArray.get(i)==Move.E){System.out.print('.');}
		}
		System.out.print('|');
	}
}
