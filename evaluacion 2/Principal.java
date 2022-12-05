import uam.pvoe.objetos.clases.Tarjeta;
import uam.pvoe.objetos.clases.TarjetaCredito;
import uam.pvoe.objetos.clases.TarjetaDebito;
import uam.pvoe.objetos.interfaces.OperacionesTarjeta;
import uam.pvoe.objetos.operaciones.LlenarDatos;

public class Principal {
    public static void main(String[] args) {
        manejoTarjetaDebito();
        manejarTarjetaCredito();
    }

    public static void manejoTarjetaDebito() {

        LlenarDatos llenar = new LlenarDatos();
        TarjetaDebito tarjeta = new TarjetaDebito();

        tarjeta = llenar.llenarDatosDebito();
        OperacionesTarjeta operaciones = new OperacionesTarjetaImpl();
        operaciones.imprimirDatos(tarjeta);

    }

    public static void manejarTarjetaCredito() {

        LlenarDatos llenar = new LlenarDatos();
        Tarjeta tarjeta = new TarjetaCredito();

        tarjeta = llenar.llenarDatosCredito();
        OperacionesTarjeta operaciones = new OperacionesTarjetaImpl();
        operaciones.imprimirDatos(tarjeta);
    }
}