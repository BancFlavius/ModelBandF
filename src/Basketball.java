public class Basketball extends Sport {

   public Basketball(){
       super(12, 5);
   }


    @Override
    public void players(){
        System.out.println("Basketball is 5 on 5 ");
        System.out.println("The height of the players makes a huge difference.");
    }
    @Override
    public void time(){
        System.out.println("In basketball a game is made up of four 12 minute quarters.");
    }
    @Override
    public void use_of_hands(){
        System.out.println("You can touch the ball with your hands, but you are penalized for it the ball with your feet.");
    }
    @Override
    public void scoring(){
        System.out.println("If you score inside the arc it's worth 2 points, and if you score outside the arc it's worth 3 points.");
    }
    @Override
    public void played_officially(){
        System.out.println("Basketball is officially played indoors.");
    }

    @Override
    public void official_field(){
        System.out.println("Basketball is officially played on a wooden or paved court.");
    }

    public void court(){
        System.out.println("A basketball game is played on a court and the distance between the two baskets is 28-29m.");
    }

    public void game_end(){
        System.out.println("The game can be canceled");
    }

    public void break_ads(){
        System.out.println("Usually when there is a break in basketball there are ads played on the court or choreographed dances.");
    }

    @Override
    public void substitutions(){
        System.out.println("The rules of basketball allow an unlimited number of substitutions.");
    }


}
