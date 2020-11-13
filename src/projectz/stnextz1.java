package projectz;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import static java.awt.event.KeyEvent.VK_UP;
import java.util.ArrayList;
import java.util.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class stnextz1 extends JPanel {

    public int x = 0, Rdom = 0 , Rdom2 = 0, Rdom3 = 0;
    public int y = 0;
    public int a = 0, b = 0, c = 0, d = 0,e = 0,r=0;

    public static int pp = 0, scoure = 0, clocK = 120,hp=3,mushp=5;
    public car monland = new car();
    public Doraz dora = new Doraz();
    public int next = 0;
    public int yfox = dora.y;
    public int jfox = 0;
    
    public bossz spmuss = new bossz();
    public coinz Coinnew = new coinz();
    public coinzz Coinnewnew = new coinzz();
    public meaTz Meatt = new meaTz();
    public potionz Potion = new potionz();
    public ArrayList<coinz> coinAar = new ArrayList<coinz>();
    public ArrayList<coinzz> newnewcoinAar = new ArrayList<coinzz>();
    public ArrayList<bombz> bombAar = new ArrayList<bombz>();
    public ArrayList<planez> planeAar = new ArrayList<planez>();
    public ArrayList<aaaz> ojout = new ArrayList();
    public ArrayList<car> carzz = new ArrayList<car>();
    public ArrayList<meaTz> meatAar =new ArrayList<meaTz>();
    public ArrayList<potionz> potionAar =new ArrayList<potionz>();
    public bombz Ballcon = new bombz();
    public planez crashed = new planez();
    
    public boolean Up = false;
    public boolean endgame =false;
   

    Image backG = new ImageIcon(getClass().getResource("BackG1.jpg")).getImage();
    Image h3 = new ImageIcon(getClass().getResource("heartnew3.png")).getImage();
    Image h2 = new ImageIcon(getClass().getResource("heartnew2.png")).getImage();
    Image h1 = new ImageIcon(getClass().getResource("heartnew1.png")).getImage();
    Image bhp5 = new ImageIcon(getClass().getResource("bosshp5.png")).getImage();
    Image bhp4 = new ImageIcon(getClass().getResource("bosshp4.png")).getImage();
    Image bhp3 = new ImageIcon(getClass().getResource("bosshp3.png")).getImage();
    Image bhp2 = new ImageIcon(getClass().getResource("bosshp2.png")).getImage();
    Image bhp1 = new ImageIcon(getClass().getResource("bosshp1.png")).getImage();
    
    stnextz1() {
        runmon.start();
        fadd.start();
        fallbomb.start();
        fallplane.start();
        
        
        clock.start();
        this.setFocusable(true);
        bossoj.start();
        
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                    x = x + 20;
                    y = 500;
                } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                    x = x - 20;
                    y = 500;
                } else if (ke.getKeyCode() == KeyEvent.VK_UP) {
                    jfox = -60;
                }               

                if (x > 1280) {
                    x = 0;
                    y = 0;

                }
                dora.x = x;
                dora.y = y;
            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }
        });
        time.start();
    }
    
    Thread fallbomb = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    fallbomb.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(stnextz1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });
    
    Thread fallplane = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    fallplane.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(stnextz1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    });

    Thread runmon = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    runmon.sleep(60);
                    if (b >= 3) {
                        b = 0;
                    }
                    b++;
                    repaint();
                } catch (Exception e) {

                }
            }
        }
    });
    public class mclick implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getX()>=438 &&e.getX()<=760 &&e.getY()>=415 &&e.getY()<=571){
               System.exit(0); 
            }
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    }
    Thread fadd = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    fadd.sleep(1500);
                    Rdom = (int) (Math.random() * 1280);
                    coinAar.add(new coinz(Rdom));
                    Rdom2 = (int) (Math.random() * 1280);
                    newnewcoinAar.add(new coinzz(Rdom2));
                    Rdom3 = (int) (Math.random() * 1280);
                    planeAar.add(new planez(Rdom3));
                    
                    carzz.add(monland);
                } catch (Exception e) {
                }
            }
        }

    });
    Thread timemuss = new Thread(new Runnable(){
        @Override
        public void run() {
            while(true){
                try {
                    fadd.sleep(1500);
                    
                } catch (Exception e) {
                }
            }
        }
        
    });
    
    Thread bossoj = new Thread(new Runnable(){
        @Override
        public void run() {
            while(true){
                try{                  
                    bossoj.sleep(1500);
            int bossatk= new Random().nextInt(2);
            int pos[] ={400,520};
            int ran = new Random().nextInt(4);
            if(ran ==0){
                ojout.add(new firez(1000,pos[bossatk],new ImageIcon(getClass().getResource("fire.png")).getImage()));//
            }
            else if(ran ==1){
                ojout.add(new keez(1000,pos[bossatk],new ImageIcon(getClass().getResource("kee.png")).getImage()));//
            }            
            else if(ran ==2){
                ojout.add(new sword(1000,pos[bossatk],new ImageIcon(getClass().getResource("sword.png")).getImage()));//
            }
            else if(ran ==3){
                ojout.add(new ghostz(1000,pos[bossatk],new ImageIcon(getClass().getResource("ghost.png")).getImage()));//
            }
                }
                catch(Exception e){}
        }
        }
    });
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        dora.y=yfox;
        g.drawImage(backG, 0, 0, this);
        if(endgame == false){
            if(hp==3){
                        g.drawImage(h3, 750, 80, this);
                    }
                    else if(hp==2){
                        g.drawImage(h2, 750, 80, this);
                    }
                    else if(hp==1){
                        g.drawImage(h1, 750, 80, this);
                    }
            if(scoure > 1800){
                if(mushp==5){
               g.drawImage(bhp5, 1045, 380, this);
            }
            else if(mushp==4){
               g.drawImage(bhp4, 1045, 380, this); 
            }
            else if(mushp==3){
               g.drawImage(bhp3, 1045, 380, this); 
            }
            else if(mushp==2){
               g.drawImage(bhp2, 1045, 380, this); 
            }
            else if(mushp==1){
               g.drawImage(bhp1, 1045, 380, this); 
            }
          }
        }
        if (scoure >= 800 && scoure < 1800) {
            backG = new ImageIcon(getClass().getResource("map2.png")).getImage();
        } else if (scoure > 1800) {
            next = 1;           
            backG = new ImageIcon(getClass().getResource("BackG3.gif")).getImage();
        }
        yfox += jfox;
        if (yfox <= 350) {
            jfox += 50;
        }
        if (yfox >= 500) {
            jfox = 0;
            yfox = 500;
        }
        if(clocK <= 0 || hp <= 0 || mushp<=0){
           
           endgame = true;
        }
        if (clocK > 0 && hp>0 &&mushp>0) {
            
            g.drawImage(dora.Array[a], dora.x, yfox, 170, 117, this);
            
    
            g.setFont(new Font("", Font.PLAIN, 40));
            g.setColor(Color.RED);
            g.drawString("Score:" + " " + scoure, 500, 100);
            g.drawString("Timer:" + " " + clocK, 200, 100);
            
            
            if (next >= 0) {
                
                for (int i = 0; i < carzz.size(); i++) {
                    g.drawImage(monland.Aarry[monland.cout%1],carzz.get(i).x,carzz.get(i).y,50,50,this);
                    
                    monland.cout++;
                    if (inter(dora.hit(), monland.hit())) {
                    scoure -=25;
                    carzz.remove(i);
                    if(stnextz1.scoure <= 0){
                    stnextz1.scoure=0;
                }
                    
                }                   
                }
                
                 if (meatAar.size() == 0) {
                    Rdom = (int) (Math.random() * 1280);
                    meatAar.add(new meaTz(Rdom));
                    
                    
                }
                for (int i = 0; i < meatAar.size(); i++) {
                    meatAar.get(i).move();
                    g.drawImage(meatAar.get(i).eat, meatAar.get(i).x, meatAar.get(i).y, 50,50,this);
                    if (inter(dora.hit(), meatAar.get(i).hit())) {
                    scoure +=200;
                    meatAar.remove(i);
                    }
                }
                for (int i = 0; i < meatAar.size(); i++) {
                    if (meatAar.get(i).y >= 500) {
                        meatAar.remove(i);
                    }
                }
                if (meatAar.size() == 0) {
                    Rdom = (int) (Math.random() * 1280);
                    meatAar.add(new meaTz(Rdom));
                    
                    
                }
                //potion
                if (potionAar.size() == 0) {
                    Rdom = (int) (Math.random() * 1280);
                    potionAar.add(new potionz(Rdom));
                    
                    
                }
                for (int i = 0; i < potionAar.size(); i++) {
                    potionAar.get(i).move();
                    g.drawImage(potionAar.get(i).potion, potionAar.get(i).x, potionAar.get(i).y, 50,50,this);
                    if (inter(dora.hit(), potionAar.get(i).hit())) {                   
                    hp++;
                    if(hp>=3){
                        hp=3;
                    }
                    potionAar.remove(i);
                    }
                }
                for (int i = 0; i < potionAar.size(); i++) {
                    if (potionAar.get(i).y >= 500) {
                        potionAar.remove(i);
                    }
                }
                
                //gold coin fall

                for (int j = 0; j < coinAar.size(); j++) {
                    g.drawImage(Coinnew.Aarry[Coinnew.cout % 6], coinAar.get(j).x, coinAar.get(j).y, 50, 50, this);
                    Coinnew.cout++;
                    coinAar.get(j).move();

                    if (inter(dora.hit(), coinAar.get(j).hit())) {
                        scoure += 200;
                        coinAar.remove(j);
                    }
                }
                for (int i = 0; i < coinAar.size(); i++) {
                    if (coinAar.get(i).y >= 500) {
                        coinAar.remove(i);
                    }
                }
                
                //silver coin fall
                for (int i = 0; i < newnewcoinAar.size(); i++) {
                    g.drawImage(Coinnewnew.Aarry[Coinnewnew.cout % 6], newnewcoinAar.get(i).x, newnewcoinAar.get(i).y, 50, 50, this);
                    Coinnewnew.cout++;
                    newnewcoinAar.get(i).move();

                    if (inter(dora.hit(), newnewcoinAar.get(i).hit())) {
                        scoure += 100;
                        newnewcoinAar.remove(i);
                    }
                }
                for (int i = 0; i < newnewcoinAar.size(); i++) {
                    if (newnewcoinAar.get(i).y >= 500) {
                        newnewcoinAar.remove(i);
                    }
                }

                //bomb fall
                if (bombAar.size() == 0) {
                    Rdom = (int) (Math.random() * 1280);
                    bombAar.add(new bombz(Rdom));
                    d = 0;
                }
                for (int i = 0; i < bombAar.size(); i++) {
                    bombAar.get(i).move();
                    g.drawImage(bombAar.get(i).Array[d], bombAar.get(i).x, bombAar.get(i).y, 100, 100, this);

                    if (inter(dora.hit(), bombAar.get(i).hit())) {
                        d++;
                        if (d > 3) {
                            d = 3;
                            bombAar.clear();
                            scoure -= 100;
                        }
                    }
                }
                for (int i = 0; i < bombAar.size(); i++) {
                    if (bombAar.get(i).y >= 500) {
                        d++;
                        if (d > 3) {
                            d = 3;
                            bombAar.clear();
                        }
                    }
                }
                
                monland.move();
                
            }
            
            if(next == 1){ //poly
                if(r==0){
                    ojout.removeAll(ojout);
                }
                r++;
                
                g.drawImage(spmuss.arIm[spmuss.cout%4], 1000, 400, this);
                spmuss.cout++;
                for (int i = 0; i < ojout.size(); i++) {
                    aaaz kujang = ojout.get(i);
                    g.drawImage(kujang.he,kujang.x, kujang.y, null);
                    kujang.move();
                    
                    if(inter(dora.hit(),kujang.myrec())){
                        kujang.kumnung();
                        ojout.remove(i);                       
                    }
                }
            }
        }
        
        if(endgame){
            backG = new ImageIcon(getClass().getResource("endgame.png")).getImage();
            g.setFont(new Font("", Font.BOLD, 120));
            g.setColor(Color.YELLOW);
           g.drawString(" " + scoure, 460, 350);
           this.addMouseListener(new mclick());
        }
        
        
    }
    Thread clock = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    time.sleep(1000);
                    clocK--;

                } catch (InterruptedException ex) {
                    Logger.getLogger(stnextz1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    });

    Thread time = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    time.sleep(100);
                    if (a >= 3) {
                        a = 0;

                    }
                    a++;

                } catch (Exception e) {
                }
            }
        }

    });

    public boolean inter(Rectangle a, Rectangle b) {
        return a.intersects(b);
    }

}