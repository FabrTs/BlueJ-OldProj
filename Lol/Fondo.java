import greenfoot.*;
public class Fondo extends World
{
    int c=0;
    public Fondo()
    {    
        super(1100, 600, 1); 
        addObject(new lolol(),getWidth()/2,getHeight()-30);
    }
    public void act()
    {
        if(c==15)
        {
            int n=Greenfoot.getRandomNumber(getWidth()-21);
            addObject(new lolol(),n,getHeight()-30);
            int x=Greenfoot.getRandomNumber(getWidth()-21);
            addObject(new otro(),x,30);
            c=0;
        }
        c++;
    }
}
