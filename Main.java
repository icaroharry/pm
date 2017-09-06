package horse;


public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        Horse h = new Horse();
        b.printBoard();
        Position p = b.getNextPosition();
        System.out.println(p.getX() + " " + p.getY());
        b.moveHorse(p);
        b.printBoard();
    }
}
