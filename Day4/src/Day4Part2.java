import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day4Part2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting day 4 part 2");
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> amounts = new HashMap<>();
        List<String> cards = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;
            amounts.put(input, 1);
            cards.add(input);
        }
        scanner.close();

        int sum = 0;
        for (String card : cards) {
            String oriCard = card;
            card = card.split(":")[1];
            for (int amount = 0; amount < amounts.get(oriCard); amount++) {
                int points = 0;
                int matches = 0;

                String winningNumbersString = card.trim().split("\\|")[0].trim();
                String ownNumbersString = card.trim().split("\\|")[1].trim();

                List<Integer> winningNumbers = new ArrayList<>();
                for (String numb : winningNumbersString.split(" ")) {
                    if (numb.trim() == "")
                        continue;
                    winningNumbers.add(Integer.parseInt(numb.trim()));
                }
                List<Integer> ownNumbers = new ArrayList<>();
                for (String numb : ownNumbersString.split(" ")) {
                    if (numb.trim() == "")
                        continue;
                    ownNumbers.add(Integer.parseInt(numb.trim()));
                }

                for (Integer numb : ownNumbers) {
                    if (winningNumbers.contains(numb)) {
                        points = (points == 0) ? 1 : points * 2;
                        matches++;
                    }
                }

                for (int i = 1; i <= matches; i++) {
                    if (i > cards.size())
                        break;
                    amounts.put(cards.get(cards.indexOf(oriCard) + i),
                            amounts.get(cards.get(cards.indexOf(oriCard) + i)) + 1);

                }
            }

        }
        for (Map.Entry<String, Integer> set : amounts.entrySet()) {
            System.out.println(set);
            sum += set.getValue();
        }
        System.out.println("Points: " + sum);
    }
}
