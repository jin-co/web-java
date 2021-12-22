package InnerClass;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear = 0;
    private boolean clutchIsIn = false;

    public Gearbox (int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        this.gears.add(new Gear(number, ratio));
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
