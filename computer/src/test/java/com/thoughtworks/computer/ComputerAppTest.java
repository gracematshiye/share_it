package com.thoughtworks.computer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by gracem on 2016/05/26.
 */
public class ComputerAppTest extends TestCase {
        /**
         * Create the test case
         *
         * @param testName name of the test case
         */
        public ComputerAppTest( String testName )
        {
            super( testName );
        }

        /**
         * @return the suite of tests being tested
         */
    public static Test suite()
    {
        return new TestSuite( ComputerAppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
