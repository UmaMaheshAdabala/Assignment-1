import java.util.Scanner;
public class Task3 {
    public static void product_list(String list[]){
        //String list[]={"Mobiles","Laptops","Tablets","Watches"};
        //System.out.print(" ");
        for(String a:list){
            System.out.println(a);
        }
        System.out.println();
    }
    public static  void product_count(String list[],int count[]){
        //String list[]={"Mobiles","Laptops","Tablets","Watches"};
        //int count[]={200,150,180,250};
        for(int i=0;i<4;i++){
            System.out.println(list[i]+": "+count[i]);
        }
        System.out.println();
    }
    public static void product_details(String list[],int count[],String speci[],int cost[]){
       // String list[]={"Mobiles","Laptops","Tablets","Watches"};
        //int count[]={200,150,180,250};
        
        //String speci[]={"6.7 Inch Amoled Display, 8GB Ram, Snapdragon 865 Processor, 48Mega Pixel Sony IMX 686 Sensor","Intel-I10, 8GB Ram, 512GB SSD",
        //"10 Inch Amoled Display, 8GB Ram, Snapdragon 865 Processor","Heart Rate Tracking and Fitness Tracking"};

    
        //int cost[]={30000,56000,25000,5000};
        for(int i=0;i<4;i++){
            System.out.println(list[i]+": Specification :"+speci[i]+" , cost: "+cost[i]+" , count: "+count[i]);
        }
    }
    public static void Edit(int b,int c,String list[],int count[],String speci[],int cost[]){
        Scanner sc=new Scanner(System.in);
        //Scanner sc=new Scanner(System.in);
        
        // String list[]={"Mobiles","Laptops","Tablets","Watches"};
        // int count[]={200,150,180,250};
        // String speci[]={"6.7 Inch Amoled Display, 8GB Ram, Snapdragon 865 Processor, 48Mega Pixel Sony IMX 686 Sensor","Intel-I10, 8GB Ram, 512GB SSD",
        // "10 Inch Amoled Display, 8GB Ram, Snapdragon 865 Processor","Heart Rate Tracking and Fitness Tracking"};
        // int cost[]={30000,56000,25000,5000};

        
        if(b==1){
            // System.out.println("which one do you want to update \n1.Specification\n2.cost");
            
            if(c==1){
                System.out.println("Enter the specification ");
                
                speci[0]=sc.nextLine();
            }
            if(c==2){
                System.out.println("Enter the cost ");
                cost[0]=sc.nextInt();
            }
        }
        if(b==2){
            //System.out.println("which one do you want to update \n1.Specification\n2.cost");
           
            if(c==1){
                System.out.println("Enter the specification ");
                speci[1]=sc.nextLine();
                
            }
            if(c==2){
                System.out.println("Enter the cost ");
                cost[1]=sc.nextInt();
            }
        }
        if(b==3){
            //System.out.println("which one do you want to update \n1.Specification\n2.cost");
            
            if(c==1){
                 System.out.println("Enter the specification ");
                speci[2]=sc.nextLine();
            }
            if(c==2){
                System.out.println("Enter the cost ");
                cost[2]=sc.nextInt();
            }
        }
        if(b==4){
           // System.out.println("which one do you want to update \n1.Specification\n2.cost");
            
            if(c==1){
                System.out.println("Enter the specification ");
                speci[3]=sc.nextLine();
            }
            if(c==2){
                System.out.println("Enter the cost ");
                cost[3]=sc.nextInt();
            }
        }
        
        for(int i=0;i<4;i++){
            System.out.println(list[i]+": Specification :"+speci[i]+" , COST: "+cost[i]+" , COUNT: "+count[i]);
        }
    }
    public static void update(String list[],int count[],String speci[],int cost[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which quantity do you want to update");
        System.out.println("1.Mobile\n2.Laptop\n3.Tablet\n4.Watches");
        // String list[]={"Mobiles","Laptops","Tablets","Watches"};
        // int count[]={200,150,180,250};
        // String speci[]={"6.7 Inch Amoled Display, 8GB Ram, Snapdragon 865 Processor, 48Mega Pixel Sony IMX 686 Sensor","Intel-I10, 8GB Ram, 512GB SSD",
        // "10 Inch Amoled Display, 8GB Ram, Snapdragon 865 Processor","Heart Rate Tracking and Fitness Tracking"};
        // int cost[]={30000,56000,25000,5000};
        int b=sc.nextInt();
        if(b==1){
            System.out.println("Enter the new Quantity");
            count[0]=sc.nextInt();
        }
        if(b==2){
            System.out.println("Enter the new Quantity");
            count[1]=sc.nextInt();
        }
        if(b==3){
            System.out.println("Enter the new Quantity");
            count[2]=sc.nextInt();
        }
        if(b==4){
            System.out.println("Enter the new Quantity");
            count[3]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.println(list[i]+": Specification :"+speci[i]+" , COST: "+cost[i]+" , COUNT: "+count[i]);
        }
    }
    public static void main(String[] args) {
        String list[]={"Mobiles","Laptops","Tablets","Watches"};
        int count[]={200,150,180,250};
        String speci[]={"6.7 Inch Amoled Display, 8GB Ram, Snapdragon 865 Processor, 48Mega Pixel Sony IMX 686 Sensor","Intel-I10, 8GB Ram, 512GB SSD",
        "10 Inch Amoled Display, 8GB Ram, Snapdragon 865 Processor","Heart Rate Tracking and Fitness Tracking"};
        int cost[]={30000,56000,25000,5000};
        int n;
        System.out.println("Enter your choice\n1.Product List\n2.Product Count\n3.Product Details\n4.Edit Details\n5.Update Inventory");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<1 ||n>5){
            System.out.println("You Have entered wrong choice");
        }
        if(n==1){
            product_list(list);
        }
        if(n==2){
            product_count(list,count);
        }
        if(n==3){
            product_details(list,count,speci,cost);
        }
        if(n==4){
            System.out.println("Which product details do you want to Edit");
            System.out.println("1.Mobile\n2.Laptop\n3.Tablet\n4.Watches");
            int b=sc.nextInt();
            System.out.println("which one do you want to update \n1.Specification\n2.cost");
            int c=sc.nextInt();
            // int x;
            // String s;
            Edit(b,c,list,count,speci,cost);  
        }
        if(n==5){
            update(list,count,speci,cost);
        }
    }
}
