package passageValeurs;

public class Student {

    //Class members
    private int id;
    private String name;


    //Constructor
    public Student(){

    }
    public Student(String name){
        this.name=name;
    }


    //Setters and Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
