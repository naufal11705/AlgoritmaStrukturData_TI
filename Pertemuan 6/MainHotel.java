public class MainHotel {
    public static void main(String[] args) {
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

        System.out.println("Daftar Hotel setelah diurutkan sesuai rating bintang:");
        hotelService.selectionSortBintang();
        hotelService.tampilAll();

        System.out.println("Daftar Hotel setelah diurutkan sesuai harga:");
        hotelService.bubbleSortHarga();
        hotelService.tampilAll();

    }
}
