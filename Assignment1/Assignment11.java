import java.util.Scanner;
public class Assignment11
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius :");
double r = sc.nextDouble();
double area = 3.14*r*r;
double perimeter = 2*3.14*r;
System.out.println("area = "+area);
System.out.println("perimeter = "+perimeter);
}
}