import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting day 4 part 1");
        Scanner scanner = new Scanner(System.in);

        List<String> cards = new ArrayList<>();
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) break;
            cards.add(input);
        }
        scanner.close();

        int sum = 0;
        for (String card : cards) {
            int points = 0;
            card = card.split(":")[1];

            String winningNumbersString = card.trim().split("\\|")[0].trim();
            String ownNumbersString = card.trim().split("\\|")[1].trim();

            List<Integer> winningNumbers = new ArrayList<>();
            for (String numb : winningNumbersString.split(" ")) {
                if(numb.trim() == "") continue;
                winningNumbers.add(Integer.parseInt(numb.trim()));
            }
            List<Integer> ownNumbers = new ArrayList<>();
            for (String numb : ownNumbersString.split(" ")) {
                if(numb.trim() == "") continue;
                ownNumbers.add(Integer.parseInt(numb.trim()));
            }

            for (Integer numb : ownNumbers) {
                if(winningNumbers.contains(numb)) {
                    points = (points == 0) ? 1 : points * 2;
                }
            }
            sum += points;
        }
        System.out.println("Points: " + sum);
    }
}
