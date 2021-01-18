import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Welcome {
	
	JFrame frame = new JFrame();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JTextField text3= new JTextField();
	JButton startbtn = new JButton();

	public Welcome() {
		
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(1200,650);
			frame.getContentPane().setBackground(new Color(50,50,50));
			frame.setLayout(null);
			frame.setResizable(false);
			
			text1.setBounds(0,0,1200,150);
			text1.setBackground(new Color(25,25,25));
			text1.setForeground(new Color(25,255,0));
			text1.setFont(new Font("Arial",Font.BOLD,35));
			text1.setBorder(BorderFactory.createBevelBorder(1));
			text1.setHorizontalAlignment(JTextField.CENTER);
			text1.setEditable(false);
			
			text2.setBounds(0,100,1200,150);
			text2.setBackground(new Color(25,25,25));
			text2.setForeground(new Color(25,255,0));
			text2.setFont(new Font("Arial",Font.BOLD,20));
			text2.setBorder(BorderFactory.createBevelBorder(1));
			text2.setHorizontalAlignment(JTextField.CENTER);
			text2.setEditable(false);
			
			text3.setBounds(0,200,1200,150);
			text3.setBackground(new Color(25,25,25));
			text3.setForeground(new Color(25,255,0));
			text3.setFont(new Font("Arial",Font.BOLD,35));
			text3.setBorder(BorderFactory.createBevelBorder(1));
			text3.setHorizontalAlignment(JTextField.CENTER);
			text3.setEditable(false);
			
			startbtn.setBounds(500,400,180,90);
			startbtn.setFont(new Font("MV Boli",Font.BOLD,30));
			startbtn.setFocusable(false);
			//startbtn.addActionListener(this);
			startbtn.setText("START");
			
			frame.add(text1);
			frame.add(text2);
			frame.add(text3);
			frame.add(startbtn);
			frame.setVisible(true);
			
			text();
	}
	
	public void text() {
		
		text1.setText("Welcome to quiz game !");
        text2.setText("This game created by Future-IT group");
        text3.setText("Start quiz click on the START button ");
        
        startbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Quiz quiz = new Quiz();
				quiz.nextQuestion();
				
			}
		});
	
	}
}
