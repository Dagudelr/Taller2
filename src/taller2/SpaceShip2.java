package taller2;

import taller2.interfaces.IUnmannedShip;
import taller2.spaceVehicle.SpaceVehicle;

public class SpaceShip2 extends SpaceVehicle implements IUnmannedShip {

    public SpaceShip2() {
        this("New Horizon", "Liquid fuel: N2H4(Hydrazine)", "2006", "EE.UU", "Unmanned");
    }

    private SpaceShip2(String name, String typeOfFuel, String yearOfLaunch, String countryOfOrigin, String typeOfShip) {
        super(name, typeOfFuel, yearOfLaunch, countryOfOrigin, typeOfShip);
    }

    @Override
    public void accelerate() {
        System.out.println("Starting the acceleration, this considerably reduces the life of the ship, it is recommended to use the gravitational assistance of the planets.");
    }

    @Override
    public void launchShip() {
        System.out.println("Unmanned spacecraft cannot launch on their own, but must be attached to a launch vehicle.");
    }

    @Override
    public void landing() {
        System.out.println("New Horizons is not designed to land, so this option will only be used when it wants to be destroyed.");
    }

    @Override
    public void couple() {
        System.out.println("Docking to the launching ship.");
    }

    @Override
    public void uncouple() {
        System.out.println("Undocking from the launch ship.");
    }

    @Override
    public String descriptionShip() {
        return "Ship Name: " + this.name
                + "\nType of fuel: " + this.typeOfFuel
                + "\nYear of launch: " + this.yearOfLaunch
                + "\nCountry of origin: " + this.countryOfOrigin
                + "\nType of ship: " + this.typeOfShip
                + "\nAssigned Mission" + this.assignMission();
    }

    @Override
    public String assignMission() {
        return "Its destination will be the dwarf planet Pluto.";
    }
}
