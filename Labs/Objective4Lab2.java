import java.util.Scanner;

public class Objective4Lab2{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int num1, num2, num3;
    double dub1, dub2, dub3;

    System.out.println("Please enter the first whole number you'd like to add.");
    num1 = input.nextInt();
    System.out.println("Please enter the second whole number you'd like to add.");
    num2 = input.nextInt();
    System.out.println("Please enter the third whole number you'd like to add.");
    num3 = input.nextInt();
    System.out.println("Please enter the first decimal number you'd like to add.");
    dub1 = input.nextDouble();
    System.out.println("Please enter the second decimal number you'd like to add.");
    dub2 = input.nextDouble();
    System.out.println("Please enter the third decimal number you'd like to add.");
    dub3 = input.nextDouble();

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1+dub2+dub3));
  }
}
