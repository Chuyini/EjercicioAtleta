package POO;

import java.util.Scanner;

public class Main {

public static int AtletaMRapido(Atleta atletas[])
{
    int mayor=atletas[0].getTiempo();
    int index=0;

    for (int cont=0;cont< atletas.length;cont++)
    {
        if(atletas[cont].getTiempo()>mayor)
        {
         mayor=atletas[cont].getTiempo();
         index=cont;
        }
    }


    return index;

}


    public static void main(String [] args)
    {
        String nombre;
        int tiempo, numAtleta;
        int catidadAT;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de atletas ");
        catidadAT=entrada.nextInt();
        Atleta atletas[]=new Atleta[catidadAT];
        for(int cont=0;cont< atletas.length;cont++)
        {
            entrada.nextLine();
            System.out.println("Nombre ");
            nombre=entrada.nextLine();
            System.out.println("Numero de atleta ");
            numAtleta=entrada.nextInt();
            System.out.println("timepo ");
            tiempo=entrada.nextInt();
            atletas[cont]=new Atleta(numAtleta,nombre,tiempo);
        }

        atletas[AtletaMRapido(atletas)].mostrarTodo();


    }


}
