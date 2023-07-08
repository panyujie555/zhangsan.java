package homework;

import javax.swing.plaf.FontUIResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

//集合中第一个元素为同学姓名，第二个为该同学的考试成绩；后续元素也按照这个方式存储。
//请编写程序，将List集合中的数据，存入Map集合，Map集合中的键为姓名（字符串），值为成绩（Integer）；要求集合中的数据是按照姓名自然顺序排列的。遍历Map集合查看结果，输出如下：
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "80", "Jerry", "85", "Jack", "82", "Rose", "90", "John", "88", "Tony", "77");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < list.size(); i+=2) {
            String name = (String) list.get(i);
            int score = (int) list.get(i + 1);
            map.put(name, score);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println("姓名：" + name + "，成绩：" + score);
        }
    }
}
