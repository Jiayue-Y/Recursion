public class Inventory {
    static int[] stock(int[] arr){
        int i = 0;
        while(i < arr.length - 1){
            if(arr[i]==0){
                for(int j = arr.length - 1; j > i; j--){
                    arr[j] = arr[j-1];
                }
                i+=2;
            }
            else i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        for(int s : stock(new int[]{1,2,3,4,5,6,7,8,9}))
            System.out.print(s);
        System.out.println();
        for(int s : stock(new int[]{1,2,0,4,0,6,0,8,9}))
            System.out.print(s);
    }
}
