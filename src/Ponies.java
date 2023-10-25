public class Ponies {
    public Ponies(boolean hasHorn, int ponyNumber){
        if(hasHorn) {
            System.out.println("Pony #" + ponyNumber + " is a unicorn");
        } else {
            System.out.println("Pony #" + ponyNumber + " is not a unicorn");
        }
    }
    public static void main(String[] args) {
        for(int x = 1;x<=100;x++) {
            if (Math.random() >=0.5){
                new Ponies(true,x);
            } else {
                new Ponies(false,x);
            }
        }
    }
}
