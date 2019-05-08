/**
 * Created by wasadmin on 5/7/2019.
 */
public class StringCalculator {

    public static int add(String input) {

        if(input.isEmpty()) {
            return 0;
        } else if (input.startsWith("//")) {
            String delimiter = input.substring(2,3);
            if(delimiter.equals(("?"))) {
                delimiter = String.valueOf('\\') + delimiter;
            }
            String[] inputArray = input.substring(4).split(delimiter);
            return calculateSumOfValuesInArray(inputArray);
        } else if (input.contains(",")) {
            String[] inputArray = input.split(",");
            return calculateSumOfValuesInArray(inputArray);
        } else if(input.contains("\n")) {
            String[] inputArray = input.split("\n");
            return calculateSumOfValuesInArray(inputArray);
        } else {
            return Integer.parseInt(input);
        }
    }

    private static String getDelimiter(String input) {
        if (input.startsWith("//")) {
            String delimiter = input.substring(2, 3);
            if (delimiter.equals(("?"))) {
                delimiter = String.valueOf('\\') + delimiter;
            }
        }
        if (input.contains(",")) {
            return ",";
        }
        if(input.contains("\n")) {
            String[] inputArray = input.split("\n");

        }
        return "";
    }

    private static int calculateSumOfValuesInArray(String[] inputArray) {
        int result = 0;
        for(String iter : inputArray) {
            result += Integer.parseInt(iter);
        }
        return result;
    }
}
