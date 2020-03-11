package fms;

public class PassengerInfo implements java.lang.Comparable<PassengerInfo> {

	@Override
	public int compareTo(PassengerInfo o) {
		// TODO Auto-generated method stub
		if (this.getTicketAmount() > o.getTicketAmount()) {
			return 1;
		} else if (this.getTicketAmount() < o.getTicketAmount()) {
			return -1;
		} else {
			return 0;
		}
	}

	private String name;
	private double TicketAmount;
	private int FlightId;

	public PassengerInfo(String name, double TicketAmount, int FlightId) {
		this.setName(name);
		this.setFlightId(FlightId);
		this.setTicketAmount(TicketAmount);
	}

	public String getName() {
		return this.name;
	}

	public double getTicketAmount() {
		return this.TicketAmount;
	}

	public int getFlightId() {
		return this.FlightId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTicketAmount(double TicketAmount) {
		this.TicketAmount = TicketAmount;
	}

	public void setFlightId(int FlightId) {
		this.FlightId = FlightId;
	}

	public boolean equals(Object obj) {
		if (obj instanceof PassengerInfo) {
			PassengerInfo other = (PassengerInfo) obj;
			if (this.getName() == other.getName() && this.getFlightId() == other.getFlightId()
					&& this.getTicketAmount() == other.getTicketAmount()) {
				return true;
			}
			return false;
		}
		return false;
	}

}
