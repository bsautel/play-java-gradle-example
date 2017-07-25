package hello;

import people.People;
import static java.util.stream.Collectors.joining;

public class Hello {
    private final People people = new People();

    public String buildHelloMessage(){
        return "Hello " + people.getPeople().stream().collect(joining(" and "));
    }
}

