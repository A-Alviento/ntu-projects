import java.util.Scanner;

public class PlaneApp {
	
	public static void main(String[] args) {
		
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
		System.out.println();
		
		System.out.println("Enter the number of your choice: ");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int sid, cid;
		
		Plane p = new Plane();
		
		while(choice < 7 && choice >= 0) {
			
			switch(choice) {
			case 1:
				p.showNumEmptySeats();
				
				break;
			case 2:
				p.showEmptySeats();
				break;
			case 3:
				p.showAssignedSeat(true);
				break;
			case 4:
				p.showAssignedSeat(false);
				break;
			case 5:
				System.out.println("Assigning Seat...");
				System.out.println("Please enter SeatID: ");
				sid = sc.nextInt();
				System.out.println("Please enter CustomerID: ");
				cid = sc.nextInt();
				if (p.p[sid-1].isOccupied()) {
					System.out.println("Seat already assigned to a customer.");
					break;
				}
				p.assignSeat(sid, cid);
				System.out.println("Seat Assigned!");
				break;
			case 6:
				System.out.println("Enter SeatID to unassign customer from: ");
				sid = sc.nextInt();
				if (!p.p[sid-1].isOccupied()) {
					System.out.println("Seat is not currently assigned to any customer.");
					break;
				}
				p.unAssignSeat(sid);
				System.out.println("Seat Unassigned");
				break;
			}
			System.out.println();
			System.out.println("Enter the number of your choice: ");
			choice = sc.nextInt();
		}
		
		
	}

}
