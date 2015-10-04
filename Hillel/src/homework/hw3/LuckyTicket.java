package homework.hw3;

public class LuckyTicket {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1001; i < 1000000; i++) {
            int number1 = i / 100000 % 10,
                    number2 = i / 10000 % 10,
                    number3 = i / 1000 % 10,
                    number4 = i / 100 % 10,
                    number5 = i / 10 % 10,
                    number6 = i % 10;
            if ((number1 + number2 + number3) == (number4 + number5 + number6)) {
                counter++;
            }
        }
        System.out.println("You need: " + counter+" gifts;");
    }
}
