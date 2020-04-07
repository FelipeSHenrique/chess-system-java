package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//POSIÇÃO DE UMA PEÇA RECEM CRIADO VAI SER NULLO
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
}
