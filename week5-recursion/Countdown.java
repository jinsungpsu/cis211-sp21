import java.util.ArrayList;

public class Countdown {
    public static void main(String[] args) {


        // Write a countdown recursive method

        int startingNum = 5000;
        System.out.println("Recursive version: ");
        // time complexity of O(n)
        // space complexity of O(n)

        long start = System.nanoTime();
        countdown(startingNum);
        long end = System.nanoTime();

        long duration = end - start;
        System.out.println("\n\nThe recursive countdown starting from: " + startingNum + " was: " + duration + " nanoseconds.");

        System.out.println("Iterative version: ");
        // time complexity of O(n)
        // space complexity of O(1)

        start = System.nanoTime();
        countdownIter(startingNum);
        end = System.nanoTime();
        duration = end - start;

        System.out.println("\n\nThe iterative countdown starting from: " + startingNum + " was: " + duration + " nanoseconds.");

        // should display 5 4 3 2 1 0 (liftoff!)
        // 10 minutes!  No pressure!
        // no googling!
        // 1:28PM


    }

    private static void countdownIter(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("Liftoff!");
    }

    public static void countdown(int num) {
        if (num != 0) {
            System.out.print(num + " ");
            num--;
            countdown(num);
        } else {
            System.out.print("0 Liftoff!");
        }
    }
}
