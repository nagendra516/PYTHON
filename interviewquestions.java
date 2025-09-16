// celing problem :to fing an smaller number that will be greate than 
//or eqal totarget or closer
//eg1:arr[]={1,3,5,6,7,9}
//target=4;
//ans:5
//eg2:arr[]={1,3,5,6,7,9}
//target=6;
//ans:6

// import java.util.Scanner;
// class interviewquestions{
//     public static int celing(int[] arr,int target){
//         int start=0;
//         int end=arr.length-1;
//          while(start<end){
//             int mid=start+(end-start)/2;
//             if(target==arr[mid]){
//                 return arr[mid];   
//             }
            
//            else if(target>arr[mid]){
//                 start=mid+1;
//                 //return arr[start+1];
//             }else{
//                 end=mid-1;
//             } 
//             // if(target<arr[mid]){
//             //     end=mid-1;
                
//             //     }else{
//             //          start=mid+1;
//             //     } 
            
//         }        

//         return arr[start];
//     }
//     public static void main(String args[]){
//         int[] arr={2,3,5,7,8,11,14,17,19};
//         int target=15;
//         System.out.println(celing( arr, target));
//     }
// }

// 744. Find Smallest Letter Greater Than Target

// Hint
// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.


// class interviewquestions {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int start=0;
//         int end=letters.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target< letters[mid]){
//                 end=mid-1;
//             }else{
//                 start=mid+1;
//             }
//           //  if(target>letters.length) return letters[0];
//             //if(target.equals(letters[0])) return latters[mid];
//         }
//         return letters[start % letters.length];
        
//     }
//     public static void main(String args[]){
//         char[] letters={'c','f','j'};
//         char target='c';
//         interviewquestions obj=new interviewquestions();
//         char ans=obj.nextGreatestLetter(letters, target);
//         System.out.println(ans);
//     }
// }

//floor problem :to fing an lager number that will be lasser than target
//or closer to target or eqal to target
//eg1:arr[]={1,3,5,6,7,9}
//target=4;
//ans:3
//eg2:arr[]={1,3,5,6,7,9}
//target=6;
//ans:6

// import java.util.Scanner;
// class interviewquestions{
//     public static int celing(int[] arr,int target){
//         int start=0;
//         int end=arr.length-1;
//          while(start<end){
//             int mid=start+(end-start)/2;
//             if(target==arr[mid]){
//                 return arr[mid];   
//             }
            
//            else if(target>arr[mid]){
//                 start=mid+1;
//                 //return arr[start+1];
//             }else{
//                 end=mid-1;
//             } 
//             // if(target<arr[mid]){
//             //     end=mid-1;
                
//             //     }else{
//             //          start=mid+1;
//             //     } 
            
//         }        

//         return arr[end];
//     }
//     public static void main(String args[]){
//         int[] arr={2,3,5,7,8,11,14,17,19};
//         int target=15;
//         System.out.println(celing( arr, target));
//     }
// }

//finging peak of an index (leetcode no:852)
// class interviewquestions {
//     public int peakIndexInMountainArray(int[] arr) {
//         int start=0;
//         int end=arr.length-1;
//         while(start<end){
//             int mid=start+(end-start)/2;
//             if(arr[mid] < arr[mid+1]){
//                 start=mid+1;
//             }else{
//                 end=mid;
//             }
//         }
//         return arr[start]; //printing index value
//         //return start;  //printing index
        
//     }
//     public static void main(String args[]){
//         int[] arr={0,2,1,0};
//         interviewquestions obj=new interviewquestions();
//         int ans=obj.peakIndexInMountainArray(arr);
//         System.out.println(ans);


//     }
// }

//finding the first and last position of an target in an array
//leetcode problem(34 :facebook interview question)

// class interviewquestions{
//     public static int[] find(int[] arr,int target){
//         int[] ans={-1,-1};
//         ans[0]=search(arr,target,true);
//         ans[1]=search(arr,target,false);
//         return ans;

