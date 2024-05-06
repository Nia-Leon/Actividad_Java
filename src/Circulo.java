public class Circulo extends FiguraGeometrica{
    private Integer Radio;

    public Circulo(String nombreFigura, String colorFigura, Integer radio) {
        super(nombreFigura, colorFigura);
        Radio = radio;
    }
    public void calcularArea(){
        System.out.println("El area de este circulo es de: \n" + (3.14*this.Radio*this.Radio) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (2*3.14*this.Radio)+"cm");
}

    public Integer getRadio() {
        return Radio;
    }

    public void setRadio(Integer radio) {
        Radio = radio;
    }
}
