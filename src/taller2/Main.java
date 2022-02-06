package taller2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SpaceShip1 saturnV = new SpaceShip1();
        SpaceShip2 newHorizon = new SpaceShip2();
        SpaceShip3 apolo = new SpaceShip3();

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
                            JOptionPane.showMessageDialog(null, "Está es la información del Saturno V");
                            JOptionPane.showMessageDialog(null, saturnV.descriptionShip());
                            JOptionPane.showMessageDialog(null, "Vamos a cargar la nave");
                            saturnV.transportCargo();
                            JOptionPane.showMessageDialog(null, "Vamos a despegar, ¡ahora!");
                            saturnV.launchShip();
                            JOptionPane.showMessageDialog(null, "iniciaremos la aceleración de la nave");
                            saturnV.accelerate();
                            JOptionPane.showMessageDialog(null, "Listo para soltar la carga");
                            saturnV.dropCargo();
                            JOptionPane.showMessageDialog(null, "Lamentablemente la nave no puede aterrizar.");
                            saturnV.landing();
                            break;

                        case 2:


                        default:
                            JOptionPane.showMessageDialog(null, "Opción invalida");
                    }
                    do {
                        try {
                            answer = JOptionPane.showInputDialog("¿Qué deseas hacer? \n1.Reiniciar menú. \n2.Salir del juego.");
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
                                    JOptionPane.showMessageDialog(null, "Opción erronea");
                                    optionExit = true;
                            }
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Solo puedes ingresar 1 o 2");
                            optionExit = true;
                        }
                    }while (optionExit);


                } else if (optionNumber == 2) {
                    do {
                        try {
                            answer = JOptionPane.showInputDialog("¿Qué deseas hacer? \n1.Reiniciar menú. \n2.Salir del juego.");
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
                                    JOptionPane.showMessageDialog(null, "Opción erronea");
                                    optionExit = true;
                            }
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Solo puedes ingresar 1 o 2");
                            optionExit = true;
                        }
                    }while (optionExit);
                } else if (optionNumber == 3) {
                    do {
                        try {
                            answer = JOptionPane.showInputDialog("¿Qué deseas hacer? \n1.Reiniciar menú. \n2.Salir del juego.");
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
                                    JOptionPane.showMessageDialog(null, "Opción erronea");
                                    optionExit = true;
                            }
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Solo puedes ingresar 1 o 2");
                            optionExit = true;
                        }
                    }while (optionExit);
                } else {
                    JOptionPane.showMessageDialog(null, "Opción erronea");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo puedes ingresar 1, 2 o 3");
            }
        }while (option);
    }
}
