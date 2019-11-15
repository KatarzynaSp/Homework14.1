import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        List<Double> numbers = giveNumbers();
        printFromBack(numbers);
        addEndShowOperation(numbers);
        maxMinNumber(numbers);
    }

    private static void maxMinNumber(List<Double> numbers) {
        TreeSet<Double> numbers1 = new TreeSet<>(numbers);
        System.out.println("Największa liczba to " + numbers1.last());
        System.out.println("Najmniejsza liczba to " + numbers1.first());
    }

    private static void addEndShowOperation(List<Double> numbers) {
        double sum = 0;
        String  a = "";
        String joined = "";
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (numbers.get(i) != numbers.get(numbers.size() -1)) {
                a += numbers.get(i) + " + ";
            } else a += numbers.get(i) + "";
        }
        System.out.println(a + "= " + sum);
    }

    private static List<Double> giveNumbers() {
        List<Double> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        System.out.println("Podaj liczby");
        while (number >= 0) {
            number = scanner.nextDouble();
            numbers.add(number);
        }
        numbers.remove(number);
        scanner.close();
        return numbers;
    }

    private static void printFromBack(List<Double> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}