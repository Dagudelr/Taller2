package taller2.spacesShips;

import taller2.interfaces.ILaunchShip;
import taller2.abstractClass.SpaceVehicle;

import javax.swing.*;

/**
 *Class that refers to a spaceship called Saturn v, extends the abstract class SpaceVehicle and implements functionalities of the spaceship launcher interface.
 */
public class SaturnV extends SpaceVehicle implements ILaunchShip {

    /**
     * Constructor that assigns the value of the attributes that are of the abstract class SpaceVehicle
     */
    public SaturnV() {
        this("Saturn V", "Liquid fuel: H(Liq) + O(Liq)", "1967", "EE.UU", "launch");
    }

    /**
     * Constructor that refers to the attributes of the abstract class SpaceVehicle.
     * @param name Refers to the name attribute to be assigned to the instance of the SaturnV class.
     * @param typeOfFuel Refers to the typeOfFuel attribute to be assigned to the instance of the SaturnV class.
     * @param yearOfLaunch Refers to the yearOfLaunch attribute to be assigned to the instance of the SaturnV class.
     * @param countryOfOrigin Refers to the countryOfOrigin attribute to be assigned to the instance of the SaturnV class.
     * @param typeOfShip Refers to the typeOfShip attribute to be assigned to the instance of the SaturnV class.
     */
    public SaturnV(String name, String typeOfFuel, String yearOfLaunch, String countryOfOrigin, String typeOfShip){
        super(name, typeOfFuel, yearOfLaunch, countryOfOrigin, typeOfShip);

    }

    /**
     * Class that references the accelerate method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void accelerate() {
        JOptionPane.showMessageDialog(null, "The ship is accelerating");
        JOptionPane.showMessageDialog(null, "We arrived at the Earth's orbit.");
    }

    /**
     * Class that references the launchShip method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void launchShip() {
        JOptionPane.showMessageDialog(null,"The Saturn V has just been launched from Earth.");
    }

    /**
     * Class that references the landing method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void landing() {
        JOptionPane.showMessageDialog(null, "The Saturn V is a launch spacecraft, it cannot land.");
        JOptionPane.showMessageDialog(null, "The spacecraft will be scrapped.");
    }

    /**
     * Class that references the couple method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void couple() {
        JOptionPane.showMessageDialog(null, "It is not possible to dock a transport ship. Since they are the ones that leave the planet.");
    }

    /**
     * Class that references the uncouple method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void uncouple() {
        JOptionPane.showMessageDialog(null, "You cannot disengage a launcher by simply dropping the payload.");
    }

    /**
     * Class that refers to the transportCargo method of the IlaunchShip interface and is overridden.
     */
    @Override
    public void transportCargo() {
        JOptionPane.showMessageDialog(null,"Coupling the cargo.");
        JOptionPane.showMessageDialog(null,"Completed");
    }

    /**
     * Class that references the dropCargo method of the IlaunchShip interface and is overridden
     */
    @Override
    public void dropCargo() {
        JOptionPane.showMessageDialog(null,"Releasing the cargo.");
        JOptionPane.showMessageDialog(null,"Completed");
    }

    /**
     * Class that references the descriptionShip method of the abstract class SpaceVehicle and is overridden.
     */
    @Override
    public String descriptionShip(){
        return "Ship Name: " + this.name
                + "\nType of fuel: " + this.typeOfFuel
                + "\nYear of launch: " + this.yearOfLaunch
                + "\nCountry of origin: " + this.countryOfOrigin
                + "\nType of ship: " + this.typeOfShip;
    }
}
