public class MainMobil {
    public static void main(String[] args) {
        String[][] arrayMobil = {
            {"BMW", "M2 Coupe", "2016", "6816", "728"},
            {"Ford" , "Fiesta ST", "2014", "3921", "575"},
            {"Nissan", "370Z", "2009", "4360", "657"},
            {"Subaru", "BRZ", "2014", "4058", "609"},
            {"Subaru", "Impreza WRX STI", "2013", "6255", "703"},
            {"Toyota", "AE86 Trueno", "1986", "3700", "553"},
            {"Toyota", "86/GT86", "2014", "4180", "609"},
            {"Volkswagen", "Golf GTI", "2014", "4180", "631"},
        };
        
        Mobil mobil[] = new Mobil[8];

        for (int i = 0; i < mobil.length; i++) {
            mobil[i] = new Mobil(arrayMobil[i][0], arrayMobil[i][1], Integer.parseInt(arrayMobil[i][2]), Integer.parseInt(arrayMobil[i][3]),
                    Integer.parseInt(arrayMobil[i][4]));
        }

        System.out.println("top_acceleration tertinggi : " + mobil[0].getHighestAccel(mobil, 0, mobil.length - 1));
        System.out.println("top_acceleration terendah : " + mobil[0].getLowestAccel(mobil, 0, mobil.length - 1));
        System.out.println("Rata-rata top_power : " + mobil[0].getAvgTopPower(mobil));

    }
}
