
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
			throw new TeamException("成员已满，无法添加");
		if(!(e instanceof Programmer))
			throw new TeamException("该成员不是开发人员，无法添加");
		Programmer p = (Programmer) e;
		if(findEmployee(p))
			throw new TeamException("该员已是本团队成员 ");
		if(p.getState()==State.VOCATION)
			throw new TeamException("该员正在休假，无法添加 ");
		if(p.getState()==State.BUSY)
			throw new TeamException("该员工已是团队成员 ");
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
				throw new TeamException("团队中只能有一名架构师");
			}
		}
		else if(p instanceof Designer){
			if(ds>=2){
				throw new TeamException("团队中只能有两名设计师");
			}
		}
		else if(p instanceof Programmer){
			if(ps>=3){
				throw new TeamException("团队中只能有三名程序员");
			}
		}
		pros[total++] = p;
		p.setTid(counter++);
		p.setState(State.BUSY);
		
		
	}
	
	public void removeMember(int tid){
		int index = findIndex(tid);
		if(index==-1)
			throw new TeamException("您删除的团队成员不存在！");
		
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
















	

