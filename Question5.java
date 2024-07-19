//int[]x={10,20,3,40,60,45};
// int[] y={45,789,10,400,900,40};
//Display those numbers from array x that are not present in array y
public class Question5 
{
	static void findMissing(int x[], int y[], int n, int m)
	{
		System.out.print("numbers from array x that are not present in array y:");
		for (int i = 0; i < n; i++)
		{
			int j;
			for (j = 0; j < m; j++) 
				if (x[i] == y[j])
					break;
				if (j == m) 
					System.out.print(x[i] + " ");
			}
		}
	public static void main(String[] args)
	{
		int[]x={10,20,3,40,60,45};
		int[] y={45,789,10,400,900,40};
		int n = x.length;
		int m = y.length;

		findMissing(x, y, n, m);
		}
}