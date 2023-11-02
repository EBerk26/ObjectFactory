public class Main {
    public static int RandInt(int LowerBound, int UpperBound){
        return(int)(Math.random()*(UpperBound-LowerBound+1)+LowerBound);
    }
    public static void describeRandomPony(int ponyNumber){
        Ponies RandomPony= new Ponies();
        RandomPony.hasHorn = Math.random()<=0.4;
        RandomPony.hasWings = Math.random()<=0.25;
        RandomPony.hornLength = (double)(RandInt(1,100))/10;
        String[] NameLibrary = new String[14];
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
        NameLibrary[11] = "Sunshine";
        NameLibrary[12] = "Peanut";
        NameLibrary[13] = "Daisy";
        RandomPony.name = NameLibrary[RandInt(0,13)];
        RandomPony.number = ponyNumber;
        RandomPony.describePony();
    }
    public static void main(String[] args) {
        for(int x =1; x<=10;x++) {
            describeRandomPony(x);
        }
        System.out.println("-----------------------------------");
        Ponies p = new Ponies(true,10, true, "Fido", 11);
        p.describePony();
    }
}