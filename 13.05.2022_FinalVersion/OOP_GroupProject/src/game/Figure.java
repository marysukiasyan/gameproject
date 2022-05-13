package game;

/**
 * An abstract figure class that will be used to create other figure classes.
 * It is abstract because there is no point to create figure without specifying its type.
 * @author Hripsime Melikyan
 * @author Meri Sukisayan
 * @author Arthur Aghamyan
 */


public abstract class Figure implements Cloneable {

    /**
     * The color of the figures variable of enum type.
     */
    private Quarto.FigureColor color;

    /**
     * One of characteristics for the figures .
     */

    private boolean hole;

    /**
     * The height of the figure.
     */

    private boolean isTall;

    /**
     * The shape of the figure.
     */

    private boolean isSquare;

    /**
     * A no-arg constructor that initializes the instance variables.
     * False for boolean types and Red for enum type of figure color.
     */

    public Figure() {
        this.color = Quarto.FigureColor.RED;
        this.hole = false;
        this.isTall = false;
        this.isSquare = false;
    }

    /**
     * A constructor that receives the color of figure and information about weather it have a hole or not, and  initializes it.
     * @param color
     * @param hole
     */

    public Figure(Quarto.FigureColor color, boolean hole) {
        this.color = color;
        this.hole = hole;

    }

    /**
     * An accessor that returns the color of the figure.
     * @return Quarto.FigureColor
     */


    public Quarto.FigureColor getColor() {
        return color;
    }

    /**
     * An accessor that returns true if the figure is tall and false otherwise.
     * @return boolean
     */

    public boolean isTall() {
        return isTall;
    }

    /**
     * An accessor that returns true if the figure is square and false if it is a circle.
     * @return boolean
     */

    public boolean isSquare() {
        return isSquare;
    }

    /**
     * An accessor tha returns true if the figure has a hole and false otherwise.
     * @return boolean
     */

    public boolean isHole() {
        return hole;
    }

    /**
     * An overridden clone method that returns the copy of figure.
     * @return Figure
     */

    public Figure clone() {
        try {
            return (Figure) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * A method to print the string representation of the object.
     * @return String
     */

    public String toString(){
        return " ";
    }



}
