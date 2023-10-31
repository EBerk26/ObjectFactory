public class Ponies {
        boolean hasHorn = false;
        double hornLength = 0;
        boolean hasWings = false;
        String name = "";
        int Number = 1;
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
                System.out.println("#" + Number + ": " + name + " the pony " + UnicornDescription + ". " + name + " "+PegasusDescription + ".");
                if(hasHorn && hasWings && hornLength == 10){
                        System.out.println(name + " is a perfect pony!");
                }
        }
}