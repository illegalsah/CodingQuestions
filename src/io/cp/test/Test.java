package io.cp.test;

import io.cp.stream.CountFrom;
import io.cp.stream.CountSum;
import io.cp.stream.FilterGreaterOrLess;
import io.cp.stream.MaxMin;

public class Test {
	public static void main(String[] args) {
		MaxMin mm = new MaxMin();
		FilterGreaterOrLess lgol = new FilterGreaterOrLess();
		CountFrom cf = new CountFrom();
		CountSum cs = new CountSum();
		
		System.out.println(cs.getSalSumThirdWay());
	}
}
