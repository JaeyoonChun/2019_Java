package p1;

import java.util.*;

class Connection {
	private String departure;
	private String arrival;

	Connection() {
	}

	Connection(String departure, String arrival) {
		this.departure = departure;
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
}


public class P10_20151169_1 {
	public static void main(String[] args) {
		Connection[] con = new Connection[14];
		con[0] = new Connection("SanJose", "SanFrancisco");
		con[1] = new Connection("SanJose", "Anchorage");
		con[2] = new Connection("NewYork", "Anchorage");
		con[3] = new Connection("NewYork", "SanJose");
		con[4] = new Connection("NewYork", "SanFrancisco");
		con[5] = new Connection("NewYork", "Honolulu");
		con[6] = new Connection("Anchorage", "NewYork");
		con[7] = new Connection("Anchorage", "SanJose");
		con[8] = new Connection("Honolulu", "NewYork");
		con[9] = new Connection("Honolulu", "SanFrancisco");
		con[10] = new Connection("Denver", "SanJose");
		con[11] = new Connection("SanFrancisco", "NewYork");
		con[12] = new Connection("SanFrancisco", "Honolulu");
		con[13] = new Connection("SanFrancisco", "Denver");

		ArrayList<Connection> info = new ArrayList<Connection>();
		for (int i = 0; i < con.length; i++) {
			info.add(con[i]);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Welcome to Flight Tour NORANG Balloon !!");
		System.out.println("-----------------------------------------");
		
		System.out.println("\n<<< Flight Information >>>");
		for (Connection c : info) {
			System.out.println(c.getDeparture() + " -> " + c.getArrival());
		}
		
		Set<String> dept = new HashSet<String>();
		for (int i = 0; i < con.length; i++) {
			dept.add(con[i].getDeparture());
		}
		LinkedList<String> deptCities = new LinkedList<String>(dept);

		System.out.println("\n-----------------------------------------");
		System.out.println("<<<  Cities in the DB  >>>");
		System.out.println("-----------------------------------------");
		for (String city : deptCities) {
			System.out.println(city);
		}
		System.out.println("-----------------------------------------");
		
		System.out.println("\nLet's plan a round-trip route!");
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter the starting city : ");
		String start = scin.next();
		LinkedList<String> route = new LinkedList<String>();
		route.add(start);
		while (true) {
			System.out.println("From " + start + " you can fly directly to :\n");
			for (int i = 0; i < con.length; i++) {
				if (con[i].getDeparture().equals(start))
					System.out.println(con[i].getArrival());
			}
			System.out.println("\n-----------------------------------------");
			
			System.out.print("Where do you want to go from " + start + "? ");
			start = scin.next();
			
			boolean isCorrectCityName = false;
			for (int i = 0; i < deptCities.size(); i++) {
				if(deptCities.get(i).equals(start)) {
					isCorrectCityName = true;
					break;
				}
			}
			
			boolean isCorrectAriv = false;
			for (Connection c : info) {
				if(c.getDeparture().equals(route.getLast()))
					if(c.getArrival().equals(start)) {
						isCorrectAriv = true;
						break;
					}
			}

			if (start.equals(route.get(0))) {
				route.add(start);
				break;
			}
			
			if (isCorrectCityName && isCorrectAriv) route.add(start);
			else {
				System.out.println("***** You can't get to that city by a direct flight. *****\n");
				start = route.getLast();
			}		
		}


		System.out.println("\n=========================================");
		System.out.println("<<<  Your Final Route  >>>\n");
		for (int i = 0; i < route.size(); i++) {
			if (i < route.size()-1) System.out.print(route.get(i) + " -> ");
			else System.out.println(route.get(i));
		}
		System.out.println("-----------------------------------------\n");
		System.out.println(" Have a nice Trip with NORANG Balloon ~");
		scin.close();
	}
}