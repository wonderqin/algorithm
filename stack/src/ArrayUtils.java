package src;

/**
 * @ClassName ArrayUtils
 * @Description TODO
 * @Author wonderQin
 * @Date 2019-04-10 2:09
 **/
public class ArrayUtils {

    /**删除数组的最后一个元素，并返回该元素**/
    public static String deleteLastElement(String[] strings){
        if(strings.length == 0){
            return null;
        }
        String tmp = strings[strings.length - 1];
        strings[strings.length - 1] = null;
        return tmp;
    }
}
