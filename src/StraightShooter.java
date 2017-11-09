public class StraightShooter {

    private int totalScore;
    private Die[] dice;
    private final int ARRAY_SIZE;

    public StraightShooter(int arraySize){
        this.ARRAY_SIZE=arraySize;
        totalScore=0;
        this.dice=new Die[this.ARRAY_SIZE];
        for(int x=0;x<this.dice.length;x++){
            this.dice[x]=new Die();
        }
    }

    public int getScore(){
        int currentScore=0;
        int lowestValue=0;
        int numOnes=0;
        for(int x=0;x<this.dice.length;x++){
            if(this.dice[x].getFace()==1) numOnes++;
            for(int y=0;y<this.dice.length;y++){
                if(this.dice[y].getFace()==lowestValue+1){
                    lowestValue++;
                    currentScore+=5;

                }
            }
        }
        if(lowestValue==6)
            currentScore+=5;
        totalScore+=currentScore;
        if(numOnes>2)
            this.totalScore=currentScore=0;

        return currentScore;
    }
    public int getTotalScore(){
        return this.totalScore;
    }
    public void roll(){
        for(int x=0;x<this.dice.length;x++){
            this.dice[x].roll();
        }
        //totalScore+=this.getScore();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        for(int x=0;x<this.dice.length;x++){
            sb.append(this.dice[x].getFace()+", ");
        }
        return sb.toString();
    }
}
