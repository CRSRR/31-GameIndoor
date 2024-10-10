import java.awt.*;

class Build_Player {
	Player[] pl=new Player[4]; 
	int[][] initialx= { // This is the array for the initial x positions of the players
			{1,1,3,3},
			{10,10,12,12},
			{10,10,12,12},
			{1,1,3,3}
	};
	int[][] initialy= { //This is the array for the initial y positions of the players
			{1,3,1,3},
			{1,3,1,3},
			{10,12,10,12},
			{10,12,10,12}
	};
	// This is the constructor for initializing the player positions
	public Build_Player(int height, int width) {
		for(int i=0;i<4;i++) {
			pl[i]=new Player(height,width);
		}
	}
	// This is the method for drawing the players
	public void draw(Graphics2D g) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				pl[i].pa[j].draw(g,initialx[i][j],initialy[i][j],i);
			}
		}
	}
	
}