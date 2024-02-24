public class Main {
    public static void main(String[] args) {

    }

    public class Product{
        private String model;
        private String manufacturer;
        private int width;
        private int height;
        private int depth;

        public Product(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }
    }


    class Monitor extends Product {
        public Monitor(String model, String manufacturer) {
            super(model, manufacturer);
        }
    }

    class Motherboard extends Product {
        private int ramSlots;
        private int cardSlots;
        private String bios;

        public Motherboard(String model, String manufacturer) {
            super(model, manufacturer);
        }

        public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
            super(model, manufacturer);
            this.ramSlots = ramSlots;
            this.cardSlots = cardSlots;
            this.bios = bios;
        }

        public void loadProgram(String programName){
            System.out.printf("Program %s \n is now loading...", programName);
        }
    }


    class ComputerCase extends Product {
        public Monitor(String model, String manufacturer) {
            super(model, manufacturer);
        }
    }

}