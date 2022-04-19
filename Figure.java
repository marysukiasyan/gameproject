public class Figure {
    private Quarto.FigureColor color;
    private boolean hole;
    private boolean isTall;
    private boolean isSquare;

    public Figure() {
        this.color = Quarto.FigureColor.WHITE;
        this.hole = false;
        this.isTall = false;
        this.isSquare = false;
    }

    public Figure(Quarto.FigureColor color, boolean hole) {
        this.color = color;
        this.hole = hole;

    }


    public Quarto.FigureColor getColor() {
        return color;
    }

    public boolean isTall() {
        return isTall;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public boolean isHole() {
        return hole;
    }

    @Override
    public String toString() {
        return "()";
    }


}
