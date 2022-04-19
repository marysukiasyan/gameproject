
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
        if (this.getColor() == Quarto.FigureColor.BLACK && this.isHole()) {
            return "TallCircularBlackHole";
        }
        if (this.getColor() == Quarto.FigureColor.BLACK && !this.isHole()){
            return "TallCircularBlackSmooth";
        }
        if (this.getColor() == Quarto.FigureColor.WHITE && this.isHole()){
            return "TallCircularWhiteHole";
        }
        if (this.getColor() == Quarto.FigureColor.WHITE && !this.isHole()){
            return "TallCircularWhiteSmooth";
        }
        return " ";
    }
}

