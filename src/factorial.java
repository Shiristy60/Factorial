import java.util.*;
public class factorial {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		shiristy obj=new shiristy();
		System.out.print("Enter a number whose factorial is to be found: ");
		int num=sc.nextInt();
		int ans=obj.fact(num);
		System.out.print(ans);
	}

}
class shiristy
{
	int prod=1;
	int fact(int n)
	{
		if(n==1 || n==0)
			return 1;
		prod= n * fact(n-1);
		//System.out.print(prod);
		return prod;
		
	}
}
