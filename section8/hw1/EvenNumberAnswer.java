import java.util.function.Function;

public class EvenNumberAnswer {
    private int sum = 0;
    private int product = 1;
    private int[] squared = new int[5];

    public static void main(String[] args) {
        ;
        EvenNumberAnswer answer = new EvenNumberAnswer();
        Function<Integer, Object> func = null;
        //printing even numbers
        func = x -> {
            System.out.print(x + " ");
            return x;
        };
        answer.doEvenNumberOperation(func, 10);
        System.out.println("\n---");
        //printing sum of even numbers
        func = x -> {
            answer.sum += x;
            return x;
        };
        answer.doEvenNumberOperation(func, 10);
        System.out.print(answer.sum);
        System.out.println("\n---");
        //printing product of even numbers
        func = x -> {
            answer.product = x;
            return x;
        };
        answer.doEvenNumberOperation(func, 10);
        System.out.print(answer.product);
        System.out.println("\n---");

        func = x -> {
            answer.squared[x / 2 - 1] = x * x;
            return x;
        };
        answer.doEvenNumberOperation(func, 10);
        for (int j : answer.squared)
            System.out.println(j);
        System.out.println("---");

    }

    public void doEvenNumberOperation(Function<Integer, Object> operation, int n) {
        for (int i = 1; i <= n; i++)
            if (i % 2 == 0)
                operation.apply(i);
    }

}