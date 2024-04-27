import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    private int numPoints;


    public int getPoints() {
        return numPoints;
    }


    public void setPoints() {
        System.out.print("Enter the number of points to be plotted as a positive integer: ");


        try {
            Scanner scanner = new Scanner(System.in);
            int enteredPoints = scanner.nextInt();
            numPoints = enteredPoints + 1;

            if (enteredPoints < 0) {
                System.out.println("\nNumber of points must be a positive integer. Please try again.\n");
                setPoints();
            } else if (enteredPoints == 0) {
                System.out.println("\nCan't generate a plot using zero points! Please try again.\n");
                setPoints();
            }


        } catch (InputMismatchException e) {
            System.out.println("""

                    The number of points must be a minimum of 1 and a maximum of 100,000. Please try again.
                    """);
            setPoints();
        }
    }
}
