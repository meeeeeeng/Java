import javax.swing.*;
import java.awt.event.*;

class MyListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton)e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
		
	}

}

