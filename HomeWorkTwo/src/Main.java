import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Задание 1
//        System.out.println(numFloat());
//    }
//    public static float numFloat() {
//        while (true) {
//            try {
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Введите дробное число: ");
//                float x = scanner.nextFloat();
//                return x;
//            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели не верно, попробуйте ещё раз!!!");
//            }
//        }
//    }
        // Задание 2

//        Integer[] intArray = new Integer[10];
//        intArray = num(intArray);
//        numTest(intArray);
//    }
//
//    private static void numTest(Integer[] intArray) {
//        try {
//            int d = 5;
////            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
//    }
//    public static Integer[] num(Integer[] intArray) {
//        //        Integer[] array = new Integer[10];
//        while (true) {
//            try {
//                for (int j = 0; j < intArray.length; j++) {
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.print("Введите число: ");
//                    Integer x = scanner.nextInt();
//                    intArray[j] = x;
//                 }
//            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели не верно, попробуйте ещё раз!!!");
//            }
//            for (int i = 0; i < intArray.length; i++) {
//                System.out.print(intArray[i] + ", ");
//            }
//            return intArray;
//        }
//    }
        // Задание 3

//        public static void main(String[] args) throws Exception {
//            try {
//                int a = 90;
//                int b = 5;
//                System.out.println("a / b = " + a / b);
//                printSum(23, 234);
//                int[] abc = { 1, 2 };
//                abc[3] = 9;
//            } catch (NullPointerException ex) {
//                System.out.println("Указатель не может указывать на null!");
//            } catch (IndexOutOfBoundsException ex) {
//                System.out.println("Массив выходит за пределы своего размера!");
//            }catch (Throwable ex) {
//                System.out.println("Что-то пошло не так...");
//            }
//        }
//        public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//            System.out.println("a + b = " + a + b);
//        }


        String name;
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println("Введите Ваше имя");
                name = scanner.nextLine();
                if(name.isEmpty()) {
                    System.out.println("Вы ничего не ввели, попробуйте ещё раз!!");
                }
                else System.out.println("Ваше имя " + name);

            }


        }


}

