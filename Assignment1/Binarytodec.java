import java.util.Scanner;
public class Binarytodec
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
int r=t%10;
t=t/10;
d=d+r *(int) Math.pow(2,i++);
}
System.out.println("Decimal Equivalent of " +num+ "is" +d);
}
}