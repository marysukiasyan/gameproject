package game;

/**
 * A class that represents the figures that are short and have a form of circle.
 * @author Meri Sukiasyan
 * @author Hripsime Melikyan
 * @author Arthur Aghamyan
 */


public class ShortCircular extends Figure {
    /**
     * An instance variable, which is final because this class is for figures of square circle only.
     */
    private final boolean isCircular = true;

    /**
     * An instance variable, which is final because this class is for short figures only.
     */

    private final boolean isShort = true;

    /**
     * A constructor which initializes the figures.
     * @param color
     * @param hole
     */

    public ShortCircular(Quarto.FigureColor color, boolean hole) {
        super(color, hole);
    }

    /**
     * An accessor which return true if the figure is circle.
     * @return boolean
     */

    public boolean isCircular() {
        return isCircular;
    }

    /**
     * An accessor which return true if the figure is short.
     * @return boolean
     */

    public boolean isShort() {
        return isShort;
    }


    /**
     * A method which returns the string representation of object depending on how we initialized it.
     * @return String
     */

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
