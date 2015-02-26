package sort.view;

import javax.swing.JFrame;
import sort.controller.SortController;

public class SortFrame extends JFrame
{
	private SortPanel basePanel;
	private SortController baseController;
	
	public SortFrame(SortController baseController)
	{
		this.baseController = baseController;
		basePanel = new SortPanel(baseController);
		setupFrame();
	}

	private void setupFrame() 
	{
		
		this.setSize(500, 500);
		this.setContentPane(basePanel);
		this.setResizable(true);
		this.setVisible(true);
		
		
	}
}
