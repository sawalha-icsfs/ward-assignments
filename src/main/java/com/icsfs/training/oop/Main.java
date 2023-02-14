package com.icsfs.training.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.icsfs.training.oop.entites.Game;
import com.icsfs.training.oop.entites.Player;

public class Main {

	private static Scanner input = new Scanner(System.in);
	private static int deckCards = 52;

	public static void main(String[] args) {
		Game game = new Game();
		Player player[] = new Player[4];

		System.out.println("Please Enter Game Name: ");
		game.setName(input.nextLine());

		for (int index = 0; index < player.length; index++) {
			player[index] = enterPlayerName(index);
		}

		game.setPlayers(player);

		System.out.println("Game Name -> " + game.getName());
		System.out.println("Players Name -> " + player[0] + " " + player[1] + " " + player[2] + " " + player[3]);

	}

	private static Player enterPlayerName(int index) {
		System.out.println("Please Enter player Name " + (index + 1) + ": ");
		Player playerObj = new Player();
		playerObj.setName(input.nextLine());
		return playerObj;
	}

}
