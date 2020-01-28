package ex.j8.stream.model;

public class Space {

	private int id;

	private String name;

	private long temperature;

	public Space() {
	}

	public Space(int id, String name, long temperature) {

		this.id = id;
		this.name = name;
		this.temperature = temperature;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTemperature() {
		return temperature;
	}

	public void setTemperature(long temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Space [ id : " + this.id + ", name : " + this.name + ", temperature : " + this.temperature + " °C ]\n";
	}

}
