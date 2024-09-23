package Application9;
import java.io.Serializable;
public class Bean implements Serializable{
	private String dname;
	private String dconcept;
	private  int dtime;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDconcept() {
		return dconcept;
	}
	public void setDconcept(String dconcept) {
		this.dconcept = dconcept;
	}
	public int getDtime() {
		return dtime;
	}
	public void setDtime(int dtime) {
		this.dtime = dtime;
	}

}
