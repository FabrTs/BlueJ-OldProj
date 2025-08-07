import java.util.ArrayList;
public class Curso
{
    private ArrayList<Alumno> lista;
    private double promedio, porcRep, porcAprob;
    private String nombre;
    public Curso(String Nom)
    {
        lista=new ArrayList<Alumno>();
        nombre=Nom;
    }
    public void inscribir(int nID,String Nom)
    {
        Alumno nvo=new Alumno(nID,Nom);
        nombre=Nom;
    }
    public void calificar(int nID, double calf)
    {
        for(Alumno a:lista)
            if(nID==a.getID())
                a.setNote(calf);
    }
    public void promediar()
    {
        double sum=0, cont=0;
        for(Alumno al:lista)
        {
            sum+=al.getNote();
            if(al.getNote()>=6)
                cont++;
        }
        promedio=sum/lista.size();
        porcAprob=(100/lista.size())*cont;
        porcRep=100-porcAprob;
    }
    public void imprimirLista()
    {
        System.out.println(nombre);
        System.out.println("Aprobados"+porcAprob+"%");
        System.out.println("Aprobados"+porcRep+"%");
        for(Alumno z:lista)
            System.out.println(""+z.getID()+" "+z.getName()+" "+z.getNote());
    }
}
