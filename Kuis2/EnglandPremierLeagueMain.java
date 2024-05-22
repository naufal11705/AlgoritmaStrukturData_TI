package Kuis2;
import java.util.Scanner;

public class EnglandPremierLeagueMain {

    public static void main(String[] args) {
        EnglandPremierLeague league = new EnglandPremierLeague();
        Scanner sc04 = new Scanner(System.in);
        int menu, innerMenu;

        /*league.addFirst("Manchester City", 38, 28, 7, 3, 96, 34, 62, 91);
        league.addFirst("Arsenal", 38, 28, 5, 5, 91, 29, 62, 89);
        league.addFirst("Liverpool", 38, 24, 10, 4, 86, 41, 45, 82);
        league.addFirst("Aston Villa", 38, 20, 8, 10, 76, 61, 15, 68);
        league.addFirst("Tottenham Hotspur", 38, 20, 6, 12, 74, 61, 13, 66);
        league.addFirst("Chelsea", 38, 18, 9, 11, 77, 63, 14, 63);
        league.addFirst("Newcastle United", 38, 18, 6, 14, 85, 62, 23, 60);
        league.addFirst("Manchester United", 38, 18, 6, 14, 57, 58, -1, 60);
        league.addFirst("West Ham United", 38, 14, 10, 14, 60, 74, -14, 52);
        league.addFirst("Crystal Palace", 38, 13, 10, 15, 57, 58, -1, 49);
        league.addFirst("Brighton & Hove Albion", 38, 12, 12, 14, 55, 62, -7, 48);
        league.addFirst("Bournemouth", 38, 12, 12, 14, 54, 67, -13, 48);
        league.addFirst("Fulham", 38, 12, 11, 15, 55, 61, -6, 47);
        league.addFirst("Wolverhampton Wanderers", 38, 12, 10, 16, 50, 65, -15, 46);
        league.addFirst("Everton", 38, 11, 7, 20, 40, 51, -11, 40);
        league.addFirst("Brentford", 38, 10, 9, 19, 56, 65, -9, 39);
        league.addFirst("Nottingham Forest", 38, 8, 8, 22, 49, 67, -18, 32);
        league.addFirst("Luton Town", 38, 6, 8, 24, 35, 68, -33, 26);
        league.addFirst("Burnley", 38, 5, 9, 24, 41, 78, -37, 24);
        league.addFirst("Sheffield United", 38, 3, 7, 28, 35, 104, -69, 16);*/
        league.addFirst("Manchester City", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Arsenal", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Liverpool", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Aston Villa", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Tottenham Hotspur", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Chelsea", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Newcastle United", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Manchester United", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("West Ham United", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Crystal Palace", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Brighton & Hove Albion", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Bournemouth", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Fulham", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Wolverhampton Wanderers", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Everton", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Brentford", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Nottingham Forest", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Luton Town", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Burnley", 0, 0, 0, 0, 0, 0, 0, 0);
        league.addFirst("Sheffield United", 0, 0, 0, 0, 0, 0, 0, 0);

        league.print();

        do {
            System.out.println("=================================================");
            System.out.println("Program Klasemen England Premier League 2023/2024");
            System.out.println("=================================================");
            System.out.println("1. Insert Data Pertandingan 1");
            System.out.println("2. Insert Data Pertandingan 2");
            System.out.println("3. Insert Data Pertandingan 3");
            System.out.println("4. Tampilkan Klasemen");
            System.out.println("0. Exit");
            System.out.print("Pilih Menu : ");
            menu = sc04.nextInt();

            switch (menu) {
                case 1:
                    league.addPoints("Manchester City", 1, 0, 0, 3, 0, 3);
                    league.addPoints("Burnley", 0, 0, 1, 0, 3, -3);
                    league.addPoints("Arsenal", 1, 0, 0, 2, 1, 1);
                    league.addPoints("Nottingham Forest", 0, 0, 1, 1, 2, -1);
                    league.addPoints("Bournemouth", 0, 1, 0, 1, 1, 0);
                    league.addPoints("West Ham United", 0, 1, 0, 1, 1, 0);
                    league.addPoints("Brighton & Hove Albion", 1, 0, 0, 1, 0, 1);
                    league.addPoints("Luton Town", 0, 0, 1, 0, 1, -1);
                    league.addPoints("Liverpool", 1, 0, 0, 3, 1, 2);
                    league.addPoints("Aston Villa", 0, 0, 1, 1, 3, -2);
                    league.addPoints("Tottenham Hotspur", 1, 0, 0, 2, 0, 2);
                    league.addPoints("Chelsea", 0, 0, 1, 0, 2, -2);
                    league.addPoints("Newcastle United", 1, 0, 0, 2, 1, 1);
                    league.addPoints("Manchester United", 0, 0, 1, 1, 2, -1);
                    league.addPoints("Crystal Palace", 1, 0, 0, 1, 0, 1);
                    league.addPoints("Fulham", 0, 0, 1, 0, 1, -1);
                    league.addPoints("Wolverhampton Wanderers", 1, 0, 0, 2, 1, 1);
                    league.addPoints("Everton", 0, 0, 1, 1, 2, -1);
                    league.addPoints("Brentford", 1, 0, 0, 3, 2, 1);
                    league.addPoints("Sheffield United", 0, 0, 1, 2, 3, 1);
                    league.sortBypoin();
                    league.print();
                    break;

                case 2:
                    league.addPoints("Manchester City", 1, 0, 0, 2, 1, 1);
                    league.addPoints("Arsenal", 1, 0, 0, 3, 1, 2);
                    league.addPoints("Liverpool", 0, 1, 0, 2, 2, 0);
                    league.addPoints("Chelsea", 0, 1, 0, 1, 1, 0);
                    league.addPoints("Newcastle United", 1, 0, 0, 4, 1, 3);
                    league.addPoints("Aston Villa", 0, 0, 1, 1, 4, -3);
                    league.addPoints("Tottenham Hotspur", 1, 0, 0, 3, 2, 1);
                    league.addPoints("Manchester United", 0, 0, 1, 2, 3, -1);
                    league.addPoints("Crystal Palace", 0, 1, 0, 1, 1, 0);
                    league.addPoints("Fulham", 0, 1, 0, 1, 1, 0);
                    league.addPoints("Wolverhampton Wanderers", 1, 0, 0, 2, 0, 2);
                    league.addPoints("Everton", 0, 0, 1, 0, 2, -2);
                    league.addPoints("Brentford", 0, 1, 0, 2, 2, 0);
                    league.addPoints("West Ham United", 0, 1, 0, 2, 2, 0);
                    league.addPoints("Brighton & Hove Albion", 1, 0, 0, 1, 0, 1);
                    league.addPoints("Bournemouth", 0, 0, 1, 0, 1, -1);
                    league.addPoints("Luton Town", 1, 0, 0, 1, 0, 1);
                    league.addPoints("Burnley", 0, 0, 1, 0, 1, -1);
                    league.addPoints("Nottingham Forest", 1, 0, 0, 2, 1, 1);
                    league.addPoints("Sheffield United", 0, 0, 1, 2, 3, 1);
                    league.sortBypoin();
                    league.print();
                    break;

                case 3:
                    league.addPoints("Manchester City", 1, 0, 0, 2, 0, 2);
                    league.addPoints("Liverpool", 1, 0, 0, 3, 1, 2);
                    league.addPoints("Arsenal", 0, 1, 0, 2, 2, 0);
                    league.addPoints("Tottenham Hotspur", 0, 1, 0, 2, 2, 0);
                    league.addPoints("Newcastle United", 0, 0, 1, 1, 2, -1);
                    league.addPoints("Chelsea", 1, 0, 0, 2, 1, 1);
                    league.addPoints("Brighton & Hove Albion", 1, 0, 0, 2, 0, 2);
                    league.addPoints("Crystal Palace", 0, 0, 1, 0, 2, -2);
                    league.addPoints("Aston Villa", 1, 0, 0, 3, 2, 1);
                    league.addPoints("Fulham", 0, 0, 1, 2, 3, -1);
                    league.addPoints("Manchester United", 1, 0, 0, 2, 1, 1);
                    league.addPoints("West Ham United", 1, 0, 0, 3, 1, 2);
                    league.addPoints("Bournemouth", 0, 1, 0, 1, 1, 0);
                    league.addPoints("Wolverhampton Wanderers", 0, 1, 0, 1, 1, 0);
                    league.addPoints("Brentford", 1, 0, 0, 2, 1, 1);
                    league.addPoints("Burnley", 0, 0, 1, 1, 3, -2);
                    league.addPoints("Everton", 1, 0, 0, 1, 0, 1);
                    league.addPoints("Luton Town", 0, 0, 1, 0, 1, -1);
                    league.addPoints("Nottingham Forest", 0, 1, 0, 1, 1, 0);
                    league.addPoints("Sheffield United", 1, 0, 1, 3, 2, 1);
                    league.sortBypoin();
                    league.print();
                    break;

                case 4:
                    league.print();

            }
        } while (menu != 0);


        league.print();
    }
}