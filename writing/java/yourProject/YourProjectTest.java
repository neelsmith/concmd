package yourProject;


import org.concordion.integration.junit3.ConcordionTestCase;

public class YourProjectTest extends ConcordionTestCase {

    /** Echoes string s i times, tidily separating all but
     * final instance with a comma.
     * @param s String to echo.
     * @param i Number of times to repeat.
     * @returns New list-like string.
     * @throws Exception if i < 1.
     */
    public String echo(String s, Integer i) throws Exception {
	// i must be >= 1
	if (i < 1) {
	    throw new Exception("echo: invalid value for i, " + i.toString());
	}
	StringBuilder str = new StringBuilder();
	for (int idx = 0;  idx < i - 1; idx++ ) {
	    str.append(s);
	    str.append(", ");
	}
	str.append(s);
	return(str.toString());
    }
    
}
