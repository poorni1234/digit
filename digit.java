import java.util.Scanner;
class NoofInt
{
	public static void main(String args[])
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		while(s!=0)
		{
			s=s/10;
			count++;
		}
		System.out.println(count);
	}
}
