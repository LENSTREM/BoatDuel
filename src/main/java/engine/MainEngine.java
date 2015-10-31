package engine;

import controller.BoatController;
import entitys.BoundaryBuoy;
import entitys.PlayerBoat;
import view.GamePanel;

import javax.swing.*;
import java.awt.event.*;

public class MainEngine  implements ActionListener {
    private Timer mainTimer = new Timer(20,this);
    private BoatController boatController;
    private PlayerBoat playerBoat;
    private GamePanel gamePanel;
	private BoundaryBuoy boundaryBuoys [];



    public MainEngine() {
        mainTimer.start();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playerBoat.move();
	    for(int i=0;i<boundaryBuoys.length;i++){
		    boundaryBuoys[i].move();
	    }

        gamePanel.repaint();
    }

    public void setPlayerBoat(PlayerBoat playerBoat) {
        this.playerBoat = playerBoat;
	    boundaryBuoys = new BoundaryBuoy[10];
	    for(int i=0;i<10;i++){
		    boundaryBuoys[i] = new BoundaryBuoy(playerBoat);
		    boundaryBuoys[i].setPosition_y((i*72));
	    }

        this.boatController =  BoatController.getInstance();
        this.boatController.setPlayerBoat(this.playerBoat);
    }

    public void setGamePanel(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        this.gamePanel.addKeyListener(new MyKeyAddapter());
        this.gamePanel.setFocusable(true);



    }

    public BoatController getBoatController() {
        return boatController;
    }

	public BoundaryBuoy [] getBoundaryBuoy() {
		return boundaryBuoys;
	}

	private class MyKeyAddapter implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            boatController.pressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
