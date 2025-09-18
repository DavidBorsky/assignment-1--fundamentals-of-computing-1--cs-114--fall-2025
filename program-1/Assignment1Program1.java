public class Assignment1Program1 {
  public static void main(String[] args) {
    // Step 1: Print initials in block letters
    // Replace 'D' and 'B' with your initials if different
/*For this assignment, you’ll be writing two separate programs, each requiring input from the user.

Program 1
For the first program, you’ll be writing a program that creates a string based on temperature and random factors.

Your program should print your first and last initials in large block letters. Use each letter’s corresponding characters to form the letters. (See the Example Output section below.)
Now, take input from the user in the form of a 5-character string, then save the string in reverse without the first and last characters. In other words, trim the outside characters. For example, if the user enters abewz, your program would save web.
Next, ask the user to enter a number in Fahrenheit. Your program should convert the value to Celsius and save it. For example, entering 32 should yield 0.0.
In this penultimate step, generate and save a random number between 32 – 16,384, inclusive.
And, finally, combine the results of steps 2 – 4 and print it to the screen.
*/

    System.out.println("DDDD   BBBBB ");
    System.out.println("D   D  B    B");
    System.out.println("D   D  BBBBB ");
    System.out.println("D   D  B    B");
    System.out.println("DDDD   BBBBB ");

    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // Step 2: Get 5-character string, trim first/last, reverse
    System.out.print("Enter a 5-character string: ");
    String input = scanner.nextLine();
    if (input.length() != 5) {
      System.out.println("Input must be exactly 5 characters.");
      return;
    }
    String trimmed = input.substring(1, 4); // Remove first and last
    String reversed = new StringBuilder(trimmed).reverse().toString();

    // Step 3: Get Fahrenheit, convert to Celsius
    System.out.print("Enter a temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    double celsius = (fahrenheit - 32) * 5 / 9;

    // Step 4: Generate random number between 32 and 16384
    int randomNum = 32 + (int)(Math.random() * (16384 - 32 + 1));

    // Step 5: Combine results and print
    System.out.println("Combined result: " + reversed + ", " + celsius + ", " + randomNum);
  }
}


