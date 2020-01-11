import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JFrameEx extends JFrame{
	//JFrame의 상속 받는 JFrameEx 서브 클래스 설계
	JFrameEx(){
		super("스윙 연습");
		//윈도우 제목표시줄
		setLayout(new FlowLayout());
		//레이아웃 메니저 설정, 생략가능
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		//버튼 생성해 컨테이너에 추가 
		setSize(500,200);
		//프레임 크기
		setLocation(100, 100);
		//프레임 위치
		setVisible(true);
		//화면에 보기게(디폴트 값이 화면에 보이지 않는 것)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//X버튼을 눌렀을 때 창이 닫히도록
		
	}

}

public class JFrameTest{
	public static void main(String[] args) {
		//GUI 어플리케이션도 프로그램 진입점이 되는 메인 메소드 가져야함. 
		//이곳에서 프레임 객체 생성
		new JFrameEx();
		
	}
}
