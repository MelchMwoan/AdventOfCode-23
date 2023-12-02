import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting day 2 part 1");
        ArrayList<Integer> totalGames = new ArrayList<>();
        ArrayList<Integer> impossibleGames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) break;
            Map<String, Integer> maxValues = new HashMap<>();
            maxValues.put("red", 12);
            maxValues.put("green", 13);
            maxValues.put("blue", 14);

            Integer gameId = Integer.parseInt(input.split(":")[0].split(" ")[1]);
            totalGames.add(gameId);
            String[] sets = input.split(":")[1].split(";");
            
            set: for (String set : sets) {
                String[] moves = set.trim().split(",");
                for (String move : moves) {
                    if(maxValues.get(move.trim().split(" ")[1]) < Integer.parseInt(move.trim().split(" ")[0])) {
                        if(!impossibleGames.contains(gameId)) impossibleGames.add(gameId);
                        continue set;
                    }
                }
            }
        }
        int sum = 0;
        for (Integer integer : totalGames) {
            sum += integer;
        }
        for (Integer integer : impossibleGames) {
            sum -= integer;
        }
        System.out.println("Total ID count: " + sum);
    }
}
