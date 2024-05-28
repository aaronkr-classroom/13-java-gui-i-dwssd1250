import javax.swing.*;
import java.awt.*;

public class Ex1401 extends JFrame {

	public Ex1401() {
		setTitle("프레임 및 아이콘");
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		add(panel);
		
		setIconImage(new ImageIcon("img/javva.png").getImage());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex1401();
	}

}
