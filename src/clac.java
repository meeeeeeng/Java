import javax.swing.*;
import java.awt.*;


public class clac extends JFrame{

	public clac() {
		
		//setSize(1000,1400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("채민지의 계산기");
		
		//setLayout(new FlowLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(new GridLayout(5,5, 3,3));
		
		
		
		//JLabel label2 = new JLabel("입력 : ");
		JTextField field1 = new JTextField(50);
	   panel1.add(field1);
		
		
		//ButtonGroup bg=new ButtonGroup();
		
		//setLayout(new GridLayout(5,5, 3,3)); 
		//add(panel, BorderLayout.CENTER);
		JButton button11 = new JButton("Backspace");
		panel2.add(button11);
		JButton button12 = new JButton(" ");
		panel2.add(button12);
		JButton button13 = new JButton(" ");
		panel2.add(button13);
		JButton button1 = new JButton("CE");
		panel2.add(button1);
		JButton button6 = new JButton("C");
		panel2.add(button6);
		
		JButton button14 = new JButton("7");
		panel2.add(button14);
		JButton button15 = new JButton("8");
		panel2.add(button15);
		JButton button16 = new JButton("9");
		panel2.add(button16);
		JButton button2 = new JButton("/");
		panel2.add(button2);
		JButton button7 = new JButton("sqrt");
		panel2.add(button7);
		
		JButton button17 = new JButton("4");
		panel2.add(button17);
		JButton button18 = new JButton("5");
		panel2.add(button18);
		JButton button19 = new JButton("6");
		panel2.add(button19);
		JButton button3 = new JButton("x");
		panel2.add(button3);
		JButton button8 = new JButton("%");
		panel2.add(button8);
		
		JButton button20 = new JButton("1");
		panel2.add(button20);
		JButton button21 = new JButton("2");
		panel2.add(button21);
		JButton button22 = new JButton("3");
		panel2.add(button22);
		JButton button4 = new JButton("-");
		panel2.add(button4);
		JButton button9 = new JButton("1/x");
		panel2.add(button9);
		

		JButton button23 = new JButton("0");
		panel2.add(button23);
		JButton button24 = new JButton("+/-");
		panel2.add(button24);
		JButton button25 = new JButton(".");
		panel2.add(button25);
		JButton button5 = new JButton("+");
		panel2.add(button5);
		JButton button10 = new JButton("=");
		panel2.add(button10);
		
		
		
		
		add(panel1, BorderLayout.PAGE_START);
		add(panel2,BorderLayout.PAGE_END);
		
		pack();

		
		
		setVisible(true);
		
	}
	
	
	
}


