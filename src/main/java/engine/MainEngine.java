package engine;

import controller.BoatController;
import entitys.BoundaryBuoy;
import entitys.PlayerBoat;
import view.GamePanel;

import javax.swing.*;
import java.awt.event.*;

public class MainEngine  implements ActionListener {
    private Timer mainTimer = new Timer(70,this);
    private BoatController boatController;
    private PlayerBoat playerBoat;
    private GamePanel gamePanel;
	private BoundaryBuoy boundaryBuoy;



    public MainEngine() {
        mainTimer.start();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playerBoat.move();
	    boundaryBuoy.move();
        gamePanel.repaint();
    }

    public void setPlayerBoat(PlayerBoat playerBoat) {
        this.playerBoat = playerBoat;
	    boundaryBuoy = new BoundaryBuoy(playerBoat);
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

	public BoundaryBuoy getBoundaryBuoy() {
		return boundaryBuoy;
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
