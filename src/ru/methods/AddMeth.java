package ru.methods;

public class AddMeth {
    public static void main(String[] args) {
        Vechile minivan = new Vechile();
        Vechile sportcar = new Vechile();

        int range1, range2;

        minivan.passangers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passangers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        System.out.println("Минивэн может перевезти " + minivan.passangers + " пассажиров на расстояние " + minivan.range() + " милль.");
        minivan.range();

        System.out.println("Спорткар может перевезти " + sportcar.passangers + " пассажиров на расстояние " + sportcar.range() + " милль.");
        sportcar.range();
    }
}
