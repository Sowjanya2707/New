package abc.MavenSonarActivity;
import java.util.SortedMap;
import java.util.TreeMap;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SortedMap<String, String> marketProjects = new TreeMap<String, String>();
        marketProjects.put("USA", "Project A");
        marketProjects.put("Switzerland", "Project B");
        marketProjects.put("India", "Project k"); 
        System.out.println(marketProjects.entrySet());
    }
}
