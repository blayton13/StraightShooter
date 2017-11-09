public class Die {
    private int face;
    private int sides;

    public Die(){
        this.sides=6;
        this.roll();
    }

    public int roll(){
        face=(int)(Math.random()*6)+1;
        return face;
    }

    public int getFace(){
        return face;
    }

}
