public class Dragon04 {

    int x, y, width, height;

    public Dragon04(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y; 
    }

    void moveLeft() {
        if (x > 0) {
            x -= 1;
        } else {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        if (x < width) {
            x += 1;
        } else {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        if (y > 0) {
            y -= 1;
        } else {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        if (y < height) {
            y += 1;
        } else {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Position: " + x + ", " + y);
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
        System.exit(0);
    }

}




