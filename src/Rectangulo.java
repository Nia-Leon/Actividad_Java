public class Rectangulo extends FiguraGeometrica{
        private Integer Base;
        private Integer Altura;

    public Rectangulo(String nombreFigura, String colorFigura, Integer base, Integer altura) {
        super(nombreFigura, colorFigura);
        Base = base;
        Altura = altura;
    }
}
