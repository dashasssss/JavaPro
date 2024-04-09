package ua.hillel.serebriakova.homework.hw8.second;

class CarEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Car Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine stopped");
    }
}

class Car {
    private CarEngine engine1 = new CarEngine();
    private CarEngine engine2 = new CarEngine();

    public void startEngines() {
        engine1.start();
        engine2.start();
    }

    public void stopEngines() {
        engine1.stop();
        engine2.stop();
    }
}

