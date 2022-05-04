package gameproject.gameproject;

import java.util.ArrayList;

public class AvailableFigures {

    private  ArrayList<Figure> availableFigures;


    public AvailableFigures() {
        this.availableFigures = new ArrayList<>(16);
        availableFigures.add( new ShortCircular(Quarto.FigureColor.BLACK, true));
        availableFigures.add( new ShortCircular(Quarto.FigureColor.BLACK, false));
        availableFigures.add(new ShortCircular(Quarto.FigureColor.WHITE, true));
        availableFigures.add( new ShortCircular(Quarto.FigureColor.WHITE, false));
        availableFigures.add( new ShortSquare(Quarto.FigureColor.BLACK, true));
        availableFigures.add( new ShortSquare(Quarto.FigureColor.BLACK, false));
        availableFigures.add( new ShortSquare(Quarto.FigureColor.WHITE, true));
        availableFigures.add( new ShortSquare(Quarto.FigureColor.WHITE, false));
        availableFigures.add( new TallCircular(Quarto.FigureColor.BLACK, true));
        availableFigures.add( new TallCircular(Quarto.FigureColor.BLACK, false));
        availableFigures.add( new TallCircular(Quarto.FigureColor.WHITE, true));
        availableFigures.add(new TallCircular(Quarto.FigureColor.WHITE, false));
        availableFigures.add(new TallSquare(Quarto.FigureColor.BLACK, true));
        availableFigures.add(new TallSquare(Quarto.FigureColor.BLACK, false));
        availableFigures.add(new TallSquare(Quarto.FigureColor.WHITE, true));
        availableFigures.add(new TallSquare(Quarto.FigureColor.WHITE, false));

    }

    public ArrayList<Figure> getAvailableFigures() {
        return availableFigures;
    }



//    public ArrayList<Figure> removeChosenFigure(int index){
//            availableFigures.remove(index);
//        return  availableFigures;
//    }



    public Figure returnRemovedFigure(int index){
        return availableFigures.remove(index);

    }

    @Override
    public String toString() {
        return  "" + (availableFigures);
    }


}
