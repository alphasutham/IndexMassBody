import java.util.Scanner;

    public class IndexMassBody {
        public static void main(String[] args) {
            Scanner BeratBadan = new Scanner(System.in);
            System.out.println("input your weight (number)");

            int Beratbadan = BeratBadan.nextInt();

            Scanner TinggiBadan = new Scanner(System.in);
            System.out.println("input your height (number)");

            int tinggibadan = TinggiBadan.nextInt();

            int a = Beratbadan;
            double b = tinggibadan;
            double c = b / 100;
            double d = c * c;
            double e = a / d;

            String bmi = "Your Body Mass Index is ";
            String argument = " This is considered ";
            if (e <= 18.4)
                System.out.println(bmi + e + argument + "underweight");

            if (e >= 18.5)
                if (e < 25)
                    System.out.println(bmi + e + argument + "normal weight");
            if (e >= 25)
                if (e < 30)
                    System.out.println(bmi + e + argument + "overweight");
            if (e >= 30)
                if (e < 35)
                    System.out.println(bmi + e + argument + "obesity class 1");
            if (e >= 35)
                if (e < 40)
                    System.out.println(bmi + e + argument + "obesity class 2");
            if (e >= 40)
                System.out.println(bmi + e + argument + "obesity class 3");

            System.out.println("");
            System.out.println("to close this program, write (close)");
            Scanner matikan = new Scanner(System.in);
            String turnoff = matikan.next();
            switch (turnoff) {
                case "close":
                    System.out.println("Thank You");
               /* System.out.println("⢀⢀⢀⢀⢀⢀⢀⣠⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣄⢀⠠⡀");
                System.out.println("⢀⢀⢀⢀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣤⣙⣿⣿⣾⣷⣄");
                System.out.println("⢀⢀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄");
                System.out.println("⢀⢀⠜⣿⠙⣹⡻⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄");
                System.out.println("⢀⢀⣰⣿⢠⣿⣇⣶⣿⣿⣿⣿⣿⣿⣿⡟⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷");
                System.out.println("⢀⢀⣰⣿⢠⣿⣇⣶⣿⣿⣿⣿⣿⣿⣿⡟⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⢀⢀⢀⢀");
                System.out.println("⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢀⢀⠍⠙⢿⡟⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⣴⣾⠃");
                System.out.println("⣿⣿⣿⣿⣿⣿⣿⠹⣿⣿⣿⣿⣿⣿⣿⠁⠈⢀⡤⢲⣾⣗⠲⣿⣿⣿⣿⣿⣿⣟⠻⢿⣿⣿⡿⠃");
                System.out.println("⡿⣿⣿⣿⣿⣿⣿⡀⢙⣿⣿⣿⣿⣿⣿⢀⠰⠁⢰⣾⣿⣿⡇⢀⣿⣿⣿⣿⣿⣿⡄⠈⢿⣿⣿⣿⣦⣄⡀");
                System.out.println("⡇⢻⣿⣿⣿⣿⢿⣇⢀⢀⠙⠷⣍⠛⠛⢀⢀⢀⢀⠙⠋⠉⢀⢀⢸⣿⣿⣿⣿⣿⣷⢀⡟⣿⣿⣿⣿⣿⣟⠦");
                System.out.println("T⠰⢀⠻⣿⣿⣿⣧⡙⠆⢀⣀⠤⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢸⣿⣿⣿⣿⣿⣿⢿⣧⢸⢻⣿⣿⠿⢿⡆⠁⠠⠠");
                System.out.println("⢀⢀⢀⠈⢿⣿⣿⣷⣖⠋⠁⢀⢀⢀⢀⢀⢀⣀⣀⣄⢀⢀⢀⢀⢸⠏⣿⣿⣿⢿⣿⢸⣿⣆⢀⢻⣿⣆⢀⢀⢀⢀⢀⣀⡀");
                System.out.println("⢀⢀⢀⢀⠈⣿⣿⣿⣷⡀⢀⢀⢀⢀⢀⡒⠉⠉⢀⢀⢀⢀⢀⢀⢈⣴⣿⣿⡿⢀⡿⢀⢻⣿⣆⡈⣿⣿⠂⢀⢀⢀⢸⣿⢀⢀⢀⢀⢀");
                System.out.println("⢀⢀⢀⢀⢀⠘⣿⣿⣿⣷⣄⢀⢀⢀⢀⠐⠄⢀⢀⢀⠈⢀⣀⣴⣿⣿⣿⡿⠁⢀⣡⣶⣿⣿⣿⣿⣿⣯⣄⢀⢀⢀⢸⣿⢀⢀⢀⢀⠐⣠⣾");
                System.out.println("⢀⢀⢀⢀⢀⢀⢹⠻⣿⣿⣿⣿⣆⠢⣤⣄⢀⢀⣀⠠⢴⣾⣿⣿⡿⢋⠟⢡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⡄⣿⣿⢂⠐⢀⣤⡾⡟⠁");
                System.out.println("⢀⢀⢀⢀⢀⢀⠸⢀⠘⠿⣿⣿⣿⣦⣹⣿⣀⣀⣀⣀⠘⠛⠋⠁⡀⣄⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢀⣿⣿⣴⣾⣿⣭⣄⢀⢀");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠈⠛⣽⣿⣿⣿⣿⣿⣿⠁⢀⢀⢀⣡⣾⣿⣿⣿⡟⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣶");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢰⣿⣿⣿⣿⣿⣿⣿⣦⣤⣶⣿⡿⢛⢿⡇⠟⠰⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⣿⣿⣿⡿⢉⣭⢭⠏⣿⡿⢸⡏⣼⣿⢴⡇⢸⣿⣶⣿⣿⣿⣿⣿⣿⣿⠇⢀⢀⣿⣿⣿⣿⡿⢿⣿⣿⡿⠟⠁");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢰⣿⣿⣿⢃⣶⣶⡏⠸⠟⣱⣿⣧⣛⣣⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠈⢀⢀⡼⠉⠉⠉⠁⢀⢀⢀⢀⢀⢀⢀");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⣾⣿⣿⣿⣾⣿⣿⠟⢻⡿⡉⣷⣬⡛⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⡯⢀⢀⠴⠋");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⣸⣿⣿⣿⣿⣿⣿⡿⢰⠘⣰⣇⣿⣿⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⠘⢿⣿⣿⣿⣿⣿⡷⢺⣿⠟⣩⣭⣽⣇⠲⠶⣿⣿⣿⣿⣿⣿⣿⠃");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⠐⢀⣾⣿⣿⣿⣿⠟⢐⡈⣿⣷⣶⠎⣹⡟⠟⣛⣸⣿⣿⣿⣿⣿⣿");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⠠⢀⣼⣿⣿⣿⣿⣯⣼⣿⣷⣿⣷⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⠐⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⠂⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⠈⠼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠹⠉⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠓⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠄⡠⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠉⠛⢦");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⢀⢀⢀⢀⢀⢀⠁⡀");
                System.out.println("⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡿⠟⠁⢀⢀⢀⢀⢀⢀⢀⢀⢀⢀⠐");
                break;*/
                    break;
                case "Close":
                    System.out.println("Thanks");
                    break;
                default:
                    System.out.println("I SAID USE CLOSE!");
                    break;
            }

        }
    }