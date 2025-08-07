import greenfoot.*;
public class Fondo extends World
{
    public Fondo()
    {    
        super(1100, 600, 1); 
    }
    int i=0;
    public void act()
    {
        if(i%100==0)
        addObject(new Meteoro(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        i++;
    }
}
