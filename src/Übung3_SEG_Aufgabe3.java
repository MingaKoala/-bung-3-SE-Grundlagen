public class Übung3_SEG_Aufgabe3 {
    public static void main(String[] args) {

        for (int i=1; i<4; i+=2)
        // schleife wird durch i+=2 jedes mal um 2 erhöht somit wird sie 2 mal aufgerufen
        {
            printName();
        }
        int i= 0;
        while (i<5){
            printName();
            printAge(24+i);

            i++;
        }
    }
    public static void printName()
    {
        System.out.println("Bene");
    }
    public static int printAge(int age){
        System.out.println("Alter " +age);
        return age;
    }
}
