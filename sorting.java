class sorting
{
      public static void main(String args[])
        {
                int [] array = new int [10];  
                int len=args.length; 
                int temp = 0; 
                for (int i = 0; i < len; i++)  
                        array[i]=Integer.parseInt(args[i]);  
                for (int i = 0; i < len; i++) {   
                       for (int j = i+1; j < len; j++) 
                        {   
                                if(array[i] > array[j]) 
                               {  
                                      temp = array[i];  
                                      array[i] = array[j];  
                                      array[j] = temp;  
                               }   
                        }   
                 }  
                 System.out.println();  
                 System.out.println("Elements of array sorted in ascending order: ");  
                 for (int i = 0; i < len; i++) {   
                      System.out.print(array[i] + " ");   
                 }  
    }  
}