import javax.swing.JFrame;

class JFrameEx extends JFrame{
	//JFrame�� ��� �޴� JFrameEx ���� Ŭ���� ����
	JFrameEx(){
		super("���� ����");
		//������ ����ǥ����
		setSize(500,200);
		//������ ũ��
		setLocation(100, 100);
		//������ ��ġ
		setVisible(true);
		//ȭ�鿡 �����(����Ʈ ���� ȭ�鿡 ������ �ʴ� ��)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//X��ư�� ������ �� â�� ��������
		
	}

}

public class JFrameTest{
	public static void main(String[] args) {
		//GUI ���ø����̼ǵ� ���α׷� �������� �Ǵ� ���� �޼ҵ� ��������. 
		//�̰����� ������ ��ü ����
		new JFrameEx();
		
	}
}
