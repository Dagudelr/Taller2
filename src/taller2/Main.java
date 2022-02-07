package taller2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SpaceShip1 saturnV = new SpaceShip1();
        SpaceShip2 newHorizon = new SpaceShip2();
        SpaceShip3 apolo = new SpaceShip3();
        SpaceShip4 arianeV = new SpaceShip4();

        String answer;
        Boolean option = false;
        Integer optionNumber = 0;
        Boolean optionExit = false;

        while (!option) {
            try {
                JOptionPane.showMessageDialog(null, "Welcome to the Spacecraft Information Module");
                answer = JOptionPane.showInputDialog("Want to get started? \n1.Yes. \n2.Exit now");
                optionNumber = Integer.valueOf(answer);
                if (optionNumber == 1) {
                    option = true;
                } else if (optionNumber == 2) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong choice.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"You can only enter 1 or 2.");
            }
        }
        do {
            try {
                answer = JOptionPane.showInputDialog("What type of spaceships do you want information about? \n1.cargo spaceships. \n2.unmanned spaceships. \n3.manned spaceships");
                optionNumber = Integer.valueOf(answer);
                if (optionNumber == 1) {
                    answer = JOptionPane.showInputDialog("About which cargo spaceship would you like information? \n1.Saturn V \n2.Ariane V.");
                    optionNumber = Integer.valueOf(answer);
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
                            break;

                        case 2:
                            JOptionPane.showMessageDialog(null, "This is the Saturn V information");
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
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Wrong choice.");
                    }
                    do {
                        try {
                            answer = JOptionPane.showInputDialog("What do you want to do? \n1.Reset menu. \n2.Exit the game.");
                            optionNumber = Integer.valueOf(answer);
                            switch (optionNumber) {
                                case 1:
                                    option = true;
                                    optionExit = false;
                                    break;
                                case 2:
                                    option = false;
                                    optionExit = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Wrong choice.");
                                    optionExit = true;
                            }
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "You can only enter 1 or 2.");
                            optionExit = true;
                        }
                    }while (optionExit);


                } else if (optionNumber == 2) {
                    do {
                        try {
                            answer = JOptionPane.showInputDialog("What do you want to do? \n1.Reset menu. \n2.Exit the game.");
                            optionNumber = Integer.valueOf(answer);
                            switch (optionNumber) {
                                case 1:
                                    option = true;
                                    optionExit = false;
                                    break;
                                case 2:
                                    option = false;
                                    optionExit = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Wrong choice.");
                                    optionExit = true;
                            }
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "You can only enter 1 or 2.");
                            optionExit = true;
                        }
                    }while (optionExit);
                } else if (optionNumber == 3) {
                    do {
                        try {
                            answer = JOptionPane.showInputDialog("What do you want to do? \n1.Reset menu. \n2.Exit the game.");
                            optionNumber = Integer.valueOf(answer);
                            switch (optionNumber) {
                                case 1:
                                    option = true;
                                    optionExit = false;
                                    break;
                                case 2:
                                    option = false;
                                    optionExit = false;
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Wrong choice.");
                                    optionExit = true;
                            }
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "You can only enter 1 or 2.");
                            optionExit = true;
                        }
                    }while (optionExit);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong choice.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You can only enter 1, 2 or 3.");
            }
        }while (option);
    }
}
