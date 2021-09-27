public class Duck extends Bird implements Swimmable{

    /***
     * Duck makes quack sounds. hence override it and provide the quack sound
     */
    @Override
    public void sing(){
        System.out.println("Quack, quack");
    }
    public void swim() {
        System.out.println("I am a duck, i can swim");
    }
}
