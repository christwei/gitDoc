import java.util.*;

public class Cope { // 创建类
	public static void main(String[] args) { // 主方法
		int arr[] = new int[] { 23, 42, 12, }; // 定义数组
		int newarr[] = Arrays.copyOf(arr, 5); // 复制数组arr
		for (int i = 0; i < newarr.length; i++) { // 循环变量复制后的新数组
			System.out.println(newarr[i]); // 将新数组输出
		}

                int arr2[] = new int[] { 23, 42, 12, 84, 10 }; // 定义数组
                int newarr2[] = Arrays.copyOfRange(arr2, 0, 3); // 复制数组
                for (int i = 0; i < newarr2.length; i++) { // 循环遍历复制后的新数组
                   System.out.println(newarr2[i]); // 将新数组中的每个元素输出
                }
	}
}
