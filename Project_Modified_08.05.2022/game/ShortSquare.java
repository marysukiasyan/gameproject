package game;

/**
 * A class that represents the figures that are short and have a form of square.
 * @author Meri Sukiasyan
 * @author Hripsime Melikyan
 * @author Arthur Aghamyan
 */

public class ShortSquare extends Figure {
    /**
     * An instance variable, which is final because this class is for short figures only.
     */
    private final boolean isShort = true;
    /**
     * An instance variable, which is final because this class is for figures of square shape only.
     */
    private final boolean isSquare = true;


    /**
     * A constructor which initializes the figures.
     * @param color
     * @param hole
     */

    public ShortSquare(Quarto.FigureColor color, boolean hole) {
        super(color, hole);
    }

    /**
     * An accessor which return true if the figure is short.
     * @return
     */

    public boolean isShort() {
        return isShort;
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
