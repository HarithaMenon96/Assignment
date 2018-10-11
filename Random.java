package com.deloitte;

import java.util.Random;

public class MySentenceMaker {

	public static void main(String[] args) {
		Random rand = new Random();
		String[] article = { "the", "a", "one", "some" };
		String[] noun = { "boy", "girl", "dog", "town", "car" };
		String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
		String[] preposition = { "to", "from", "over", "under", "on" };
		String sentence;

		for (int i = 0; i < 20; i++) {
			sentence = "";

			sentence = sentence + " " + article[rand.nextInt(3)];
			sentence = sentence.substring(1, 2).toUpperCase() + sentence.substring(2).toLowerCase();
			sentence = sentence + " " + noun[rand.nextInt(4)];
			sentence = sentence + " " + verb[rand.nextInt(4)];
			sentence = sentence + " " + preposition[rand.nextInt(4)];
			sentence = sentence + " " + article[rand.nextInt(3)];
			sentence = sentence + " " + noun[rand.nextInt(4)];
			sentence = sentence + ".";
			System.out.println(sentence);

		}
	}
}