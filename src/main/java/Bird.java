class Bird extends Animal implements Walkable,Flyable,Singable {

    public void fly(){
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am Singing");
    }


    public void walk() {
        System.out.println("I am a bird, i can walk");
    }
}
