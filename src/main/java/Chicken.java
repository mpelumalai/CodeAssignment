public class Chicken extends Bird{

    /**
     * Chicken makes Cluck, cluck sounds. hence override and provide its behaviour
     */
    @Override
    public void sing(){
        System.out.println("Cluck, cluck");
    }
    @Override
    public void fly() {
        System.out.println("I am a chicken, i cannot fly");
    }

}
