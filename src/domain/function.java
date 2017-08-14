package domain;

public class function {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public String getFunctionServlet() {
		return functionServlet;
	}
	public void setFunctionServlet(String functionServlet) {
		this.functionServlet = functionServlet;
	}
	private String functionName;
	private String functionServlet;
}
