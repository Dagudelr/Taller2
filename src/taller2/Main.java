package taller2;

import taller2.spacesShips.Apollo;
import taller2.spacesShips.ArianeV;
import taller2.spacesShips.NewHorizons;
import taller2.spacesShips.SaturnV;

import javax.swing.*;

/**
 *Main class that allows initializing the application.
 */
public class Main {

    /**
     * Main method that allows the execution of the application.
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Instance of the SaturnoV class
         */
        SaturnV saturnV = new SaturnV();
        /**
         * Instance of the NewHorizons class
         */
        NewHorizons newHorizon = new NewHorizons();
        /**
         * Instance of the Apollo class
         */
        Apollo apollo = new Apollo();
        /**
         * Instance of the ArianeV class
         */
        ArianeV arianeV = new ArianeV();
        /**
         * Attribute that refers to the questions that are shown to the user and receives the string response.
         */
        String answer;
        /**
         * Boolean attribute that refers to the condition of the control flow.
         */
        Boolean option = false;
        /**
         * Intenger attribute that refers to the user's response converted to Intenger.
         */
        Integer optionNumber = 0;
        /**
         * Boolean attribute that refers to the control flow condition that allows exiting or restarting the application.
         */
        Boolean optionExit;
        /**
         *Enters the while control flow if the option attribute is false and exits if it is true.
         */
        while (!option) {
            /**
             * Exception control, try to execute the code.
             */

            try {
                /**
                 * Shows a message to the user.
                 */
                JOptionPane.showMessageDialog(null, "Welcome to the Spaceship Information Module");
                /**
                 * It asks the user a question and saves its answer as a string in the answer attribute.
                 */
                answer = JOptionPane.showInputDialog("Want to get started? \n1.Yes. \n2.Exit now");
                /**
                 * The answer becomes Intenger.
                 */
                optionNumber = Integer.valueOf(answer);
                /**
                 * Control flow if, performs a condition based on the user's response.
                 */
                if (optionNumber == 1) {
                    option = true;
                } else if (optionNumber == 2) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong choice.");
                }
                /**
                 * Catches the exception and displays a message.
                 */
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"You can only enter 1 or 2.");
            }

            /**
             * It enters the do-while control flow and is executed at least once. If the option attribute is true it iterates again. If it is false it terminates.
             */
            do {
                /**
                 * Exception control, try to execute the code.
                 */
                try {
                    /**
                     * It asks the user a question and saves its answer as a string in the answer attribute.
                     */
                    answer = JOptionPane.showInputDialog("What type of spaceships do you want information about? \n1.cargo spaceships. \n2.unmanned spaceships. \n3.manned spaceships");
                    /**
                     * The answer becomes Intenger.
                     */
                    optionNumber = Integer.valueOf(answer);
                    /**
                     * Control flow if, performs a condition based on the user's response.
                     */
                    if (optionNumber == 1) {
                        /**
                         *It enters the do-while control flow and is executed at least once. If the optionExit attribute is true it iterates again. If it is false it terminates.
                         */
                        do {
                            answer = JOptionPane.showInputDialog("About which cargo spaceship would you like information? \n1.Saturn V \n2.Ariane V.");
                            optionNumber = Integer.valueOf(answer);
                            /**
                             * Control flow switch, executes code based on user response.
                             */
                            switch (optionNumber) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, "This is the Saturn V information");
                                    JOptionPane.showMessageDialog(null, saturnV.descriptionShip());
                                    JOptionPane.showMessageDialog(null, "Let's load the spaceship");
                                    saturnV.transportCargo();
                                    JOptionPane.showMessageDialog(null, "Let's take off, now!");
                                    saturnV.launchShip();
                                    JOptionPane.showMessageDialog(null, "we will start the acceleration of the spaceship");
                                    saturnV.accelerate();
                                    JOptionPane.showMessageDialog(null, "Ready to drop the load");
                                    saturnV.dropCargo();
                                    JOptionPane.showMessageDialog(null, "Unfortunately, the spaceship cannot land.");
                                    saturnV.landing();
                                    optionExit = false;
                                    break;

                                case 2:
                                    JOptionPane.showMessageDialog(null, "This is the Ariane V information");
                                    JOptionPane.showMessageDialog(null, arianeV.descriptionShip());
                                    JOptionPane.showMessageDialog(null, "Let's load the spaceship");
                                    arianeV.transportCargo();
                                    JOptionPane.showMessageDialog(null, "Let's take off, now!");
                                    arianeV.launchShip();
                                    JOptionPane.showMessageDialog(null, "we will start the acceleration of the spaceship");
                                    arianeV.accelerate();
                                    JOptionPane.showMessageDialog(null, "Ready to drop the load");
                                    arianeV.dropCargo();
                                    JOptionPane.showMessageDialog(null, "Unfortunately, the spaceship cannot land.");
                                    arianeV.landing();
                                    optionExit = false;
                                    break;

                                default:
                                    JOptionPane.showMessageDialog(null, "Wrong choice.");
                                    optionExit = true;
                            }
                        }while(optionExit);

                        option = exit();
                    /**
                     * Control flow else if, performs a condition based on the user's response.
                     */
                    } else if (optionNumber == 2) {
                        JOptionPane.showMessageDialog(null, "We will give you information about the unmanned spaceship New Horizons.");
                        JOptionPane.showMessageDialog(null, newHorizon.descriptionShip());
                        JOptionPane.showMessageDialog(null, "We will give you information about the unmanned spacecraft New Horizons.");
                        newHorizon.assignMission();
                        JOptionPane.showMessageDialog(null, "Let's dock the ship ");
                        newHorizon.couple();
                        newHorizon.launchShip();
                        newHorizon.uncouple();
                        newHorizon.accelerate();
                        JOptionPane.showMessageDialog(null, "9.5 years later we arrived at Pluto. It is a historic milestone, being one of the fastest unmanned spaceship ever built by");
                        newHorizon.landing();

                        option = exit();

                    /**
                     * Control flow else if, performs a condition based on the user's response.
                     */
                    } else if (optionNumber == 3) {
                        JOptionPane.showMessageDialog(null, "We will give you information about the manned spaceship Apollo.");
                        JOptionPane.showMessageDialog(null, apollo.descriptionShip());
                        JOptionPane.showMessageDialog(null, "Meet your crew.");
                        apollo.showCrew();
                        JOptionPane.showMessageDialog(null, "Let's start the process.");
                        apollo.couple();
                        apollo.uncouple();
                        apollo.accelerate();
                        apollo.landing();
                        apollo.launchShip();

                        option = exit();

                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong choice.");
                    }
                    /**
                     * Catches the exception and displays a message.
                     */
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "You can only enter 1, 2 or 3.");
                }
            }while (!option);
        }

    }

    /**
     * Method that refers to the end of the game.
     * @return a boolean.
     */
    public static boolean exit(){
        Boolean option = false;
        Boolean optionExit;
        String answer;
        Integer optionNumber;
        do {
            /**
             * Exception control, try to execute the code.
             */
            try {
                /**
                 * It asks the user a question and saves its answer as a string in the answer attribute.
                 */
                answer = JOptionPane.showInputDialog("What do you want to do? \n1.Reset menu. \n2.Exit the game.");
                /**
                 * The answer becomes Intenger.
                 */
                optionNumber = Integer.valueOf(answer);
                /**
                 * Control flow switch, executes code based on user response.
                 */
                switch (optionNumber) {
                    case 1:
                        option = false;
                        optionExit = false;
                        break;
                    case 2:
                        option = true;
                        optionExit = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Wrong choice.");
                        optionExit = true;
                }
                /**
                 * Catches the exception and displays a message.
                 */
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "You can only enter 1 or 2.");
                optionExit = true;
            }
        }while (optionExit);
        return option;
    }

}
