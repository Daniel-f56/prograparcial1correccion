package com.mycompany.parcial1.car;

import com.mycompany.parcial1.box.PackageSend;
import com.mycompany.parcial1.people.Driver;
import java.util.ArrayList;

public class Vehicle {
    private ArrayList<PackageSend> packages;
    private VehicleType type;
    private String carPlate;//Placa del carro
    private int sizeCapacity;
    private Driver driver;

    public Vehicle(VehicleType type, String carPlate, int sizeCapacity) {
        this.type = type;
        this.carPlate = carPlate;
        this.sizeCapacity = sizeCapacity;
        this.packages = new ArrayList<>();
    }

    public Vehicle(VehicleType type, String carPlate, int sizeCapacity, Driver driver) {
        this.type = type;
        this.carPlate = carPlate;
        this.sizeCapacity = sizeCapacity;
        this.driver = driver;
        this.packages = new ArrayList<>();
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    //Metodo para agregar paquetes a un vehiculo
    public void addPackage(PackageSend packageSend){
        if(this.packages.size() < this.sizeCapacity){
            this.packages.add(packageSend);
        } else {
            System.out.println("Vehiculo lleno");
        }
    }
    
    public void showPackages(){
        for(PackageSend packageSend : this.packages){
            System.out.println(packageSend.getID() + " "+ packageSend.isDelivered());
        }
    }
}
