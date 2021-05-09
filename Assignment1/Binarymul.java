import java.util.Scanner;
public class Binarymul
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first binary number ");
String x =sc.next();
System.out.println("Enter second binary number ");
String y =sc.next();
int b1 =Integer.parseInt(x,2);
int b2 =Integer.parseInt(y,2);
int b3=b1*b2;

System.out.println("Multiply is : "+ Integer.toBinaryString(b3));
}
}