import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        if (numbers.size() > 1) {
            numbers.remove(1);
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
