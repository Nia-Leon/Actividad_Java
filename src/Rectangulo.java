public class Rectangulo extends FiguraGeometrica{
        private Integer Base;
        private Integer Altura;

    public Rectangulo(String nombreFigura, String colorFigura, Integer base, Integer altura) {
        super(nombreFigura, colorFigura);
        Base = base;
        Altura = altura;
    }

    public void calcularArea(){
        System.out.println("El area de este rectangulo es de: \n" + (this.Base*this.Altura) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (this.Base*2+this.Altura*2)+"cm");
    }

    public Integer getBase() {
        return Base;
    }

    public void setBase(Integer base) {
        Base = base;
    }

    public Integer getAltura() {
        return Altura;
    }

    public void setAltura(Integer altura) {
        Altura = altura;
    }
}
