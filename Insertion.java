class insertion
{
public static void main(String args[])
  {
     int[]array=new int[]{1,2,3,4,5,6,7,8,9,-1};
     int value=Integer.parseInt(args[0]);
     int pos=Integer.parseInt(args[1]);
     array[9]=array[pos];
     array[pos-1]=value;
     for(int i=0;i<10;i++){
       System.out.print(array[i]+" ,");
     }
  }
}

#
class insertingatpos {
    public static void main(String args[]){
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,-1};
        int ele=Integer.parseInt(args[0]);
        int pos=Integer.parseInt(args[1]);
        for(int i=9;i>=pos;i--)
               arr[i]=arr[i-1];
       arr[pos-1]=ele;
       for(int i=0;i<10;i++)
               System.out.print(arr[i] + " ,");
        
    }
}