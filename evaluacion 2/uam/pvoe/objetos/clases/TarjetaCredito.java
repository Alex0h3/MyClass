package uam.pvoe.objetos.clases;

public class TarjetaCredito extends Tarjeta {

    private float creditoMaximo;
    private float deuda;

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public float getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(float creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public String toString() {
        return super.toString() + "\nCrédito: " + this.getCreditoMaximo()
                +
                "\nDeuda Actual: " + this.getDeuda();
    }

}
