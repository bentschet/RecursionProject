package counting.view;

import java.awt.Color;
import javax.swing.*;
import counting.controller.CountingController;
import java.awt.Dimension;
import java.awt.event.*;

public class CountingPanel extends JPanel
{
	private CountingController baseController;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JTextField textField;
	private JButton fibButton;
	private JButton factButton;
	
	public CountingPanel(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.textArea = new JTextArea(5, 15);
		this.fibButton = new JButton("fib");
		this.factButton = new JButton("fact");
		this.textField = new JTextField(15);
		
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 47, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 126, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, textArea);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, textArea);
		baseLayout.putConstraint(SpringLayout.EAST, textField, 180, SpringLayout.WEST, textArea);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, 0, SpringLayout.EAST, textArea);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 0, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 28, SpringLayout.SOUTH, textField);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 0, SpringLayout.WEST, textArea);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(textArea);
		this.add(textField);
		this.add(fibButton);
		this.add(factButton);
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						textArea.setText(baseController.transferFactorial(textField.getText()));
					}
				});
		fibButton.addActionListener(new ActionListener()
		
				{
					public void actionPerformed(ActionEvent click)
					{
						
					}
				});
	}
}
