package ru.methods;

public class Vechile {
    int passangers;
    int fuelcap;
    int mpg;

    Vechile(int p, int f, int m) {
        this.passangers = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    int range() {
        return fuelcap*mpg;
    }

    double fuelneeded(int miles) {
        return (double) miles/mpg;
    }
}
