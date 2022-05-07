import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class ccalc extends JFrame {

	public ccalc() {
	
		setTitle("ä������ ����");
		
		JPanel north_1 = new JPanel();
		JPanel north_2 = new JPanel();
		JPanel south = new JPanel();
		
		// 1. ������Ʈ�� ����� ����.
		// 1-1. north_1 �����̳ʿ� �� ������Ʈ�� ����� ����.
		JLabel jl1 = new JLabel("�� 1 : ");
		JTextField su1 = new JTextField(7);
		
		
		
		// 1-2. north_2 �����̳ʿ� �� ������Ʈ�� ����� ����.
		JLabel jl3 = new JLabel("������ : ");
		
		JButton jrb1 = new JButton("+");
		JButton jrb2 = new JButton("-");
		JButton jrb3 = new JButton("*");
		JButton jrb4 = new JButton("/");
		JButton jrb5 = new JButton("%");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2);
		bg.add(jrb3); bg.add(jrb4); bg.add(jrb5);
		
		// 1-3. TextArea  ������Ʈ�� ����� ����.
		JTextArea jta = new JTextArea(5, 25);
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		
		// 1-4. south �����̳ʿ� ��� ������Ʈ�� ����� ����.
		JButton jb1 = new JButton("��   ��");
		JButton jb2 = new JButton("��   ��");
		JButton jb3 = new JButton("��   ��");
		
		
		// 2. ������Ʈ�� �����̳ʿ� �÷��� �Ѵ�.
		// 2-1. 1-1 ������Ʈ���� north_1 �����̳ʿ� �÷��� �Ѵ�.
		north_1.add(jl1); north_1.add(su1);
		
		
		// 2-2. 1-2 ������Ʈ���� north_2 �����̳ʿ� �÷��� �Ѵ�.
		north_2.add(jl3); north_2.add(jrb1);
		north_2.add(jrb2); north_2.add(jrb3);
		north_2.add(jrb4); north_2.add(jrb5);
		
		/*int n=1;
		for(n=1;n<26;n++) {
			north_2.add(button[n]);}*/
		
		
		
		// 2-3. 1-4 ������Ʈ���� south �����̳ʿ� �÷��� �Ѵ�.
		south.add(jb1); south.add(jb2); south.add(jb3);
		 
		// �߿��� �κ�
		// �����̳ʸ� �ϳ� �� ������.
		JPanel pg = new JPanel(new BorderLayout());
		
		// ���� �߰��� �����̳ʿ� ������ �����̳ʸ� �÷�����.
		pg.add(north_2, BorderLayout.NORTH);
		pg.add(jsp, BorderLayout.CENTER);
		pg.add(south, BorderLayout.SOUTH);
		
		// 3. �����̳ʸ� �����ӿ� �÷��־�� �Ѵ�.
		add(north_1, BorderLayout.NORTH);
		add(pg, BorderLayout.CENTER);
		
		

		
		setLayout(new GridLayout(5,5, 3,3)); 
		//add(panel, BorderLayout.CENTER);
		JButton button11 = new JButton("Backspace");
		bg.add(button11);
		JButton button12 = new JButton(" ");
		bg.add(button12);
		JButton button13 = new JButton(" ");
		bg.add(button13);
		JButton button1 = new JButton("CE");
		bg.add(button1);
		JButton button6 = new JButton("C");
		bg.add(button6);
		
		JButton button14 = new JButton("7");
		bg.add(button14);
		JButton button15 = new JButton("8");
		bg.add(button15);
		JButton button16 = new JButton("9");
		bg.add(button16);
		JButton button2 = new JButton("/");
		bg.add(button2);
		JButton button7 = new JButton("sqrt");
		bg.add(button7);
		
		JButton button17 = new JButton("4");
		bg.add(button17);
		JButton button18 = new JButton("5");
		bg.add(button18);
		JButton button19 = new JButton("6");
		bg.add(button19);
		JButton button3 = new JButton("x");
		bg.add(button3);
		JButton button8 = new JButton("%");
		bg.add(button8);
		
		JButton button20 = new JButton("1");
		bg.add(button20);
		JButton button21 = new JButton("2");
		bg.add(button21);
		JButton button22 = new JButton("3");
		bg.add(button22);
		JButton button4 = new JButton("-");
		bg.add(button4);
		JButton button9 = new JButton("1/x");
		bg.add(button9);
		

		JButton button23 = new JButton("0");
		bg.add(button23);
		JButton button24 = new JButton("+/-");
		bg.add(button24);
		JButton button25 = new JButton(".");
		bg.add(button25);
		JButton button5 = new JButton("+");
		bg.add(button5);
		JButton button10 = new JButton("=");
		bg.add(button10);
		/*
		int n=1;
		for(n=1;n<26;n++) {
			north_2.add(button [n]);}*/
		
		
		setBounds(200, 200, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new ccalc();

	}

}