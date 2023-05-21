package streams;

import pojo.Person;
import pojo.PersonResponse;
import pojo.PersonResponse1;
import pojo.PersonResponse2;
import pojo.StatusResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsAndGroupingBy {

  private static List<Person> personList =new ArrayList<>();

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      personList.add(new Person("code" + i, "name" + i, "pays" + i, "DDA", "RESERVED"));
    }
    for (int i = 0; i <= 5; i++) {
      personList.add(new Person("code" + i, "name" + i, "pays" + i, "DDA", "DRAFT"));
    }
    for (int i = 0; i <= 3; i++) {
      personList.add(new Person("code" + i, "name" + i, "pays" + i, "DDA", "ACTIVED"));
    }

    for (int i = 0; i <= 4; i++) {
      personList.add(new Person("code" + i, "name" + i, "pays" + i, "DTA", "RESERVED"));
    }
    for (int i = 0; i <= 6; i++) {
      personList.add(new Person("code" + i, "name" + i, "pays" + i, "DTA", "DRAFT"));
    }
    for (int i = 0; i <= 5; i++) {
      personList.add(new Person("code" + i, "name" + i, "pays" + i, "DTA", "FOUNDED"));
    }
    System.out.println(
        "************11111111111111111111111111111111111******************************");
    //personList.stream().forEach(person-> System.out.println(person));
    System.out.println("************222222222222222222222******************************");
    Map<String, Long> personlistGroupingAndCounting = personList.stream()
        .collect(Collectors.groupingBy(Person::getType, Collectors.counting()));
    System.out.println(personlistGroupingAndCounting);

    System.out.println(
        "************33333333333333333333333333333333******************************");
    Map<String, Map<String, Long>> personlistGroupingAndCounting1 = personList.stream().collect(
        Collectors.groupingBy(Person::getType,
            Collectors.groupingBy(Person::getStatus, Collectors.counting())));
    System.out.println(personlistGroupingAndCounting1);

    System.out.println("************44444444444444444444443******************************");
    Map<String, Map<String, Long>> personlistGroupingAndCounting2 = personList.stream().collect(
        Collectors.groupingBy(Person::getType,
            Collectors.groupingBy(Person::getStatus, Collectors.counting())));
    System.out.println(personlistGroupingAndCounting2);

    System.out.println(
        "************5555555555555555555555555555555555******************************");
    PersonResponse1 personResponse1 = new PersonResponse1();
    personlistGroupingAndCounting2.entrySet().stream().forEach(x -> {
      personResponse1.setType(x.getKey());
      personResponse1.setStatusResponse(x.getValue());
      System.out.println(personResponse1);
    });

    System.out.println(
        "***********6666666666666666666666666666666666666666666******************************");
    PersonResponse personResponse = new PersonResponse();
    StatusResponse statusResponse = new StatusResponse();
    personlistGroupingAndCounting2.entrySet().stream().forEach(x -> {
      personResponse.setType(x.getKey());
      x.getValue().entrySet().stream().forEach(y -> {
        statusResponse.setStatus(y.getKey());
        statusResponse.setStatusNumber(y.getValue());
        personResponse.setStatusResponse(statusResponse);
        System.out.println(personResponse);
      });
    });

    System.out.println(
        "***********777777777777777777777777777777777777777777******************************");
    PersonResponse2 personResponse2 = new PersonResponse2();
    personlistGroupingAndCounting2.entrySet().stream().forEach(x -> {
      personResponse2.setType(x.getKey());
      x.getValue().entrySet().stream().forEach(y -> {
        personResponse2.setStatus(y.getKey());
        personResponse2.setStatusNumber(y.getValue());
        System.out.println(personResponse2);
      });
    });
  }
}
