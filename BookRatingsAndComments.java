import java.util.Scanner;

public class BookRatingsAndComments {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which would you like to do?");
        System.out.println("1. Leave a rating.");
        System.out.println("2. Leave a comment.");
        System.out.println("3. Display ratings.");
        System.out.println("4. Display comments.");
        System.out.println("0. Quit.");
        int menuchoice = scan.nextInt();

        switch(menuchoice) {
            case 1:
                ratings();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println();
                break;
            case 0:
                System.out.print("Goodbye.");
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a valid choice.");
                menu();
                break;
        }
    }

    public static void comments() {
        Scanner comment = new Scanner(System.in);
        System.out.print("Please leave a comment below: ");
        String usercomment = comment.next();
        menu();
    }

    public static void ratings() {
        int oneCounter = 0;
        int twoCounter = 0;
        int threeCounter = 0;
        int fourCounter = 0;
        int fiveCounter = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please rate this book on a scale of 1-5: ");
        int stars = scnr.nextInt();
        if ((stars >= 1) && (stars <= 5)) {
                switch (stars) {
                    case 1:
                        System.out.println("1 star.");
                        oneCounter += 1;
                        menu();
                        break;
                    case 2:
                        System.out.println("2 stars.");
                        twoCounter += 1;
                        menu();
                        break;
                    case 3:
                        System.out.println("3 stars.");
                        threeCounter += 1;
                        menu();
                        break;
                    case 4:
                        System.out.println("4 stars.");
                        fourCounter += 1;
                        menu();
                        break;
                    case 5:
                        System.out.println("5 stars.");
                        fiveCounter += 1;
                        menu();
                        break;
                }
            }
        else {
        System.out.println("Invalid choice!");
        ratings();
        }
        //public static void comment() {
    }
}
