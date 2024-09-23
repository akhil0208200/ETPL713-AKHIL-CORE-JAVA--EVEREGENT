package Application9;

public class Service {
	DAO dao=new DAO();
	String str=null;
	public int create(String dname,String dconcept,int dtime) {
		Bean b=new Bean();
		b.setDname(dname);
		b.setDconcept(dconcept);
		b.setDtime(dtime);
		int re=dao.createAccount(b);
		return re;
	}
	public String showConcept(String name) {
		return  dao.showC(name);
	}
	public void showD() throws Exception {
		dao.ShowD();
	}
	public int change(String name,String concept) {
		return dao.with(name, concept);
		// return 1;
	}

}
