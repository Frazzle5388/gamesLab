import org.junit.Before;
import org.junit.Test;

public class NedTest {
    Ned ned;
    Pensioner pensioner;
    Buckfast buckfast;
    BadChat badChat;

    @Before
    public void before(){
        ned = new Ned("Disco", 100);
        pensioner = new Pensioner("Auld Jimmy", 30);
        buckfast = new Buckfast("Bucky", 25);
        badChat = new BadChat("When I was your age...", 50);
    }

    @Test
    public void pensionerCanAttackNed(){
        ned.causeDamage(buckfast, pensioner);

    }

}
