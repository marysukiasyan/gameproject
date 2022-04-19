package gameproject.gameproject;

public class ShortSquare extends Figure {
    private final boolean isShort = true;
    private final boolean isSquare = true;

    public ShortSquare(Quarto.FigureColor color, boolean hole) {
        super(color, hole);
    }

    public boolean isShort() {
        return isShort;
    }

    public boolean isSquare() {
        return isSquare;
    }

    @Override
    public String toString() {
            if (this.getColor() == Quarto.FigureColor.BLACK && this.isHole()) {
                return "ShortSquareBlackHole";
            }
            if (this.getColor() == Quarto.FigureColor.BLACK && !this.isHole()){
                return "ShortSquareBlackSmooth";
            }
            if (this.getColor() == Quarto.FigureColor.WHITE && this.isHole()){
                return "ShortSquareWhiteHole";
            }
            if (this.getColor() == Quarto.FigureColor.WHITE && !this.isHole()){
                return "ShortSquareWhiteSmooth";
            }
            return " ";
        }
}

