public class Main {
    public static void main(String[] args) {

        // We built this PC by passing objects to the constructor, like assembling the computer.

        // Now we'll hide functionality further, we don't want the calling program to access the parts directly.
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // Now we've *Composed* the PC
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        thePC.getMonitor().drawPixelAt(10, 10, "red");
        thePC.getMotherboard().loadProgram("Windows OS");
        thePC.getComputerCase().powerButton();

    }
}
