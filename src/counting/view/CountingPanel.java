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
		this.textField = new JTextField(15);
		this.factButton = new JButton("fact");
		this.fibButton = new JButton("fib");
		
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
