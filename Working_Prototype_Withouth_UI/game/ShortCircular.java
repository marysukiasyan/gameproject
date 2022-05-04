package game;

public class ShortCircular extends Figure {

    private final boolean isCircular = true;
    private final boolean isShort = true;


    public ShortCircular(Quarto.FigureColor color, boolean hole) {
        super(color, hole);
    }

    public boolean isCircular() {
        return isCircular;
    }

    public boolean isShort() {
        return isShort;
    }

    public String toString() {
        if (this.getColor() == Quarto.FigureColor.BLUE && this.isHole()) {
            return "SCBH"; //ShortCircularBlueHole
        }
        if (this.getColor() == Quarto.FigureColor.BLUE && !this.isHole()){
            return "SCBS"; //ShortCircularBlueSmooth
        }
        if (this.getColor() == Quarto.FigureColor.RED && this.isHole()){
            return "SCRH"; //ShortCircularRedHole
        }
        if (this.getColor() == Quarto.FigureColor.RED && !this.isHole()){
            return "SCRS"; //ShortCircularWhiteSmooth
        }
        return " ";
    }

}
