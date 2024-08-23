public class Card {
    private int suit;
    private int rank;

    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    public Card(){
        this(3, 13)
       // this.suit = 3; these are not necessary
       // this.rank = 13;
    }

    public int getRank(){
        return rank;
    }

    public int getSuit(){
        return suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    
}
