
package projectz;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class potionz {
    public int x=0,y=0,cout=0;
    Image potion = new ImageIcon(getClass().getResource("potion.png")).getImage();
    potionz(){
        
    }
    potionz(int x){
        this.x=x;
    }
    
    Rectangle hit(){
        return new Rectangle(x,y,50,50);
    }
    public void move(){
        y+=15;
        if(y>=500){
            y=500;
            
        }
    }
    
}