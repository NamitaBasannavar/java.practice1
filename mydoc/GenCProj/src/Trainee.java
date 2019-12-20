
public class Trainee {
	
	private int EmployeeId;
	private String EmployeeName; 
	private static final String COHORT_CODE = " CHNAJ19004" ;
	
	public Trainee(int EmployeeId, String EmployeeName) {
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName; 
	}
	
	
	public long getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	
	public void display()
	{
		System.out.println(+getEmployeeId()+getEmployeeName()+COHORT_CODE+"\n");
		
		
	}
}
