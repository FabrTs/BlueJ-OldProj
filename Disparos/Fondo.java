import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Fondo extends World
{
    public Fondo()
    {    
        super(1180, 600, 1); 
        addObject(new Nave(),60,60);
        addObject(new Nave(),400,60);
        addObject(new Nave(),700,60);
    }
}
