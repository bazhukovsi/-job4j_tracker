package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenCollectAddress() {
        Profile profile = new Profile(new Address("Segezha", "proezd Montazhnikov", 5, 130),
                "Sergey Bazhukov");
        List<Profile> list = List.of(profile);
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(list);
        List<Address> expected = List.of(new Address("Segezha", "proezd Montazhnikov", 5, 130));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectAddressTwo() {
        Profile profile = new Profile(new Address("Segezha", "proezd Montazhnikov", 5, 130),
                "Sergey Bazhukov");
        Profile profile1 = new Profile(new Address("Segezha", "proezd Bumazhnikov", 6, 100),
                "Elena Bazhukova");
        List<Profile> list = List.of(profile, profile1);
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(list);
        List<Address> expected = List.of(new Address("Segezha", "proezd Montazhnikov", 5, 130),
                new Address("Segezha", "proezd Bumazhnikov", 6, 100));
        assertThat(rsl, is(expected));
    }
}