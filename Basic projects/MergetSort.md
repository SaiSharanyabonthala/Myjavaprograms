**This is the code for MergeSort:**

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

class Main {

    public void Merge(int\[] arr,int low,int mid,int high){

       List<Integer> temp = new ArrayList<>();  

        int left=low;

        int right=mid +1;

        while(left<=mid \&\& right <=high){

            if(arr\[left]<=arr\[right]){

                temp.add(arr\[left]);

                left++;

            }else{

                temp.add(arr\[right]);

                right++;

            }

        }

        while(left<=mid){

            temp.add(arr\[left]);

            left++;

        }

    while(right<=high){

        temp.add(arr\[right]);

        right++;

    }

    for(int i=low;i<=high;i++){

            arr\[i]=temp.get(i-low);

     }  }

     public void MergeSort( int\[] arr,int low,int high){

            if(low >= high)return;

           int  mid=(low+high)/2;

            MergeSort(arr,low,mid);

            MergeSort(arr,mid+1,high);

            Merge(arr,low,mid,high);

        }

    public static void main(String\[] args) {

       Main sol=new Main();

       int\[] arr={1,3,2,4,1};

       sol.MergeSort(arr, 0, arr.length - 1);

        

        System.out.print(Arrays.toString(arr));

    }

}

