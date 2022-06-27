public class FibonnaciSeries {
    public static void main (String[] args){

    // la suma de los primeros dos numeros mas un tercero
        int n1=0, n2=1, next=0;

        System.out.println("\n"+" "+n1+" "+"\n"+" "+n2);
        
        for (int i=0; i< 10; i++){
            next=n1+n2;
            System.out.println(" "+next);
            n1=n2;
            n2=next;           
        }
    }
}

