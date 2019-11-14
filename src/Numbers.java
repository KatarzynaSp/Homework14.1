import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new LinkedList<>();

        giveNumbers(scanner, numbers);
        printFromBack(numbers);
        double sum = add(numbers);
        showAddOperation(numbers, sum);
    }

    private static void showAddOperation(List<Double> numbers, double sum) {
        String a = "";
        for (int i = 0; i < numbers.size() - 1; i++) {
            a += numbers.get(i) + " + ";
        }
        System.out.println(a + numbers.get(numbers.size() - 1) + " = " + sum);
    }

    private static double add(List<Double> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    private static void printFromBack(List<Double> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }

    private static void giveNumbers(Scanner scanner, List<Double> numbers) {
        double number = 0;
        System.out.println("Podaj liczby");
        while (number >= 0) {
            number = scanner.nextDouble();
            numbers.add(number);
        }
        numbers.remove(number);
        scanner.close();
    }
}