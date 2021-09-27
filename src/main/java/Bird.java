class Bird extends Animal implements Flyable,Singable {

    public void fly(){
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am Singing");
    }
}
