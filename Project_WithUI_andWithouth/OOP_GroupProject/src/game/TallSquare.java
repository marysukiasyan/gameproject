package game;

/**
 * A class that represents the figures that are tall and have a form of square.
 * @author Meri Sukiasyan
 * @author Hripsime Melikyan
 * @author Arthur Aghamyan
 */

public class TallSquare extends Figure {
    /**
     * An instance variable, which is final because this class is for tall figures only.
     */
    private final boolean isTall = true;
    /**
     * An instance variable, which is final because this class is for figures of square shape only.
     */
    private final boolean isSquare = true;

    /**
     * A constructor which initializes the figures.
     * @param color
     * @param hole
     */
    public TallSquare(Quarto.FigureColor color, boolean hole) {
        super(color, hole);
    }

    /**
     * An accessor which return true if the figure is tall.
     * @return
     */

    public boolean isTall() {
        return isTall;
    }

    /**
     * An accessor which return true if the figure is square.
     * @return
     */

    public boolean isSquare() {
        return isSquare;
    }

    /**
     * A method which returns the string representation of object depending on how we initialized it.
     * @return
     */

    public String toString() {
        if (this.getColor() == Quarto.FigureColor.BLUE && this.isHole()) {
            return "TSBH"; //TallSquareBlueHole
        }
        if (this.getColor() == Quarto.FigureColor.BLUE && !this.isHole()){
            return "RSBS"; // TallSquareBlueSmooth
        }
        if (this.getColor() == Quarto.FigureColor.RED && this.isHole()){
            return "TSRH"; // TallSquareRedHole
        }
        if (this.getColor() == Quarto.FigureColor.RED && !this.isHole()){
            return "TSRS"; //TallSquareRedSmooth
        }
        return " ";
    }
}
