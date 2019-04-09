package src;
import src.ArrayUtils;

/**
 * @ClassName ArrayStack
 * @Description 基于数组实现的顺序栈
 * @Author wonderQin
 * @Date 2019-04-10 1:45
 **/
public class ArrayStack {
    /**数组**/
    private String[] items;
    /**栈中元素的个数**/
    private int count;
    /**栈的大小**/
    private int size;

    /**初始化数组，申请一个大小为size的数组空间**/
    public ArrayStack(int size){
        this.items = new String[size];
        this.size = size;
        this.count = 0;
    }

    /**
     * @Author wonderqin
     * @Description 压栈
     * @Date  2019-04-10 01:57
     * @Param item
     * @Return boolean
    **/
    public boolean push(String item){
        /**栈满**/
        if(size == count){return false;}
        items[count - 1] = item;
        count++;
        return true;
    }

    /**
     * @Author wonderqin
     * @Description 弹栈
     * @Date 2019-04-10 01:57
     * @Param item
     * @Return boolean
    **/
    public String pop(){
        //栈空
        if(count == 0){return null;}
        count--;
        return ArrayUtils.deleteLastElement(items);
    }
}
