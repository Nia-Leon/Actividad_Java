public class Empleado {
    private String Nombre;
    private double SalarioBasico;

    public Empleado(String nombre, double salarioBasico) {
        Nombre = nombre;
        SalarioBasico = salarioBasico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getSalarioBasico() {
        return SalarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        SalarioBasico = salarioBasico;
    }
}
