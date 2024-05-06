public class Estudiantes extends Persona{
    private Integer Grado;

    @Override
    public void mensaje(){
        super.mensaje();
        System.out.print(" , Mi grado es: " + this.Grado);
    }
}
