public class PStar9
{
public static void main(String args[])
{
int num=7;

for(int i=4;i>=1;i--)
{
for(int j=4;j>i;j--)
{
System.out.print(" ");
}

for(int k=1;k<=num;k++)
{
System.out.print("*");
}
System.out.println();
num=num-2;
}
}
}