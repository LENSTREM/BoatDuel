package controller;

import entitys.PlayerBoat;

import java.awt.event.KeyEvent;

public class BoatController {
    private PlayerBoat playerBoat;

    public BoatController(PlayerBoat playerBoat) {
        this.playerBoat = playerBoat;
    }

    public void pressed(KeyEvent e){
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT){
                System.out.println(1);
                playerBoat.setBoatW();

            }if(key == KeyEvent.VK_RIGHT){
            System.out.println(2);
                playerBoat.setBoatE();
            }
        }


    private void rotate(){

    }



}
