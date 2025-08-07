import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class lolol extends Actor
{
    public void act() 
    {
        setLocation(getX(),getY()-1);
        if(getY()<=20)
        {
            getWorld().removeObject(this);
            return;
            
        }    
    }    
}
