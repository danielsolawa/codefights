package com.danielsolawa.codefights.core.solutions;

public class Candles {
	
	int candles(int candlesNumber, int makeNew) {
		
		return burnCandles(candlesNumber, 0, makeNew);
	}
	
	int burnCandles(double candles, double leftover, double makeNew) {
		
		if(candles == 0 && leftover < makeNew)
			return 0;
		else {
			leftover += candles; 
			double newCandles = Math.floor(leftover / makeNew);
			leftover -= newCandles * makeNew;

			return (int) (candles + burnCandles(newCandles, leftover, makeNew));
		}
	}
}
