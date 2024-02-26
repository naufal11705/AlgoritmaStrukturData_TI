public class DragonMain04 {
    public static void main(String[] args) {
       
        Dragon04 dg1 = new Dragon04(20, 20, 10, 15);

        System.out.println("\nThe dragon moves to the right.");
        for (int i = 0; i < 4; i++) {
            dg1.moveRight();
            dg1.printPosition();
        }

        System.out.println("\nThe dragon moves upward.");
        for (int i = 0; i < 2; i++) {
            dg1.moveUp();
            dg1.printPosition();
        }

        System.out.println("\nThe dragon moves to the left.");
        for (int i = 0; i < 3; i++) {
            dg1.moveLeft();
            dg1.printPosition();
        }

        System.out.println("\nThe dragon moves to the downward.");
        for (int i = 0; i < 10; i++) {
            dg1.moveDown();
            dg1.printPosition();
        }

    }
}
