package logic;

public class Card {
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public boolean equals(Object o){
		if(o instanceof Card){
			Card c = (Card)o;
			return c.rank == rank && c.suit == suit;
		}
		return false;
	}
}
