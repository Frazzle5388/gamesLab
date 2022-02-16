import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NedTest {
    Ned ned;
    Pensioner pensioner;
    Buckfast buckfast;
    BadChat badChat;
    Egg egg;
    DramGlassToTheHeid dramGlassToTheHeid;
    ArrayList<Weapon> pensionersWeapons;
    ArrayList<Weapon> nedsWeapons;

    @Before
    public void before(){


        buckfast = new Buckfast("Bucky", 25);
        egg = new Egg("Egg", 10);
        badChat = new BadChat("When I was your age...", 50);
        dramGlassToTheHeid = new DramGlassToTheHeid("Dram glass", 40);
        pensionersWeapons = new ArrayList<>();
        pensionersWeapons.add(badChat);
        pensionersWeapons.add(dramGlassToTheHeid);
        nedsWeapons = new ArrayList<>();
        nedsWeapons.add(buckfast);
        nedsWeapons.add(egg);
        ned = new Ned("Disco", 100, buckfast, nedsWeapons);
        pensioner = new Pensioner("Auld Jimmy", 30, badChat, pensionersWeapons);

    }

    @Test
    public void nedCanAttackPensioner(){
        ned.causeDamage(buckfast, pensioner);
        assertEquals(5, pensioner.getHealth());
    }

    @Test
    public void nedCanHeal(){
        pensioner.causeDamage(badChat, ned);
        ned.heal(buckfast);
        assertEquals(75, ned.getHealth());
    }

    @Test
    public void canSwitchWeaponAndHeal(){
        pensioner.causeDamage(pensioner.currentWeapon, ned);
        ned.heal(ned.currentWeapon);
        pensioner.switchCurrentWeapon(1);
        pensioner.causeDamage(pensioner.currentWeapon, ned);
        assertEquals(35, ned.getHealth());

    }

}
