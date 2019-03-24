import java.util.*;
public class Driver
{
    public static void main(String []args){
    
    ArrayList<Integer> ob=new ArrayList<Integer>();
     for(Integer i=0;i<ob.buffer;i++)
    {
    ob.add(i);
    }
         System.out.println("Enter Your Choice:");
         System.out.println("1. Add Element At Position:");
         System.out.println("2. For Printing Elemnts:");
         System.out.println("3. For Search when Given Element:");
         System.out.println("4. Enter Search when Given Position:");
        
        Scanner sc=new Scanner(System.in);
        Integer a=sc.nextInt();
        switch(a)
        {
            case 1: ob.add(20);
                    ob.Traverse();
                    break;
            case 2: ob.Traverse();
                    break;
            case 3: System.out.println(ob.Search(3));
                    ob.Traverse();
                    break;
            case 4: System.out.println(ob.getElementAt(3));
                    ob.Traverse();
                    break;
            case 5: if(ob.isempty())
                    System.out.println("Arraylist is empty");
            }
    }
}
