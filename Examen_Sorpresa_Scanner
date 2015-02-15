/*EJERCICIO 1
 Introducir notas por teclado.
 Finaliza al introducir el número 0.
 Calcular la cantidad de notas de cada tipo y mostrar un 
 Mostrar histograma con la cantidad de notas de cada una ej: Nota1: ***, Nota2: ** ...*/

/*EJERCICIO 2
 Visualizar la nota que se ha introducido más veces (en caso de que esté repetida, mostrar la más alta) */

/*EJERCICIO 3
 Utilizar un método para controlar que las notas introducidas son correctas*/


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class notasIsma {

    static int[] notas = new int[11];

    static void ejercicio1() throws IOException {
        int nota;

        do {
            nota = ejercicio3("Nota: ");
            notas[nota] = notas[nota] + 1;

        } while (nota != 0);

        System.out.println();

        System.out.println("Notas  Repeticiones\n"
                         + "-----  ------------");
        for (int i = 1; i < notas.length - 1; i++) {
            System.out.print(i + ":\t");
            for (int contador = 0; contador < notas[i]; contador++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void ejercicio2()
    {
        int notaMasAlta = 0, numAlumnos = 0;

        for (int contador = 0; contador < notas.length; contador++) {
            if (notas[contador] >= numAlumnos) {
                numAlumnos = notas[contador];
                notaMasAlta = contador;

            }
        }
        System.out.println();

        System.out.println(numAlumnos + " alumnos han sacado un " + notaMasAlta + " y esta es la nota más repetida.");
    }

    static int ejercicio3(String texto) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int nota = 0;
        int numero;
        boolean correcto;

        do {
            try {
                correcto = true;
                System.out.print(texto);
                numero = sc.nextInt();

                if ((numero > 10) || (numero < 0)) {
                    correcto = false;
                    System.out.println("INTRODUZCA UN NÚMERO ENTRE 1 Y 10");
                } else {
                    nota = numero;
                }
            } catch (InputMismatchException e) {//Controla si se introduce algo que no sea un integer

                correcto = false;
                sc.nextLine();//Si no se hace este salto de linea, se provoca un bucle infinito con el error.
                System.out.println("INTRODUZCA UN NÚMERO!!");
            }

        } while (!correcto);
        return nota;
    }
    
    public static void main(String[] args) throws IOException {
        ejercicio1();
        ejercicio2();
    }
}
