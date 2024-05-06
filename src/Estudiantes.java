public class Estudiantes extends Persona {
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

    public Integer getGrado() {
        return Grado;
    }

    public void setGrado(Integer grado) {
        Grado = grado;
    }
}
