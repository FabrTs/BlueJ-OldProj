import greenfoot.*; 
public class Card extends Actor
{
    public int num;
    String fig;
    public Card(int n, String f)
    {
        fig=f;
        num=n;
        setImage(fig+num+".png");
    }
    public int ObtenValor()
    {
        return num;
    }
    public void act() 
    {
        
    }    
}
