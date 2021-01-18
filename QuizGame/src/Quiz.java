import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
	
	String[] questions =  {
			       				/*1*/ "What is the purpose of snapshot?What is the purpose of snapshot?What is the purpose of snapshot?What is the purpose of snapshot?What is the purpose of snapshot?What is the purpose of snapshot?",
								/*2*/ "Does VirtualBox allows you to have more than one snapshot?",
								/*3*/ "What do we use to save a particular state of a virtual machine for later use?",
								/*4*/ "Does the VirtualBox allows you to operate more than one system at a time?",
								/*5*/ "What is the difference between a snapshot and a clone in virtualBox?",
								/*6*/ "What is the name of the command for a long listing?",
								/*7*/ "What is bash?",
								/*8*/ "Clone is a copy of a virtual box",
								/*9*/ "What command will take you to the previous directory?",
								/*10*/"What command clears the screen?",
								/*11*/"What is the operating system of the physical computer on which VirtualBox was installed?",
								/*12*/"What is the deference between 32-bit and 64-bit host operating systems?",
								/*13*/"What is the operating system that is running inside the virtual machine?",
								/*14*/"Who can change other users'  passwords?",
								/*15*/"Which command will exit on man pages?",
								/*16*/"Which arrow keys edits the previous commands in the history lists?",
								/*17*/"What command is the user manual?",
								/*18*/"What command can we use to display date and time?",
								/*19*/"What command waits a number of seconds?",
								/*20*/"How could see date options?"
						  };
	String[][] options =  {
								/*1*/ {"Taking a picture","You can save a particular state of a virtual machine for later use You can save a particular state of a virtual machine for later use You can save a particular state of a virtual machine for later use","I don’t know","You can take a selfie with it"},
								/*2*/ {"No","Maybe","I don’t know","Yes"},
								/*3*/ {"Clone","Snapshot","Logs","Deatils"},
								/*4*/ {"No","Maybe","Yes","I don't know"},
								/*5*/ {"Clone complete copy of snapshot","Clone complete copy of VM, snapshot is  picture of VM","Clone complete copy of VirtualBox","No answer"},
								/*6*/ {"cd","ls -l","ld","ls -a"},
								/*7*/ {"Command language interpreter","Command helper","I don't know","None of the above"},
								/*8*/ {"True","False","I don't know","None of the above"},
								/*9*/ {"cd","cd ..","cd ~","cd -"},
								/*10*/{"clear","None of the above","Ctrl+L","A and C"},
								/*11*/{"Host operating system","Administrator","Guest","Public"},
								/*12*/{"Video adapter","RAM","Network adapter","Using OS"},
								/*13*/{"Guest OS","Only Mac OS","Only Windows OS","Only Linux"},
								/*14*/{"Administrator","Regular user","Superuser","Supervisor"},
								/*15*/{"exit","q","d","Ctrl+c"},
								/*16*/{"Left arrows","Right arrows","Down arrows","Up arrows"},
								/*17*/{"cd","ls","pad","man"},
								/*18*/{"cal","time","date","current"},
								/*19*/{"stop","pause","sleep","replay"},
								/*20*/{"man date","whatis date","date --help","help date"}
						  };
	char[] answers =	  {
								/*1*/ 'B',
								/*2*/ 'D',
								/*3*/ 'B',
								/*4*/ 'C',
								/*5*/ 'C',
								/*6*/ 'B',
								/*7*/ 'A',
								/*8*/ 'A',
								/*9*/ 'D',
								/*10*/'D',
								/*11*/'A',
								/*12*/'B',
								/*13*/'A',
								/*14*/'C',
								/*15*/'B',
								/*16*/'D',
								/*17*/'D',
								/*18*/'C',
								/*19*/'C',
								/*20*/'C'
						  };
	char guess;
	char answer;
	int index;
	int correct_guesses;
	int total_questions = questions.length;
	int result;
	int seconds=20;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();	
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JButton buttonRestart = new JButton();
	JTextArea answer_labelA = new JTextArea();
	JTextArea answer_labelB = new JTextArea();
	JTextArea answer_labelC = new JTextArea();
	JTextArea answer_labelD = new JTextArea();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
			}
		}
	});
	
	public void Welcome() {
				
	}
	
	public Quiz() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200,650);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(false);
		
		/* Frame display number of question */
		textfield.setBounds(0,0,1160,25);
		textfield.setBackground(new Color(51,153,255));
		textfield.setForeground(new Color(255,255,255));
		textfield.setFont(new Font("Arial",Font.PLAIN,18));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		/* Frame display questions */
		textarea.setBounds(0,25,1200,150);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(50,50,50));
		textarea.setForeground(new Color(255,255,255));
		textarea.setFont(new Font("Arial",Font.PLAIN,18));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		/* Button display A */
		buttonA.setBounds(0,180,50,100);
		buttonA.setFont(new Font("Arial",Font.PLAIN,18));
		buttonA.setFocusable(false);
		buttonA.setBackground(new Color(51,153,255));
		buttonA.setForeground(new Color(255,255,255));
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		/* Button display B */
		buttonB.setBounds(0,285,50,100);
		buttonB.setFont(new Font("Arial",Font.PLAIN,18));
		buttonB.setFocusable(false);
		buttonB.setForeground(new Color(255,255,255));
		buttonB.setBackground(new Color(51,153,255));
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		/* Button display C */
		buttonC.setBounds(0,390,50,100);
		buttonC.setFont(new Font("Arial",Font.PLAIN,18));
		buttonC.setFocusable(false);
		buttonC.setForeground(new Color(255,255,255));
		buttonC.setBackground(new Color(51,153,255));
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		/* Button display D */
		buttonD.setBounds(0,495,50,100);
		buttonD.setFont(new Font("Arial",Font.PLAIN,18));
		buttonD.setForeground(new Color(255,255,255));
		buttonD.setFocusable(false);
		buttonD.setBackground(new Color(51,153,255));
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		buttonRestart.setBounds(500,500,200,70);
		buttonRestart.setFont(new Font("Arial",Font.PLAIN,18));
		buttonRestart.setFocusable(false);
		buttonRestart.addActionListener(this);
		
		answer_labelA.setBounds(50,180,1135,100);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(255,255,255));
		answer_labelA.setFont(new Font("Arial",Font.PLAIN,18));
		answer_labelA.setLineWrap(true);
		answer_labelA.setWrapStyleWord(true);
		answer_labelA.setBorder(BorderFactory.createBevelBorder(1));
		answer_labelA.setEditable(false);
			
		answer_labelB.setBounds(50,285,1135,100);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(255,255,255));
		answer_labelB.setFont(new Font("Arial",Font.PLAIN,18));
		answer_labelB.setLineWrap(true);
		answer_labelB.setWrapStyleWord(true);
		answer_labelB.setBorder(BorderFactory.createBevelBorder(1));
		answer_labelB.setEditable(false);
		
		answer_labelC.setBounds(50,390,1135,100);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(255,255,255));
		answer_labelC.setFont(new Font("Arial",Font.PLAIN,18));
		answer_labelC.setLineWrap(true);
		answer_labelC.setWrapStyleWord(true);
		answer_labelC.setBorder(BorderFactory.createBevelBorder(1));
				
		answer_labelD.setBounds(50,495,1135,100);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(255,255,255));
		answer_labelD.setFont(new Font("Arial",Font.PLAIN,18));
		answer_labelD.setLineWrap(true);
		answer_labelD.setWrapStyleWord(true);
		answer_labelD.setBorder(BorderFactory.createBevelBorder(1));
		
		/* Diplay timer */ 
		seconds_left.setBounds(1160,0,25,25);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(new Color(255,0,0));
		seconds_left.setFont(new Font("Arial",Font.PLAIN,18));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		/*time_label.setBounds(1050,0,75,25);
		time_label.setBackground(new Color(50,50,50));
		time_label.setForeground(new Color(25,255,0));
		time_label.setFont(new Font("Arial",Font.PLAIN,18));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("Created by FUTURE-IT");*/
		
		number_right.setBounds(300,300,100,0);
		number_right.setBackground(new Color(25,25,25));
		number_right.setForeground(new Color(25,225,0));
		number_right.setFont(new Font("Ink Free",Font.BOLD,50));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(500,325,200,100);
		percentage.setBackground(new Color(25,25,25));
		percentage.setForeground(new Color(25,225,0));
		percentage.setFont(new Font("Ink Free",Font.BOLD,50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);
		
		nextQuestion();
	}
	
	public void nextQuestion() {
		
		if(index>=total_questions) {
			results();
		}else {
			textfield.setText("Question "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if (e.getSource() == buttonA) {
			answer='A';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		if (e.getSource() == buttonB) {
			answer='B';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		if (e.getSource() == buttonC) {
			answer='C';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		if (e.getSource() == buttonD) {
			answer='D';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		displayAnswer();
	}
	
	public void displayAnswer() {
		
		timer.stop();
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		if(answers[index] != 'B')
			answer_labelB.setForeground(new Color(255,0,0));
		if(answers[index] != 'C')
			answer_labelC.setForeground(new Color(255,0,0));
		if(answers[index] != 'D')
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(2000, new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				answer_labelA.setForeground(new Color(255,255,255));
				answer_labelB.setForeground(new Color(255,255,255));
				answer_labelC.setForeground(new Color(255,255,255));
				answer_labelD.setForeground(new Color(255,255,255)); 
				
				answer = ' ';
				seconds=20;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		
		pause.setRepeats(false);
		pause.start();
	}
	
	public void results() {
			
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = (int)((correct_guesses/(double)total_questions)*100);
		
		textfield.setText("RESULTS!");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		frame.add(buttonRestart);
		buttonRestart.setText("TRY AGAIN!");
		
		buttonRestart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Quiz quiz = new Quiz();
			}
		});

		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		
		
		frame.add(number_right);
		frame.add(percentage);
	}
}
