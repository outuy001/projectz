/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectz;
import java.awt.*;
import javax.swing.*;

public class Doraz {
    public int x = 0,y = 500;
    
    Image a1 = new ImageIcon(getClass().getResource("dora1.png")).getImage();
    Image a2 = new ImageIcon(getClass().getResource("dora2.png")).getImage();
    Image a3 = new ImageIcon(getClass().getResource("dora3.png")).getImage();
    Image a4 = new ImageIcon(getClass().getResource("dora4.png")).getImage();
    
    Image Array[] = {a1,a2,a3,a4};
    
    Doraz(){
    
     
    }
    
    
    Rectangle hit(){
        return new Rectangle(x,y,100,100);
    }
  
}
