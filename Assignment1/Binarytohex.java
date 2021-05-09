import java.util.Scanner;
public class Binarytohex
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a binary number");
int num=sc.nextInt();
int i=0;
int d=0;
int t=num;
while(t>0)
{
int r=t%16;
t=t/16;
d=d+r *(int) Math.pow(16,i++);
}
System.out.println("Hexadecimal Equivalent of " +num+ "is" +d);
}
}