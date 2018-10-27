import java.util.ArrayList;

public class Round {

    public boolean isOver(){

        return true;
    }

    //show卡面
    public void printCard(Card card){
        if(card.hidden==1)
            System.out.println("Hidden");
        else {
            System.out.print(card.number+" of ");
            if (card.type==0)
                System.out.println("方块");
            else if(card.type==1)
                System.out.println("草花");
            else if(card.type==2)
                System.out.println("红桃");
            else if(card.type==3)
                System.out.println("黑桃");
            else if(card.type==4)
                System.out.println("小王");
            else if(card.type==5)
                System.out.println("大王");

        }
    }

    public void printState(ArrayList<Player> players,Dealer dealer){
        System.out.println("Dealer:");
        for(Card card:dealer.getdCards()){
            printCard(card);
        }
        for (Player player:players) {
            for(Card card:player.getpCards())
                printCard(card);
        }

    }

    public void startRound(ArrayList<Player> players,Dealer dealer,Cards cards){
        dealer.getRandomCard(cards);
        for (Player player:players)
            player.getRandomCard(cards);
        printState(players,dealer);
    }

    //要几张？
    public void startDoubleRound(ArrayList<Player> players,Dealer dealer,Cards cards){
        dealer.getRandomCard(cards);
        for (Player player:players) {
            player.getRandomCard(cards);
            player.setTempBet(player.getTempBet()*2);
        }
        printState(players,dealer);
    }

    public void stayRound(){

    }
}
