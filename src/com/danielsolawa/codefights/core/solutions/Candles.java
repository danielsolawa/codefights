package com.danielsolawa.codefights.core.solutions;

public class Candles {
	
	int candles(int candlesNumber, int makeNew) {
		
		return burnCandles(candlesNumber, 0, makeNew);
	}
	
	int burnCandles(double candles, double leftover, double makeNew) {
		double newCandles = Math.floor(leftover / makeNew);
		
		if(candles == 0 && leftover < makeNew)
			return 0;
		
		
		return (int) (candles + burnCandles(newCandles, (leftover - (newCandles * makeNew)) + candles, makeNew));
	}
}
