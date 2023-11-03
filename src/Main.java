public class Main {
    public static int RandInt(int LowerBound, int UpperBound){
        return(int)(Math.random()*(UpperBound-LowerBound+1)+LowerBound);
    }
    public static void describeRandomPony(int ponyNumber){
        Ponies RandomPony= new Ponies();
        RandomPony.hasHorn = Math.random()<=0.4;
        RandomPony.hasWings = Math.random()<=0.25;
        RandomPony.hornLength = (double)(RandInt(1,100))/10;
        String[] NameLibrary = new String[7];
        NameLibrary[0] = RandomNameGenerator.RandomName();
        NameLibrary[1] = RandomNameGenerator.RandomName();
        NameLibrary[2] = "Sparkles";
        NameLibrary[3] = "Fluffy";
        NameLibrary[4] = "Sunshine";
        NameLibrary[5] = "Peanut";
        NameLibrary[6] = "Daisy";
        RandomPony.name = NameLibrary[RandInt(0,6)];
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