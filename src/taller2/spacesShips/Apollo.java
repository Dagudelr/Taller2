package taller2.spacesShips;

import taller2.interfaces.IMannedShip;
import taller2.abstractClass.SpaceVehicle;

import javax.swing.*;

/**
 *Class that refers to a spaceship called Apollo, extends the abstract class SpaceVehicle and implements functionalities of the spaceship IMannedShip interface.
 */
public class Apollo extends SpaceVehicle implements IMannedShip {
    /**
     * It refers to an attribute of the class that is a list of strings that receives 3 elements that are the names of the crew members of the spaceship.
     */
    private String[] crew = new String[3];

    /**
     * Constructor that assigns the value of the attributes that are of the abstract class SpaceVehicle
     */
    public Apollo() {
        this("Apollo", "Liquid fuel: NO4+UDMH", "1966", "EE.UU", "manned");
    }

    /**
     * Constructor that refers to the attributes of the abstract class SpaceVehicle.
     * @param name Refers to the name attribute to be assigned to the instance of the Apollo class.
     * @param typeOfFuel Refers to the typeOfFuel attribute to be assigned to the instance of the Apollo class.
     * @param yearOfLaunch Refers to the yearOfLaunch attribute to be assigned to the instance of the Apollo class.
     * @param countryOfOrigin Refers to the countryOfOrigin attribute to be assigned to the instance of the Apollo class.
     * @param typeOfShip Refers to the typeOfShip attribute to be assigned to the instance of the Apollo class.
     */
    public Apollo(String name, String typeOfFuel, String yearOfLaunch, String countryOfOrigin, String typeOfShip) {
        super(name, typeOfFuel, yearOfLaunch, countryOfOrigin, typeOfShip);
    }
    /**
     * Class that refers to the showCrew method of the IMannedShip interface and is overridden.
     */
    @Override
    public void showCrew() {
        this.crew[0] = "Neil Armstrong";
        this.crew[1] = "Michael Collins";
        this.crew[2] = "Buzz Aldrin";

        for(String name: this.crew){
            JOptionPane.showMessageDialog(null, name);
        };
    }

    /**
     * Class that references the accelerate method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void accelerate() {
        JOptionPane.showMessageDialog(null, "The space ship is accelerating toward the moon.");
        JOptionPane.showMessageDialog(null, "76 hours later, Apollo reached orbit of the Moon.");
    }

    /**
     * Class that references the launchShip method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void launchShip() {
        JOptionPane.showMessageDialog(null, "The Apollo taking off from the moon.");
        JOptionPane.showMessageDialog(null, "76 hours later, Apollo reached Earth orbit.");
    }

    /**
     * Class that references the landing method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void landing() {
        JOptionPane.showMessageDialog(null, "Apollo is landing on the moon.");
        JOptionPane.showMessageDialog(null, "Neil Armstrong: It's a small step for one man, but a giant leap for mankind.");
    }

    /**
     * Class that references the couple method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void couple() {
        JOptionPane.showMessageDialog(null, "The Apollo docked to the Saturn V rocket.");
        JOptionPane.showMessageDialog(null, "The Saturn V has taken off.");
        JOptionPane.showMessageDialog(null, "The Saturn V has reached orbit.");
        JOptionPane.showMessageDialog(null, "The Apollo is ready to be undocked.");
    }

    /**
     * Class that references the uncouple method of the abstract class SpaceVehicle and is overridden
     */
    @Override
    public void uncouple() {
        JOptionPane.showMessageDialog(null, "Apollo undocked from Saturn V rocket.");
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
}
