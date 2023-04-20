package Patterns;

public class HallowRectangle {
    public static void main(String args[]){
        //Outer Loop
        for(int i=1;i<5;i++){
            // inner loop
            for (int j=1;j<5;j++){
                if(i==1 || j == 1 || i == 4 || j ==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
