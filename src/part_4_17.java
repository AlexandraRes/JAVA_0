// Задание 4.17
import java.util.Scanner;
public class part_4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int allMiles = 0, allGallons = 0;
        int miles, gallons, trips, i;
        System.out.print("\nEnter the number of trips : ");
        trips = input.nextInt();
        for (i = 1; i <= trips; i++) {
            System.out.printf("\nEnter the number of miles traveled per trip: %d (enter -1 to complete) %n", i);
            miles = scanner.nextInt();
            if (miles == -1){
                break;
            }
            System.out.printf("\nEnter the number of gallons spent per trip: %d (enter -1 to complete) %n", i);
            gallons = scanner.nextInt();
            if (gallons == -1){
                break;
            }
            double MilToGal = (double) miles / gallons;
            System.out.println("\nMiles per gallon for this trip:" + MilToGal);
            allMiles += miles;
            allGallons += gallons;
        }
        if (allGallons !=0 ){
            double averMtoGal = (double) allMiles / allGallons;
            System.out.println("\nAverage consumption per tank:" + averMtoGal);
        } else {
            System.out.println("You didn't enter the correct travel data.");
        }
        scanner.close();
    }
}

