import java.util.Arrays;

public class CardGame {

    public static void main(String[] args) {
        String[] deck = initializeDeck(); // Initialize the deck
        deck = shuffleDeck(deck); // Shuffle the deck

        int numPlayers = 4; // Number of players
        int cardsPerPlayer = 5; // Number of cards per player

        // Ensure the deck can be distributed to players
        if (cardsPerPlayer * numPlayers <= deck.length) {
            String[][] playersCards = distributeCards(deck, numPlayers, cardsPerPlayer);
            printPlayersCards(playersCards); // Print the players and their cards
        } else {
            System.out.println("Not enough cards to distribute!");
        }
    }

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        // Create the deck with all possible combinations of suits and ranks
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i)); // Random card index
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp; // Swap the cards
        }
        return deck;
    }

    // Method to distribute the deck to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        String[][] playersCards = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        // Distribute the cards to each player
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards: " + Arrays.toString(playersCards[i]));
        }
    }
}
