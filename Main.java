import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that
number.
If the number is a multiple of 5, you need to print "Buzz" instead of that
number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
instead of that number*/
        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
      /*  2.Write a Java program to reverse a string.
        Test Data: Input a string: The quick brown fox Expected Output: Reverse
        string: xof nworb kciuq ehT*/
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String str = input.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

       /* 3.Write a program to find the factorial value of any number entered
        through the keyboard.*/
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        long factorial = 1;
        {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);}
       /* 4.Two numbers are entered through the keyboard. Write a program to find
        the value of one number raised to the power of another. (Do not use Java
        built-in method)*/
        System.out.print("Enter the base number: ");
        int keyboard = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= keyboard;
        }
        System.out.println(keyboard + " raised to the power of " + exponent + " is: " + result);

        /*5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.*/
        System.out.print("Enter the number of integers: ");
        int count = input.nextInt();

        int evenS = 0;
        int oddS = 0;

        System.out.println("Enter the integers:");

        for (int i = 0; i < count; i++) {
            int num = input.nextInt();

            if (num % 2 == 0) {
                evenS += num;
            } else {
                oddS += num;
            }
        }
        System.out.println("Sum of even integers: " + evenS);
        System.out.println("Sum of odd integers: " + oddS);
        /*6.Write a program that prompts the user to input a positive integer. It
        should then output a message indicating whether the number is a prime
        number.*/
        System.out.print("Enter a positive integer: ");
        int number2 = input.nextInt();

        boolean isPrime = true;

        if (number2 <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number2 / 2; i++) {
                if (number2 % i == 0) {
                    isPrime = false;
                    break;}}}

        if (isPrime) {
            System.out.println(number2 + " is a prime number.");
        } else {
            System.out.println(number2 + " is not a prime number.");}

/*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.
Expected Output:
*/

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + ":");

            // Print days for each week
            for (int day = 1; day <= 7; day++) {
                System.out.println("Day " + day);
            }}

       /* 8.Write a program thats check if the word is a palindrome or not. hint: A
        string is said to be a palindrome if it is the same if we start reading it from
        left to right or right to left.*/
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        boolean isPalindrome = true;
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }}
        if (isPalindrome) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");}}}
