import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> calibrations = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) break;
            Map<String, String> numberMapping = new HashMap<>();
            numberMapping.put("one", "1");
            numberMapping.put("two", "2");
            numberMapping.put("three", "3");
            numberMapping.put("four", "4");
            numberMapping.put("five", "5");
            numberMapping.put("six", "6");
            numberMapping.put("seven", "7");
            numberMapping.put("eight", "8");
            numberMapping.put("nine", "9");

            String newInput = "";
            for (char ch : input.toCharArray()) {
                if(Character.isDigit(ch)) continue;
                newInput = newInput + ch;
                for (String str : numberMapping.keySet()) {
                    if(newInput.contains(str)) {
                        input = input.replaceAll(str, str.charAt(0)+numberMapping.get(str)+str.charAt(str.length()-1));
                        newInput = str.charAt(str.length()-1)+"";
                    }
                }
            }
            input = input.replaceAll("\\D+", "");
            calibrations.add(Integer.parseInt(input.charAt(0)+""+input.charAt(input.length()-1)));
        }
        System.out.println(calibrations);
        int sum = 0;
        for (Integer integer : calibrations) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
