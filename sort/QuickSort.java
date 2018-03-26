package cn.edu.tju.rico.sort;

import java.util.Arrays;

/**
 * Title: ���������еĿ�������ĿǰӦ����Ϊ�㷺�������㷨����һ���ݹ��㷨
 * Description:������������������̣����� �� ����
 * "����"��ָ��ԭ���а���׼Ԫ�ػ�������������
 * "����"��ָ�ֱ�������н��п���
 * 
 * ��ƽ������ʱ����ԣ����������������ڲ����򷽷�����õ�һ��
 * 
 * �Դ��ģ��������ʱ�������ǿ�ģ���С��ģ��������ʱ�����������ģ��������ڼ�ѡ������ȼ����򷽷�
 * 
 * ��������������ԭʼ���У������ʱ�临�Ӷȴ�O(nlgn)��O(n^2)����
 * ʱ�临�Ӷȣ��������O(nlgn)��ƽ������O(nlgn)���������O(n^2)
 * 
 * �ݹ������ĵ�ջ�ռ�
 * �ռ临�Ӷȣ�O(lgn)
 * 
 * ��ѡ��һԪ����Ϊ��׼Ԫ��
 * �� �� �ԣ����ȶ�
 * 
 * 
 * �ڲ�����(���������������Ԫ����ȫ���ڴ�)
 * 
 * @author rico
 * @created 2017��5��20�� ����10:40:00
 */
public class QuickSort {
	  
	/**     
	 * @description �����㷨(�ݹ��㷨)���ڵ�ȥ�����оͰ���������
	 * @author rico       
	 * @created 2017��5��20�� ����5:12:06     
	 * @param target
	 * @param left
	 * @param right
	 * @return     
	 */
	public static int[] quickSort(int[] target, int left, int right) {
		
		if(right > left){     // �ݹ���ֹ����
			int base_index = partition(target,left, right);  // ԭ���л��ֺ��׼Ԫ�ص�λ��
			quickSort(target, left, base_index-1);    // �Ե�һ�������п������򣬲�������׼Ԫ�أ�
			quickSort(target, base_index+1, right);   // �Եڶ��������п������򣬲�������׼Ԫ�أ�
			return target;
		}
		return target;
	}
	
	  
	/**     
	 * @description ���л��֣��Ե�һ��Ԫ��Ϊ��׼Ԫ��
	 * @author rico       
	 * @created 2017��5��20�� ����5:10:54     
	 * @param target  ����
	 * @param left �������
	 * @param right  �����Ҷ�
	 * @return     
	 */
	public static int partition(int[] target, int left, int right){
		
		int base = target[left];   // ��׼Ԫ�ص�ֵ
		int base_index = left;    // ��׼Ԫ������Ӧ���ڵ�λ��
		
		for (int i = left+1; i <= right; i++) {  // �ӻ�׼Ԫ�ص���һ��Ԫ�ؿ�ʼ
			if(target[i] < base){       //  ����С�ڻ�׼Ԫ��
				base_index++;           // ����С�ڻ�׼Ԫ��,���׼Ԫ������λ�ú��ƣ��������ƶ�
				if(base_index != i){	// ��������ζ��i֮ǰ��Ԫ�ض�С��base,ֻ��Ҫ��һ�μ��ɣ�����Ҫ�δζ���
					int temp = target[base_index];
					target[base_index] = target[i];
					target[i] = temp;
				}
			}
		}
		
		// ����׼Ԫ�ؾ�λ
		target[left] = target[base_index];   
		target[base_index] = base;
		
		System.out.println(Arrays.toString(target));
		
		return base_index;  //���ػ��ֺ��׼Ԫ�ص�λ��
	}
}
