import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Ex1402 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		//프레임 설정
		frame.setTitle("My First GUI");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//패널
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		
		//버튼 추가
		JButton btn1 = new JButton("Icon1"/*, new ImageIcon("img/javva2.png")*/);
		JButton btn2 = new JButton("Icon2"/*, new ImageIcon("img/javva3.png")*/);
		JButton btn3 = new JButton("Icon3"/*, new ImageIcon("img/javva4.png")*/);
		btn1.setSize(64, 64);
		btn2.setSize(64, 64);
		btn3.setSize(64, 64);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		// J체크박스
		JCheckBox box1 = new JCheckBox("Subscribe to newsletter");
		JCheckBox box2 = new JCheckBox("Receive SMS marketing", true);
		JCheckBox box3 = new JCheckBox("Receive email marketing");
		panel.add(box1);
		panel.add(box2);
		panel.add(box3);
		
		// J체크박스
		JRadioButton rbox1 = new JRadioButton("1학년");
		JRadioButton rbox2 = new JRadioButton("2학년", true);
		JRadioButton rbox3 = new JRadioButton("3학년");
		JRadioButton rbox4 = new JRadioButton("4학년");
		JRadioButton rbox5 = new JRadioButton("기타");
		panel.add(rbox1);
		panel.add(rbox2);
		panel.add(rbox3);
		panel.add(rbox4);
		panel.add(rbox5);
		
		//J콤보박스
		String email[] = {"naver.com", "google.com", "kakao.com"};
		JComboBox cbox1 = new JComboBox(email);
		panel.add(cbox1);
		
		Vector phone = new Vector();
		phone.add("SKT");
		phone.add("KT");
		phone.add("LG U+");
		JComboBox cbox2 = new JComboBox(phone);
		panel.add(cbox2);
		
		//J라벨 + J텍스트에리어
		JLabel msg = new JLabel("메시지를 입력하세요: ");
		panel.add(msg);
		JTextArea msgtxt = new JTextArea(5, 10);
		panel.add(msgtxt);
		
		//J텍스트필드 + J패스워드필드
		JLabel unaleLbl = new JLabel("username: ");
		panel.add(unaleLbl);
		JTextField uname = new JTextField(10);
		panel.add(uname);
		
		JLabel upassLbl = new JLabel("password: ");
		panel.add(upassLbl);
		JTextField upass = new JTextField(10);
		panel.add(upass);
		
		
		
		
		frame.setVisible(true);
	}

}
