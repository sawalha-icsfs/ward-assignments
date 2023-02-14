package com.icsfs.training.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.icsfs.training.oop.entites.Card;
import com.icsfs.training.oop.entites.CardType;
import com.icsfs.training.oop.entites.Game;
import com.icsfs.training.oop.entites.Player;

public class Main {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Game game = new Game();
		Player player[] = new Player[4];

		System.out.println("Please Enter Game Name: ");
		game.setName(input.nextLine());

		for (int index = 0; index < player.length; index++) {
			player[index] = enterPlayerName(index);
		}

		System.out.println("Game Name -> " + game.getName());
		System.out.println("Players Name -> " + player[0] + " " + player[1] + " " + player[2] + " " + player[3]);
		List<Card> cards = createCardsDeck();
		System.out.println(cards);
		game.setPlayers(player);

		for (Card card : cards) {
			List<Card> tempCards  = new ArrayList<Card>();;
			int index = 0;
			for (int i = 0; i < 13; i++) {
				tempCards.add(card);
				tempCards.remove(i);
				
			}
			game.getPlayers()[index].setCards(tempCards);
			index++;
		}

	}

	private static Player enterPlayerName(int index) {
		System.out.println("Please Enter player Name " + (index + 1) + ": ");
		Player playerObj = new Player();
		playerObj.setName(input.nextLine());
		return playerObj;
	}

	public static List<Card> createCardsDeck() {
		List<Card> cards = new ArrayList<>();

		int cardTypeFlag = 0;

		for (int i = 1; i < 53; i++) {
			Card card = new Card();
			card.setNumber(i);

			if (i == 14)
				cardTypeFlag = 1;
			else if (i == 27)
				cardTypeFlag = 2;
			else if (i == 40)
				cardTypeFlag = 3;

			switch (cardTypeFlag) {
			case 0:
				card.setType(CardType.CLUBS);
				break;
			case 1:
				card.setType(CardType.DIAMONDS);
				break;
			case 2:
				card.setType(CardType.HEARTS);
				break;
			case 3:
				card.setType(CardType.SPADES);
				break;

			default:
				break;
			}

			cards.add(card);

		}

		Collections.shuffle(cards);

		return cards;

	}

}
