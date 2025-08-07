import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class cae extends Actor
{
    public void act() 
    {
        if(getY()>=getWorld().getHeight()-22)
        {
            getWorld().addObject(new Xplod(), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        setLocation(getX(),getY()+1);
    }    
}
