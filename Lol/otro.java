import greenfoot.*;
public class otro extends Actor
{
    public void act() 
    {
        setLocation(getX(),getY()+1);
        if(getY()<=getWorld().getHeight()-20)
        {
            getWorld().removeObject(this);
            return;
        }
    }    
}
