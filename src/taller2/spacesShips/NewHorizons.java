package taller2.spacesShips;

import taller2.interfaces.IUnmannedShip;
import taller2.abstractClass.SpaceVehicle;

import javax.swing.*;

/**
 *Class that refers to a spaceship called New Horizons, extends the abstract class SpaceVehicle and implements functionalities of the spaceship Unmanned interface.
 */
public class NewHorizons extends SpaceVehicle implements IUnmannedShip {

    /**
     * Constructor that assigns the value of the attributes that are of the abstract class SpaceVehicle
     */
    public NewHorizons() {
        this("New Horizon", "Liquid fuel: N2H4(Hydrazine)", "2006", "EE.UU", "Unmanned");
    }

    /**
     * Constructor that refers to the attributes of the abstract class SpaceVehicle.
     * @param name Refers to the name attribute to be assigned to the instance of the NewHorizons class.
     * @param typeOfFuel Refers to the typeOfFuel attribute to be assigned to the instance of the NewHorizons class.
     * @param yearOfLaunch Refers to the yearOfLaunch attribute to be assigned to the instance of the NewHorizons class.
     * @param countryOfOrigin Refers to the countryOfOrigin attribute to be assigned to the instance of the NewHorizons class.
     * @param typeOfShip Refers to the typeOfShip attribute to be assigned to the instance of the NewHorizons class.
     */
    private NewHorizons(String name, String typeOfFuel, String yearOfLaunch, String countryOfOrigin, String typeOfShip) {
        super(name, typeOfFuel, yearOfLaunch, countryOfOrigin, typeOfShip);
    }

    /**
     * Class that references the accelerate method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void accelerate() {
        JOptionPane.showMessageDialog(null, "Starting the acceleration, this considerably reduces the life of the ship, it is recommended to use the gravitational assistance of the planets.");
    }

    /**
     * Class that references the launchShip method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void launchShip() {
        JOptionPane.showMessageDialog(null, "Successful coupling");
        JOptionPane.showMessageDialog(null,"The launch spaceship has lifted off.");
        JOptionPane.showMessageDialog(null,"The spaceship has reached orbit.");
        JOptionPane.showMessageDialog(null,"Ready to undock from the launch spaceship.");
    }

    /**
     * Class that references the landing method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void landing() {
        JOptionPane.showMessageDialog(null, "New Horizons is not designed to land, so this option will only be used when it wants to be destroyed.");
    }

    /**
     * Class that references the couple method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void couple() {
        JOptionPane.showMessageDialog(null, "Docking to the launching ship.");
    }

    /**
     * Class that references the uncouple method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void uncouple() {
        JOptionPane.showMessageDialog(null,"Undocking from the launch ship.");
        JOptionPane.showMessageDialog(null,"Completed");
    }

    /**
     * Class that references the descriptionShip method of the abstract class SpaceVehicle and is overridden.
     */
    @Override
    public String descriptionShip() {
        return "Ship Name: " + this.name
                + "\nType of fuel: " + this.typeOfFuel
                + "\nYear of launch: " + this.yearOfLaunch
                + "\nCountry of origin: " + this.countryOfOrigin
                + "\nType of ship: " + this.typeOfShip;
    }

    /**
     * Class that references the dropCargo method of the IUnmannedShip interface and is overridden
     */
    @Override
    public void assignMission() {
        JOptionPane.showMessageDialog(null,"Its destination will be the dwarf planet Pluto.");
    }
}
