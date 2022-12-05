package uam.pvoe.objetos.clases;

public class TarjetaDebito extends Tarjeta {

    private float saldoActual;

    public float getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String toString() {
        return super.toString() + "\nSaldo Actual: " +
                this.getSaldoActual();
    }

}