package OOPS;

public class Students extends User {
    int id ;
    String name ;

    @Override
    public String getAddress(){
        return "Banasthali";
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj==null){
            return false;
        }
        if (getClass()!= obj.getClass() ){
            return false;
        }
        Students students=(Students) obj;
        if (this.id == students.id && this.name == students.name   ){
            return true;
        }
        return false;
}

}

