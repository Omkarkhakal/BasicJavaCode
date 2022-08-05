public class PStar4
{
public static void main(String args[])
{
for(int i=4;i>=1;i--)
{
for(int k=4;k>=i+1;k--)
{
System.out.print(" ");
}
for(int j=i;j>=1;j--)
{
System.out.print("*");
}

System.out.println();
}
}
}