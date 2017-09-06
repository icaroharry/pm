package horse;

public class Board {
    private int[][] squares;
    private Horse horse;

    public Board() {
        squares = new int[8][8];
        horse = new Horse();
        this.moveHorse(horse.getPosition());
    }

    public int[][] getSquares() {
        return squares;
    }

    public void setSquares(int[][] squares) {
        this.squares = squares;
    }

    public void moveHorse(Position p) {
        squares[p.getX()][p.getY()] = 1;
        horse.setPosition(p);
    }

    public void printBoard() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(squares[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public Position getNextPosition() {
        Position currentPosition = horse.getPosition();

        for(int i = -2; i <= 2; i++) {
            if(i != 0) {
                if(currentPosition.getX() + i >= 0 && currentPosition.getX() + i < 8) {
                    for(int j = -2; j <= 2; j++) {
                        if(j != 0) {
                            if(currentPosition.getY() + j >= 0 && currentPosition.getY() + j < 8) {
                                if(Math.abs(i) + Math.abs(j) == 3) {
                                    return new Position(currentPosition.getX() + i, currentPosition.getY() + j);                                    
                                }
                            }
                        }
                    }
                }
            }
        }

        return currentPosition;
    }

}
