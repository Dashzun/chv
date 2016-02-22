import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ TestBuilder.class, TestCache.class, TestMain.class,
		TestParser.class, TestPathFinder.class, TestWordValidater.class })
public class AllTests {

}
