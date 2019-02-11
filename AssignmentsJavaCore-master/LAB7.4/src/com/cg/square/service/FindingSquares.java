package com.cg.square.service;

import java.util.HashMap;

public class FindingSquares {
public HashMap<Integer, Integer> getSquare(int[]numbers){
	HashMap<Integer,Integer> squares = new HashMap<>();
	for(int i=0;i<numbers.length;i++){
		int squareOfnum =numbers[i]*numbers[i];
		squares.put(numbers[i], squareOfnum);
	}
	return squares;
}
}
