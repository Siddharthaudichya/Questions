public class reverse {
    public static void main(String[] args)
    {

        // Brute force approach 
        String str = "Hello";
        // char[] arr = str.toCharArray();
        // char[] reversedArray = str.toCharArray();
    
        // for(int i=arr.length-1, j=0; i>=0;i--,j++) {
        //     reversedArray[j] = arr[i];
        // }

        //System.out.println(new String(reversedArray));



        // BETTER APPROACH :) (By using a StringBuilder class)
        //System.out.println(new StringBuilder(str).reverse().toString());
        


        // OPTIMAL APPROACH
        char[] arr = str.toCharArray();
        int left=0, right = arr.length-1;

        while (left<right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(arr));

    }

}
