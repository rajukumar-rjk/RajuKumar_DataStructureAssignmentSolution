package com.assignment.main;
import com.assignment.service.SkyScraper;

public class Driver_Q1 {

	public static void main(String[] args) {
		SkyScraper ss = new SkyScraper();
        int no_of_floors = ss.inputFloors();
        ss.assemblyPlan(no_of_floors);

	}
}
