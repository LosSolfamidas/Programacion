//Parte 01: Introducimos notas hasta que el usuario teclee 0, calcular la cantidad de notas de cada tipo y mostrar un 
//histograma con la cantidad de notas de cada una ej: Nota1: ***, Nota2: ** ...
//Parte 02: Clacular cual de todas las Notas es la mas numerosa. Se mostrara la nota con la cantidad de veces que se ha introducido
//Parte 03: Se creara un metod para pedir las notas que controle que solo se introducen Numeros y solo numeros del 1 al 10

import java.io.*;

public class Ejercicio_Notas 
{
	//Creamos un Array de tipo int par almacenar la cantidad de cada nota
	static int[]notas = new int[11];
	
	public static void main(String[] args) 
	{
		parte01();
		parte02();
	}
	
	static void parte01()//Metodo Parte 01
	{
		int nota;
	
		System.out.println("  -- Parte 01 --");
		
		//Introducimos las notas hasta que nota == 0
		do
		{
		  nota = pideNota("Nota: ");
			notas[nota] = notas[nota]+1;						
			
		}while(nota!=0);
		
		System.out.println("");
		
		//Mostramos el Histograma con las Notas, recorriendo el Aarray Notas[]
		System.out.println("  --Histograma Notas--  ");
		for(int a=1; a<notas.length-1; a++)
		{
			System.out.print("Nota "+a+": ");
			for(int b=0; b<notas[a]; b++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void parte02()//Metodo Parte 02
	{
		int notaMax=0, numAlum=0;
		
		//Recorremos el Array Notas[] y calculamos cual es la nota con mayor numero de introducciones.
		for(int a=0; a<notas.length; a++)
		{
			if(notas[a]>=numAlum)
			{
				numAlum = notas[a];
				notaMax = a;
			}
		}
		System.out.println("");
		System.out.println("--Parte 2 | Nota Maxima--");
		System.out.println("La Nota "+notaMax+" con "+numAlum+".");
	}
	
	static int pideNota(String texto)//Metodo Parte 03
	{
		String cadnum;
		int numero = 0;
		boolean correcto;
		
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		
		do
		{
			try
			{
				correcto = true;
				System.out.print(texto);
				cadnum = teclado.readLine();
				
				//Condicion para que solo se introduzcan Numeros entre el 1 y el 10.
				if(Integer.parseInt(cadnum)>10)
				{
					correcto = false;
					System.out.println("Solo del 1 al 10");
				}
				else
				{
					numero = Integer.parseInt(cadnum);
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("\t\tIntroduzca Nº");
				correcto = false;
			}
			catch (IOException e)
			{
				System.out.println("\t\tSe ha producido un error: "+e);
				correcto = false;
			}
		}
		while (!correcto);
		return numero;
	}
}
