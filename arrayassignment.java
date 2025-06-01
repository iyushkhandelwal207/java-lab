public class arrayassignment{
    public static boolean twise(int arr[]){
        // boolean check;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int binarysearch(int arr[],int target){
        int start=0;
        int last=arr.length-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                start=start+1;
            }
            if(target>arr[mid]){
                last=last-1;
            }
        }
        return -1;
    }
    public static void maxprofit(int arr[]){
        int maxpro=0;
        int byprice=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            // if()
            
            if(byprice<arr[i]){
               int profit=arr[i]-byprice;
                maxpro=Math.max(profit,maxpro);
            }else{
                byprice=arr[i];
            }
        }
        System.out.println("max profit:"+maxpro);
    }
    public static void trappedwater(int arr[]){
        //leftmax
        int trapped=0;
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }

        //right max
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        //loop
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(left[i],right[i]);
            trapped+=waterlevel-arr[i];
        }
        if(trapped>0){
        System.out.println("Trapped water:"+trapped);
        }else{
            System.out.println("Trapped water:0");
        }
        //waterlevel
        //water
    }
    public static void triple(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){

                    if((arr[i]+arr[j]+arr[k]==0)&& i!=j && i!=k && j!=k){
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                       
                    }
                    
                }
                break;
                
            }
        }
    }
 public static void main(String[] args) {
    // int arr[]={1,1,1,2,3,4};
    // int arr[]={1,5,6,10,12,36,78};
    // int arr[]={4,5,6,7,0,1,2};
    // System.out.println(twise(arr));
    // System.out.println(binarysearch(arr, 0));
    // int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
    // int arr1[]={4,2,0,3,2,5};
    // trappedwater(arr1);
    // maxprofit(arr);
    int arr1[]={-1,0,1,2,-1,-4};
    triple(arr1);
 }   
}
