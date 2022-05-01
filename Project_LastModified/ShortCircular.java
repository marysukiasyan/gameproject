package gameproject.gameproject;

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
        if (this.getColor() == Quarto.FigureColor.BLACK && this.isHole()) {
            return "ShortCircularBlackHole";
        }
        if (this.getColor() == Quarto.FigureColor.BLACK && !this.isHole()){
            return "ShortCircularBlackSmooth";
        }
        if (this.getColor() == Quarto.FigureColor.WHITE && this.isHole()){
            return "ShortCircularWhiteHole";
        }
        if (this.getColor() == Quarto.FigureColor.WHITE && !this.isHole()){
            return "ShortCircularWhiteSmooth";
        }
        return " ";
    }

}
