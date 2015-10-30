package controller;

import entitys.PlayerBoat;

import java.awt.event.KeyEvent;

public class BoatController {
    private PlayerBoat playerBoat;
    private int position = 0;

    public BoatController(PlayerBoat playerBoat) {
        this.playerBoat = playerBoat;
    }

    public void pressed(KeyEvent e){
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT){
                if (position<2)position++;

            }if(key == KeyEvent.VK_RIGHT){
                if (position>-2)position--;
            }
        setImg();
        }


    private void setImg() {
        if(position == 0){
            playerBoat.setBoatN();
        }if(position == 1){
            playerBoat.setBoatNW();
        }if(position == 2){
            playerBoat.setBoatW();
        }if(position == -1){
            playerBoat.setBoatNE();
        }if(position == -2){
            playerBoat.setBoatE();
        }

    }


}
