package aufgaben.rekursion;

public class Rekursion {

    int[] hofbuffer;

    public static void main(String[] args) {
        System.out.println(new Rekursion().hof(1000));
    }

    /**
     * Berechnung der Höhe eines DINAn Blattes
     * @param n
     * @return
     */
    public static double din(int n){
        if(n==0){
            return (Math.sqrt(2/Math.sqrt(2)));
        }
        return (din(n-1)/Math.sqrt(2));
    }


    public static double wachstum(int n) {
        double k = 2;
        if (n == 0) {
            return 0.2;
        }
        double cache = wachstum(n -1);
        return (k*cache*(1-cache));
    }

    public static int fib(int n){
        if(n<=1){
            return 1;
        }
        return (fib(n-1)+fib(-2));
    }

    public int hof(int n){

        if(hofbuffer!=null && n<hofbuffer.length){
            return hofbuffer[n];
        }

        hofbuffer = new int[n+3];
        hofbuffer[1] = 1;
        hofbuffer[2] = 1;
        ToFile.writeToFile(""+hofbuffer[1]);
        ToFile.writeToFile(""+hofbuffer[2]);
        if(n<=2){
            return hofbuffer[n];
        }
        for(int i = 3; i <=n;i++){

            hofbuffer[i] = hofbuffer[i-hofbuffer[i-1]]+hofbuffer[i-hofbuffer[i-2]];
            ToFile.writeToFile(""+hofbuffer[i]);
        }
        return hofbuffer[n];
    }

    public int[] getHofbuffer() {
        return hofbuffer;
    }
}
