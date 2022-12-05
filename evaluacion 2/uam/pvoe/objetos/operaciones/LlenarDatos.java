package uam.pvoe.objetos.operaciones;

import uam.pvoe.objetos.clases.Fecha;
import uam.pvoe.objetos.clases.Tarjeta;
import uam.pvoe.objetos.clases.TarjetaCredito;
import uam.pvoe.objetos.clases.TarjetaDebito;

public class LlenarDatos {
    /* Creación y llenado de una Tarjeta */
    public Tarjeta llenarDatos() {
        Tarjeta tarjeta = new Tarjeta();
        Fecha fechaVencimiento = new Fecha();
        tarjeta.setNombreTarjeta("Nombre del titular Tarjeta");
        tarjeta.setNumeroCuenta("123456");
        tarjeta.setNumeroTarjeta("123 456 789");
        fechaVencimiento.setMes(11);
        fechaVencimiento.setAnnio(18);
        tarjeta.setFechaVencimiento(fechaVencimiento);

        return tarjeta;
    }

    /* Creación y llenado de una Tarjeta de Crédito */
    public TarjetaCredito llenarDatosCredito() {
        TarjetaCredito tarjeta = new TarjetaCredito();
        Fecha fechaVencimiento = new Fecha();
        tarjeta.setNombreTarjeta("Ronaldo");
        tarjeta.setNumeroCuenta("594257");
        tarjeta.setNumeroTarjeta("478 684 987");
        fechaVencimiento.setMes(9);
        fechaVencimiento.setAnnio(26);
        tarjeta.setFechaVencimiento(fechaVencimiento);

        tarjeta.setCreditoMaximo(7900);
        tarjeta.setDeuda(2200);

        return tarjeta;
    }

    /* Creación y llenado de una Tarjeta de Débito */
    public TarjetaDebito llenarDatosDebito() {

        TarjetaDebito tarjeta = new TarjetaDebito();
        Fecha fechaVencimiento = new Fecha();
        tarjeta.setNombreTarjeta("Javier");
        tarjeta.setNumeroCuenta("594257");
        tarjeta.setNumeroTarjeta("478 684 987");
        fechaVencimiento.setMes(9);
        fechaVencimiento.setAnnio(26);
        tarjeta.setFechaVencimiento(fechaVencimiento);

        tarjeta.setSaldoActual(28000);

        return tarjeta;
    }
}
