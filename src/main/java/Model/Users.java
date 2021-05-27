package Model;

public class Users {
	private String name;
    private Long salary;
    private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Users() {
	}
	public Users(String name, Long salary, Integer id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
}
