import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        System.out.println("Задание 1");
        int[] weight =  new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[2]);

        double[] gramm = {1.57, 7.654, 9.9686 };
        System.out.println(gramm[0]);

        int[] random = {1, 2, 3, 7, 6, 9, 8, 4, 5 };
        System.out.println(random[4]);

        // Задание 2

        System.out.println("Задание 2");
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(gramm));
        System.out.println(Arrays.toString(random));

        // Задание 3

        System.out.println("Задание 3");

        for (int i = weight.length - 1; i >= 0; i-- ) {
            if (i != 0) {
            System.out.print(weight[i] + ", ");}
            else {
                System.out.println(weight[i]);}
            }
        for (int i = gramm.length - 1; i >= 0; i-- ) {
            if (i != 0) {
                System.out.print(gramm[i] + ", ");}
            else {
                System.out.println(gramm[i]);}
        }
        for (int i = random.length - 1; i >= 0; i-- ) {
            if (i != 0) {
                System.out.print(random[i] + ", ");}
            else {
                System.out.println(random[i]);}
        }

        // Задание 4

        System.out.println("Задание 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;
            }
        }
        System.out.print(Arrays.toString(weight));



        }









    }
