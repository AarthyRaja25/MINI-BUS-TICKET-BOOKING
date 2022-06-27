package Movieticketbooking;
import java.util.ArrayList;
import java.util.Scanner;
public class TicketBooking {
Scanner in=new Scanner(System.in);
int list;
int noofseats;
String[] movielist= {"1=> AVENGERS","2=>BATMAN","3=>THEGRAYMAN","4=>SPIDERMAN"};


	public void name() {
		// TODO Auto-generated method stub
		String name=in.nextLine();
		System.out.println("Hello!"+name);
	}

	public void DisplayMovielist() {
		// TODO Auto-generated method stub
	
	for(int i=0;i<movielist.length;i++)
		{
			System.out.println(movielist[i]);
		}
		
	}

	public void selectmovie() {
		// TODO Auto-generated method stub
		list=in.nextInt();
		
		System.out.println("Movie selected"+" "+movielist[list-1]);
	

	}

	public void seatbooking() {
		// TODO Auto-generated method stub
		noofseats=in.nextInt();
		System.out.println("you have booked"+" "+noofseats+" "+"Tickets");
		System.out.println("**Thankyou**");
	}

}
