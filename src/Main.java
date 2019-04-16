import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Rombo</h1>
 * Programa que dibuja un rombo ingresando la altura
 * @author marcoxio
 * @since 2019
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Variable usada para definir los espacios de los * o en este caso el numero 1
         */
        char espacio = ' ';

        /**
         * Variable que me dibuja los numeros que salen del rombo
         */
        char asterisco = '1';
        //Entrada de datos
        Scanner entrada = new Scanner(System.in);
        int numFilas;
        System.out.println("Ingresa la altura del rombo");
        numFilas=entrada.nextInt();

        /**
         * Con este ciclo controlo los espacios y dibujo la parte de arriba del rombo
         */

        for (int i= 1; i<=numFilas; i++){
            for (int espacios = numFilas - i; espacios >0; espacios--)
                System.out.print(espacio);
            for (int lineas = 1; lineas < 2 * i; lineas++)
                System.out.print(asterisco);
            System.out.println("");
        }

        /**
         * Con este ciclo controlo los espacios y dibujo la parte de abajo del rombo
         */
        for (int i= numFilas; i>=1; i--){
            for (int espacios = numFilas - i; espacios >0; espacios--)
                System.out.print(espacio);
            for (int lineas = 1; lineas < 2 * i; lineas++)
                System.out.print(asterisco);
            System.out.println("");
        }
    }



}



