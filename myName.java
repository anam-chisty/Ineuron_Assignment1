package in.ineuron.main;

public class myName {

	public static void main(String[] args) {
		
		int n=10;
		
		for(int i=0;i<n;i++)
		{
			//Capital A
			for(int j=0;j<n;j++)
			{
				if((i==0&&j>0&&j<n-1)||((j==0)&&i>0)||(i==(n-1)/2)||(j==n-1&&i>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
	
			}
			
			System.out.print(" ");
			
			//Capital N
			for(int j=0;j<n;j++)
			{
				if((j==0)||(j==(n-1)||i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			//Capital A
			for(int j=0;j<n;j++)
			{
				if((i==0&&j>0&&j<n-1)||((j==0)&&i>0)||(i==(n-1)/2)||(j==n-1&&i>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
	
			}
			
			System.out.print(" ");
			
			//Capital M
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||(i==j&&j<=(n-1)/2&&i<=(n-1)/2)||(i+j==n-1&&i<=(n-1)/2&&j>=(n-1)/2))
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
