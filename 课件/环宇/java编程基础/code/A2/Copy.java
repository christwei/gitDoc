import java.util.*;

public class Cope { // ������
	public static void main(String[] args) { // ������
		int arr[] = new int[] { 23, 42, 12, }; // ��������
		int newarr[] = Arrays.copyOf(arr, 5); // ��������arr
		for (int i = 0; i < newarr.length; i++) { // ѭ���������ƺ��������
			System.out.println(newarr[i]); // �����������
		}

                int arr2[] = new int[] { 23, 42, 12, 84, 10 }; // ��������
                int newarr2[] = Arrays.copyOfRange(arr2, 0, 3); // ��������
                for (int i = 0; i < newarr2.length; i++) { // ѭ���������ƺ��������
                   System.out.println(newarr2[i]); // ���������е�ÿ��Ԫ�����
                }
	}
}
