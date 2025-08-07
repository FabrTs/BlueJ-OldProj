import greenfoot.*; 
public class Meteoro extends Actor
{
    public Meteoro()
    {
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void explotar()
    {
        getWorld().removeObject(this);
        return;
    }
    public void act() 
    {
        move(1);
    }    
}
