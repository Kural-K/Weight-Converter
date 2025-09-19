import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // WEIGHT CONVERSION PROGRAM

        System.out.println("Welcome to weight conversion program!");

        System.out.println("1: convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the # of lbs you want to convert: ");
            weight = scanner.nextInt();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in KG is: %.2fkg", newWeight);
        }
        else if( choice == 2){
            System.out.print("Enter the # of kgs you want to convert: ");
            weight = scanner.nextInt();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2flbs", newWeight);
        }
        else{
            System.out.println("Invalid Choice!");
        }

        scanner.close();
    }
}