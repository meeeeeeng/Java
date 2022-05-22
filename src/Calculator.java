import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



import javax.swing.*;
import java.awt.*;



// 소스만 입력하고 Ctrl+Shift+O를 누른다. 

class Calculator extends JFrame{

   private JPanel panel;
   private JTextField tField;
   private JButton[] buttons;
   private String[] labels = { 
         "Backspace", "", "", "CE", "C",
         "7", "8", "9", "/", "sqrt",
         "4", "5", "6", "x", "%",
         "1", "2", "3", "-", "1/x",
         "0", "+/-", ".", "+", "=",
   };
   private String tempString = "";
   private String op;
   private int tempNum1 = 0;
   private int tempNum2 = 0;
   private int result;

   public Calculator() {
      tField = new JTextField(35);
      panel = new JPanel();
      tField.setEnabled(false);
   
      panel.setLayout(new GridLayout(0, 5, 3, 3));
      buttons = new JButton[25];
      int index = 0;
      for (int rows = 0; rows < 5; rows++) {
         for (int cols = 0; cols < 5; cols++) {
            buttons[index] = new JButton(labels[index]);
            if( cols >= 3 )
               buttons[index].setForeground(Color.red);
            else 
               buttons[index].setForeground(Color.blue);
            buttons[index].setBackground(Color.yellow);
            panel.add(buttons[index]);
          
            buttons[index].addActionListener(new MyAction());
            index++;
         }
      }
      add(tField, BorderLayout.NORTH);
      add(panel, BorderLayout.CENTER);
      setVisible(true);

      pack();
   }
   
   
            class MyAction implements ActionListener {

               @Override
               public void actionPerformed(ActionEvent e) {
            
               JButton buttons = (JButton)e.getSource();
               tempString = tField.getText();
               
               if (tempString.equals("0")) {
                  tempString = "";
               }
               
               switch(buttons.getText()) {
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
               case "x":
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

   public static void main(String args[]) {
      Calculator s = new Calculator();
   }
}