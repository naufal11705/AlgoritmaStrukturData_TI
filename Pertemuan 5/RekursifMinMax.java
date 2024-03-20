import java.util.Arrays;

public class RekursifMinMax {

    public static void main(String[] args) {
        int[] data = {10, 5, 12, 7, 9, 15, 2, 4, 11};

        // Temukan nilai maksimal dan minimal dengan algoritma divide and conquer
        int max = findMax(data);
        int min = findMin(data);

        // Cetak hasil
        System.out.println("Nilai maksimal: " + max);
        System.out.println("Nilai minimal: " + min);
    }

    private static int findMax(int[] data) {
        if (data.length == 1) {
            return data[0];
        }

        int mid = data.length / 2;
        int leftMax = findMax(Arrays.copyOfRange(data, 0, mid));
        int rightMax = findMax(Arrays.copyOfRange(data, mid, data.length));

        return Math.max(leftMax, rightMax);
    }

    private static int findMin(int[] data) {
        if (data.length == 1) {
            return data[0];
        }

        int mid = data.length / 2;
        int leftMin = findMin(Arrays.copyOfRange(data, 0, mid));
        int rightMin = findMin(Arrays.copyOfRange(data, mid, data.length));

        return Math.min(leftMin, rightMin);
    }
}
