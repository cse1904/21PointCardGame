import java.util.ArrayList;

public class OneGame {
    protected ArrayList<Player> players;

    protected OneGame(ArrayList<Player> players){
        this.players=players;
    }

    public void runGame(){
        //洗牌
        Cards cards=new Cards();
        cards.shuffleCard();

        //生成庄家
        Dealer dealer=new Dealer();

        for (Player player:players) {
            if(player.getBet()>0){
                System.out.println(player.getName()+"have"+player.getBet());
                System.out.println("Enter bet 500");
                //todo:输入下注
                player.setTempBet(500);
            }
            else
                System.out.println(player.getName()+"已经狗带!");
        }

        Round round=new Round();
        System.out.println("New hand...");
        //第一波
        dealer.getRandomHiddenCard(cards);
        dealer.getRandomCard(cards);
        for (Player player:players) {
            player.getRandomCard(cards);
            player.getRandomCard(cards);
        }

        System.out.print("Hit or Stay or Double:");
        //todo:输入
        String button="hit";

        while(!round.isOver()){
            if(button.equals("hit"))
                round.startRound(players,dealer,cards);
            else if(button.equals("stay"))//todo:aoaoao
                round.stayRound();
            else if(button.equals("double")){
                round.startDoubleRound(players,dealer,cards);

            }

        }

    }

}
