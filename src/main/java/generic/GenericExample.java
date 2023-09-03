package generic;

import java.math.BigDecimal;

class Student<T extends Number,S extends Object>{
    private T score;
    private S name;


    public Student(T score) {
        this.score = score;
    }
    public Student(T score,S name) {
        this.score = score;
        this.name = name;
    }

    public T getScore(){
        return score;
    }
    public void setScore(T score){
        this.score = score;
    }

    public S getName(){
        return name;
    }

    public void setName(S name){
        this.name=name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "score=" + score + "name="+ name +
                '}';
    }
}
public class GenericExample {
    public static void main(String[] args){
        Student<Integer,String> megha = new Student<>(55,"Megha");
        Student<Double,Object> guru = new Student<>(50.5);

        Student<BigDecimal,Object> stuti = new Student<>(new BigDecimal("445678934567"));
        System.out.println(megha);
        System.out.println(guru);
        System.out.println(stuti);
    }
}
