import java.io.*;
import java.util.*;
class Task5{
    public static void main(String args[]){
        String l=null;
        int tot_trans=0;
        float tot_bill=0;
        float m=0;
        float min=9999;
        try{
            BufferedReader b = new BufferedReader(new FileReader("Task5.csv"));
            while((l= b.readLine())!=null){
                String [] trans=l.split(",");
                tot_bill+=Float.parseFloat(trans[3]);
                tot_trans++;
                if(Float.parseFloat(trans[3])>m){
                    m=Float.parseFloat(trans[3]);
                }
                if(Float.parseFloat(trans[3])<min){
                    min=Float.parseFloat(trans[3]);
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Choice:\n");
        System.out.println("1.Total number of Transactions");
        System.out.println("2.Total bill amount");
        System.out.println("3.Maximum bill amount");
        System.out.println("4.Minimum Bill amount");
        int n=sc.nextInt();
        sc.close();
        if(n==1){
            System.out.println("Total Number of Transactions: "+tot_trans);
        }
        if(n==2){
            System.out.println("Total Bill Amount: "+tot_bill);
        }
        if(n==3){
            System.out.println("Total Number of Transactions: "+m);
        }
        if(n==4){
            System.out.println("Total Number of Transactions: "+min);
        }
    }
}