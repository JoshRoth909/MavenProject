package coupling;

public class Traveller {

//    private Car c = new Car();
//    private Bike b = new Bike();
    Rideable rideable;


    public void startJourney(Rideable rideable){
        rideable.move();
//      c.move();
//      b.move();
    }

}
