import java.io.*;

/*
Solution for first problem for Advent of Code 2018.
 */
public class DayOne_ProblemOne {
    public static void main(String[] args) throws IOException {
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
        }
        System.out.println(total);
    }
}
