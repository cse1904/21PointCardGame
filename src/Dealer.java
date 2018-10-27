import java.util.ArrayList;

public class Dealer {
    protected ArrayList<Card> dCards=new ArrayList<>();

    public ArrayList<Card> getdCards() {
        return dCards;
    }

    public void getRandomCard(Cards cards){
        Card card=cards.randomCard();
        dCards.add(card);
    }

    //第一张为隐藏
    public void getRandomHiddenCard(Cards cards){
        Card card=cards.randomCard();
        card.hidden=1;
        dCards.add(card);
    }
}
