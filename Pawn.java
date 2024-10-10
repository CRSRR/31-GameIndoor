import java.awt.*;

class Pawn {
	int x,y;
	int current;
	int height,width;
	public Pawn(int h,int w){ // Constructor to initialize pawn
		current=-1;
		x=-1;
		y=-1;
		height=h;
		width=w;
	}
	// Function to draw pawn on board 
	public void draw(Graphics2D g, int i, int j,int play) {
		if(current==-1) { // If pawn is not on board 
			int temp1=80+(height/2),temp2=50+(width/2); // Initial position of pawn 
			x=i; // x coordinate of pawn
			y=j; // y coordinate of pawn
			if(play==0) { // If player 1 
				g.setColor(Color.RED); // Color of pawn
			}
			else if(play==1) { // If player 2
				g.setColor(Color.GREEN); // Color of pawn
			} 
			else if(play==2) { // If player 3
				g.setColor(Color.YELLOW); // Color of pawn
			}
			else if(play==3) { // If player 4
				g.setColor(Color.BLUE); // Color of pawn
			}
			g.fillOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10); // Drawing pawn on board
			g.setStroke(new BasicStroke(2)); // Thickness of border
			g.setColor(Color.BLACK); // Color of border
	    	g.drawOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10); // Drawing border of pawn
		}
		else 
		{ // If pawn is on board 
			int temp1=80,temp2=50; // Initial position of board
			x=Path.ax[play][current]; // x coordinate of pawn
			y=Path.ay[play][current]; // y coordinate of pawn
			if(play==0) {
				g.setColor(Color.RED);
			}
			else if(play==1) {
				g.setColor(Color.GREEN);
			}
			else if(play==2) {
				g.setColor(Color.YELLOW);
			}
			else if(play==3) {
				g.setColor(Color.BLUE);
			}
			g.fillOval(temp1+5+(x*width),temp2+5+(y*height),width-10,height-10); // Drawing pawn on board
			g.setStroke(new BasicStroke(2)); // Thickness of border
			g.setColor(Color.BLACK);
	    	g.drawOval(temp1+5+(x*width),temp2+5+(y*height),width-10,height-10); // Drawing border of pawn
		}
	}
}