public class Parrot extends Bird{

    private String habitat;

    /***
     * Creating a class named Parrot which will be parent for all parrots.
     * This method differentiates the sound of the parrot based on living location. Hence this class is closed for modification and open for extension
     */
    @Override
    public void sing(){

        if(isNotEmpty(getHabitat())){
            if(getHabitat().equals("LivingWithDog"))
                System.out.println("Woof, woof");
            else if(getHabitat().equals("LivingWithCat"))
                System.out.println("Me ow");
            else if(getHabitat().equals("LivingNearRooster"))
                System.out.println("Cock-a-doodle-doo");
        }else{
            System.out.println("I am a Parrot, i can sing");
        }

    }

    private boolean isNotEmpty(String arg){
        return !isEmpty(arg);
    }
    /**
     * This method checks if a given String argument is empty or null
     * @param arg
     * @return
     */
    private boolean isEmpty(String arg){
        if(null == arg || arg.trim().isEmpty())
            return true;
      return false;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