//     }
//     public static int search(int[] arr,int target,boolean fingfirstindex){
//         int start=0;
//         int end=arr.length-1;
//         int ans=-1;
//         while(start<=end){
//         int mid=start+(end-start)/2;
//         if(target<arr[mid]){
//             end=mid-1;
//         }else if(target>arr[mid]){
//             start=mid+1;
//         }else{
//             ans=mid;
//             if(fingfirstindex){
//                 end=mid-1;
//             }else{
//                 start=mid+1;
//             }
            
//         }
//     }
        
//         return ans;
        
        
//     }
//     public static void main(String args[]){
//         int[] arr={1,2,3,4,4,5,6,6,8};
//         int target=6;
//         int[] result=find(arr , target) ;
//         System.out.println(result[0] +","+ result[1]);
//     }
// }


// finding the element in an infinite array,we dont no the start and end value of an array;
// here we using chunks to finding the solution that means taking the boxes from upto certain range an apply binary search
//follow the same binary search code
//Amazon interview question:

// class interviewquestions{
//     public static void main(String args[]){
//         int[] arr={12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
//         int target=21;
//         System.out.println(ans(arr,target));
//     }
//     public static int ans(int[] arr,int target){
//         int start=0;
//          int end=1;
//          while(target>arr[end]){
//             int newStart=end+1;
//             //why beacause of we doubling the size
//             end=start+(end-start+1)*2;
//             //double the box length,if we need to clarify means ,pls calculate
//             start=newStart;
//          }
//          return binarysearch(arr,target,start,end);
//     }
//     public static int binarysearch(int[] arr,int target,int start,int end){
//         // int start=0;
//         // int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target<arr[mid]){
//                 end=mid-1;
//             }else if(target >arr[mid]){
//                 start=mid+1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return start;
        
//     }
// }

//here we are finding the peak of an element in an array

// class interviewquestions{
//     public static void main(String args[]){
//         int[ ] arr={1,2,3,4,5,-1,-2,-3};
//         System.out.println(peak(arr));
        
//     }
//     public static int peak(int[] arr){
//         int start=0;
//         int end=arr.length-1;
//         while(start<end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]>arr[mid+1]){
//                 end=mid;
//             }else{
//                 start=mid+1;
//             }
//            // return mid;
//         }
//         return arr[start];
        
//     }
// }

//here we are finging the pivot element in an rotated array,it it is not rotated element
//then we proced the normal binary serch here this code contain 
//three methods.this will clearly explin in the notes;
//this question is asked in google,and amozon
//leetcode no:33
// class interviewquestions {
//     public static void main(String args[]) {
//         int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
//         int target = 0;
//         System.out.println("Pivot index: " + findpivot(arr,target));
//         int ans = rotated(arr, target);
//         System.out.println("Target found at index: " + ans);
//     }

//     public static int findpivot(int[] arr,int target) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (mid < end && arr[mid] > arr[mid + 1]) {
//                 return mid;
//             }
//             if (mid > start && arr[mid] < arr[mid - 1]) {
//                 return mid - 1;
//             }

//             if (arr[mid] >= arr[start]) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static int rotated(int[] arr, int target) {
//         int pivot = findpivot(arr,target);

//         // If no pivot found, array is not rotated
//         if (pivot == -1) {
//             return binarysearch(arr, target, 0, arr.length - 1);
//         }

//         // If pivot is the target
//         if (arr[pivot] == target) {
//             return pivot;
//         }

//         // If target >= first element → search left part
//         if (target >= arr[0]) {
//             return binarysearch(arr, target, 0, pivot - 1);
//         }

//         // Else search right part
//         return binarysearch(arr, target, pivot + 1, arr.length - 1);
//     }

//     public static int binarysearch(int[] arr, int target, int start, int end) {
//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (target < arr[mid]) {
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }


