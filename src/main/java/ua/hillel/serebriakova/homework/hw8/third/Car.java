package ua.hillel.serebriakova.homework.hw8.third;

class Car {
    public void startEngines() {
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

        CarEngine engine1 = new CarEngine();
        CarEngine engine2 = new CarEngine();

        engine1.start();
        engine2.start();
    }

    public void stopEngines() {}
}
