package horse;

import java.util.Random;

public class Horse {
    private Position position;

    public Horse() {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(8);
        int y = randomGenerator.nextInt(8);
        position = new Position(x, y);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


}
