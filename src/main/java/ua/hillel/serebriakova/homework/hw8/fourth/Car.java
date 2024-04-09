package ua.hillel.serebriakova.homework.hw8.fourth;

class Car {
    public void startEngines() {
        IEngine engine1 = new IEngine() {
            @Override
            public void start() {
                System.out.println("Car Engine 1 started");
            }

            @Override
            public void stop() {
                System.out.println("Car Engine 1 stopped");
            }
        };

        IEngine engine2 = new IEngine() {
            @Override
            public void start() {
                System.out.println("Car Engine 2 started");
            }

            @Override
            public void stop() {
                System.out.println("Car Engine 2 stopped");
            }
        };

        engine1.start();
        engine2.start();
    }

    public void stopEngines() {}
}


