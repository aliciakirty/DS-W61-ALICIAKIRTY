import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AgeVerificationQueue {
    
    public static void enqueue(Queue<Integer> a, int value) {
        a.add(value);
    }

    public static int dequeue(Queue<Integer> a) {
        return a.remove();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextLine()) return;
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            
            Queue<Integer> passed = new LinkedList<>();
            Queue<Integer> failed = new LinkedList<>();
            
            for (String part : parts) {
                try {
                    int age = Integer.parseInt(part);

                    if (age >= 1000) {
                        return; 
                    }

                    if (age >= 28 && age <= 118) {
                        enqueue(passed, age);
                    } else {
                        enqueue(failed, age);
                    }
                } catch (NumberFormatException e) {
                }
            }

            System.out.println(passed);
            System.out.println(failed);
        }
    }
}
