//This proggram gives Cross Square pattern 
class SquareCross
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || i+j==n-1 || i==n-1 || j==n-1 || i==0 || j==0)
				{
					System.out.print("*"+" ");
				}
				else 
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
