package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassageParValeurSurTableau {
    public static void main(String[] args) {

        List<String> strings= Arrays.asList("q","u","e","r","t","y");

        List<String> stringOne= new ArrayList<>();
        stringOne.addAll(Arrays.asList("q","u","e","r","t","y"));

        //Asignation
        System.out.println("***********Assignation a un tableau*************");
        System.out.println("strings step 1 "+strings);
        stringsAssigment(strings);
        System.out.println("strings step 2 "+strings);

        //update List
        System.out.println("***********Update a List*************");
        System.out.println("strings step 1 "+stringOne);
        stringsUpdate(stringOne);
        System.out.println("strings step 2 "+stringOne);

    }

    //This method assign list
    public static void stringsAssigment(List<String> stringOne){
        stringOne= Arrays.asList("a","z","e","r","t","y");
        System.out.println("Inside method after assigment List "+stringOne);
    }

    //This method update list
    public static void stringsUpdate(List<String> stringOne){
        stringOne.add("*");
        System.out.println("Inside method after update List "+stringOne);
    }
}
