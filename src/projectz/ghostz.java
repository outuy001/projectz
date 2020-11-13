/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectz;

import java.awt.Image;

/**
 *
 * @author Max
 */
public class ghostz extends aaaz {

    public ghostz(int x, int y, Image he) {
        super(x, y, he);
    }
    @Override
    public void move(){
        x-=40;
        
        
    }
    @Override
    public void kumnung(){
        stnextz1.scoure-=200;
        if(stnextz1.scoure <= 0){
            stnextz1.scoure=0;
        }
    }
}
