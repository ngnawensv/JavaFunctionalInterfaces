package functionalInterfaces;

import java.util.function.Function;
// Function<T,R>: Represents a function that accepts one argument and produces a result.
public class _Function {
    public static void main(String[] args) {
        //without Function<T,R>
        System.out.println(numberPlus1(1));
        System.out.println(multiplyBy10(2));
        System.out.println(incrementByOneAndMultiplyByTen(2));

        //With Function<T,R>
        System.out.println(numberPlus1Function.apply(1));
        System.out.println(multiplyBy10Function.apply(2));
        System.out.println(incrementByOneAndMultiplyByTenFunction.apply(2));
        System.out.println(numberPlus1Function.andThen(multiplyBy10Function).apply(2));
    }

    //without Function<T,R>
    static public  int numberPlus1(int number){
        return number+1;
    }
    static public  int multiplyBy10(int number){
        return number*10;
    }

    static public  int incrementByOneAndMultiplyByTen(int number){
        return (number + 1) * 10;
    }

    //With Function<T,R> :Represents a function that accepts one argument and produces a result.
    static Function<Integer,Integer> numberPlus1Function = number->number+1;
    static Function<Integer,Integer> multiplyBy10Function = number->number*10;
    static Function<Integer,Integer> incrementByOneAndMultiplyByTenFunction = number->(number + 1) * 10;

}
