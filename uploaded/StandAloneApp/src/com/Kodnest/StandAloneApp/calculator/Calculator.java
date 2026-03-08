package com.Kodnest.StandAloneApp.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calulator");
		lblNewLabel.setBounds(119, 10, 159, 27);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 22));
		contentPane.add(lblNewLabel);
		
		a = new JTextField();
		a.setBounds(108, 57, 79, 19);
		contentPane.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setBounds(108, 103, 79, 19);
		b.setColumns(10);
		contentPane.add(b);
		
		JTextArea result = new JTextArea();
		result.setBounds(32, 165, 239, 55);
		contentPane.add(result);
		
		JButton bt1 = new JButton("sum");
		bt1.setBounds(285, 40, 85, 21);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				
				int add =n1+n2;
				result.setText("The Addition result is: "+add);
			}
		});
		contentPane.add(bt1);
		
		JButton bt2 = new JButton("sub");
		bt2.setBounds(285, 71, 85, 21);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				
				int sub =n1-n2;
				result.setText("The Addition result is: "+sub);
			}
				
			
		});
		contentPane.add(bt2);
		
		JButton bt3 = new JButton("mul");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				
				int mul =n1*n2;
				result.setText("The Subtarction result is: "+mul);
			}
			
		});
		bt3.setBounds(285, 102, 85, 21);
		contentPane.add(bt3);
		
		JButton bt4 = new JButton("div");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				
				int div =n1/n2;
				if(n2>0) {
				result.setText("The Multiplication result is: "+div);
				} else {
					System.out.println("invalid input");
				}
			}
			
		});
		bt4.setBounds(285, 134, 85, 21);
		contentPane.add(bt4);
		
		JButton bt5 = new JButton("mod");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				if(n2>0) {
				int div =n1%n2;
				result.setText("The Addition result is: "+div);
				} 
				else {
					System.out.println("Invalid input");
				}
			}
			
			
		});
		bt5.setBounds(285, 167, 85, 21);
		contentPane.add(bt5);
		
		JLabel lblNewLabel_1 = new JLabel("Number 1");
		lblNewLabel_1.setBounds(10, 60, 88, 27);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number 2");
		lblNewLabel_1_1.setBounds(10, 106, 88, 27);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1_1);

	}

}
