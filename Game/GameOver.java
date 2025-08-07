import greenfoot.*; 
import java.awt.Color;
import java.awt.Font;
public class GameOver extends Actor
{
    GreenfootImage Men;
    public GameOver()
    {
        Men=new GreenfootImage(300,200);
        Men.setColor(new Color(255,0,0,150));
        Men.fillRect(0,0,300,200);
        setImage(Men);
        Men.setColor(new Color(0,0,200,200));
        Men.fillRect(20,20,260,160);
        Men.setColor(new Color(255,255,255,255));
        Men.setFont(new Font("Tahoma",Font.BOLD,20));
        Men.drawString("Game Over",90,100);
    }
    public void act() 
    {
    }    
}
