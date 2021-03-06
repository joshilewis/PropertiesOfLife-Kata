package org.katas.gameoflife;

import java.util.Random;

public class StillLife implements BoardGenerator {

	private int numberOfStillLifes;

	public StillLife(int numberOfStillLifes) {
		this.numberOfStillLifes = numberOfStillLifes;
	}

	@Override
	public Board createBoard() {

		Board b = new Board();
		Random r = new Random();
		int x = r.nextInt(Integer.MAX_VALUE - 3);
		int y = r.nextInt(Integer.MAX_VALUE - 3);

		BoardGenerator.place(b, x, y, getRandomStillLife(r));
		return b;
	}

	private String getRandomStillLife(Random r) {
		String block = "**\n**\n";
		String beehive = " ** \n*  *\n ** ";
		String[] stillLifes = { block, beehive };
		String stillLife = stillLifes[r.nextInt(stillLifes.length)];
		return stillLife;
	}

}
