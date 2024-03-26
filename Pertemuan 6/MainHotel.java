import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {

        Scanner sc04 = new Scanner(System.in);

        String[][] arrayHotel = {
            {"Hotel Indonesia Kempinski", "Jakarta", "1000000", "2"},
            {"Grand Hyatt Bali", "Bali", "1500000", "5"},
            {"Sheraton Bandung Hotel & Towers", "Bandung", "800000", "4"},
            {"JW Marriott Hotel Surabaya", "Surabaya", "1200000", "1"},
            {"Melia Makassar", "Makassar", "700000", "3"}
        };

        Hotel hotel[] = new Hotel[5];

        for (int i = 0; i < hotel.length; i++) {
            hotel[i] = new Hotel(arrayHotel[i][0], arrayHotel[i][1], Integer.parseInt(arrayHotel[i][2]), Byte.parseByte(arrayHotel[i][3]));
        }
        
        HotelService hotelService = new HotelService();

        for (Hotel h : hotel) {
            hotelService.tambah(h);
        }

        System.out.println("Daftar Hotel sebelum diurutkan:");
        hotelService.tampilAll();

        System.out.println("Pilihan filter :");
        System.out.println("[1] Harga Ascending");
        System.out.println("[2] Bintang Descending");
        System.out.print("Pilihan anda : ");

        switch (sc04.nextInt()) {
            case 1:
                System.out.println("Daftar hotel filter harga ascending :");
                System.out.println("-- BUBBLE SORT --");
                hotelService.bubbleSortHarga();
                hotelService.tampilAll();

                System.out.println("-- SELECTION SORT --");
                hotelService.selectionSortHarga();
                hotelService.tampilAll();
                break;

            case 2:
                System.out.println("Daftar hotel filter rating bintang descending :");
                System.out.println("-- BUBBLE SORT --");
                hotelService.bubbleSortBintang();
                hotelService.tampilAll();

                System.out.println("-- SELECTION SORT --");
                hotelService.selectionSortBintang();
                hotelService.tampilAll();
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
