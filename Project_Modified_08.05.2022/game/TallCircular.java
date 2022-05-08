package game;

/**
 * A class that represents the figures that are tall and have a form of circle.
 * @author Meri Sukiasyan
 * @author Hripsime Melikyan
 * @author Arthur Aghamyan
 */

public class TallCircular extends Figure {
    /**
     * An instance variable, which is final because this class is for tall figures only.
     */
    private final boolean isTall = true;
    /**
     * An instance variable, which is final because this class is for figures of square circle only.
     */
    private final boolean isCircular = true;

    /**
     * A constructor which initializes the figures.
     * @param color
     * @param hole
     */

    public TallCircular(Quarto.FigureColor color, boolean hole) {
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
     * An accessor which return true if the figure is circle.
     * @return
     */

    public boolean isCircular() {
        return isCircular;
    }

    /**
     * A method which returns the string representation of object depending on how we initialized it.
     * @return
     */

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
