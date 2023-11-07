package homework2.Loops;

public class Task4 {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Задача 4
        //    -	Да се изведат на екрана всички четни числа от -20 до 20.
        // ---------------------------------------------------------

        for (int i = -20; i <= 20; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
