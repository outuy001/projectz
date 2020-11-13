
package projectz;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class meaTz {
    public int x=0,y=0,cout=0;
    Image eat = new ImageIcon(getClass().getResource("eat.png")).getImage();
    meaTz(){
        
    }
    meaTz(int x){
        this.x=x;
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