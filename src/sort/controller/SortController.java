package sort.controller;

import sort.view.SortFrame;

public class SortController 
{
	private SortFrame baseFrame;
	private int[] wholeNumbers;
	private double[] realNumbers;
	
	public SortController()
	{
		baseFrame = new SortFrame(this);
	}
	
	public void start()
	{
		fillTheArrays();
	}

	private void fillTheArrays() 
	{
		randomIntArray();
		randomDoubleArray();
	}
	
	private void randomDoubleArray()
	{
		realNumbers = new double [20];
		for(int spot = 0; spot < realNumbers.length; spot++)
		{
			realNumbers[spot] = Math.random() * 9000;
			if(spot % 7 > 3 && spot % 9 < 3)
			{
				realNumbers[spot] *= -1.000;
			}
		}
	}
	
	private void randomIntArray() 
	{
		
		wholeNumbers = new int [20];
		for(int spot =0; spot < wholeNumbers.length; spot++)
		{
			wholeNumbers[spot] = (int) (Math.random() * 23432);
		}
		
	}
}
