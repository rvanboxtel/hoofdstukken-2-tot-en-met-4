/**
 * Created by romek on 07-09-16.
 */
import java.awt.*;
import java.applet.*;

public class OpdrachtVierPuntVier extends Applet {

    public void init(){
    setBackground(Color.white);

    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(110, 11, 150,20);
        g.drawRect(30, 11, 80,20);
        g.drawString("Kinderen.",35,25);
        g.drawString("Gewicht.",115,24);
        g.drawRect(30, 31, 80,20);
        g.drawRect(110, 31, 150,20);
        g.drawString("Valerie:",35,45);
        g.drawString("40 Kilogram.",115,44);
        g.drawRect(30, 51, 80,20);
        g.drawRect(110, 51, 150,20);
        g.drawString("Jeroen:",35,65);
        g.drawString("100 Kilogram.",115,64);
        g.drawRect(30, 71, 80,20);
        g.drawRect(110, 71, 150,20);
        g.drawString("Hans:",35,85);
        g.drawString("80 Kilogram.",115,84);

    }
}