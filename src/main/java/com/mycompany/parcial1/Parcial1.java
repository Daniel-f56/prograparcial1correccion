package com.mycompany.parcial1;

import com.mycompany.parcial1.box.PackageSend;
import com.mycompany.parcial1.car.Vehicle;
import com.mycompany.parcial1.car.VehicleType;
import com.mycompany.parcial1.people.Driver;

public class Parcial1 {

    public static void main(String[] args) {
        
        
        Driver driver1 = new Driver("Pedro", true);
        
        Vehicle vehicle1 = new Vehicle(VehicleType.TRUCK, "ASD", 5, driver1);
        Vehicle vehicle2 = new Vehicle(VehicleType.VAN, "fgh", 1);
        
        PackageSend package1 = new PackageSend("a");
        PackageSend package2 = new PackageSend("b");
        PackageSend package3 = new PackageSend("c");
        
        package2.setDelivered(true);
        
        vehicle2.addPackage(package1);
        vehicle2.addPackage(package2);
        vehicle2.showPackages();


    }
}
