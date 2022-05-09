package co.micol.guiprac;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
	
	public MainWindow(){
		setTitle("MyHome");
		setVisible(true);
		setLocation(200, 200);
		setSize(1000, 200);
		setLayout(new FlowLayout()); // 배치관리자 생성
		setBackground(Color.green);
		
		JButton btn = new JButton("확인");
		JButton btn2 = new JButton("취소");

		btn.setSize(getPreferredSize());
		btn2.setSize(getPreferredSize());
		
		this.add(btn);
		this.add(btn2);
		setVisible(true);
		
	}

}
