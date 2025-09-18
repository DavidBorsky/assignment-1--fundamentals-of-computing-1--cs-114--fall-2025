public class Assignment1Program2 {
  public static void main(String[] args) 
  
  /*For the second program, you’ll convert a base 10 number to another base, 
both of which are chosen by the user. You’ll need to calculate and report the largest 
4-digit number that can be represented using the entered base. You may not use any looping
 structure to solve this program. See Example Output below, and this video, for a full example
  of what the input must look like and the resulting output.*/
  
  {
 
    System.out.println("Base Conversion Program\n");
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.print("Please enter a base (2  9): ");
    int base = scanner.nextInt();
    if (base < 2 || base > 9) {
      System.out.println("Base must be between 2 and 9.");
      return;
    }

    int largest = (int)Math.pow(base, 4) - 1;
    System.out.println("\nThe maximum, 4-digit, base 10 number in base " + base + " is " + largest + ".");


    System.out.print("Now, enter a base 10 number in the range 0 to " + largest + " to convert: ");
    int number = scanner.nextInt();
    if (number < 0 || number > largest) {
      System.out.println("Number must be in the range 0 to " + largest + ".");
      return;
    }

   
    int d0 = number % base;
    int d1 = (number / base) % base;
    int d2 = (number / (base * base)) % base;
    int d3 = (number / (base * base * base)) % base;
    String converted = String.format("%d%d%d%d", d3, d2, d1, d0);

  
    System.out.println("\n" + number + " (base 10) = " + converted + " (base " + base + ")");
  }
}


  