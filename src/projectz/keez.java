package projectz;

import java.awt.Image;
import java.awt.Rectangle;

public class keez extends aaaz {
    
    public keez(int x, int y, Image he) {
        super(x, y, he);
    }
    @Override
    public void move(){
        x-=50;
    }
    @Override
    public void kumnung(){
        stnextz1.scoure-=100;
        if(stnextz1.scoure <= 0){
            stnextz1.scoure=0;
        }
    }
    Rectangle hit(){
        return new Rectangle(x,y,50,50);
    }
}