/***
 * This class acts as an utility class for our implementation
 */
public class Utils {

    public static boolean isNotEmpty(String arg)
    {
        return !isEmpty(arg);
    }
    /**
     * This method checks if a given String argument is empty or null
     * @param arg
     * @return
     */
    public static boolean isEmpty(String arg){
        if(null == arg || arg.trim().isEmpty())
            return true;
        return false;
    }
}
