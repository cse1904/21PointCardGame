import java.util.ArrayList;

public class Cards {
    protected ArrayList<Card> cards;

    protected Cards(){
        for(int i=0;i<4;i++)
            for(int j=1;j<=13;j++)
                if(j>10)
                    cards.add(new Card(i,j,10));
                else
                    cards.add(new Card(i,j,j));

        cards.add(new Card(4,0,10));//小王
        cards.add(new Card(5,0,10));//大王
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    //用FisherYates方法
    public void shuffleCard(){
        int len=54;
        for(int i = len - 1; i > 0; i--){
            int j = ((int)Math.random()) % (i+1);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public Card randomCard(){
        Card card;
        int i = cards.size();
        int j = ((int)Math.random()) % i;
        card=cards.get(j);
        cards.remove(j);
        return card;
    }
}
