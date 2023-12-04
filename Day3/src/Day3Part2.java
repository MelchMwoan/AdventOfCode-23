import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day3Part2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting day 3 part 2");
        Scanner scanner = new Scanner(System.in);

        List<String> yLines = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;
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

        int totalRatio = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
                if (grid[i][j] == '*') {
                    int count = 0;
                    int ratio = 1;
                    String number = "";
                    if (Character.isDigit(grid[i - 1][j - 1])) {
                        int x = 1;
                        while (j-x >= 0 && Character.isDigit(grid[i - 1][j - x])) {
                            
                            number = grid[i - 1][j - x] + number;
                            grid[i - 1][j - x] = '.';
                            x++;
                        }
                        x = 0;
                        while (j+x < cols && Character.isDigit(grid[i - 1][j + x])) {
                            
                            number = number + grid[i - 1][j + x];
                            grid[i - 1][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }
                    if (Character.isDigit(grid[i - 1][j])) {
                        int x = 1;
                        while (j-x >= 0 && Character.isDigit(grid[i - 1][j - x])) {
                            
                            number = grid[i - 1][j - x] + number;
                            grid[i - 1][j - x] = '.';
                            x++;
                        }
                        x = 0;
                        while (j+x < cols && Character.isDigit(grid[i - 1][j + x])) {
                            
                            number = number + grid[i - 1][j + x];
                            grid[i - 1][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }
                    if (Character.isDigit(grid[i - 1][j + 1])) {
                        int x = 1;
                        while (j+x < cols && Character.isDigit(grid[i - 1][j + x])) {
                            
                            number = number + grid[i - 1][j + x];
                            grid[i - 1][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }

                    if (Character.isDigit(grid[i][j - 1])) {
                        int x = 1;
                        while (j-x >= 0 && Character.isDigit(grid[i][j - x])) {
                            System.out.println(grid[i][j - x]);
                            number = grid[i][j - x] + number;
                            grid[i][j - x] = '.';
                            x++;
                        }
                        x = 0;
                        while (j+x < cols && Character.isDigit(grid[i][j + x])) {
                            System.out.println(grid[i][j + x]);
                            number = number + grid[i][j + x];
                            grid[i][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }
                    if (Character.isDigit(grid[i][j])) {
                        int x = 1;
                        while (j-x >= 0 && Character.isDigit(grid[i][j - x])) {
                            System.out.println(grid[i][j - x]);
                            number = grid[i][j - x] + number;
                            grid[i][j - x] = '.';
                            x++;
                        }
                        x = 0;
                        while (j+x < cols && Character.isDigit(grid[i][j + x])) {
                            System.out.println(grid[i][j + x]);
                            number = number + grid[i][j + x];
                            grid[i][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }
                    if (Character.isDigit(grid[i][j + 1])) {
                        int x = 1;
                        while (j+x < cols && Character.isDigit(grid[i][j + x])) {
                            System.out.println(grid[i][j + x]);
                            number = number + grid[i][j + x];
                            grid[i][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }

                    
                    if (Character.isDigit(grid[i + 1][j - 1])) {
                        int x = 1;
                        while (j-x >= 0 && Character.isDigit(grid[i + 1][j - x])) {
                            System.out.println(grid[i + 1][j - x]);
                            number = grid[i + 1][j - x] + number;
                            grid[i + 1][j - x] = '.';
                            x++;
                        }
                        x = 0;
                        while (j+x < cols && Character.isDigit(grid[i + 1][j + x])) {
                            System.out.println(grid[i + 1][j + x]);
                            number = number + grid[i + 1][j + x];
                            grid[i + 1][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }
                    if (Character.isDigit(grid[i + 1][j])) {
                        int x = 1;
                        while (j-x >= 0 && Character.isDigit(grid[i + 1][j - x])) {
                            System.out.println(grid[i + 1][j - x]);
                            number = grid[i + 1][j - x] + number;
                            grid[i + 1][j - x] = '.';
                            x++;
                        }
                        x = 0;
                        while (j+x < cols && Character.isDigit(grid[i + 1][j + x])) {
                            System.out.println(grid[i + 1][j + x]);
                            number = number + grid[i + 1][j + x];
                            grid[i + 1][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }
                    if (Character.isDigit(grid[i + 1][j + 1])) {
                        int x = 1;
                        while (j+x < cols && Character.isDigit(grid[i + 1][j + x])) {
                            System.out.println(grid[i + 1][j + x]);
                            number = number + grid[i + 1][j + x];
                            grid[i + 1][j + x] = '.';
                            x++;
                        }
                        System.out.println(number);
                        ratio *= Integer.parseInt(number);
                        count++;
                        number = "";
                    }
                    System.out.println(ratio);
                    if(count == 2) {
                        totalRatio += ratio;
                    }
                }
            }
            System.out.println();
        }
        System.out.println(totalRatio);
    }
}
