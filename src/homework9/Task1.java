package homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        // ---------------------------------------------------------
        // task - 1:
        //    1.1 Да се създаде метод за делене на масиви
        //
        //    •	Метод: int[] divideArrays(int[] a1, int[] a2)
        //    •	Методът да приема като параметри 2 масива
        //    •	Методът да връща като резултат нов масив, като всеки елемент от новополученият масив е равен на съответният елемент от първия масив,
        //    разделен на съответващият му елемент от втория масив.
        //    •	Чрез обработка на подходящ Exception, да се записва 0 в новия масив, ако елемента на който се дели е 0
        //    •	Да се вземе в предвид дали двата масива подадени като параметри са с различна дължина,
        //    ако са с различна полученият масив да е с дължината на по-късият
        //    •	Метода да е направен по такъв начин, че в никакъв случай да не се стига до Exception, тоест искаме всички
        //    Exception-и, които евентуално могат да възникнат да бъдат обработени –
        //    Тук, искаме да използваме Exception-и, а не if-else statement!
        //    •	Да се направи и main метод, където да се демонстрира използването на метода divideArrays
        //
        //    1.1.1 Входни данни
        //    •	Array1 = [8, 3, 10, 24, 0, 4, 7, 14]
        //    •	Array2 = [4, 0, 5, 3, 9, 4]
        //    1.1.2 Изход
        //    •	[2, 0, 2, 8, 0, 1]
        // ---------------------------------------------------------

        int[] array = new int[] { 8, 3, 10, 24, 0, 4, 7, 14 };
        int[] arrayToDivide = new int[] { 4, 0, -5 };

        int[] resultArr = divideArrays(array, arrayToDivide);
        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] divideArrays(int[] array, int[] arrayToDivide) {
        try {
            int[] newArr = new int[array.length];
            int index = ZERO;

            while (index < newArr.length) {
                try {
                    newArr[index] = array[index] / arrayToDivide[index];
                    index++;
                } catch (ArithmeticException e) {
                    newArr[index] = ZERO;
                    index++;
                } catch (IndexOutOfBoundsException e) {
                    newArr = Arrays.copyOf(newArr, index);
                    break;
                }
            }

            return newArr;
        } catch (NullPointerException exception) {
            System.out.println("Provided array was null.");
        } catch (RuntimeException exception) {
            System.out.println("There was unknown error. - " + exception.getMessage());
        }

        return new int[0];
    }
}
