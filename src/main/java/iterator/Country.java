package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Country implements Iterable<People>{

    private final List<People> people;

    public Country(People... people) {
        this.people = Arrays.asList(people);
    }

    @Override
    public Iterator<People> iterator() {
        return people.iterator();
    }
}
