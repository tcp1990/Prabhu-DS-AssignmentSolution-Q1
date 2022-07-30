package com.gl.apps;

import java.util.*;

import com.gl.services.FloorAssembler;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the total no of floors in the building");
		int floorTotalCount = scan.nextInt();

		int[] inputFloorSize = new int[floorTotalCount];

		System.out.println("\n");

		for (int index = 0; index < floorTotalCount; index++) {
			System.out.println("Enter the floor size given on day : " + (index + 1));
			inputFloorSize[index] = scan.nextInt();
		}
		
		//Arranging the floors based on priority queue data structure
		FloorAssembler floorAssembler = new FloorAssembler();
		floorAssembler.reArrangeFloors(floorTotalCount, inputFloorSize);

		scan.close();
	}
}
