public class Solution {
    public static void main(String args[]){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Duck duck = new Duck();
        duck.sing();
        duck.swim();

        Chicken chicken = new Chicken();
        chicken.sing();
        chicken.fly();

        Rooster rooster = new Rooster();
        rooster.sing();

        Parrot parrotLivingWithDog = new Parrot();
        parrotLivingWithDog.setHabitat("LivingWithDog");
        parrotLivingWithDog.sing();

        Parrot parrotLivingWithCat = new Parrot();
        parrotLivingWithCat.setHabitat("LivingWithCat");
        parrotLivingWithCat.sing();

        Parrot parrotLivingWithRooster = new Parrot();
        parrotLivingWithRooster.setHabitat("LivingNearRooster");
        parrotLivingWithRooster.sing();

    }
}
