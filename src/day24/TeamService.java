
import java.util.Arrays;

public class TeamService {
	
	private static int counter=1;
	private static final int MAX_MEMBERS = 5;
	private Programmer[] pros = new Programmer[MAX_MEMBERS];
	private int total = 0;
	public static void main(String[] args) {
		
	}
	public Programmer[] getTeam(){
		
		return Arrays.copyOf(pros, total);
	}
	

	public void addMember(Employee e){
		if(total>=MAX_MEMBERS)
			throw new TeamException("��Ա�������޷����");
		if(!(e instanceof Programmer))
			throw new TeamException("�ó�Ա���ǿ�����Ա���޷����");
		Programmer p = (Programmer) e;
		if(findEmployee(p))
			throw new TeamException("��Ա���Ǳ��Ŷӳ�Ա ");
		if(p.getState()==State.VOCATION)
			throw new TeamException("��Ա�����ݼ٣��޷���� ");
		if(p.getState()==State.BUSY)
			throw new TeamException("��Ա�������Ŷӳ�Ա ");
		int as = 0;
		int ds = 0;
		int ps = 0;
		for (int i = 0; i < total; i++) {
			if(pros[i] instanceof Architect){
				as++;
			}else if(pros[i] instanceof Designer){
				ds++;
			}else{
				ps++;
			}
		}
		
		if(p instanceof Architect){
			if(as>=1){
				throw new TeamException("�Ŷ���ֻ����һ���ܹ�ʦ");
			}
		}
		else if(p instanceof Designer){
			if(ds>=2){
				throw new TeamException("�Ŷ���ֻ�����������ʦ");
			}
		}
		else if(p instanceof Programmer){
			if(ps>=3){
				throw new TeamException("�Ŷ���ֻ������������Ա");
			}
		}
		pros[total++] = p;
		p.setTid(counter++);
		p.setState(State.BUSY);
		
		
	}
	
	public void removeMember(int tid){
		int index = findIndex(tid);
		if(index==-1)
			throw new TeamException("��ɾ�����Ŷӳ�Ա�����ڣ�");
		
		pros[index].setState(State.FREE);
		for(int i=index;i<total-1;i++){
			pros[i]=pros[i+1];
			pros[i].setTid(pros[i].getTid()-1);
		}
		pros[--total] = null;
		counter--;
		
	}
	private int findIndex(int tid) {
		for(int i=0;i<total;i++){
			if(tid==pros[i].getTid())
				return i;
				
		}
		return -1;
	}

	private boolean findEmployee(Programmer e) {
		int index=findIndex(e.getTid());
		return index==-1?false:true;
	}

}
















	

