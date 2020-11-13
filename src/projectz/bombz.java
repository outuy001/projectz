/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectz;
import java.awt.*;
import javax.swing.*;


public class bombz {
    public int x=0,y=0;
    Image bomb1 = new ImageIcon(getClass().getResource("bomb.png")).getImage();
    Image bomb2 = new ImageIcon(getClass().getResource("bomb1.png")).getImage();
    Image bomb3 = new ImageIcon(getClass().getResource("bomb2.png")).getImage();
    Image bomb4 = new ImageIcon(getClass().getResource("bomb3.png")).getImage();
    
    Image Array[] ={bomb1,bomb2,bomb3,bomb4};
    
    bombz(){
        
    }
    
    bombz(int x){
        this.x =x;
    }
     Rectangle hit(){
        return new Rectangle(x,y,100,100);
    }
     public void move(){
        y+=8;
       
    }
}