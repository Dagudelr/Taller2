package taller2;

import taller2.interfaces.ILaunchShip;
import taller2.spaceVehicle.SpaceVehicle;

import javax.swing.*;

public class SpaceShip4 extends SpaceVehicle implements ILaunchShip {

    public SpaceShip4() {
        this("Ariane V", "Solid fuel + liquid fuel H(Liq) + O(Liq)", "1996", "European Union", "launch");
    }

    public SpaceShip4(String name, String typeOfFuel, String yearOfLaunch, String countryOfOrigin, String typeOfShip) {
        super(name, typeOfFuel, yearOfLaunch, countryOfOrigin, typeOfShip);
    }

    @Override
    public void transportCargo() {
        JOptionPane.showMessageDialog(null, "Docking of a satellite in orbit.");
        JOptionPane.showMessageDialog(null,"Completed");
    }

    @Override
    public void dropCargo() {
        JOptionPane.showMessageDialog(null,"Unlock the satellite");
        JOptionPane.showMessageDialog(null,"Completed");
    }

    @Override
    public void accelerate() {
        JOptionPane.showMessageDialog(null, "The ship is accelerating");
        JOptionPane.showMessageDialog(null, "We arrived at the Earth's orbit.");
    }

    @Override
    public void launchShip() {
        JOptionPane.showMessageDialog(null,"The Ariane V has just been launched from Earth.");
    }

    @Override
    public void landing() {
        JOptionPane.showMessageDialog(null, "The Ariane V is a launch spaceship, it cannot land.");
        JOptionPane.showMessageDialog(null, "The spaceship will be discarded in the ocean.");
    }

    @Override
    public void couple() {
        JOptionPane.showMessageDialog(null, "It is not possible to dock a transport ship. Since they are the ones that leave the planet.");
    }

    @Override
    public void uncouple() {
        JOptionPane.showMessageDialog(null, "You cannot disengage a launcher by simply dropping the payload.");
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
