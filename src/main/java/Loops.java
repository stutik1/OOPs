public class Loops {
    public static void main(String[] args){
        // For Loop
        for(int i=1;i<=100;i++)
            System.out.println(i);

        System.out.println("Descending Order");
        for(int i=100;i>=1;i--)
            System.out.println(i);

        // While Loops

        int j=100;
        while (j>=1){
            System.out.println(j);
            j=j-1;
        }

        // Do While Loop
        int k= 100;
        do{
            System.out.println(k);
            k=k-1;
        }while (k>=1);
    }
}
