package Infinity_Champions;

public class merge2sortedArrays {
    public static void main(String[] args) {
        int nums1[] = {1, 3};
        int nums2[] = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length ;
        int n = nums2.length ;
        int mergedArray[] = new int[m+n];

        int index = 0;
        int i = 0;
        int j = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                mergedArray[index++] = nums1[i++];
            }
            else if(nums1[i] > nums2[j]){
                mergedArray[index++] = nums2[j++];
            }
            else{
                mergedArray[index++] = nums2[j++];
                mergedArray[index++] = nums1[i++];

            }
        }
        while(i < m)mergedArray[index++] = nums1[i++];
        while(j < n)mergedArray[index++] = nums2[j++];

        int k = m+n;

        return (k % 2== 0)?(mergedArray[k/2 - 1] + mergedArray[k/2])/2.0 :mergedArray[k/2 ];
    }
}
