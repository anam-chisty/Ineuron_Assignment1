package in.ineuron.main;

public class ques1 {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=0;i<n;i++)
		{
			//Lower Case i
			for(int j=0;j<n;j++)
			{
				if((j==n/2&&i>=n/4) || (i==0&&j==n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
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
			//Capital E
			for(int j=0;j<n;j++)
			{
				if((i==0)||(i==(n-1))||(i==((n-1)/2))||(j==0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			//Capital U
			for(int j=0;j<n;j++)
			{
				if((j==0 && i<(n-1))||(i==(n-1)&&j>0&&j<(n-1))||(j==(n-1)&&i<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			//Capital R
			for(int j=0;j<n;j++)
			{
				if((j==0&&i>0)||(i==0&&j<n-1)||(i==(n-1)/2&&j<n-1)||(j==n-1&&i>0&&i<(n-1)/2)||(i==j&&i>=(n-1)/2&&j>=(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			//Capital O
			for(int j=0;j<n;j++)
			{
				if((i==0&&j>0&&j<n-1)||(j==0&&i>0&&i<n-1)||(j==n-1&&i>0&&i<n-1)||(i==n-1&&j>0&&j<n-1))
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
			System.out.println();
		}
	
	
	

}
 	}
