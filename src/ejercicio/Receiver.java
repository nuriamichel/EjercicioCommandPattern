package ejercicio;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Receiver {
    private String usuario = " ";
    private String tiempo;

    public void operationApagar() {
        System.out.println( usuario + " COMMAND > Apagar: \t>\t" + setTiempo());
    }

    public void operationReiniciar() {
        System.out.println( usuario + " COMMAND > Reiniciar: \t>\t" + setTiempo());
    }

    public void operationCerrarSesion() {
        System.out.println( usuario + " COMMAND > Cerrar Sesion: \t>\t" + setTiempo());
    }

    public void operationSuspender() {
        System.out.println( usuario + " COMMAND > Suspender: \t>\t" + setTiempo());
    }

    public String setTiempo() {
        return this.tiempo = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
