/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 
 * 
 */

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        // 使用类似二分查找的办法
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (array[left] >= array[right]) {
            // 找到了最小值，直接返回
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = left + (right - left) / 2;
            if (array[left] == array[mid] && array[left] == array[right]) {
                return getMin(array,left,right);
            }
            if (array[left] <= array[mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
    }
    
    private int getMin(int [] array,int left,int right) {
        int res = Integer.MAX_VALUE;
        for (;left <= right;left++) {
            if (res > array[left]) res = array[left];
        }
        return res;
    }
}