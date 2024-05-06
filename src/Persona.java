public class Persona {
        private String nombre;
        private int edad;
        private String fechaNacimiento;

    public Persona(String nombre, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }
    public void calcularFechaNacimiento() {
        System.out.println("Su anio de nacimiento fue en el: " + (2024 - this.edad));
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void mensaje(){
        System.out.println("Mi nombre es: " + this.nombre + " , Mi edad es: " + this.edad);
    }
}
