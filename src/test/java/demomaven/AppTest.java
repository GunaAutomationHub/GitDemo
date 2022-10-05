package demomaven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        System.out.println("postJira1");
        System.out.println("postJira2");
        System.out.println("postJira3");
        
        System.out.println("postJira4");
        System.out.println("postJira5");
        System.out.println("postJira6");
<<<<<<< HEAD
        System.out.println("postJira7"); 
        System.out.println("postJira8");
=======
>>>>>>> 10cc4dbfebbec48ef61cf269d26bb11ee92574c2
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
