package deckOfCard;

public class deckofcardEx {

	    public static void main(String[] args) {
	    	int k=0;
	    	 System.out.println("--------------Deck Of Card-----------------");
	    	 System.out.println("9 Cards distributed to 4 players ");
	    	String[][] Player = new String[4][9];
	            String[] SUITS = {
	                "Clubs", "Diamonds", "Hearts", "Spades"
	            };

	            String[] RANKS = {
	                "2", "3", "4", "5", "6", "7", "8", "9", "10",
	                "Jack", "Queen", "King", "Ace"
	            };

	          
	            int n = SUITS.length * RANKS.length;
	            String[] deck = new String[n];
	            for (int i = 0; i < RANKS.length; i++) {
	                for (int j = 0; j < SUITS.length; j++) {
	                    deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
	                }
	            }

	            
	            for (int i = 0; i < n; i++) {
	                int r = i + (int) (Math.random() * (n-i));
	                String temp = deck[r];
	                deck[r] = deck[i];
	                deck[i] = temp;
	            }
	            for (int i = 0; i < 4; i++) {
	            	System.out.println("\n"+"Player-"+(i+1));
	            	for (int j = 0; j < 9; j++) {
	            		
	            		Player[i][j]=deck[k];
	 	                
		                System.out.println("-"+Player[i][j]);
		                k++;
		            }
	            	System.out.println("-----------------------------------------");
	            	
	               
	            }

	            
	            
	        }
	    }

