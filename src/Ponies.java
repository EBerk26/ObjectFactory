public class Ponies {
        boolean hasHorn;
        double hornLength;
        boolean hasWings;
        String name;
        int number;
        public  Ponies(boolean phasHorn, double phornLength, boolean phasWings, String pname, int pnumber){
                hasHorn = phasHorn;
                hornLength = phornLength;
                hasWings = phasWings;
                name = pname;
                number = pnumber;
        }
        public Ponies(){
                hasHorn = false;
                hornLength = 0;
                hasWings = false;
                name = "";
                number = 1;
        }
        public void describePony(){
                String UnicornDescription;
                if(hasHorn){
                        UnicornDescription = ("is a unicorn and has a horn length of "+ hornLength+" inches");
                } else {
                        UnicornDescription = "is not a unicorn";
                }
                String PegasusDescription;
                if(hasWings){
                        PegasusDescription = "is a pegasus";
                } else {
                        PegasusDescription = "is not a pegasus";
                }
                System.out.println("#" + number + ": " + name + " the pony " + UnicornDescription + ". " + name + " "+PegasusDescription + ".");
                if(hasHorn && hasWings && hornLength == 10){
                        System.out.println(name + " is a perfect pony!");
                }
        }

}