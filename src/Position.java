public class Position {
	private int line;
	private int column;
	private String piece; //white, black or null
	
	Position(int l, int c){
		this.line = l;
		this.column = c;
	}
	
	public String toString() {
		String text = "";
		return(text + line +","+column);
	}
	int getLine() {
		return line;
	}
	int getCol() {
		return column;
	}
	
	void setPiece(String name) {
		piece = name;
	}
	
	String piece() {
		return piece;
	} 
	
	
}
