import javax.swing.*;
import java.awt.*;

public class clac extends JFrame{

	public clac() {
		
		setSize(100,140);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("채민지의 계산기");
		
		//setLayout(new FlowLayout());
		
		
		//JLabel label2 = new JLabel(" ");
		JTextField field1 = new JTextField(20);
		add(field1, BorderLayout.NORTH);
		
		//JPanel panel = new JPanel();
		setLayout(new GridLayout(5,5, 3,3)); 
		//add(panel, BorderLayout.CENTER);
		JButton button11 = new JButton("Backspace");
		this.add(button11);
		JButton button12 = new JButton(" ");
		this.add(button12);
		JButton button13 = new JButton(" ");
		this.add(button13);
		JButton button1 = new JButton("CE");
		this.add(button1);
		JButton button6 = new JButton("C");
		this.add(button6);
		
		JButton button14 = new JButton("7");
		this.add(button14);
		JButton button15 = new JButton("8");
		this.add(button15);
		JButton button16 = new JButton("9");
		this.add(button16);
		JButton button2 = new JButton("/");
		this.add(button2);
		JButton button7 = new JButton("sqrt");
		this.add(button7);
		
		JButton button17 = new JButton("4");
		this.add(button17);
		JButton button18 = new JButton("5");
		this.add(button18);
		JButton button19 = new JButton("6");
		this.add(button19);
		JButton button3 = new JButton("x");
		this.add(button3);
		JButton button8 = new JButton("%");
		this.add(button8);
		
		JButton button20 = new JButton("1");
		this.add(button20);
		JButton button21 = new JButton("2");
		this.add(button21);
		JButton button22 = new JButton("3");
		this.add(button22);
		JButton button4 = new JButton("-");
		this.add(button4);
		JButton button9 = new JButton("1/x");
		this.add(button9);
		

		JButton button23 = new JButton("0");
		this.add(button23);
		JButton button24 = new JButton("+/-");
		this.add(button24);
		JButton button25 = new JButton(".");
		this.add(button25);
		JButton button5 = new JButton("+");
		this.add(button5);
		JButton button10 = new JButton("=");
		this.add(button10);
		
		
		
		
		
		
		pack();

		
		
		setVisible(true);
		
	}
	
	
	
}
