//int[]x={10,20,3,40,60,45};
// int[] y={45,789,35,400,900,23};
//copy all 2 digits number from array x and y into a new array
public class Question3 
{
	public static void main(String[] args) 
	{
		int[]x={10,20,3,40,60,45};
		int[] y={45,789,35,400,900,23};
		int []z=new int[x.length+y.length];
		int j=-1;
		for(int i=0 ;i<x.length;i++)
		{
			if(x[i]>=10  &&  x[i]<=99)
			{
				z[++j]=x[i];
			}
		}
		for(int i=0 ;i<y.length;i++)
		{
			if(y[i]>=10  &&  y[i]<=99)
			{
				z[++j]=y[i];
			}
		}
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}

}
