package jUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAssertArrayEquals.class, TestAssertEquals.class, TestAssertFalse.class, TestAssertNotSame.class,
		TestAssertNull.class, TestAssertThat.class, TestAssertTrue.class })
public class AllTests {

}
