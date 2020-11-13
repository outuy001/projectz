/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectz;

import java.awt.*;
import javax.swing.*;

public class coinz{
    public int x=0,y=0,cout=0;
    Image coin1 = new ImageIcon(getClass().getResource("newcoin1.png")).getImage();
    Image coin2 = new ImageIcon(getClass().getResource("newcoin2.png")).getImage();
    Image coin3 = new ImageIcon(getClass().getResource("newcoin3.png")).getImage();
    Image coin4 = new ImageIcon(getClass().getResource("newcoin4.png")).getImage();
    Image coin5 = new ImageIcon(getClass().getResource("newcoin5.png")).getImage();
    Image coin6 = new ImageIcon(getClass().getResource("newcoin6.png")).getImage();
    
    Image Aarry[] ={coin1,coin2,coin3,coin4,coin5,coin6};
    
    coinz(){
        
    }
    coinz(int x){
        this.x =x;
    }
    Rectangle hit(){
        return new Rectangle(x,y,50,50);
    }
    
    public void move(){
        y+=8;
        if(y>=500){
            y=500;
            
        }
    }
}
