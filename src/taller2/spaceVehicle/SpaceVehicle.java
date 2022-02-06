package taller2.spaceVehicle;

import java.util.Date;

abstract public class SpaceVehicle {

    protected String name;
    protected String typeOfFuel;
    protected String yearOfLaunch;
    protected String countryOfOrigin;
    protected String typeOfShip;

    public SpaceVehicle(String name, String typeOfFuel, String yearOfLaunch, String countryOfOrigin, String typeOfShip) {
        this.name = name;
        this.typeOfFuel = typeOfFuel;
        this.yearOfLaunch = yearOfLaunch;
        this.countryOfOrigin = countryOfOrigin;
        this.typeOfShip = typeOfShip;
    }

    abstract public void accelerate();
    abstract public void launchShip();
    abstract public void landing();
    abstract public void couple();
    abstract public void uncouple();
    abstract public String descriptionShip();
}
