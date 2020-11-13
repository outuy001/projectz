/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectz;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
public class car {
    int x=1100;
    int y=570;
    int cout=0;
    
    Image car = new ImageIcon(getClass().getResource("car1.png")).getImage();

    Image Aarry[] ={car};
    car(){
        
    }
    public void move(){
        x-=30;
        if(x<0){
            x=1300;
        }
    }
    Rectangle hit(){
        return new Rectangle(x,y,20,20);
    }
}