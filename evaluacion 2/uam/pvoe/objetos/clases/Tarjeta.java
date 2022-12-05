package uam.pvoe.objetos.clases;

public class Tarjeta {

    private String nombreTarjeta;
    private Fecha fechaVencimiento;
    private String numeroTarjeta;
    private String numeroCuenta;

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public Fecha getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Fecha fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String toString() {
        String mensaje = "";
        mensaje = "Titular: " + this.nombreTarjeta + "\n" +
                "Número de tarjeta: " + this.numeroTarjeta + "\n" +
                "Número de cuenta: " + this.numeroCuenta + "\n" +
                "Fecha de vencimiento: " + fechaVencimiento.getMes() +
                "/" + fechaVencimiento.getAnnio();

        return mensaje;

    }
}