//finging the sum of adjacent elements in an array

// import java.util.Scanner;
// class interviewquestions {
//     public static int sum(int[] arr, int target) {
//         int sum;

//         for (int i = 0; i < arr.length-1 ; i++) {
//             for(int j=i+1;j<arr.length;j++){
//             sum = arr[i] + arr[j];

//             if (sum == target) {
//                 System.out.println("The indexes are: " + i + " and " + j);
//                 return sum;
//             }
//         }
//         }

//         // If no pair found
//         System.out.println("No consecutive elements found with the given target sum.");
//         return -1;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size");
//         int size=sc.nextInt();
//         int[] arr =new int[size];
//         System.out.println("enter the array");
//         for(int i=0;i<arr.length-1;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("Enter the target:");
//         int target = sc.nextInt();

//         int ans = sum(arr, target);
//         System.out.println("Result: " + ans);
//     }
// }

// import java.util.Arrays;
// class interviewquestions{
// public static void main(String args[]){
//      StringBuilder sb=new StringBuilder("nani");
//     // StringBuilder ans=sb.reverse();
//     // System.out.println(ans);
//     int length=sb.length(); 
//     for(int i=0;i<length/2;i++){
//         int front=i;
//         int back=length-i-1;
//         char frontchar=sb.charAt(front);
//         char backchar=sb.charAt(back);
//         sb.setCharAt(front, backchar);
//         sb.setCharAt(back,frontchar);
       

//     }
//     System.out.println(sb);

   
// }
// }


// //same as leetcode:33 but,deleting duplicate values here ,it is same code of roated serach;
// class interviewquestions {
//     public static void main(String args[]){
//        int[] nums={4,4,5,6,7,0,1,2,4};
//        int target=2;
//         System.out.println(rsb( nums,target));

//     }
//     public static int rsb(int[] nums,int target){
//         int pivot=search(nums,target);
//         if(pivot==-1){
//            return binarysearch(nums, target,0,nums.length-1);

//         }
//         if(target==nums[pivot]){
//             return pivot;
//         }
//         if(target>=nums[0]){
//            return binarysearch(nums,target,0, pivot-1);

//         }else{
//            return binarysearch(nums,target,pivot+1, nums.length-1);
//         }
        
