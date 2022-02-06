package taller2;

import taller2.interfaces.IMannedShip;
import taller2.spaceVehicle.SpaceVehicle;

import java.util.Timer;
import java.util.TimerTask;

public class SpaceShip3 extends SpaceVehicle implements IMannedShip {

    private String[] crew = new String[3];
    private Timer waitingTime = new Timer();
    private TimerTask task = new TimerTask() {
        @Override
        public void run() {

            System.out.println("The Saturn V has arrived in orbit");
        }

    };

    public SpaceShip3() {
        this("Apolo", "Liquid fuel: NO4+UDMH", "1966", "EE.UU", "manned");
    }

    public SpaceShip3(String name, String typeOfFuel, String yearOfLaunch, String countryOfOrigin, String typeOfShip) {
        super(name, typeOfFuel, yearOfLaunch, countryOfOrigin, typeOfShip);
    }

    @Override
    public String showCrew() {
        this.crew[0] = "Neil Armstrong";
        this.crew[1] = "Michael Collins";
        this.crew[2] = "Buzz Aldrin";

        for(String name: this.crew){
            System.out.println("name = " + name);
        };
        return "";
    }

    @Override
    public void accelerate() {
        System.out.println("The space ship is accelerating toward the moon.");
    }

    @Override
    public void launchShip() {
        System.out.println("The Apollo taking off from the moon.");
    }

    @Override
    public void landing() {
        System.out.println("Apollo is landing on the moon.");
    }

    @Override
    public void couple() {
        System.out.println("The Apollo docked to the Saturn V rocket.");
    }

    @Override
    public void uncouple() {
        System.out.println("Apollo undocked from Saturn V rocket.");
    }

    @Override
    public String descriptionShip() {
        return "Ship Name: " + this.name
                + "\nType of fuel: " + this.typeOfFuel
                + "\nYear of launch: " + this.yearOfLaunch
                + "\nCountry of origin: " + this.countryOfOrigin
                + "\nType of ship: " + this.typeOfShip;
    }
}
