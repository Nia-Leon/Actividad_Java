public class FiguraGeometrica {
    private  String NombreFigura;
    private String ColorFigura;

    public FiguraGeometrica(String nombreFigura, String colorFigura) {
        NombreFigura = nombreFigura;
        ColorFigura = colorFigura;
    }

    public String getNombreFigura() {
        return NombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        NombreFigura = nombreFigura;
    }

    public String getColorFigura() {
        return ColorFigura;
    }

    public void setColorFigura(String colorFigura) {
        ColorFigura = colorFigura;
    }
}
