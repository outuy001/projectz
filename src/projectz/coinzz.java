package projectz;

import java.awt.*;
import javax.swing.*;

public class coinzz{
    public int x=0,y=0,cout=0;
    Image coinz1 = new ImageIcon(getClass().getResource("newnewcoin1.png")).getImage();
    Image coinz2 = new ImageIcon(getClass().getResource("newnewcoin2.png")).getImage();
    Image coinz3 = new ImageIcon(getClass().getResource("newnewcoin3.png")).getImage();
    Image coinz4 = new ImageIcon(getClass().getResource("newnewcoin4.png")).getImage();
    Image coinz5 = new ImageIcon(getClass().getResource("newnewcoin5.png")).getImage();
    Image coinz6 = new ImageIcon(getClass().getResource("newnewcoin6.png")).getImage();
    
    Image Aarry[] ={coinz1,coinz2,coinz3,coinz4,coinz5,coinz6};
    
    coinzz(){
        
    }
    coinzz(int x){
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