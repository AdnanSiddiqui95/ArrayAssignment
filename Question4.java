//int[]x={10,20,3,40,60,45};
// int[] y={45,789,10,400,900,40};
//Display those numbers that are common in both array
public class Question4 
{
	public static void main(String[] args) 
	{
		int[]x={10,20,3,40,60,45};
		int[] y={45,789,10,400,900,40};
		System.out.println("Common number in both x and y array are: ");
		for(int i=0 ;i<x.length;i++)
		{
			for(int j=0 ;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					System.out.println(x[i]);
				}
			}
		}
	}

}