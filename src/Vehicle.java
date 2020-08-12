    class Vehicle {
        private int passengers;
        private int fuelcap;
        private double lkm;

        Vehicle(int p, int f, double l) {
            passengers = p;
            fuelcap = f;
            lkm = l;
        }

        //method access
        int range() {
            return (int) (fuelcap * lkm / 100);
        }

        double fuelneeded(int km) {
            return (double) km / 100 * lkm;
        }

        int getPassengers() {
            return passengers;
        }

        void setPassengers(int passengers) {
            this.passengers = passengers;
        }

        int getFuelcap() {
            return fuelcap;
        }

        void setFuelcap(int fuelcap) {
            this.fuelcap = fuelcap;
        }

        double getLkm() {
            return lkm;
        }

        void setLkm(double lkm) {
            this.lkm = lkm;
        }
    }
    class Truck extends Vehicle{
        private int cargocap;

        Truck(int p, int f, double l, int c) {
            super(p, f, l);
            this.cargocap = c;
        }

        int getCargocap(){
            return cargocap;
        }
        void putCargocap(int cargocap){
            this.cargocap = cargocap;
        }
    }

    class TruckDemo{
        public static void main(String[] args) {

            Truck semi = new Truck(2, 200, 25, 4);
            Truck pickup = new Truck(3, 80, 15, 1);
            OffRoad car3 = new OffRoad(2, 45, 13, 40);
            double liters;
            int dist = 252;

            liters = semi.fuelneeded(dist);
            System.out.println("Semi car transport " + semi.getCargocap() + " tons of cargo");
            System.out.println("Distance " + dist + " km, semi car needed " + liters + " liters fuel");

            liters = pickup.fuelneeded(dist);
            System.out.println("Pickup car transport " + pickup.getCargocap() + " tons of cargo");
            System.out.println("Distance " + dist + " km, pickup car needed " + liters + " liters fuel");

            liters = car3.fuelneeded(dist);
            System.out.println("Car 3 has ground clearance: " + car3.getGroundClearance() + " cm");
        }
    }

    class OffRoad extends Vehicle{

    private int groundClearance;


        OffRoad(final int p, final int f, final double l, int gC) {
            super(p, f, l);
            this.groundClearance = gC;

        }

        int getGroundClearance(){
        return groundClearance;
        }

        void setGroundClearance(int gC){
            this.groundClearance = gC;
        }

    }

