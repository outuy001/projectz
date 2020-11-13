package projectz;

import java.awt.Image;
import java.awt.*;

public class firez extends aaaz {
    boolean m=true;
    public firez(int x, int y, Image he) {
        super(x, y, he);
    }
    @Override
    public void move(){
        x-=35;        
        if(m){
            y-=35;
            if(y<= 200){
                m=false;
            }
        }
        else if(!m){
            y+=35;
            
            if(y>=500){
                m=true;
            }
        }

    }
    @Override
    public void kumnung(){
        stnextz1.hp--;
        stnextz1.scoure-=200;
        if(stnextz1.hp <= 0){
            stnextz1.hp=0;           
        }
    }
    Rectangle hit(){
        return new Rectangle(x,y,50,50);
    }
}