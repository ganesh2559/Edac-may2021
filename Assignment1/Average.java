import java.util.Scanner;
public class Average
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first num1");
int num1= sc.nextInt();
System.out.println("Enter the second num2");
int num2= sc.nextInt();
System.out.println("Enter the third num3");
int num3= sc.nextInt();
int avr= (num1+num2+num3)/3;
System.out.println("The Average of the numbers is "+avr);
}
}