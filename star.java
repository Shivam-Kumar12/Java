public class star
{
public static void main(String[] args)
{
Scanner .in= new Scanner(System.in);
System.out.println("Please provide number of rows to print... ");
int myrows = Scanner.nextInt();
System.out.println("\nThe star pattern is... ");
for (int m = 1; m <= myrows; m++)
{
for (int n = 1; n <= m; n++)
{
System.out.print("*");.
}
System.out.println();
}
}
}