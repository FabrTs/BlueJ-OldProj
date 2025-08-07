import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
public class Contador extends Actor
{
    GreenfootImage Men;
    int C=0;
    public void Draw()
    {
           Men.setColor(new Color(255,0,0,150));
        Men.fillRect(0,0,100,80);
        setImage(Men);
        Men.setColor(new Color(0,0,200,200));
        Men.fillRect(5,5,90,70);
        Men.setColor(new Color(255,255,255,255));
        Men.setFont(new Font("Tahoma",Font.BOLD,20));
        Men.drawString(""+C,45,40);
    }
    public Contador()
    {
        Men=new GreenfootImage(100,80);
        Draw();
    }
    public void increase()
    {
        C++;
        Men.clear();
    }
    public void act() 
    {
        Draw();
    }    
}
