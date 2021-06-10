package rest.POJOClass;

public class PojoClass {

	
	

	String createdBy;
	String projectName;
	String teamSize;
	String status;
	public PojoClass(String createdBy, String projectName, String teamSize, String status) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.teamSize = teamSize;
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public String getStatus() {
		return status;
	}
	public String getTeamSize() {
		return teamSize;
	}
	
}
