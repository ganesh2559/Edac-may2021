import java.util.Scanner;
public class Dectobin
{
public static void main(String args[])
{
int binary[]=new int[5];
int index=0;
int n=10;
while(n>0)
{
binary[index-1]=n%2;
n=n/2;
}
for(int i=index-1; i>=0;i--)
{
System.out.println(binary[i]);
}
}
}