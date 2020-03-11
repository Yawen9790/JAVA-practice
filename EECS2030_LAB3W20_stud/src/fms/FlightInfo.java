package fms;

public class FlightInfo {

	private String name;
	private String airLine;

	public String getAirline() {
		return this.airLine;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAirline(String airLine) {
		this.airLine = airLine;
	}

	public boolean equals(Object obj) {
		if (obj instanceof FlightInfo) {
			FlightInfo other = (FlightInfo) obj;// Incompatible operand types
			if (this.getName() == other.getName() && this.getAirline() == other.getAirline()) {
				return true;
			}
			return false;
		}
		return false;
	}

	public FlightInfo(String name, String airLine) {
		this.setAirline(airLine);
		this.setName(name);
	}

}
