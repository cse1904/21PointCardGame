import java.util.ArrayList;

public class Player {
    protected int bet;//总有钱数
    protected String name;

    protected int tempBet;//下注数值
    protected ArrayList<Card> pCards=new ArrayList<>();

    protected Player(int bet,String name){
        this.bet=bet;
        this.name=name;
    }

    public int getBet() {
        return bet;
    }

    public String getName() {
        return name;
    }

    public int getTempBet() {
        return tempBet;
    }

    public ArrayList<Card> getpCards() {
        return pCards;
    }

    public void setTempBet(int tempBet) {
        this.tempBet = tempBet;
    }

    public void getRandomCard(Cards cards){
        Card card=cards.randomCard();
        pCards.add(card);
    }

}
