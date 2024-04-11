package paquete2;

import paquete1.Mensaje;
import paquete3.Informacion;
import java.util.Scanner;

public class Demo002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Desea que la cadena de texto se imprima en minusculas?"
                + " Si es así digite cualquier numero entre 1 a 5: ");
        int num = sc.nextInt();
        // Usamos el printf para presentar la oracion, en el %s ponemos el string
        // que obtenemos de la clase "Mensaje", seguido de eso usamos %d para 
        // presentar por pantalla el numero que obtenemos de la operacion
        // del paquete "Informacion"

        if (num >= 1 && num <= 5) {
            System.out.printf("%s con %d\n", Mensaje.obtenerMensaje(),
                    Informacion.obtenerHabitantes());
            // Si el numero está entre 1 y 5, el texto saldrá en minusculas
        } else {
            System.out.printf("%s CON %d\n", Mensaje.obtenerMensaje().toUpperCase(),
                    Informacion.obtenerHabitantes());
        } // Sino la cadena se imprimirá en mayusculas

        // usar printf;
    }

}
