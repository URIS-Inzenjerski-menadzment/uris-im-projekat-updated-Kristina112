
import java.awt.EventQueue;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.Font;
public class SmartCalculator {

	private JFrame frame;
	private JTextField textField;
	private boolean operation;
	private boolean currentValue;
	private boolean number;
	
	double  firstnumber;
	double secondnum;
    double result;
    String operations;
    String answer;
    private JTextField valueState;
    int n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmartCalculator window = new SmartCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SmartCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.GRAY);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 300, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Smart Calculator");
		
		JButton btn01= new JButton("x!");
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				int base = Integer.parseInt(textField.getText());
				int counter = 1;
				for (int i = base; i> 0; i-- ) {
					counter = counter*i;
			}textField.setText(String.valueOf(counter));
				
			}
		});
		btn01.setBounds(10, 120, 59, 42);
		frame.getContentPane().add(btn01);
		
		JButton btn02 = new JButton("\u221A");
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.sqrt(num);
						textField.setText(String.valueOf(num));
			}
		});
		btn02.setBounds(77, 120, 59, 42);
		frame.getContentPane().add(btn02);
		
		JButton btn03 = new JButton("x^2");
		btn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = (num * num);
				    	textField.setText(String.valueOf(num));
			}
		});
		btn03.setBounds(146, 120, 59, 42);
		frame.getContentPane().add(btn03);
		
		JButton btn04 = new JButton("ln");
		btn04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.log(num);
						textField.setText(String.valueOf(num));
			}
		});
		btn04.setBounds(215, 120, 59, 42);
		frame.getContentPane().add(btn04);
		
		JButton btn05 = new JButton("(");
		btn05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"(");
			}
		});
		btn05.setBounds(10, 173, 59, 42);
		frame.getContentPane().add(btn05);
		
		JButton btn06 = new JButton(")");
		btn06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+")");
			}
		});
		btn06.setBounds(77, 173, 59, 42);
		frame.getContentPane().add(btn06);
		
		JButton btn07 = new JButton("%");
		btn07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				double base = Double.parseDouble(textField.getText());
				double baseConv = base/100;
				textField.setText(String.valueOf(baseConv));			}
		});
		btn07.setBounds(146, 173, 59, 42);
		frame.getContentPane().add(btn07);
		
		JButton btn08 = new JButton("/");
		btn08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
				valueState.setText(""+ firstnumber + "/");
				
			}
		});
		btn08.setBounds(215, 234, 59, 42);
		frame.getContentPane().add(btn08);
		
		
		JButton btn09 = new JButton("*");
		btn09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
				valueState.setText(""+ firstnumber + "*");
			}
		});
		btn09.setBounds(215, 283, 59, 42);
		frame.getContentPane().add(btn09);
		
		JButton btn10 = new JButton("-");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
				valueState.setText(""+ firstnumber + "-");
			}
		});
		btn10.setBounds(215, 332, 59, 42);
		frame.getContentPane().add(btn10);
		
		JButton btn11 = new JButton("+");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				firstnumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				valueState.setText(""+ firstnumber + "+");
			}
		});
		btn11.setBounds(215, 385, 59, 42);
		frame.getContentPane().add(btn11);
		
		JButton btn12 = new JButton(".");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (! textField.getText().contains("."))
				{
					textField.setText(textField.getText() + btn12.getText());
				}
			}
		});
		btn12.setBounds(77, 385, 59, 42);
		frame.getContentPane().add(btn12);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("First zero");
				if (number) {
					String currentValue;
					currentValue = textField.getText();
					textField.setText(currentValue + "0");
							
				}
				else
				{
					textField.setText("0");
				}
			}
		});
		btn0.setBounds(10, 385, 59, 42);
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn1.getText();
				textField.setText(inum);
				number = true;
			}
		});
		btn1.setBounds(10, 332, 47, 42);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn2.getText();
				textField.setText(inum);
				number = true;
				
			}	
		});
		btn2.setBounds(77, 332, 47, 42);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn3.getText();
				textField.setText(inum);
				number = true;
				
			}
		});
		btn3.setBounds(146, 332, 47, 42);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn4.getText();
				textField.setText(inum);
				number = true;
			}
		});
		btn4.setBounds(10, 283, 47, 42);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn5.getText();
				textField.setText(inum);
				number = true;
			}
		});
		btn5.setBounds(77, 283, 47, 42);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn6.getText();
				textField.setText(inum);
				number = true;
			}
		});
		btn6.setBounds(146, 283, 47, 42);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn7.getText();
				textField.setText(inum);
				number = true;
				
			}
		});
		btn7.setBounds(10, 234, 47, 42);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn8.getText();
				textField.setText(inum);
				number = true;
			}
		});
		btn8.setBounds(77, 234, 47, 42);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inum = textField.getText() + btn9.getText();
				textField.setText(inum);
				number = true;
			}
		});
		btn9.setBounds(146, 234, 47, 42);
		frame.getContentPane().add(btn9);
		

		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = false ;
				textField.setText(null);
		     //	currentValue = false;
				valueState.setText(null);
			}
		});
		btnAC.setBounds(215, 199, 59, 23);
		frame.getContentPane().add(btnAC);
		
		JButton btnC = new JButton("\u2190");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		}			
		);
		btnC.setBounds(215, 173, 59, 23);
		frame.getContentPane().add(btnC);
	
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(10, 24, 264, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		valueState = new JTextField();
		valueState.setFont(new Font("Tahoma", Font.PLAIN, 12));
		valueState.setEditable(false);
		valueState.setBounds(148, 0, 126, 23);
		frame.getContentPane().add(valueState);
		valueState.setColumns(10);
		
		JButton btn13 = new JButton("=");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isBlank()) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				String answer; 
				secondnum = Double.parseDouble(textField.getText());
						if (operations == "+")
						{
							result = firstnumber + secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operations == "-")
						{
							result = firstnumber - secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operations == "*")
						{
							result = firstnumber * secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operations == "/")
						{
							result = firstnumber / secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operations == "%")
						{
							result = firstnumber % secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
						}
						else if (operations == "x!")
							{
								result =  firstnumber ;
								 
							    for (double i=1; i<= firstnumber; i++){
							    	firstnumber = firstnumber * i;
							        System.out.println("Faktorijel broja "+ i +" je " + firstnumber);
							    };
								answer = String.format("%.2f", result);
								textField.setText(answer);
							};				
					     	
			}
		});
		btn13.setBounds(146, 385, 59, 42);
		frame.getContentPane().add(btn13);

		
		JButton btn14 = new JButton("Custom expression");
		btn14.setBounds(10, 78, 264, 31);
    	frame.getContentPane().add(btn14);
		
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				
				textField.setText(null);
				
				String inputExpression;
				inputExpression=JOptionPane.showInputDialog("Enter your custom expression.");
				
				//evaluate postfix notation
				int outputValue = evalPostfix(inputExpression);
				
				textField.setText(Integer.toString(outputValue));
				
			}
		});
	}
	
	static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    protected  static int evalPostfix(String express) 
    { 
        Stack<Integer> st = new Stack<>(); 
          
        for(int i=0; i < express.length(); i++) /* loop to scan all elements of the expression one by one */
        { 
            char ch = express.charAt(i); 
             
            if(Character.isDigit(ch)) /* pushing value into the stack */
            st.push(ch - '0'); 
              
           
            else       /* if the operator comes it will be evaluated */
            { 
                int value1 = st.pop(); 
                int value2 = st.pop(); 
                  
                switch(ch) 
                { 
                    case '+': 
                    st.push(value2 + value1); 
                    break; 
                      
                    case '-': 
                    st.push(value2 - value1); 
                    break; 
                        
                    case '*': 
                    st.push(value2*value1); 
                    break; 
                    case '/': 
                    st.push(value2/value1); 
                    break; 
              } 
            } 
        } 
        return st.pop();   // result return  
        
    } 
	
}
