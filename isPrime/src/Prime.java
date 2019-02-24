import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int number = scanner.nextInt();

        if (number < 2) System.out.println("Number " + number + " is not a prime.");


            int count = 0;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0){
                    count++;
                }
            }
        if(count == 0){
            System.out.println(number + " is a prime");

        } else {
            System.out.println(number + " is not a prime");
        }
    }
}
