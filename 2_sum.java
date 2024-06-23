import java.util.*;
  public class hello{

    public static void search(int[] arr,int target){
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]+arr[j]==target){
            // return new int[] {i,j};
            System.out.println("["+i+","+j+"]");
          }}}
      //return new IllegalArgumentException("not found");
      System.out.println("not found");
        
    }


    
    public static void main(String args[]){
      int arr[]=new int[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter elements: ");
      for(int i=0;i<5;i++){
        if(sc.hasNextInt()){
          arr[i]=sc.nextInt();}}
      int target=sc.nextInt();
      search(arr,target);
        
    }}
