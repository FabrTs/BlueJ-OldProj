import java.util.ArrayList;
public class Agenda
{
    private ArrayList<String> notas;
    public Agenda()
    {
        notas=new ArrayList<String>();
    }
    public void addNote(String N)
    {
        notas.add(N);
    }
    public int numNotes()
    {
        return notas.size();
    }
    public void showNote(int in)
    {
        if(in>=0 && in<numNotes())
            System.out.println(notas.get(in));
    }
    public void printNotes()
    {
        for(String n:notas)
            System.out.println(n);
    }
    public void deleteNote(int in)
    {
        if(in>=0 && in<numNotes())
            notas.remove(in);
    }
}
