package com.appspot.btcticker.model;

public class Valuation {

	public final double buy;
	public final double sell;
	public final double last;

	public Valuation(double buy, double sell, double last) {
		super();
		this.buy = buy;
		this.sell = sell;
		this.last = last;
	}
	
	public double weightedValue () {
		return (buy + sell + 2 * last) / 4;
	}

	@Override
	public String toString() {
		return "Valuation [buy=" + buy + ", sell=" + sell + ", last=" + last
				+ "]";
	}

}
