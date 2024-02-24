
// This is both a Product and contains Products
// This is Composition, composing PersonalComputer of sub Products
public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }



}
