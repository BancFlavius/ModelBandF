public abstract class Sport {

    Sport(){

    }

    abstract void players();

    void played(){
        System.out.println("Can be played outside or inside.");
    }

    void coach(){
        System.out.println("Both sports have a coach for each team.");
    }

    abstract void scoring();

    abstract void time();

    abstract void use_of_hands();

    abstract void played_officially();

    abstract void official_field();



}
