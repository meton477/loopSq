import java.util.Scanner;

public class LoopSquares {
    public static void main(String[] args) {
        int userInput;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number: ");

        userInput= keybd.nextInt();

for (int i = 1; i<=userInput; i++) {
    int square = i*i;

    System.out.println(i + " :\t" + square);

}
    }
}
