import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Solution for first problem for Advent of Code 2018.
 */
public class DayOne_ProblemOne {
    public static void main(String[] args) throws IOException {
        partOne();
        partTwo();
    }

    public static void partOne() throws IOException {
        //Create file reader
        File input = new File("input/day1_1.txt");
        BufferedReader reader = new BufferedReader(new FileReader(input));

        String next;
        int total = 0;
        //Read input
        while ((next = reader.readLine()) != null) {
            //Subtract
            if (next.charAt(0) == '-') {
                total -= Integer.parseInt(next.substring(1));
                //Add
            } else {
                total += Integer.parseInt(next.substring(1));
            }
            System.out.print(total + ", ");
        }
        System.out.println(total);
    }

    public static void partTwo() throws IOException {
        //Create file reader
        File input = new File("input/day1_1.txt");
        BufferedReader reader = new BufferedReader(new FileReader(input));

        //variables
        String next;
        int total = 0;
        ArrayList<String> changes = new ArrayList<>();
        ArrayList<Integer> frequency = new ArrayList<>();

        //Read input
        while ((next = reader.readLine()) != null) {
            changes.add(next);
        }

        //iterate through list
        for (int i = 0; i < changes.size(); i++) {
            String change = changes.get(i);

            //Subtract
            if (change.charAt(0) == '-') {
                total -= Integer.parseInt(change.substring(1));
                //Add
            } else {
                total += Integer.parseInt(change.substring(1));
            }
            //Check if current frequency is in list, if so exit
            if (frequency.contains(total)){
                System.out.println(total);
                break;
            }
            //If no add frequency to list
            frequency.add(total);

            //If at the end of the list, set i to -1, because for loop will iterate i back to 0
            if (i + 1 == changes.size())
                i = -1;
        }
        System.out.println(frequency.toString());
    }
}
