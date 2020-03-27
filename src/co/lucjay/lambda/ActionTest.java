package co.lucjay.lambda;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionTest extends JFrame {
	JButton btn;

	public ActionTest() {
		this.setTitle("frame test");
		this.setSize(300, 200);
		int var = 10;
		// 버튼추가
		btn = new JButton("눌러줘!!");
		btn.addActionListener(e -> {
			System.out.println("버튼 클릭");
			this.setTitle("에레레레레레레"); // 람다식 안에서 this는 람다식을 실행하는 바깥(아우터)클래스를 가르킨다
			this.btn.setText("클릭됨~~~~~");// 필드
			System.out.println(var);// 지역변수 접근가능
		});// 람다식

		this.getContentPane().add(btn);
		this.setVisible(true);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ActionTest();

	}

}