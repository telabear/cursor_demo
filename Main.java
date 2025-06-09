import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1 构建原始的数组
        String[] strArray = new String[] { "i", "love" };
        // 2 通过Arrays.asList 工具把数组转成List 集合
        List<String> strList = Arrays.asList(strArray);
        // 3 往集合中添加元素
        strList.add("you");
    }
}