public class Alumno
{
    private int ID;
    private String nombre;
    private double nota;
    public Alumno(int m, String nom)
    {
        ID=m;
        nombre=nom;
    }
    public String getName()
    {
        return nombre;
    }
    public int getID()
    {
        return ID;
    }
    public double getNote()
    {
        return nota;
    }
    public void setNote(double nNote)
    {
        nota=nNote;
    }
    public void setName(String nom)
    {
        nombre=nom;
    }
    public void setID(int nID)
    {
        ID=nID;
    }
}
