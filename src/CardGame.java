import java.util.ArrayList;

public class CardGame {

    public static void main(String args[]){
        System.out.println("Welcome to Blackjack!");
        int playerNum=3;
        ArrayList<Player> players= new ArrayList<>();
        for(int i=0;i<playerNum;i++){
            players.add(new Player(1000,String.valueOf(i)));
        }
        //todo:仅玩一局，若想玩多局restart，加循环，图形化界面各种功能未加
        OneGame oneGame=new OneGame(players);
        oneGame.runGame();

    }
}
