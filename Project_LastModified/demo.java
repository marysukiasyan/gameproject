package gameproject.gameproject;

import java.util.ArrayList;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
//        TallSquare t = new TallSquare(Quarto.FigureColor.WHITE,false);
//        System.out.println(t);
//        System.out.println(t.getColor());
//        System.out.println(t.isHole());
//        System.out.println(t.isTall());
//        System.out.println(t.isSquare());
//        Quarto q = new Quarto();
//        System.out.println(Arrays.deepToString(q.getBoard()));
//        ShortCircular s = new ShortCircular(Quarto.FigureColor.BLACK,true);
//        System.out.println(s.isSquare());
//        TallCircular g = new TallCircular(Quarto.FigureColor.WHITE,false);
//        System.out.println(g.isSquare());
        AvailableFigures fig = new AvailableFigures();
        System.out.println(fig);
        Quarto board = new Quarto();
        System.out.println(Arrays.deepToString(board.getBoard()));

        int index = 0;
        board.addFigureToBoard(0,0,fig.returnRemovedFigure(0));
        board.addFigureToBoard(0,1,fig.returnRemovedFigure(1));
        board.addFigureToBoard(0,2,fig.returnRemovedFigure(2));
        board.addFigureToBoard(0,3,fig.returnRemovedFigure(3));


        System.out.println(board);
        System.out.println(fig.getAvailableFigures());
        System.out.println(board.isGameOver());
        System.out.println(fig);





//        String[] lst = {"Hello_World","Mom_Hello","World_Hello","Go_Home_Hello_Pop"};
//
//        int count=0;
//        String l = "lom";
//        System.out.println(l.indexOf("k"));
//        for (int i = 0; i < 4; i++){
//            if (lst[i].contains("Hello"));
//            count++;
//        }
//        System.out.println(count);
    }

    }

