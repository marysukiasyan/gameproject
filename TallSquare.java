public class TallSquare extends Figure{
    private final boolean isTall = true;
    private final boolean isSquare = true;


    public TallSquare(Board.FigureColor color, boolean hole) {
        super(color, hole);
    }

    @Override
    public String toString() {
        return "TallSquare{" +
                "isTall=" + isTall +
                ", isSquare=" + isSquare +
                '}';
    }
}
