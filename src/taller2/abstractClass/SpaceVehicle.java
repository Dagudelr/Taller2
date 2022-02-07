package taller2.abstractClass;

/**
 * It is an abstract class that refers to the SpaceVehicle and is considered the superclass.
 */
abstract public class SpaceVehicle {

    /**
     * Protected attribute referring to the name of the SpaceVehicle.
     */
    protected String name;
    /**
     * Protected attribute referring to the typeOfFuel of the SpaceVehicle.
     */
    protected String typeOfFuel;
    /**
     * Protected attribute referring to the yearOfLaunch of the SpaceVehicle.
     */
    protected String yearOfLaunch;
    /**
     * Protected attribute referring to the countryOfOrigin of the SpaceVehicle.
     */
    protected String countryOfOrigin;
    /**
     * Protected attribute referring to the typeOfShip of the SpaceVehicle.
     */
    protected String typeOfShip;

    /**
     * It refers to the constructor of the abstract class that helps to initialize the attributes of the class.
     * @param name Initializes the name attribute.
     * @param typeOfFuel Initializes the typeOfFuel attribute.
     * @param yearOfLaunch Initializes the yearOfLaunch attribute.
     * @param countryOfOrigin Initializes the countryOfOrigin attribute.
     * @param typeOfShip Initializes the typeOfShip attribute.
     */
    public SpaceVehicle(String name, String typeOfFuel, String yearOfLaunch, String countryOfOrigin, String typeOfShip) {
        this.name = name;
        this.typeOfFuel = typeOfFuel;
        this.yearOfLaunch = yearOfLaunch;
        this.countryOfOrigin = countryOfOrigin;
        this.typeOfShip = typeOfShip;
    }

    /**
     * Refers to an abstract method that you are obliged to use if you extend the abstract class. It serves to speed up the spaceship.
     */
    abstract public void accelerate();

    /**
     * Refers to an abstract method that you are obliged to use if you extend the abstract class. It is used to launch the spaceship.
     */
    abstract public void launchShip();

    /**
     * Refers to an abstract method that you are obliged to use if you extend the abstract class. It is used to land the spaceship.
     */
    abstract public void landing();

    /**
     * Refers to an abstract method that you are obliged to use if you extend the abstract class. It is used to couple the spaceship.
     */
    abstract public void couple();

    /**
     * Refers to an abstract method that you are obliged to use if you extend the abstract class. It serves to decouple the spaceship.
     */
    abstract public void uncouple();

    /**
     * Refers to an abstract method that you are obliged to use if you extend the abstract class. It serves to give information about the spaceship.
     * @return the description of the spaceship.
     */
    abstract public String descriptionShip();
}
