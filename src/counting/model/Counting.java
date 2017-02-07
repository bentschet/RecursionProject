package counting.model;

public class Counting 
{
	public static int calculateFactorial(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public static int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
	
	public static long calculateIterativeFib(int num)
	{
	    long result = 1;
	    if(num == 0) 
	    {
	    	return 1;
	    }
	    else 
	    {
	        for(int i = 2; i <= num; i++) {
	        result *= i;
	    }
	    return result;
	    }
	}
	
	public int calculateIterativeFact(int n)
	{
		int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) 
        {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
	}
}
