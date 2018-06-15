public class Football extends Sport {

    public Football(){
        super(20, 11);
    }

    @Override
    public void players(){
        System.out.println("Football is 11 on 11");
        System.out.println("Height is not that important.");
    }
    @Override
    public void time(){
        System.out.println("In football there are only 2 halves of 45 minutes.");
    }
    @Override
    public void use_of_hands(){
        System.out.println("Only the goalkeeper can touch the ball with his hands, otherwise it is forbidden.");
    }
    @Override
    public void scoring(){
        System.out.println("While scoring a goal, the scoring team get only one point.");
    }
    @Override
    public void played_officially(){
        System.out.println("Football is officially played outdoors.");
    }

    @Override
    public void official_field(){
        System.out.println("Football is officially played on a grass field.");
    }

    public void field(){
        System.out.println("A football game is played on a field and the distance between the goals is 100-110m.");
    }

    @Override
    public void substitutions(){
        System.out.println("The number of substitutes, up to a maximum of five.");
    }

}
