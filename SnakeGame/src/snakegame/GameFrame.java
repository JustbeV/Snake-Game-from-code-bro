/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegame;

import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class GameFrame extends JFrame{
    
    GameFrame(){
        
        GamePanel panel=new GamePanel();
        
        this.add(panel);
        this.setTitle("Snake Game^^");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(720,720);//sets the size of the Frame.
        //this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
