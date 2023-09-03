package threads;

public class Pet {
    public static void main(String[] args){
        int n=1;
        int N=10;
        for(int i=1;i<=N;i++){
            if(n%3== 0){
                System.out.println("Cat");
                n++;
            }else {
                System.out.println("Dog");
                n++;
            }
        }



    }
}
