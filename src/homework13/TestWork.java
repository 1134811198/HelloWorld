package homework13;
/**
 * ��������������work���������������㣬��һ���ֻ���Cellphone��
 * ���巽��testWork���Լ��㹦�ܣ����ü���ӿڵ�work������
Ҫ�����CellPhone���� ��testWork������ʹ���� �����ڲ���

 * @author win10
 *
 */
public class TestWork {
	public static void main(String[]args){
	Cellphone CellPhone = new Cellphone();
	CellPhone.cale(new Calculater(){
		public void work(){
			System.out.print("����");
		}
	});
	
	}
	

}
class Cellphone{
	public void cale(Calculater cl){
		cl.work();
	}
	
}
interface Calculater{
	void work();
}