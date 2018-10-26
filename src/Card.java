public class Card {
    protected int type;//花色0-3,小王4,大王5
    protected int number;//牌面1-13
    protected int value;//数值1-10

    protected int hidden;//可见

    protected Card(int type,int number,int value){
        this.type=type;
        this.number=number;
        this.value=value;
        hidden=0;
    }
    public int getValue(){
        return value;
    }

    public int getType() {
        return type;
    }

    public int getHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
