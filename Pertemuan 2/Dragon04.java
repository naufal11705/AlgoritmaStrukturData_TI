public class Dragon04 {

    int x, y, width, height;

    void moveLeft() {
        if (x > 0) {
            x -= 1;
        }
    }

    void moveRight() {
        if (x < width) {
            x += 1;
        }
    }

    void moveUp() {
        if (y > 0) {
            y -= 1;
        }
    }

    void moveDown() {
        if (x < height) {
            x += 1;
        }
    }

    void printPosition() {
        System.out.println("x : " + x + ",y : " + y);
    }

    void detectCollision(int x, int y) {
        if (x<0 || y<0) {
            System.out.println("Game Over");
        }
    }

}




