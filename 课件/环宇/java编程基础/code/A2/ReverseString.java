

public class ReverseString {
    
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
         String text = "abcde";// 获取用户输入
         StringBuilder sbuilder = new StringBuilder(text);// 创建构建器包含用户输入
         StringBuilder reverse = sbuilder.reverse();// 调用反转方法获取反转后的构建器
         String reverseText = reverse.toString();// 从构建器获取反转的字符串
         System.out.println(reverseText);
    }
    
    
}
