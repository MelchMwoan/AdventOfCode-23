import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting day 3 part 1");
        Scanner scanner = new Scanner(System.in);

        List<String> yLines = new ArrayList<>();
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) break;
            yLines.add(input);
        }
        scanner.close();

        int rows = yLines.size();
        int cols = yLines.get(0).length();

        char[][] grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = yLines.get(i).toCharArray()[j];
            }
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // System.out.print(grid[i][j] + " ");
                if(!Character.isDigit(grid[i][j]) && grid[i][j] != '.'){

                    
                }
            }
            // System.out.println();
        }
        System.out.println(sum);
    }
}
