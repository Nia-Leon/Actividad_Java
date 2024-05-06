public class Gerente extends Empleado{
    private double Bono;

    public Gerente(String nombre, double salarioBasico) {
        super(nombre, salarioBasico);
    }

    public double getBono() {
        return Bono;
    }

    public void setBono(double bono) {
        Bono = bono;
    }

    public double CalcularSalario(){
        return super.CalcularSalario() + Bono;
    }
}
