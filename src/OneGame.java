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

        for (Player player:players) {
            if(player.getBet()>0){
                System.out.println(player.getName()+"have"+player.getBet());
                System.out.println("Enter bet 500");
                player.setTempBet(500);//下注
            }
            else
                System.out.println(player.getName()+"已经狗带!");
        }

        Round round=new Round();
        System.out.println("New hand...");
        while(!round.isOver()){
            
        }

    }

}
