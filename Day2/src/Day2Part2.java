import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day2Part2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting day 2 part 2");

        ArrayList<Integer> powers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) break;
            
            String[] sets = input.split(":")[1].split(";");
            
            Map<String, Integer> maxMoveValues = new HashMap<>();
            for (String set : sets) {
                String[] moves = set.trim().split(",");
                for (String move : moves) {
                    if(maxMoveValues.get(move.trim().split(" ")[1]) != null) {
                        if(maxMoveValues.get(move.trim().split(" ")[1]) < Integer.parseInt(move.trim().split(" ")[0])) 
                            maxMoveValues.put(move.trim().split(" ")[1], Integer.parseInt(move.trim().split(" ")[0]));
                    } else {
                        maxMoveValues.put(move.trim().split(" ")[1], Integer.parseInt(move.trim().split(" ")[0]));
                    }
                }
            }
            int totalPower = 1;
            for (Integer val : maxMoveValues.values()) {
                totalPower *= val;
            }
            powers.add(totalPower);
        }
        int sum = 0;
        for (Integer integer : powers) {
            sum += integer;
        }
        System.out.println("Total power count: " + sum);
    }
}
