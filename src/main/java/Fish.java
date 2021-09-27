import jdk.jshell.execution.Util;

public class Fish extends Animal implements Swimmable{

    private String size;
    private String color;

    private boolean canMakeJokes;
    private boolean canEatFish;

    public void swim() {
        if(checkIfClownFish())
            System.out.println("I am a clownFish, i can swim");
        else if(checkIfShark())
            System.out.println("I am a Shark, i can swim");
        else
            System.out.println("I am a fish, i can swim");
    }

    private boolean checkIfShark(){
        return canEatFish && Utils.isNotEmpty(size) && size.equals("large") && Utils.isNotEmpty(color) && color.equals("grey");
    }
    private boolean checkIfClownFish(){
        return canMakeJokes && Utils.isNotEmpty(size) && size.equalsIgnoreCase("small") && Utils.isNotEmpty(color) && color.equals("orange");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanMakeJokes() {
        return canMakeJokes;
    }

    public void setCanMakeJokes(boolean canMakeJokes) {
        this.canMakeJokes = canMakeJokes;
    }

    public boolean isCanEatFish() {
        return canEatFish;
    }

    public void setCanEatFish(boolean canEatFish) {
        this.canEatFish = canEatFish;
    }

}
