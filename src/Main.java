import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int
                n1, n2, sum_1, // for 2.15, 2.16, 2.17, 2.24
                n3, sum_2, average, multip, min_1, max_1, // for 2.17, 2.24
                n4, n5, min_2, max_2, i, // for 2.24, 2.30
                number_1, // for 2.25
                number_2, number_3, // for 2.26
                r, r2, // for 2.28
                number_4, count, // for 2.30, 2.32
                N_1, N_2, N_3, N_4, N_5, count_2, count_3; // for 2.32

        double pi; // for 2.28

        //////
        System.out.print("№ 2.15: ");
        System.out.print("\nEnter first integer: ");
        n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        n2 = input.nextInt();
        sum_1 = n1 + n2;
        System.out.printf("Sum is %d%n", sum_1);

        //////
        System.out.print("\n№ 2.16: ");
        if (n1 > n2 ) {
            System.out.print("The first number is larger");
        } else if (n1 == n2 ){
            System.out.print("These numbers are equal");
        } else {
            System.out.print("The second number is larger");
        }

        //////
        System.out.print("\n\n№ 2.17: ");
        System.out.print("\nEnter third integer: ");
        n3 = input.nextInt();
        sum_2 = sum_1 + n3;
        average = sum_2 / 3;
        multip = n1* n2* n3;
        System.out.printf("Sum is %d%n", sum_2);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Multiplication is %d%n", multip);
        min_1 = n1;
        max_1 = n2;
        if (n2 < min_1) {
            System.out.print("The second number is minimum");
        } else if (n3 < min_1 ){
            System.out.print("The third number is minimum");
        } else {
            System.out.print("The first number is minimum");
        }

        if (n1 > max_1) {
            System.out.print("\nThe first number is larger");
        } else if (n3 > max_1 ){
            System.out.print("\nThe third number is larger");
        } else {
            System.out.print("\nThe second number is larger");
        }

        //////
        System.out.print("\n\n№ 2.24: ");
        System.out.print("\nEnter fourth integer: ");
        n4 = input.nextInt();
        System.out.print("Enter fifth integer: ");
        n5 = input.nextInt();
        int[] array = {n1, n2, n3, n4, n5};
        min_2 = n1;
        max_2 = n2;
        for (i = 0; i < array.length; i++){
            if (array[i] < min_2) {
                min_2 = array[i];
            }
        }
        System.out.printf("The minimal number is: %d%n", min_2);
        for (i = 0; i < array.length; i++){
            if (array[i] > max_2) {
                max_2 = array[i];
            }
        }
        System.out.printf("The maximum number is: %d%n", max_2);

        //////
        System.out.print("\n№ 2.25: ");
        System.out.print("\nEnter number integer: ");
        number_1 = input.nextInt();
        if (number_1 % 2 == 0 ){
            System.out.print("The number is even");
        } else {
            System.out.print("The number is odd");
        }

        //////
        System.out.print("\n\n№ 2.26: ");
        System.out.print("\nEnter number №1 integer: ");
        number_2 = input.nextInt();
        System.out.print("Enter number №2 integer: ");
        number_3 = input.nextInt();
        if (number_3 % number_2 == 0) {
            System.out.print("The first number is a multiple of the second");
        } else {
            System.out.print("The first number is not a multiple of the second");
        }

        //////
        System.out.print("\n\n№ 2.28: ");
        System.out.print("\nEnter radius integer: ");
        r = input.nextInt();
        r2 = r*r;
        pi = 3.14159;
        System.out.printf("The diameter is: %d%n", 2*r);
        System.out.printf("The circumference  is: %f%n", pi * 2 * r);
        System.out.printf("The area is: %f%n", pi * r2);

        //////
        System.out.print("\n№ 2.30: ");
        System.out.print("\nEnter a five-digit number: ");
        number_4 = input.nextInt();
        String str_number_4 = Integer.toString(number_4);
        count = str_number_4.length();
        if (count < 5 ) {
            System.out.print("\nMistake. The number is less than 5 digits: ");
        }
        else if (count == 5){
            System.out.print("\nCorrectly entered number: ");
            for (i = 1; i < 6; i++){
                System.out.printf(i + "   ");
            }
        }
        else {
            System.out.print("\nMistake. A number greater than 5 digits: ");
        }

        //////
        System.out.print("\n№ 2.31: ");
        int[] array_2 = new int[11];
        for (i = 0; i < array_2.length; i++) {
            array_2[i] = i;
        }
        for (i = 0; i < array_2.length; i++){
            int square = array_2[i] * array_2[i];
            int cube = array_2[i] * square;
            System.out.print("\nThe number: ");
            System.out.print("The square of the number: ");
            System.out.print("The cube of the number: ");
            System.out.printf("\n%5d", array_2[i]);
            System.out.printf("%25d", square);
            System.out.printf("%25d", cube);
        }

        //////
        System.out.print("\n№ 2.32: ");
        System.out.print("\nEnter a five numbers: ");
        N_1 = input.nextInt();
        N_2 = input.nextInt();
        N_3 = input.nextInt();
        N_4 = input.nextInt();
        N_5 = input.nextInt();
        int[] array_3 = { N_1, N_2, N_3, N_4, N_5};
        count = 0;
        count_2 = 0;
        count_3 =0;
        for (i = 0; i<array_3.length; i++ ){
            if (array_3[i] < 0 ){
                count ++;
            } else if (array_3[i] == 0 ){
                count_2++;
            } else {
                count_3++;
            }
        }
        System.out.printf("\nQuantity the negative numbers: %d", count);
        System.out.printf("\nQuantity the zero numbers: %d", count_2);
        System.out.printf("\nQuantity the positive numbers: %d", count_3);
    }
}
