package ir.isc.session7;

public class Departments {
	
	private String name;
	private String id;
	

		@Override
	public String toString() {
		return "Departments [name=" + name + ", id=" + id + "]";
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		
	

}
