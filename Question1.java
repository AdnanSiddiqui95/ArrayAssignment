//int[]x={10,20,30,40,50,50};
//Create a new array and copy each element of array x into new array in reverse order
public class Question1 
{
	public static void main(String[] args) 
	{
		int[]x={10,20,30,40,50,50};
		int []y=new int[x.length];
		int j=x.length-1;
		int a=-1;
		for(int i=0;i<j;i++,j--)
		{
			int temp=x[i];
			x[i]=x[j];
			x[j]=temp;
		}
		for(int i=0;i<x.length;i++)
		{
			y[++a]=x[i];
			
		}
		System.out.print("y=["+y[0]);
		for(int i=1;i<y.length;i++)
		{
		System.out.print(","+y[i]);
		}
		System.out.print("]");
	}

}
