import greenfoot.*;
import java.awt.Color; 
public class Escudo extends Actor
{
    int w,h,m,n,xc,yc;
    GreenfootImage im;
    boolean flag;
    public Escudo()
    {
        im= new GreenfootImage(200,200);
        xc=100;
        yc=100;
        w=10;
        h=10;
        im.setColor(new Color(255,255,255,50));
        im.fillOval(xc-w/2,yc-h/2,w,h);
        setImage(im);
    }
    public void act() 
    {
        if(w==200)
            flag=false;
        if(w==10) 
            flag=true;
        if(flag)
        {
            im.clear();
            w+=10;
            h+=10;
            im.fillOval(xc-w/2,yc-h/2,w,h);
        }
        else
        {
            im.clear();
            w-=10;
            h-=10;
            im.fillOval(xc-w/2,yc-h/2,w,h);
        }
    } 
    
}
