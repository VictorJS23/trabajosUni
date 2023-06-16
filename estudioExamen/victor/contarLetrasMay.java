package trabajosUni.estudioExamen.victor;

import java.util.Scanner;

public class contarLetrasMay {
    public static void main(String[] args) {
        /*
         * Contar letras mayúsculas: Escribe un método que reciba una cadena de texto y
         * devuelva el número de letras mayúsculas que contiene.
         */

        String palabra;

        System.out.println("Ingrese una palabra: ");

        Scanner input = new Scanner(System.in);

        palabra = input.nextLine();

        char[] array = palabra.toCharArray();

        String palabraMay = palabra.toUpperCase();

        char[] arrayDos = palabraMay.toCharArray();

        int contMay = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == arrayDos[i]) {
                contMay++;
            }
        }

        System.out.println("La cantidad de mayusculas que hay en la palabra es de: " + contMay);

        input.close();

    }

}
