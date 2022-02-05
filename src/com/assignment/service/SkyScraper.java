package com.assignment.service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SkyScraper {

	Stack<Integer> construction;
    ArrayList<Integer> floors;

    int highest;
    
    public SkyScraper() {
        this.floors = new ArrayList<>();
        this.construction = new Stack<>();
        this.highest = -1;
    }
    


    public int inputFloors() {
        Scanner input = new Scanner(System.in);
        int no_of_floors, floor;

        System.out.println("enter the total no of floors in the building");
        no_of_floors = input.nextInt();

        for (int i = 1; i <= no_of_floors; i++) {
            System.out.println("enter the floor size given on day : " + i);
            floor = input.nextInt();
            floors.add(floor);
            if (floor > highest)
                highest = floor;
        }

        input.close();
        return no_of_floors;
    }
    
    public void assemblyPlan(int no_of_floors) {

        int temp;

        for (int i = 1; i<= no_of_floors; i++) {
        	System.out.println("");
        	System.out.println("The order of construction is as follows");
            System.out.println("\nDay: " + i);

            if (highest == floors.get(i-1)) {
                temp = floors.get(i-1);
                System.out.print(temp);

                while (!construction.isEmpty() && temp - construction.peek() == 1) {
                    temp = construction.pop();
                    System.out.print(" " + temp);
                    highest = temp;
                }

                --highest;

            } else {
                construction.push(floors.get(i-1));
            }

        }

    }
}
