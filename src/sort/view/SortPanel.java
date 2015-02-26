package sort.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;

import sort.controller.SortController;


public class SortPanel extends JPanel
{
	private SortController baseController;
	private JTextField inputField;
	private JScrollPane textPane;
	private JTextArea textArea;
	private JButton sortButton;
	private JButton searchButton;
	private SpringLayout baseLayout;
	
	public SortPanel(SortController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		textArea = new JTextArea(10, 30);
		sortButton = new JButton("Sort the stuff");
		searchButton = new JButton("Search for input");
		
		inputField = new JTextField();
		
		
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPane() 
	{
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		
	}

	private void setupListeners() 
	{
		
		
		
	}

	private void setupLayout() 
	{
		
		baseLayout.putConstraint(SpringLayout.WEST, searchButton, 255, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, 0, SpringLayout.NORTH, searchButton);
		baseLayout.putConstraint(SpringLayout.EAST, sortButton, -29, SpringLayout.WEST, searchButton);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 144, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, 341, SpringLayout.WEST, this);
		
	}

	private void setupPanel() 
	{
		
		this.setSize(500, 500);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(baseLayout);
		this.add(searchButton);
		
		this.add(sortButton);
		
		
		this.add(inputField);
		textPane = new JScrollPane(textArea);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 86, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, -212, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, searchButton, 35, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 109, SpringLayout.WEST, this);
		this.add(textPane);
		
		
	}
}
