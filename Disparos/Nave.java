import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Nave extends Actor
{
    int dx=1,c=0,n=20;
    public void act() 
    {
        if(getX()>=getWorld().getWidth()-20 || getX()<=22)
        {
            dx*=-1;
            turn(180);
        }    
        setLocation(getX()+dx,getY());
        if(c==n)
        {
            getWorld().addObject(new cae(),getX(),getY());
            c=0;
            n=Greenfoot.getRandomNumber(250);
        }
        c++;
    }    
}
