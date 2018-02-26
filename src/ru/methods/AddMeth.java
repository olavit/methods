package ru.methods;

public class AddMeth {
    public static void main(String[] args) {
        Vechile minivan = new Vechile(7, 16, 21);
        Vechile sportcar = new Vechile(2, 14, 12);
        double gallons;
        int dist = 252;
        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спорткару требуется " + gallons + " галлонов топлива");


    }
}
