package com.ju.japro.structalg.ten.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

import com.ju.japro.common.util.Print;

public class Controller {
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c){eventList.add(c);}
	public void run() {
		while(eventList.size() > 0) {
			for (Event event : new ArrayList<Event>(eventList)) {
				if (event.ready()) {
					Print.print(event);
					event.action();
					eventList.remove(event);
				}
			}
		}
	}
}