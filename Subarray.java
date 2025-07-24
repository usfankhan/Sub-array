// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Subarray {
    public static void main(String[] args) {
     int arr[]={10,20,30,40,50};
     int n=arr.length;
     for(int si=0;si<n;si++){
         for(int ei=0;ei<n;ei++){
             for(int k=si;k<ei;k++){
                 System.out.println(arr[k]+" ");
             }
             System.out.println();
             
         }
     }
    }
}
