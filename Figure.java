public class Figure {
    private Board.FigureColor color;
    private boolean hole;

    public Figure(Board.FigureColor color, boolean hole ) {
        this.color = color;
        this.hole = hole;

    }

    @Override
    public String toString() {
        return "Figure{" +
                "color=" + color +
                ", hole=" + hole +
                '}';
    }
}
