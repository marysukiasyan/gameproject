package game;

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
            if (this.getColor() == Quarto.FigureColor.BLUE && this.isHole()) {
                return "SSBH"; // ShortSquareBlueHole
            }
            if (this.getColor() == Quarto.FigureColor.BLUE && !this.isHole()){
                return "SSBS"; // ShortSquareBlUESmooth
            }
            if (this.getColor() == Quarto.FigureColor.RED && this.isHole()){
                return "SSRH"; //ShortSquareRedHole
            }
            if (this.getColor() == Quarto.FigureColor.RED && !this.isHole()){
                return "SSRS"; //ShortSquareRedSmooth
            }
            return " ";
        }
}
