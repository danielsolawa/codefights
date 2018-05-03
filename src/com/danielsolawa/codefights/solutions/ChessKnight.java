package com.danielsolawa.codefights.solutions;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class ChessKnight {

	int chessKnight(String cell) {
		int count = 0;
		List<Point> points = new ArrayList<>();
		points.add(new Point(1, 2));
		points.add(new Point(-1, 2));
		points.add(new Point(-1, -2));
		points.add(new Point(1, -2));
		points.add(new Point(-2, 1));
		points.add(new Point(-2, -1));
		points.add(new Point(2, 1));
		points.add(new Point(2, -1));
		
		
		
		if(!isOnBoard(cell, 0, 0))
			return 0;
		
		for(Point p : points) {
			if(isOnBoard(cell, p.x, p.y))
				count++;
		}
		
		
		return count;
	}
	
	
	
	boolean isOnBoard(String cell, int letterMovement, int numMovement) {
		char letter = (char) (cell.charAt(0) + letterMovement);
		int num =  (cell.charAt(1) - '0') +  numMovement;
	
		
		if(letter > 'h' || letter < 'a')
			return false;
		if(num > 8 || num < 1)
			return false;
		
		return true;
	}
	
	
	
}
