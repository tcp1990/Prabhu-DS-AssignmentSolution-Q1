package com.gl.services;

import java.util.PriorityQueue;

public class FloorAssembler {

	public void reArrangeFloors(int floorTotalCount, int inputFloorSize[]) {

		int maxCount = floorTotalCount;

		PriorityQueue<Integer> assemblerQueue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		System.out.println("\nThe order of construction is as follows :\n");

		for (int index = 0; index < floorTotalCount; index++) {
			System.out.println("Day : " + (index + 1));

			assemblerQueue.add(inputFloorSize[index]);

			while (!assemblerQueue.isEmpty() && assemblerQueue.peek() == maxCount) {

				System.out.print(assemblerQueue.poll() + " ");
				maxCount--;
			}

			System.out.println();
		}
	}
}
