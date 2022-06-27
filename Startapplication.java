package Movieticketbooking;

import java.util.Scanner;

public class Startapplication {
	
public  void flowmanager() {
	Scanner in=new Scanner(System.in); 
	boolean isexit=true;
	while(isexit)
	{
		System.out.println();
		System.out.println("**WELCOME TO LA CINEMAS**");
		System.out.println("Enter 1 and please enter your name");
		System.out.println("Enter 2 for View the movieList");
		System.out.println("Enter 3 for Selecting the movie");
		System.out.println("Enter 4 for booking Seats");
		System.out.println("Enter 5 Exit");
		 int option=in.nextInt();
		switch(option)
		{
		case 1:
		System.out.println("Please enter your name for booking Tickets");
		new TicketBooking().name();
		break;
		case 2:
		System.out.println("Movielist is here");
		
		new TicketBooking().DisplayMovielist();
		break;
		case 3:
	   System.out.println("Select the movie");
	   new TicketBooking().selectmovie();
	   break;
		case 4:
			System.out.println("Book your seats");
			new TicketBooking().seatbooking();
			break;
		case 5:
			isexit=false;
			System.out.println("Thank you");
			break;
			default:
				System.out.println("Enter a valid number");
}
}
}
public static void main(String[] args) {
	
new Startapplication().flowmanager();
		
}
}