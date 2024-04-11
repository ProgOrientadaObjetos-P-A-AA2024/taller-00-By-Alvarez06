package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;
public class Demo002 {
    public static void main(String[] args) {
        // Usamos el printf para presentar la oracion, en el %s ponemos el string
        // que obtenemos de la clase "Mensaje", seguido de eso usamos %d para 
        // presentar por pantalla el numero que obtenemos de la operacion
        // del paquete "Informacion"
        System.out.printf("%s con %d\n", Mensaje.obtenerMensaje(), 
                Informacion.obtenerHabitantes());
        // usar printf;
    }
    
}
