import java.util.Scanner;
public class Assignment13
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter width :");
double w = sc.nextDouble();
System.out.println("Enter hight :");
double h = sc.nextDouble();
double area = w*h;
double peri = 2*(w+h);
System.out.println("area is :" +area);
System.out.println("peri is :" +peri);
}

}