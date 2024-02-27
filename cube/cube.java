import java.util.*;
class cube
{
	public static void main(String[]args)
	{
		System.out.println("enter the limit:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
	        {
		System.out.println("cube of"+i+":"+i*i*i);
	        }
	}
}	
