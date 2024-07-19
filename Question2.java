//int[]x={1,11,15,17,97,127,90,67,58};
//15,90,58-non prime number
//Display all prime number from this array
public class Question2 
{
	public static void main(String[] args) 
	{
		int[]x={1,11,15,17,97,127,90,67,58};
		for (int i = 0; i < x.length; i++) 
		{
			if(x[i]%2==0)
			{
				System.out.println(x[i]+ " is not a prime number ");
			}
			else 
			{
            boolean Prime = true;
            for (int j = 2; j < x[i]; j++) 
            {
                if (x[i] % j == 0) {
                    Prime = false;
                    System.out.println(x[i]+ " is not a prime number ");
                    break;
                }
            }
            if (Prime) {
                System.out.println(x[i] + " is a prime number ");
            }
			}
        }
    }
}
