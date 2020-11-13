package projectz;

import java.awt.Image;

public class sword extends aaaz{
    
    public sword(int x, int y, Image he) {
        super(x, y, he);
    }
    @Override
    public void move(){
        x-=30;
    }
    @Override
    public void kumnung(){
        stnextz1.scoure+=50;
        stnextz1.mushp -=1;
    }
}