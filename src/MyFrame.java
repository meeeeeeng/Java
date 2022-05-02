import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
public MyFrame() {
Toolkit kit = Toolkit.getDefaultToolkit();
Dimension screenSize = kit.getScreenSize();
setSize(300, 200);
setLocation(screenSize.width / 2, screenSize.height / 2);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("MyFrame");
Image img = kit.getImage("w1.gif");
setIconImage(img);
setLayout(new FlowLayout());
JButton button = new JButton("button");
this.add(button);
setVisible(true);
}
}
