package com.theatre.models;

import java.util.ArrayList;

public class TicketManager {

	public boolean addTicket(Bilet b) {
		TicketDAO td = new TicketDAO();
		boolean ok = td.addTicket(b);
		return ok;
	}

	public ArrayList<Bilet> seeAllTickets() {
		TicketDAO td = new TicketDAO();
		ArrayList<Bilet> bilete = td.seeAllTickets();
		return bilete;
	}
}
