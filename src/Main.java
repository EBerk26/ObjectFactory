public class Main {
    public static int RandInt(int LowerBound, int UpperBound){
        return(int)(Math.random()*(UpperBound-LowerBound+1)+LowerBound);
    }
    public static void describeRandomPony(int ponyNumber){
        Ponies RandomPony= new Ponies();
        RandomPony.hasHorn = Math.random()<=0.4;
        RandomPony.hasWings = Math.random()<=0.25;
        RandomPony.hornLength = (double)(RandInt(1,100))/10;
        String[] NameLibrary = new String[11];
        NameLibrary[0] = "Eli";
        NameLibrary[1] = "Teddy";
        NameLibrary[2] = "Gabe";
        NameLibrary[3] = "Ava";
        NameLibrary[4] = "Mx. Bradford";
        NameLibrary[5] = "Finn";
        NameLibrary[6] = "Pati";
        NameLibrary[7] = "Rae";
        NameLibrary[8] = "Claire";
        NameLibrary[9] = "Sparkles";
        NameLibrary[10] = "Fluffy";
        RandomPony.name = NameLibrary[RandInt(0,10)];
        String UnicornDescription;
        if(RandomPony.hasHorn){
            UnicornDescription = ("is a unicorn and has a horn length of "+ RandomPony.hornLength+" inches");
        } else {
            UnicornDescription = "is not a unicorn";
        }
        String PegasusDescription;
        if(RandomPony.hasWings){
            PegasusDescription = "is a pegasus";
        } else {
            PegasusDescription = "is not a pegasus";
        }
        System.out.println("#" + ponyNumber + ": " + RandomPony.name + " the pony " + UnicornDescription + ". " + RandomPony.name + " "+PegasusDescription + ".");
        if(RandomPony.hasHorn && RandomPony.hasWings && RandomPony.hornLength == 10){
            System.out.println(RandomPony.name + " is a perfect pony!");
        }
    }
    public static void main(String[] args) {
        for(int x =1; x<=1000;x++) {
            describeRandomPony(x);
        }
    }
}