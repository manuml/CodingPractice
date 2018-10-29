package com.queensattack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Coordinate {
	Integer x, y;

	public Coordinate() {
	}

	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + "]";
	}

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Coordinate))
			return false;
		if (obj == this)
			return true;
		return (this.x == ((Coordinate) obj).x) && (this.y == ((Coordinate) obj).y);

	}

}

public class QueensAttack {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of matrix: ");
		int n = scanner.nextInt();
		System.out.println("Enter the coordinate of queen");
		int rq = scanner.nextInt();
		int cq = scanner.nextInt();
		Coordinate q = new Coordinate(rq, cq);
		System.out.println("Enter the number of obstacles: ");
		int obsCount = scanner.nextInt();
		Coordinate[] obs = new Coordinate[obsCount];
		for (int i = 0; i < obsCount; i++) {
			System.out.println("Enter the Coordinates of obstacle: ");
			int ro = scanner.nextInt();
			int co = scanner.nextInt();
			obs[i] = new Coordinate(ro, co);
		}
		int result = findQueenAttack(n, q, obs);
		System.out.println("The number of squares which can be invaded: " + result);
		scanner.close();
	}

	private static int findQueenAttack(int n, Coordinate q, Coordinate[] obs) {
		int count = 0;
		List<Coordinate> eligibleList = new ArrayList<>();
		// getting vertical and horizontal squares
		for (int i = 0; i < n; i++) {
			if (i != q.y)
				eligibleList.add(new Coordinate(q.x, i));
			if (i != q.x)
				eligibleList.add(new Coordinate(i, q.y));
		}
		// getting left diagonal squares
		int start = q.x - q.y;
		if (start > 0) {
			int j = 0, k = n - 1;
			for (int i = start; i < n; i++) {
				while (j < n - start) {
					if (j == q.y)
						j++;
					eligibleList.add(new Coordinate(i, j));
					j++;
					break;
				}
				while (k > start) {
					if (k == q.y)
						k--;
					eligibleList.add(new Coordinate(i, k));
					k--;
					break;
				}
			}
		} else {
			for (int i = 0; i < n - start; i++) {
				for (int j = start; j < n; j++) {
					if (i != q.x && j != q.y) {
						eligibleList.add(new Coordinate(i, j));
					}
				}
			}
			int abs = Math.abs(start);
			for (int i = abs; i < n; i++) {
				for (int j = n - 1; j > abs; j--) {
					if (i != q.x && j != q.y) {
						eligibleList.add(new Coordinate(i, j));
					}
				}
			}
		}
		count = eligibleList.size();
		eligibleList.stream().forEach(k -> System.out.println(k));
		return count;
	}

}
