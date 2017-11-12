package pRS;

import java.sql.Date;

import Business.User;
import util.Console;

public class PRSApp {
public static void main(String[] args) {
	System.out.println("Welcome to the PRS Console!");
	System.out.println("Please enter the attributes of a User. ");
	
	int id = Console.getInt("User ID: ");
	String username = Console.getString("username: ", 20); //using new getString in console
	String password = Console.getString("password: ");
	String firstName = Console.getString("firstName: ");
	String lastName = Console.getString("lastName: ");
	String phone = Console.getString("phone: ");
	String email = Console.getString("email: ");
	boolean reviewer = Console.getBoolean("reviewer (true/false): ");
	boolean admin = Console.getBoolean("admin (true/false): ");
	
	User u = new User(id,username,password,firstName,lastName,phone,
			email,reviewer,admin);
	System.out.println(u.toString()); //gives you the location of object
	
//	System.out.println("Please enter the attributes of a Purchase Request: ");
//	
//	int userID = Console.getInt("userID: ");
//	String description = Console.getString("description: ");
//	String justification = Console.getString("justification: ");
////	Date dateNeeded = Console.getDate("Date: ");
//	String deliveryMode = Console.getString("delivery Mode: ");
//	int status = Console.getInt("status: ");
//	double total = Console.getDouble("total: ");
////	Date submittedDate = Console.getDate("Date: ");
//	PurchaseRequest p = new PurchaseRequest(id,userID,description,justification,dateNeeded,
//			deliveryMode,status,total,submittedDate);
//	System.out.println(p.toString());
//	
	System.out.println("Bye!");
	}
}
