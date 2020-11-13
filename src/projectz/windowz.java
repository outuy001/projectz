
package projectz;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class windowz extends JPanel {
    public int x=0,y=0;
    Timer Totime= new Timer(15,new TotimeListener());
    Image logo = new ImageIcon(getClass().getResource("Back.gif")).getImage(); 
    Image Menulogo = new ImageIcon(getClass().getResource("logoMenu.png")).getImage(); 
    Image Starbutton = new ImageIcon(getClass().getResource("1Startz.png")).getImage(); 
    Image Quitebutton = new ImageIcon(getClass().getResource("1Quitz.png")).getImage();
    
    windowz(){
        //this.addMouseListener(new mouse1());
        Totime.start();
        this.addMouseMotionListener(new a());
        this.addMouseListener(new toch());
        this.setFocusable(true);
        this.requestFocus();
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(logo, 0,0,1280,720,null);
        g.drawImage(Menulogo,  500, 25, null);
        g.drawImage(Starbutton, 507, 250, null);
        g.drawImage(Quitebutton, 507, 400, null);
        
    }

  


class toch implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {    
        }

        @Override
        public void mousePressed(MouseEvent me) {
            if(me.getX()>=507 && me.getX()<=724 && me.getY()>=400 && me.getY()<=600){
                System.exit(0);
            }
            else if(me.getX()>=507 && me.getX()<=724 &&me.getY()>=250 && me.getY()<=450){
                Gamerealz.x =1;
                
                Totime.stop();
                
            }
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            
        }

        @Override
        public void mouseExited(MouseEvent me) {
            
        }
    }


    class TotimeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            repaint();
        }
    }
    
    class  a implements  MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent me) {
           
        }

        @Override
        public void mouseMoved(MouseEvent me) {
            if(me.getX()>=507 && me.getX()<=724 && me.getY()>=400 && me.getY()<=600){
                Quitebutton = new ImageIcon(getClass().getResource("2Quitz.png")).getImage();
            }
            else if(me.getX()>=507 && me.getX()<=724 &&me.getY()>=250 && me.getY()<=450){
                Starbutton = new ImageIcon(getClass().getResource("2Startz.png")).getImage(); 
            }
            else{
                Quitebutton = new ImageIcon(getClass().getResource("1Quitz.png")).getImage();
                Starbutton = new ImageIcon(getClass().getResource("1Startz.png")).getImage(); 
            }
        }
        
    }
}