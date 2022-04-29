package com.example.oops.polymorphism;

public class PolymorphismExample {

	public int add(int i, int j) {
		return i + j;
	}

	public float add(float a, float b) {
		return a + b;
	}

	public long add(long x, long y) {
		return x + y;
	}

	public static void main(String[] args) {
		
		PolymorphismExample obj = new PolymorphismExample();
		
		float res = obj.add(123.456f, 121.678f);

		System.out.println(res);

		long res1 = obj.add(123l, 121l);

		System.out.println(res1);

		int res3 = obj.add(123, 127);

		System.out.println(res3);
	}

}
