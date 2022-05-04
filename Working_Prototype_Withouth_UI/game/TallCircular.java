package game;

public class TallCircular extends Figure {
    private final boolean isTall = true;
    private final boolean isCircular = true;

    public TallCircular(Quarto.FigureColor color, boolean hole) {
        super(color, hole);
    }

    public boolean isTall() {
        return isTall;
    }

    public boolean isCircular() {
        return isCircular;
    }

    public String toString() {
        if (this.getColor() == Quarto.FigureColor.BLUE && this.isHole()) {
            return "TCBH"; //TallCircularBlueHole
        }
        if (this.getColor() == Quarto.FigureColor.BLUE && !this.isHole()){
            return "TCBS"; //TallCircularBlueSmooth
        }
        if (this.getColor() == Quarto.FigureColor.RED && this.isHole()){
            return "TCRH"; // TallCircularRedHole
        }
        if (this.getColor() == Quarto.FigureColor.RED && !this.isHole()){
            return "TCRS"; //TallCircularRedSmooth
        }
        return " ";
    }
}
