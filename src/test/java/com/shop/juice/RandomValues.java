package com.shop.juice;


import java.util.Random;

public class RandomValues {
	
	public static String generatingRandom() {

		String capitalChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChar = "abcdefghijklmnopqrstuvwxyx";
		String numbers = "1234567890";
		String values = capitalChar + smallChar + numbers;
		Random randomValues = new Random();
		StringBuilder sb = new StringBuilder();
		int length = 10;
		for (int i = 0; i <= length; i++) {
			int index = randomValues.nextInt(values.length());
			char randomChar = values.charAt(index);
			sb.append(randomChar);
		}
		return sb.toString();
	}

	public static String generateRandomNumber(int length) {

		Random randomValues = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(randomValues.nextInt(10));
		}
		return sb.toString();
	}

}
