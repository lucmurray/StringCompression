import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string (only letters): ");
        String inputString = scanner.nextLine();
        System.out.println("The new formatted string is " + StringCompressor.compressString(inputString));
    }

    private static class StringCompressor {
        static String compressString(String inputString) {
            StringBuilder stringBuilder = new StringBuilder();
            int count = 0;
            for (int i = 0; i < inputString.length(); i++) {
                count++;
                if (i+1 >= inputString.length() || inputString.charAt(i) != inputString.charAt(i+1)) {
                    stringBuilder.append(inputString.charAt(i));
                    stringBuilder.append(count);
                    count = 0;
                }
            }
            return stringBuilder.toString().length() < inputString.length() ? stringBuilder.toString() : inputString;
        }
    }
}
