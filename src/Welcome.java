import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Welcome {
	
	JFrame frame = new JFrame();
	JLabel text1 = new JLabel();
	JLabel text2 = new JLabel();
	JLabel text3= new JLabel();
	JLabel text4= new JLabel();
	JButton startbtn = new JButton();

	public Welcome() {
		
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(700,400);
			frame.setLocationRelativeTo(null);
			frame.getContentPane().setBackground(new Color(50,50,50));
			frame.setLayout(null);
			frame.setResizable(false);
			
			text1.setBounds(0,0,650,100);
			text1.setBackground(new Color(25,25,25));
			text1.setForeground(new Color(25,255,0));
			text1.setFont(new Font("Times New Roman",Font.BOLD,20));
			text1.setHorizontalAlignment(JTextField.CENTER);
			//text1.setEditable(false);
			
			text2.setBounds(0,50,650,150);
			text2.setBackground(new Color(25,25,25));
			text2.setForeground(new Color(25,255,0));
			text2.setFont(new Font("Times New Roman",Font.BOLD,20));
			text2.setHorizontalAlignment(JTextField.CENTER);
			//text2.setEditable(false);
			
			text3.setBounds(0,100,650,150);
			text3.setBackground(new Color(25,25,25));
			text3.setForeground(new Color(25,255,0));
			text3.setFont(new Font("Times New Roman",Font.BOLD,20));
			text3.setHorizontalAlignment(JTextField.CENTER);
			//text3.setEditable(false);
			
			text4.setBounds(0,270,650,150);
			text4.setBackground(new Color(25,25,25));
			text4.setForeground(new Color(255,255,255));
			text4.setFont(new Font("Times New Roman",Font.BOLD,15));
			text4.setHorizontalAlignment(JTextField.CENTER);
			
			startbtn.setBounds(250,250,150,50);
			startbtn.setFont(new Font("Times New Roman",Font.BOLD,20));
			startbtn.setFocusable(false);
			//startbtn.addActionListener(this);
			startbtn.setText("START");
			
			frame.add(text1);
			frame.add(text2);
			frame.add(text3);
			frame.add(text4);
			frame.add(startbtn);
			frame.setVisible(true);
			
			text();
	}
	
	public void text() {
		
		text1.setText("Quizes from AWS");
        text2.setText("You will get 71 multiple choice questions");
        text3.setText("To start quiz click on the START button ");
        text4.setText("@All rights reserved. Quiz created by Future-IT group");
        
        startbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Quiz quiz = new Quiz();
				quiz.nextQuestion();
				
			}
		});
	
	}
}
