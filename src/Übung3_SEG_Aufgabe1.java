import javax.swing.*;

public class Übung3_SEG_Aufgabe1 {
    public static void main(String[] args) {
        String wert1 = JOptionPane.showInputDialog("Wert eingeben");

        switch(wert1){
            case"20":
                int number = Integer.parseInt(wert1) * 24;
                JOptionPane.showMessageDialog(null, number);
                break;

            case "Peter Pan":
                JOptionPane.showMessageDialog(null, "Bangarang");
                break;


            default:
                System.err.println("nothing correct");
        }

        }
    }

