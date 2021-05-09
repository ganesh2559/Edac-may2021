import java.util.Scanner;
public class Division
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 nos:");
int num1= sc.nextInt();
int num2= sc.nextInt();
int div= num1/num2;
System.out.println("The division of the numbers is "+div);
}
}