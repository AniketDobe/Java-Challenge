public class practiceset {
    public static void main(String args[]){
        // problem 1
        // float [] marks = {45.5f, 67.5f, 99.0f, 100.0f, 63.0f};
        // float sum = 0;
        // for(float element: marks){
        //     sum += element;
        // }
        // System.out.println("The value of sum is: "+sum);


        // problem 2
        // float [] marks = {45.5f, 67.5f, 99.0f, 100.0f, 63.0f};
        // float num = 45.5f;
        // boolean isInArray = false;
        // for(float element: marks){
        //     if(num == element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("value is present is array");
        // }
        // else{
        //     System.out.println("Ivalue is not in array");
        // }


        // problem 3 
        // float [] marks = {45.5f, 67.5f, 99.0f, 100.0f, 63.0f};
        // float sum = 0;
        // for(float element: marks){
        //     sum += element;
        // }
        // System.out.println("The value of avg marks is: "+ sum/marks.length);


        // problem 4
        // int [][] mat1 = {   
        //                     {1,2,3},
        //                     {4,5,6}
        //                 };
        // int [][] mat2 = {   
        //                     {2,6,13},
        //                     {3,7,1}
        //                 };
        // int [][] result = {   
        //                     {0,0,0},
        //                     {0,0,0}
        //                 };
        // for(int i=0; i<mat1.length; i++){       // rows
        //     for(int j=0; j<mat1[i].length; j++){            // columns
        //         System.out.format("Setting value for i=%d and j=%d\n", i, j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }
        // for(int i=0; i<mat1.length; i++){       // rows
        //     for(int j=0; j<mat1[i].length; j++){            // columns
        //         System.out.print(result[i][j] + " ");
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        //     System.out.println();
        // }


        // problem 5
        // int [] arr = {1,2,3,4,5,6};
        // int l = arr.length;
        // int n = Math.floorDiv(5, 2);
        // int temp;
        // for(int i=0; i<n; i++){
        //     temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }
        // for(int element: arr){
        //     System.out.print(element +" ");
        // }


        // problem 6
        // int [] arr = {1,2,3,4,5,6};
        // int max = 0;
        // for(int element : arr){
        //     if(element>max){
        //         max=element;
        //     }
        // }
        // System.out.println("Maximum element is array is : " +max);

        // System.out.println("Minimum value: "+Integer.MIN_VALUE);
        // System.out.println("Maximum value: "+Integer.MAX_VALUE);


        // problem 7
        int []arr = {1, 52, 558, 8544, 45};
        // int [] arr = {1,2,3,4,5,6};

        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }




    }
}
