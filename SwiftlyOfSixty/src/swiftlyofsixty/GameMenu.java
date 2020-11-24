package swiftlyofsixty;

import java.util.Scanner;
import static swiftlyofsixty.SwiftlyOfSixty.clearScreen;
import static swiftlyofsixty.SwiftlyOfSixty.printLogo;

public class GameMenu {

    private static int noOfPlayer;
    private int mode;
    //hgghghg
    public GameMenu(){
        
    }
    
    public int getNoOfPlayer() {
        return noOfPlayer;
    }

    public void selectPlayer() {
        Scanner s1 = new Scanner(System.in);
        clearScreen();
        printLogo();
        System.out.println("Select Player(1,2): ");
        System.out.print(">> ");
        switch (s1.nextInt()) {
            case 1:
                noOfPlayer = 1;
                selectMode();
                break;
            case 2:
                noOfPlayer = 2;
                selectMode();
                break;
            default:
                selectPlayer();
                break;
        }
    }

    public void selectMode() {
        Scanner s2 = new Scanner(System.in);
        Vocabulary word = new Vocabulary();
        clearScreen();
        printLogo();
        System.out.println("Select Mode(1,2,3): ");
        System.out.println("\t1.easy, 2.normal, 3.hard");
        System.out.print(">> ");
        switch (s2.nextInt()) {
            case 1:
                word.modeWord(1);
                break;
            case 2:
                word.modeWord(2);
                break;
            case 3:
                word.modeWord(3);
                break;
            default:
                selectMode();
                break;
        }

    }
}
