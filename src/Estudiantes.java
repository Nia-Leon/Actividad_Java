public class Estudiantes extends Persona implements Trabajador{
    private Integer Grado;

    public Estudiantes(String nombre, int edad, String fechaNacimiento, Integer grado) {
        super(nombre, edad, fechaNacimiento);
        Grado = grado;
    }

    @Override
    public void mensaje(){
        super.mensaje();
        System.out.print(" , Mi grado es: " + this.Grado);
    }

    public void RealizarTarea(){
        System.out.print("Realizando tarea escolar");
    }

    public Integer getGrado() {
        return Grado;
    }

    public void setGrado(Integer grado) {
        Grado = grado;
    }
}
