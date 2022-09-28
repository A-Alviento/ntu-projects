
public class Plane {
	
	PlaneSeat[] p = new PlaneSeat[12];
	int numEmptySeat;
	
	public Plane() {
		for(int i=0; i<12; i++) 
			this.p[i] = new PlaneSeat(i+1);
		numEmptySeat = 12;
	}
	
	public PlaneSeat[] sortSeats() {
		PlaneSeat[] pc = new PlaneSeat[12];
		System.arraycopy(this.p, 0, pc, 0, 12);
		int count; 
		PlaneSeat tmp;
		
		for (int i=1; i<12; i++) {
			count = i;
			for (int j=i-1; j>=0; j--) {
				if (pc[count].getCustomerID() < pc[j].getCustomerID()) {
					tmp = pc[count];
					pc[count] = pc[j];
					pc[j] = tmp;
					count--;
				}
				else {
					break;
				}
			}
		}
		
		return pc;
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are " + this.numEmptySeat + " empty seats");
	}
	
	public void showEmptySeats() {
		System.out.println("The following seats are empty:");
		for (int i=0; i<12; i++) {
			if (!this.p[i].isOccupied())
				System.out.println("SeatID " + this.p[i].getSeatID());
		}
	}
	
	public void showAssignedSeat(boolean bySeatId) {
		System.out.println("The seat assignments are as follow: ");
		PlaneSeat[] cpy = this.sortSeats();
		
		if (bySeatId) {
			
			for(int i=0; i<12; i++) {
				if (this.p[i].isOccupied()) {
					System.out.println("SeatID " + this.p[i].getSeatID() + " assigned to CustomerID " + this.p[i].getCustomerID());
				}
			}
		}
		
		else {
			
			for(int i=0; i<12; i++) {
				if (cpy[i].isOccupied()) {
					System.out.println("SeatID " + cpy[i].getSeatID() + " assigned to CustomerID " + cpy[i].getCustomerID());
				}
			}
		}
		
		
	}
	
	public void assignSeat(int seatId, int cus_id) {
		seatId--;
		this.p[seatId].assign(cus_id);
		this.numEmptySeat--;
	}
	public void unAssignSeat(int seatId) {
		seatId--;
		this.p[seatId].unassign();
		this.numEmptySeat++;
	}
}
