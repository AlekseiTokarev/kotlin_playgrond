package leetcode;

import java.util.List;

public class LongestSymbolCombinations {

    public static void main(String[] args) {
        String input = "aaabbssssbbbbbtttrrr";
        returnLongestSymbolCombinations(input);
    }

    public static String returnLongestSymbolCombinations(String output) {

        String lastSymbol = null;
        int counter = 0;
        int longestCounter = 0;
        int startPosition = 0;
        for (int i = 0; i < output.length() - 1; i++) {
            String currentSymbol = String.valueOf(output.charAt(i));
            if (currentSymbol.equals(lastSymbol)) {
                counter++;
            } else if (lastSymbol != null) {
                if (counter > longestCounter) {
                    longestCounter = counter;
                    startPosition = i - counter;
                }
                counter = 0;
            }
        }
        return output.substring(startPosition, longestCounter);
    }

    public <T> T getFirstFrom(List<T> list) {
        return list.iterator().next();
    }
}
