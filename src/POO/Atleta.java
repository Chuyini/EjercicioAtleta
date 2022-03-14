package POO;

public class Atleta {

    private int numAtleta;
    private String nombre;
    private int tiempo;

    Atleta(int numAtleta,String nombre, int tiempo)
    {
        this.nombre=nombre;
        this.tiempo=tiempo;
        this.numAtleta=numAtleta;
    }
    public int getTiempo()
    {
        return tiempo;
    }
    public void mostrarTodo()
    {
        System.out.println("Tiempo "+tiempo);
        System.out.println("Nombre "+nombre);
        System.out.println("Numero de atleta "+numAtleta);
    }



}
