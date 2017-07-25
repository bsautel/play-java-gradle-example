package people;

import org.junit.Test;
import com.google.common.collect.ImmutableList;
import static org.assertj.core.api.Assertions.assertThat;

public class PeopleTest {
	@Test
    public void shouldReturnPeople() {
	People people = new People();

	ImmutableList<String> result = people.getPeople();

	assertThat(result).containsExactly("Bob", "Alice");
    }
}

