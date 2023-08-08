class Vehicle{
    public Vehicle(){
        System.out.println("Vehicle");
    }

    static class Car extends Vehicle{

        public static void Car(){
            System.out.println("Car");
        }
    }

    static class Suzuki extends Car {

        public static void honda(){

            System.out.println("Suzuki");

        }

        public static void c1(){
            System.out.println("c1");
        }
        public static void c2(){
            System.out.println("c2");
        }
        public static void c3(){
            System.out.println("c3");
        }

    }

    static class Toyata extends Car {

        public static void toyata() {
            System.out.println("Toyata");
        }
        public static void c1(){
            System.out.println("c1");
        }
        public static void c2(){
            System.out.println("c2");
        }
        public static void c3(){
            System.out.println("c3");
        }
    }

    static class Dashatsu extends Car {

        public static void dashatu(){
            System.out.println("Dashatu");
        }
        public static void c1(){
            System.out.println("c1");
        }
        public static void c2(){
            System.out.println("c2");
        }
        public static void c3(){
            System.out.println("c3");
        }
    }

    static class Bike extends Vehicle {

        public static void Bike() {
            System.out.println("Bike");
        }
    }

    static class Bus extends Vehicle {

        public static void Bus() {
            System.out.println("Bus");
        }

        static class AC_bus extends Bus{

            public static void local(){

                System.out.println("Local Bus");

            }
            public static void Dream(){
                System.out.println("Dream");
            }
        }

        static class Non_ac extends Bus{

            public static void Ncs(){
                System.out.println("NCS");
            }+
        }

        static class Truck extends Vehicle{

            public static void truck(){
                System.out.println("2-Types");
            }

           static class mini_Truck extends Truck{

                public static void mini_Truck(){
                    System.out.println("Mini Truck");
                }
            }

            static class cargo_Truck extends Truck{

                public static void cargo_Truck(){
                    System.out.println("Cargo-Truck");
                }
            }
        }

    }

    public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
    }
  }
}