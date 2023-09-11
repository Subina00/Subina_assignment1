
/**
 * This is the assignment1 to calculate the highest marks and lowest marks of the students and find the mean and standard deviation.
 *
 * @author (Subina)
 * @version (Version 1.0 05/09/2023)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Allow the user to input the assignment name
        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();
        
        // F2: Allow the user to input students' marks for the assignment (up to 30 students)
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            while (true) {
                try {
                    System.out.print("Enter mark for student " + i + ": ");
                    int mark = Integer.parseInt(scanner.nextLine());

                    // Validate input as a valid mark (between 0 and 30)
                    if (mark >= 0 && mark <= 30) {
                        marks.add(mark);
                        break;
                    } else {
                        System.out.println("Invalid mark. Please enter a mark between 0 and 30.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }
}
}



