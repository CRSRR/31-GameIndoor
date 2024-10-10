import java.awt.*;


class Player { 
	int height,width,status,coin;
	Pawn[] pa=new Pawn[4]; // Array of 4 pawns for each player 
	public Player(int height,int width) {
		status=-1;
		coin=0;
		for(int i=0;i<4;i++) { // Initializing pawns for each player 
			pa[i]=new Pawn(height,width); 
		}
	}
	public void draw(Graphics2D g) {
	}
}