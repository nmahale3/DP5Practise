package day22.arrayofobject;

public class Department2 {
	
	private int did;
	private String dname;

	public Department2(int did, String dname) {
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
}
