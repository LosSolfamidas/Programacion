//Parte 01: Introducimos notas hasta que el usuario teclee 0, calcular la cantidad de notas de cada tipo y mostrar un histograma con la 
//cantidad de notas de cada una ej: Nota1: ***, Nota2: ** ...
//Parte 02: Clacular cual de todas las Notas es la mas numerosa. Se mostrara la nota con la cantidad de veces que se ha introducido
//Parte 03: Se creara un metod para pedir las notas que controle que solo se introducen Numeros y solo numeros del 1 al 10

import java.io.*;

public class ExamenPrueba110215
{
    public static void main(String[] args)
    {
        String [] notas = {"","","","","","","","","","",""};
        int nota=1;
        
        while(nota!=0)
        {
            nota = pideNota("Introduce una nota: ");
            notas[nota] += "*";
        }
        System.out.println("");
        recorrerVector(notas);
       
    }
    
    static int pideNota(String texto)
    {
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        String cadnum;
        int numero=0;
        boolean correcto = false ;
        do
        {
            try
            {
                System.out.print(texto);
                cadnum=teclado.readLine();
                numero=Integer.parseInt(cadnum);
                
                if(numero>=0 && numero<=10)
                {
                    correcto=true;
                }
                else
                {
                    correcto = false;
                }
                catch (NumberFormatException e) 
                {
                    System.out.println("\t\tTienes que introducir un nº valido");
                    correcto=false;
                }
                catch (IOException e) 
                {
                    System.out.println("\t\tSe ha producido un error: ");
                    correcto=false;
                }
                
        }while (correcto == false);
        return numero;
    }
    
    static void recorrerVector(String [] v)
    {
       int mayor=0;
       
       for(int i=1;i<v.length;i++)
       {
           if(v[i].length()>=mayor)
           {
               mayor = i;
           }
            System.out.println("Posicion "+(i)+" numero: "+v[i]);
        }
       System.out.println("La nota con mas alumnos es: "+mayor);
   }
}
