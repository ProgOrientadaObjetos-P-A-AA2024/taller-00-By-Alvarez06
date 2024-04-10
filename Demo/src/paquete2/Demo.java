package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;
public class Demo {
    public static void main(String[] args) {
        System.out.printf("%s con %d\n", Mensaje.obtenerMensaje(), 
                Informacion.obtenerHabitantes());
        // usar printf;
    }
    
}
