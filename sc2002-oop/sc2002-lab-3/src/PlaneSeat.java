
public class PlaneSeat {

	int seatId, customerId;
	boolean assigned;
	
	public PlaneSeat(int seat_id) {
		this.seatId = seat_id;
		this.customerId = 0;
		this.assigned = false;
	}
	
	public int getSeatID() {
		return this.seatId;
	}
	
	public int getCustomerID() {
		return this.customerId;
	}
	
	public boolean isOccupied() {
		return this.assigned;
	}
	
	public void assign(int cust_id) {
		this.customerId = cust_id;
		this.assigned = true;
	}
	
	public void unassign() {
		this.customerId = 0;
		this.assigned = false;
	}
	
}
