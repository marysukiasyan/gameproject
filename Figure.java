public class Figure {
    private Quarto.FigureColor color;
    private boolean hole;

    public Figure() {
        this.color = Quarto.FigureColor.WHITE;
        this.hole = false;
    }

    public Figure(Quarto.FigureColor color, boolean hole ) {
        this.color = color;
        this.hole = hole;

    }


    public Quarto.FigureColor getColor() {
        return color;
    }

    public boolean isHole() {
        return hole;
    }


    @Override
    public String toString() {
        return "()";
    }
}
