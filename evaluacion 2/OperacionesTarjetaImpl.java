import uam.pvoe.objetos.clases.Tarjeta;
import uam.pvoe.objetos.interfaces.OperacionesTarjeta;

public class OperacionesTarjetaImpl implements OperacionesTarjeta {
    @Override
    public void imprimirDatos(Tarjeta tarjeta) {
        System.out.println("Datos de la Tarjeta:");
        System.out.println(tarjeta.toString());
    }
}