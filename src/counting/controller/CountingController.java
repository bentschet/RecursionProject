package counting.controller;

import counting.view.CountingFrame;
import counting.model.Counting;
import javax.swing.JOptionPane;

public class CountingController 
{
	private CountingFrame baseFrame;
	private Counting countingTool;
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Look, we are doing math");
	}
	
	public String transferFactorial(String input)
	{
		String factorialInfo = "The factorial of " + input + "is";
		
		if(isValid(input))
		{
			factorialInfo += Counting.calculateFactorial(Integer.parseInt(input));
			
		}
		
		return factorialInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try
		{
			int test = Integer.parseInt(testValue);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid number >= 0");
			return false;
		}
	}

}
