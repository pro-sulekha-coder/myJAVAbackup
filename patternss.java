import java.util.Scanner;
class patternss
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int inp=sc.nextInt();  //taking user's inputs
		System.out.println("your results: \n");
		for(int i=1;i<=inp;i++)
		{
			System.out.print(i+" ,");
		}
		System.out.println();
	}
}
//end of the code...