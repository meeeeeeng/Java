import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator2 extends JFrame{
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	
	
	private String tempString = "";
	private String op;
	private int tempNum1 = 0;
	private int tempNum2 = 0;
	private int result;
	
	public Calculator2() {
		setTitle("계산기 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel Panel_North = new JPanel();
		JPanel Panel_Center = new JPanel();
		JPanel Panel_South = new JPanel();
		
		JLabel text1 = new JLabel("수식입력");
		tField = new JTextField(15);
	
		Panel_North.setBackground(Color.lightGray);
		Panel_Center.setBackground(Color.white);
		Panel_Center.setLayout(new GridLayout(4, 4, 5, 5));
		Panel_South.setBackground(Color.yellow);
		
		Panel_North.add(text1);
		Panel_North.add(tField);
		
		
		for(int i=0; i<16; i++) {
			JButton b = new JButton();
			b.addActionListener(new MyAction());
			String[] str = {"CE", "=", "+", "-", "*", "/"};
			Panel_Center.add(b);
			if(i<10)
				b.setText(Integer.toString(i));
			else
				b.setText(str[i-10]);
			if(i>11) {
				b.setOpaque(true);
				b.setBackground(Color.cyan);
			}
		}
		
		c.add(Panel_North, BorderLayout.NORTH);
		c.add(Panel_Center, BorderLayout.CENTER);
		c.add(Panel_South, BorderLayout.SOUTH);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	class MyAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			tempString = tField.getText();
			
			if (tempString.equals("0")) {
				tempString = "";
			}
			
			switch(b.getText()) {
			case "0":
				int temp = 0;
				if (tempString != "")
					tField.setText(tempString + "0");
				break;
			case "1":
				temp = 1;
				if(tempString != "") {
					tField.setText(tempString + "1");
				} else {
					tField.setText(Integer.toString(temp));					
				}
				break;
			case "2":
				temp = 2;
				if(tField.getText() != "") {
					tField.setText(tempString + "2");
				} else {
					tField.setText(Integer.toString(temp));				
				}
				break;
			case "3":
				temp = 3;
				if(tField.getText() != "") {
					tField.setText(tempString + "3");
				} else {
					tField.setText(Integer.toString(temp));					
				}
				break;
			case "4":
				temp = 4;
				if(tField.getText() != "") {
					tField.setText(tempString + "4");
				} else {
					tField.setText(Integer.toString(temp));					
				}
				break;
			case "5":
				temp = 5;
				if(tField.getText() != "") {
					tField.setText(tempString + "5");
				} else {
					tField.setText(Integer.toString(temp));					
				}
				break;
			case "6":
				temp = 6;
				if(tField.getText() != "") {
					tField.setText(tempString + "6");
				} else {
					tField.setText(Integer.toString(temp));					
				}
				break;
			case "7":
				temp = 7;
				if(tField.getText() != "") {
					tField.setText(tempString + "7");
				} else {
					tField.setText(Integer.toString(temp));					
				}
				break;
			case "8":
				temp = 8;
				if(tField.getText() != "") {
					tField.setText(tempString + "8");
				} else {
					tField.setText(Integer.toString(temp));					
				}
				break;
			case "9":
				temp = 9;
				if(tField.getText() != "") {
					tField.setText(tempString + "9");
				} else {
					tField.setText(Integer.toString(temp));					
				}
				break;
			case "CE":
				tField.setText("");
				break;
			case "+":
				tempNum1 = Integer.parseInt(tempString);
				op = "+";
				tField.setText("");
				break;
			case "-":
				tempNum1 = Integer.parseInt(tempString);
				op = "-";
				tField.setText("");
				break;
			case "*":
				tempNum1 = Integer.parseInt(tempString);
				op = "*";
				tField.setText("");
				break;
			case "/":
				tempNum1 = Integer.parseInt(tempString);
				op = "/";
				tField.setText("");
				break;
			case "=":
				tempNum2 = Integer.parseInt(tempString);
				if(op == "+")
					result = tempNum1 + tempNum2;
				if(op == "-")
					result = tempNum1 - tempNum2;
				if(op == "*")
					result = tempNum1 * tempNum2;
				if(op == "/")
					result = tempNum1 / tempNum2;
				tField.setText(Integer.toString(result));
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Calculator2();
	}
	
}
