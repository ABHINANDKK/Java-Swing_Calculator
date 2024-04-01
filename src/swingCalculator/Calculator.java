package swingCalculator;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevBttn;
	JButton eigButt ;
	JButton ninButt;
	JButton sixButt;
	JButton fivButt;
	JButton forButt;
	JButton threButt;
	JButton twoButt ;
	JButton oneButt;
	JButton zeroButt;
	
	JButton divButt;
	JButton multButt;
	JButton plusButt;
	JButton minButt;
	JButton pointButt;
	JButton equalButt,clearButt;
	
	
	char action;
	 
	double oldValueF,newValueF;
	double result;
	boolean isOperatorClicked=false;
	
	public Calculator () {
		
		jf = new JFrame("Calculator");
		jf.setLayout(null);
//		jf.setBackground(Color.BLUE);
		jf.setSize(440, 600);
		jf.setLocation(870, 110);
		
		
		displayLabel= new JLabel("");
		displayLabel.setFont(new Font("Serif", Font.PLAIN, 22));
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setBounds(9, 30, 450, 60);
		jf.add(displayLabel);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		
		 sevBttn = new JButton("7");
		jf.add(sevBttn);
		sevBttn.setBounds(10, 130, 95, 65);
		sevBttn.addActionListener(this);
		sevBttn.setBackground(Color.lightGray);
		sevBttn.setFont(new Font("Arial", Font.PLAIN, 30));
		
		 eigButt = new JButton("8");
		jf.add(eigButt);
		eigButt.setBounds(115, 130, 95, 65);
		eigButt.addActionListener(this);
		eigButt.setBackground(Color.lightGray);
		eigButt.setFont(new Font("Arial", Font.PLAIN, 30));
		 ninButt = new JButton("9");
		jf.add(ninButt);
		ninButt.setBounds(220, 130, 95, 65);
		ninButt.addActionListener(this);
		ninButt.setBackground(Color.lightGray);
		ninButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		 sixButt = new JButton("6");
		jf.add(sixButt);
		sixButt.setBounds(220, 202, 95, 65);
		sixButt.addActionListener(this);
		sixButt.setBackground(Color.YELLOW);
		sixButt.setFont(new Font("Arial", Font.PLAIN, 30));
		fivButt = new JButton("5");
		jf.add(fivButt);
		fivButt.setBounds(115, 202, 95, 65);
		fivButt.addActionListener(this);
		fivButt.setBackground(Color.YELLOW);
		fivButt.setFont(new Font("Arial", Font.PLAIN, 30));
		 forButt = new JButton("4");
		jf.add(forButt);
		forButt.addActionListener(this);
		forButt.setBounds(10, 202, 95, 65);
		forButt.setBackground(Color.lightGray);
		forButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		oneButt = new JButton("1");
		jf.add(oneButt);
		oneButt.addActionListener(this);
		oneButt.setBounds(10, 274, 95, 65);
		oneButt.setBackground(Color.lightGray);
		oneButt.setFont(new Font("Arial", Font.PLAIN, 30));
		twoButt = new JButton("2");
		jf.add(twoButt);
		twoButt.addActionListener(this);
		twoButt.setBounds(115, 274, 95, 65);
		twoButt.setBackground(Color.lightGray);
		twoButt.setFont(new Font("Arial", Font.PLAIN, 30));
		threButt = new JButton("3");
		jf.add(threButt);
		threButt.addActionListener(this);
		threButt.setBounds(220, 274, 95, 65);
		threButt.setBackground(Color.lightGray);
		threButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		 divButt = new JButton("/");
		jf.add(divButt);
		divButt.addActionListener(this);
		divButt.setBounds(324, 130, 95, 65);
		divButt.setBackground(Color.yellow);
		divButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		 multButt = new JButton("x");
		jf.add(multButt);
		multButt.addActionListener(this);
		multButt.setBounds(324, 202, 95, 65);
		multButt.setBackground(Color.yellow);
		multButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
	
		 plusButt = new JButton("+");
		plusButt.setBounds(324, 274, 95, 65);
		plusButt.addActionListener(this);
		jf.add(plusButt);
		plusButt.setBackground(Color.yellow);
		plusButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		
		 minButt = new JButton("-");
		jf.add(minButt);
		minButt.addActionListener(this);
		minButt.setBounds(324, 348, 95, 65);
		minButt.setBackground(Color.yellow);
		minButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		
		 pointButt = new JButton(".");
		jf.add(pointButt);
		pointButt.addActionListener(this);
		pointButt.setBounds(220, 348, 95, 65);
		pointButt.setBackground(Color.lightGray);
		pointButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		
		 zeroButt = new JButton("0");
		jf.add(zeroButt);
		zeroButt.addActionListener(this);
		zeroButt.setBounds(115, 348, 95, 65);
		zeroButt.setBackground(Color.lightGray);
		zeroButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		
		 equalButt = new JButton("=");
		jf.add(equalButt);
		equalButt.addActionListener(this);
		equalButt.setBounds(10, 348, 95, 65);
		equalButt.setBackground(Color.white);
		equalButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		 clearButt = new JButton("Clear");
		jf.add(clearButt);
		clearButt.addActionListener(this);
		clearButt.setBounds(118, 418, 195, 45);
		clearButt.setBackground(Color.lightGray);
		clearButt.setFont(new Font("Arial", Font.PLAIN, 30));
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		Calculator calcu = new Calculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonText= ((JButton) e.getSource()).getText();
		
		if(e.getSource()==sevBttn) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}else if(e.getSource()==eigButt) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked = false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()==ninButt) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}			
		}else if(e.getSource()==sixButt) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked= false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource()==fivButt) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked= false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==forButt) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked= false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()==threButt) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked= false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource()==twoButt) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked= false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource()==oneButt) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked= false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()==zeroButt) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked= false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==pointButt) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
			displayLabel.setText(displayLabel.getText()+'.');
			}
		
			//mistakes maybe//
			
		}else if(e.getSource()==plusButt) {
			isOperatorClicked = true;
			action = '+';
			oldValueF = Double.parseDouble(displayLabel.getText());
			
		}else if(e.getSource()==minButt) {
			isOperatorClicked = true;
			action = '-';
			oldValueF = Double.parseDouble(displayLabel.getText());
			
		}else if(e.getSource()==divButt) {
			isOperatorClicked = true;
			action = '/';
			oldValueF = Double.parseDouble(displayLabel.getText());
			
		}else if(e.getSource()==multButt) {
			isOperatorClicked = true;
			action = '*';
			oldValueF = Double.parseDouble(displayLabel.getText());
			
		}else if(e.getSource()==equalButt) {
			
			newValueF= Double.parseDouble(displayLabel.getText());
			
			doCalcu();
			
		}else if(e.getSource()==clearButt) {
			displayLabel.setText(" ");
		}
	
	}
	void doCalcu() {
		switch (action) {
        case '+': result = oldValueF + newValueF; break;
        case '-': result = oldValueF - newValueF; break;
        case '*': result = oldValueF * newValueF; break;
        case '/': result = oldValueF / newValueF; break;
        
	}
	 
	displayLabel.setText(result+"");
	
	}


}
