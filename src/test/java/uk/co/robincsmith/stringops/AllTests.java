package uk.co.robincsmith.stringops;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite for all the test cases.
 * @author Robin Smith
 */
@RunWith(Suite.class)
@SuiteClasses({ StringHelperTestRemovePatternFromString.class,
        StringHelperTestReplacePatternWithHyphens.class,
        StringHelperTestReverseString.class })
public class AllTests
{

}
