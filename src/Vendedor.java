public class Vendedor extends Empleado{
    private double Comision;

    public Vendedor(String nombre, double salarioBasico) {
        super(nombre, salarioBasico);
    }

    public double getComision() {
        return Comision;
    }

    public void setComision(double comision) {
        Comision = comision;
    }
}
