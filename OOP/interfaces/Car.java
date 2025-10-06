package OOP.interfaces;

public class Car implements Engine, Brake, Media {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    
}
}
