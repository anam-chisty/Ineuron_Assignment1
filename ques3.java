package in.ineuron.main;

public class ques3 {

	public static void main(String[] args) {
		
		int n=21;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j<=n/2)||j==0||i==0||j==n-1||i==n-1||(j-i)>=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

	}
	}

}
