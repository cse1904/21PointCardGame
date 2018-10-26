public class Player {
    protected int bet;//总有钱数
    protected String name;

    protected int tempBet;//下注数值

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

    public void setTempBet(int tempBet) {
        this.tempBet = tempBet;
    }

    public void choose(){

    }
    //todo:玩家的赌注加倍，同时再发一张牌，不论是否爆牌，都不能再要牌。
    public void doubleCard(){

    }
    public void goOn(){

    }
    public void stay(){

    }
}
