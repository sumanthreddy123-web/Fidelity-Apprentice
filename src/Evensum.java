public class Evensum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6,7,8};
        int Evensum = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                Evensum += arr[i];
            }
        }
        System.out.println( "The sum of the even integers in an array"+Evensum);
    }
}
