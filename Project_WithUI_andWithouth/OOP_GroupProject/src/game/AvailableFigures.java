package game;

import java.util.ArrayList;

/**
 * This class holds the information about available figures fo Quarto game.
 * @author Hripsime Melikyan
 * @author Meri Sukiasyan
 * @author Arthur Aghamyan
 */

public class AvailableFigures {
    /**
     * The list of all figures that currently available.
     */

    private  ArrayList<Figure> availableFigures;

    /**
     * A no-arg constructor that initializes the figures for the game.
     */

    public AvailableFigures() {
        this.availableFigures = new ArrayList<>(16);
        availableFigures.add( new ShortCircular(Quarto.FigureColor.BLUE, true));
        availableFigures.add( new ShortCircular(Quarto.FigureColor.BLUE, false));
        availableFigures.add(new ShortCircular(Quarto.FigureColor.RED, true));
        availableFigures.add( new ShortCircular(Quarto.FigureColor.RED, false));
        availableFigures.add( new ShortSquare(Quarto.FigureColor.BLUE, true));
        availableFigures.add( new ShortSquare(Quarto.FigureColor.BLUE, false));
        availableFigures.add( new ShortSquare(Quarto.FigureColor.RED, true));
        availableFigures.add( new ShortSquare(Quarto.FigureColor.RED, false));
        availableFigures.add( new TallCircular(Quarto.FigureColor.BLUE, true));
        availableFigures.add( new TallCircular(Quarto.FigureColor.BLUE, false));
        availableFigures.add( new TallCircular(Quarto.FigureColor.RED, true));
        availableFigures.add(new TallCircular(Quarto.FigureColor.RED, false));
        availableFigures.add(new TallSquare(Quarto.FigureColor.BLUE, true));
        availableFigures.add(new TallSquare(Quarto.FigureColor.BLUE, false));
        availableFigures.add(new TallSquare(Quarto.FigureColor.RED, true));
        availableFigures.add(new TallSquare(Quarto.FigureColor.RED, false));

    }

    /**
     * An accessor that returns all the figures that currently available.
     * @return ArrayList<Figure>
     */

    public ArrayList<Figure> getAvailableFigures() {
        return availableFigures;
    }



//    public ArrayList<Figure> removeChosenFigure(int index){
//            availableFigures.remove(index);
//        return  availableFigures;
//    }


    /**
     * A method that removes chosen figure from the available list, and returns the removed one.
     * @param index
     * @return
     */
    public Figure returnRemovedFigure(int index){
        return availableFigures.remove(index);
    }


    /**
     * A method that prints the available figures in String format.
     * @return
     */

    public String toString() {
        return  "" + (availableFigures);
    }

    /**
     * A method that prints the available figures in String format and puts the numbers that needed to choose the figure.
     * @return
     */

    public void printAvailableFigures(){
        for (int i = 0; i < this.availableFigures.size(); i++){
            System.out.print(i+1 + ". ");
            System.out.print(this.availableFigures.get(i)+ " ");
        }
    }


}