//     }
//     public static int binarysearch(int[] nums,int target,int start,int end){
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target>nums[mid]){
//                 start=mid+1;
//             }
//             else if(target<nums[mid]){
//                 end=mid-1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
//     public static int search(int[] nums,int target) {
        
//         int start=0;
//         int end=nums.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if( mid< end && nums[mid]>nums[mid+1]){
//                 return mid;
//             }
//             if(mid> start && nums[mid] < nums[mid-1]){
//                 return mid-1;
//             }
//             if(nums[start]==nums[mid] && nums[mid]==nums[end]){
//                 if(nums[start]>nums[start+1]){
//                     return start;
//                 }
//                 start++;
//                 if(nums[end]<nums[end-1]){
//                     return end-1;
//                 }
//                 end--;
//                 if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
//                     start=mid+1;
//                 }else{
//                     end=mid-1;
//                 }

//             }
//         }
//          return -1; 
//     }  
// }

//same as leetcode:33 but,here using boolean values;
// class interviewquestions {
//     public static void main(String args[]){
//        int[] nums={4,4,5,6,7,0,1,2,4};
//        int target=3;
//         System.out.println(rsb( nums,target));

//     }
//     public static boolean rsb(int[] nums,int target){
//         int pivot=search(nums,target);
//         if(pivot==-1){
//            return binarysearch(nums, target,0,nums.length-1) !=-1;

//         }
//         if(target==nums[pivot]){
//             return true;
//         }
//         if(target>=nums[0]){
//            return binarysearch(nums,target,0, pivot-1) !=-1;

//         }else{
//            return binarysearch(nums,target,pivot+1, nums.length-1) !=-1;
//         }
        
//     }
//     public static int binarysearch(int[] nums,int target,int start,int end){
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target>nums[mid]){
//                 start=mid+1;
//             }
//             else if(target<nums[mid]){
//                 end=mid-1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
//     public static int search(int[] nums,int target) {
        
//         int start=0;
//         int end=nums.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if( mid< end && nums[mid]>nums[mid+1]){
//                 return mid;
//             }
//             if(mid> start && nums[mid] < nums[mid-1]){
//                 return mid-1;
//             }
//             if(nums[start]==nums[mid] && nums[mid]==nums[end]){
//                 if(nums[start]>nums[start+1]){
//                     return start;
//                 }
//                 start++;
//                 if(nums[end]<nums[end-1]){
//                     return end-1;
//                 }
//                 end--;
//                 if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
//                     start=mid+1;
//                 }else{
//                     end=mid-1;
//                 }

//             }
//         }
//          return -1; 
//     }  


    // to find that how many times your array is rotated
    //answer is (pivit+1)
    // class interviewquestions{
    //     public static void main(String rags[]){
    //         int[] nums={10,11,12,3,4,5,6,7};
    //         System.out.println(count(nums));
    //     }
    //     public static int count(int[] nums){
    //       int pivot=findpivot(nums);
    //       return pivot+1;
    //     }
    //     public static int findpivot(int[] nums) {
        
    //         int start=0;
    //         int end=nums.length-1;
    //         while(start<=end){
    //             int mid=start+(end-start)/2;
    //             if( mid< end && nums[mid]>nums[mid+1]){
    //                 return mid;
    //             }
    //             if(mid> start && nums[mid] < nums[mid-1]){
    //                 return mid-1;
    //             }
    //             if(nums[start]==nums[mid] && nums[mid]==nums[end]){
    //                 if(nums[start]>nums[start+1]){
    //                     return start;
    //                 }
    //                 start++;
    //                 if(nums[end]<nums[end-1]){
    //                     return end-1;
    //                 }
    //                 end--;
    //                 if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
    //                     start=mid+1;
    //                 }else{
    //                     end=mid-1;
    //                 }
    
    //             }
    //         }
    //          return -1; 
    //     }  
    

    // }

//method1:to reverse an string
// import java.util.Arrays;
// class interviewquestions{
//     public static void main(String args[]){
//         String name="Nani";
//         char[] ch=name.toCharArray();
//         int length=name.length();
//         int left=0;
//         int right=ch.length-1;
//         while(left<right){
//             char temp=ch[left];
//             ch[left]=ch[right];
//             ch[right]=temp;
//             left++;
//             right--;
//         }
//         System.out.println(Arrays.toString(ch));
//     }
// }


//method2:to reverse an string 
// import java.util.Arrays;
// class interviewquestions{
//     public static void main(String args[]){
//         StringBuilder name=new StringBuilder("nani");
//          int length=name.length();int right=length;
//         for(int i=0;i<length/2;i++){
//             int front=i;
//             int back=name.length()-1-i;
//             char frontchar=name.charAt(i);
//             char backchar=name.charAt(back);
//             name.setCharAt(front,backchar);
//             name.setCharAt(back,frontchar);
           
//         }
//         System.out.println((name));
//     }
// }

//method3:to reverse an string
// class interviewquestions{
//     public static void main(String args[]){
//         StringBuilder name=new StringBuilder("nani");
//         System.out.println(name.reverse());
//     }
// }

//leetcode problem 410:
//aked in google
//hardquetion 
//here we are finding the maximum sum in subarray 
// here subarrays are less than k; k is how many subayys we will create they will given in problem
//similar problem is 1011,same code works
// class interviewquestions{
//     public static int google(int[] nums,int k){
//         int start=0;
//         int end=0;
//         int count=0;
//         int[] n={};
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums[i].lenght;j++){
//             if(nums[i] ==nums[i+1]){
//                 count++;
//                 return nus[i];
//             }
//             else{
//                 return n;
//             }
//             start=Math.max(start,nums[i]);
//             end=end+nums[i];
//             }
//         }
//         while(start<end){
//           int mid=start+(end-start)/2;
//           int sum=0;
//           int pieces=1;
//           for(int num:nums){
//             if(sum+num>mid){
//                 sum=num;
//                 pieces++;
//             }else{
//                 sum=k+sum+num;
//             }
//           }  
//           if(pieces>k){
//             start=mid+1;
//           }else{
//             end=mid;
//           }

//         }
//         return end;
//     }
//     public static void main(String args[]){
//         int[] nums={7,2,5,8,10};
//         int k=2;
//         System.out.println(google(nums, k));
//     }
// }


//leetcode no:
// import java.util.ArrayList;
// class interviewquestions{
//     public static void split(int[] nums){
//         ArrayList<Integer> arr1=new ArrayList<>();
//         ArrayList<Integer> arr2=new ArrayList<>();
//         arr1.add(nums[0]);
//         arr2.add(nums[1]);
//         for(int i=2;i<nums.length;i++){
//             int last1=arr1.get(arr1.size()-1);
//             int last2=arr2.get(arr2.size()-1);
//             if(last1>last2){
//                  arr1.add(nums[i]);
//             }
//             else{
//                  arr2.add(nums[i]);
//             }
//         }
//         ArrayList<Integer> Result=new ArrayList<>(arr1);
//         Result.addAll(arr2);
//         for(int num:Result){
//             System.out.println(num);
//         }

//     }
//     public static void main(String args[]){
//         int[] nums={2,1,3};
//         split(nums);
//     }
// }

//leetcode problem:2149
//🔍 Problem Statement Explanation:
// You are given an array nums[] of even length. This array has:

// Equal number of positive and negative numbers.
// Your job is to rearrange it alternating positive and negative numbers starting with a positive number.
// 🎯 Your output must satisfy 2 conditions:
// Alternate signs (positive-negative-positive-negative...)
// Preserve the original order of positives and negatives as they were in the input array.
// import java.util.ArrayList;
// class interviewquestions{
//     public static void alternate(int[] nums){
//         ArrayList<Integer> arr1=new ArrayList<>();
//         ArrayList<Integer> arr2=new ArrayList<>();
//         ArrayList<Integer> n=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>0){
//             arr1.add(nums[i]);
//             }
//             else{
//                 arr2.add(nums[i]);
//             }
//         }
//         int i=0,j=0;
//         while(i<arr1.size()&& j<arr2.size()){
//             n.add(arr1.get(i));
//             n.add(arr2.get(i));
//             i++;
//             j++;
//         }
//         // while(i<arr1.size()){
//         //     n.add(arr1.get(i));
//         //     i++;
//         // }
//         // while(j<arr2.size()){
//         //     n.add(arr2.get(j));
//         //     j++;
//         // }
        
//         for(int k=0;k<n.size();k++){
//             System.out.print(n.get(k)+" ");
//         };


//     }
//     public static void main(String args[]){
//         int[] nums={-1,1};
//       alternate(nums);
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;
// class interviewquestions{
//     public static int[] cal(int[] nums){
//         ArrayList<Integer>arr1=new ArrayList<>();
//         ArrayList<Integer>arr2=new ArrayList<>();
//         ArrayList<Integer>result=new ArrayList<>();
//         arr1.add(nums[0]);
//         arr2.add(nums[1]);
//         for(int i=2;i<nums.length;i++){
//             int last1=arr1.get(arr1.size()-1);
//             int last2=arr2.get(arr2.size()-1);
//             if(last1>last2){
//                 arr1.add(nums[i]);
//             }else{
//                 arr2.add(nums[i]);
//             }
//         }
//         result.addAll(arr1);
//         result.addAll(arr2);
//         int[] finalresult=new int[result.size()];
//         for(int i=0;i<result.size();i++){
//             finalresult[i]=result.get(i);
//         }
//         return finalresult;
//     }
//     public static void main(String args[]){
//         int[] nums={2,1,3};
//         System.out.println(Arrays.toString(cal(nums)));
//     }
// }

// printing the spiral matrix 
//important 
//leetcode no:54
// import java.util.Scanner;
// class interviewquestions{
//     public static void printmat(int[][] matrix){
//         int left=0;
//         int top=0;
//         int bottom=matrix.length-1;
//         int right=matrix[0].length-1;
//         while(top <=bottom & left<=right){
//             for(int i=left;i<=right;i++){
//                 System.out.println(matrix[top][i] +" ");
//             }
//             top++;
//             for(int i=top;i<=bottom;i++){
//                 System.out.println(matrix[i][right] +" ");
//             }
//             right--;
//             if(top<=bottom){
//             for(int i=right;i>=left;i--){
//                 System.out.println(matrix[bottom][i]);
//             }
//             bottom--;
//             if(left<=right){
//                 for(int i=bottom;i>=top;i--){
//                     System.out.println(matrix[i][left]);
//                 }
//                 left++;
//             }
//         }
//     }
//     }
//     public static void main(String args[]){
//         int[][] matrix={
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };

