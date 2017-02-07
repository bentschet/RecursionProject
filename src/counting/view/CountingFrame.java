package counting.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import counting.controller.CountingController;

public class CountingFrame extends JFrame
{
	private CountingController baseController;
	private CountingPanel panel;
	
	public CountingFrame(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.panel = new CountingPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(500, 500);
		super.setTitle("Recursion");
		super.setContentPane(panel);
		super.setVisible(true);
	}
	
	public CountingPanel getPanel()
	{
		return this.panel;
	}
}
