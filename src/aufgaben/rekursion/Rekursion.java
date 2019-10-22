package aufgaben.rekursion;

import java.util.Arrays;

public class Rekursion {

    int[] hofbuffer;

    public static void main(String[] args) {
        //System.out.println(pascalDreieck(30,12));

        int[] i = {12, 23, 33};
        int[] b = sortieren(i);

        for(int x = 0; x<i.length;x++){
            System.out.println(b[x]);
        }
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

    public static int pascalDreieck(int i, int j){
        System.out.println("Zeile \t"+ i + " Spalte \t" + j);
        if(j > i || i <0){
            return -1;
        }
        if( j == 1 || i == j){
            return 1;
        }
        return (pascalDreieck(i - 1, j - 1) + pascalDreieck(i - 1, j));
    }


    public static int[] sortieren(int[] i){
        boolean b = true;
        int y = 0;
        while(y < i.length-1){
            if(i[y]>i[y+1]){
                b = false;
                break;
            }
            y++;
        }
        if(b){
            System.out.println("Sortiert");
            return i;
        }else{
            int cache = i[y];
            i[y] = i[y+1];
            i[y+1] = cache;
            return sortieren(i);
        }

    }

}
