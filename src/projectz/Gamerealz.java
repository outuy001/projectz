package projectz;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Gamerealz extends JFrame implements ActionListener  {
        windowz menu;
        stnextz1 next;
        public static int x=0;
        Timer ready = new Timer(10,this);
        
        Gamerealz(){
        
       this.setSize(1280,700);
       this.setResizable(true);
       this.setTitle("THE HUNGRY CAT");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       menu = new windowz();
       this.setContentPane(menu);
       this.setLocationRelativeTo(null);
       validate();
       ready.start();
       
        }
        
        
    public static void main(String[] args) {
       Gamerealz frame = new Gamerealz();
    }   


    @Override
    public void actionPerformed(ActionEvent e) {       
        if(x==1){
            x=0;
            menu.removeAll();
            next = new stnextz1();
            this.setContentPane(next);
            next.setFocusable(true);
            next.requestFocusInWindow();
            this.validate();
        }
    }
}