package entitys;

import javax.swing.*;
import java.awt.*;

public class BoundaryBuoy  {
	private Image boundaryBuoyImg;
	private PlayerBoat playerBoat;

	private int position_x;
	private int position_y = 130;


/*	private int yVelocity ;
	private int xVelocity ;*/

	private int currentSpead;

	public BoundaryBuoy(PlayerBoat playerBoat) {
		this.playerBoat = playerBoat;
/*		this.xVelocity = playerBoat.getxVelocity();
		this.yVelocity = playerBoat.getyVelocity();*/
		this.boundaryBuoyImg = new ImageIcon("src/resources/images/BoundaryBuoy.png").getImage();
	}

	public void move(){
		position_y += playerBoat.getyVelocity();
		position_x += playerBoat.getxVelocity();
	}

	public Image getBoundaryBuoyImg() {
		return boundaryBuoyImg;
	}

	public int getPosition_y() {
		return position_y;
	}

	public int getPosition_x() {
		return position_x;
	}
}