//         printmat(matrix);
//     }
// }

//printing the coprime triplates,coprime means here the hcf is 1
//solve by using eclids algorithm
// import java.util.Scanner;
// class interviewquestions{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int a=1;a<=n;a++){
//             for(int b=a+1;b<=n;b++){
//                 for(int c=b+1;c<=n;c++){
//                     if (iscoprime(a, b, c)){
//                         System.out.println(a +"," + b + "," +c );

//                     }
                    
//                 }
//             }
//         }
        

//     }
//     public static int gcd(int a,int b){
//         if(b==0) return a;
//         return gcd(b , a%b);
//     }
//     public static boolean iscoprime(int a,int b,int c){
//         return gcd(a,b)==1 && gcd(b,c)==1 && gcd(c,a)==1;
//     }

// }

// //printing the prime factors of an n:
// import java.util.Scanner;
// class interviewquestions{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         while(n%2==0){
//             System.out.println(2+ " ");
//             n=n/2;
//         }
//         for(int i=3;i<=Math.sqrt(n);i+=2){
//             while(n%i==0){
//                 System.out.println(i+" ");
//                 n=n/i;                
//             }
//         }
//         if(n>2){
//             System.out.println(n);
//         }
//     }
// }

// public class PatternAlternate {
//     public static void main(String[] args) {
//         int n = 5;
//         int num = 1;
//         for (int row = 1; row <= n; row++) {
//             int[] temp = new int[row];
//             for (int i = 0; i < row; i++) {
//                 temp[i] = num++;
//             }
//             if (row % 2 == 0) {
//                 for (int i = row - 1; i >= 0; i--) {
//                     System.out.print(temp[i] + " ");
//                     if(i!=0){
//                         System.out.print("*" +" ");
//                     }
//                 }
//             } else {
//                 for (int i = 0; i < row; i++) {
//                     System.out.print(temp[i] + " ");
//                     if(i!=row-1){
//                         System.out.print("*" +" ");
//                     }
//                 }
//             }
//          System.out.println();
//         }
//     }
// }

//finding the digital clock
// public class interviewquestions{
//     public static void main(String args[]) throws InterruptedException{
//         int h=4,m=03,s=0;
//         while(true){
//              System.out.printf("\r%02d :%02d :%02d",h,m,s);
//              System.out.flush();
//              Thread.sleep(1000);
//              s=s+1;
//              if(s==60){
//                 s=0;
//                 m=m+1;
//              }
//              else if(m==60){
//                 s=0;
//                 m=0;
//                 h=h+1;
//              }
//         }
//     }
// }


    