//int[]x={11,567,121,21,89,671};
//Display those  numbers that ends with 1 (last digit is 1)
public class Question6 
{
		public static void main(String[] args) 
		{
			int[]x={11,567,121,21,89,671};
			for(int i=0;i<x.length;i++)
			{
			if(x[i]%10==1)
			{
				System.out.print(x[i]+" ");
			}
			}
		
	}

}