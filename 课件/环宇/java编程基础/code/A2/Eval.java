import java.util.*;

public class Eval { // 新建类
	public static void main(String[] args) { // 主方法
		 Date date = new Date(); // 创建Date对象date
        String year = String.format("%tY", date); // 将date进行格式化
        String month = String.format("%tB", date);
        String day = String.format("%td", date);
        System.out.println("今年是：" + year + "年"); // 输出信息
        System.out.println("现在是：" + month);
        System.out.println("今天是：" + day + "号");
        
        String hour = String.format("%tH", date); // 将date进行格式化
        String minute = String.format("%tM", date);
        String second = String.format("%tS", date);
         // 输出的信息
        System.out.println("现在是：" + hour + "时" + minute + "分"
                + second + "秒");

String intStr = String.format("%d","01"); // 格式化为十进制整数
        System.out.println(intStr );
	}
}
