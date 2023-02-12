import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=a[n-1];
        int e=0;
        for(int i=1;i<=c;i++){
            for(int j=0;j<n;j++){
                if(i==a[j]){
                   e++;
                }
            }
            if(e==0){
                System.out.print(i+" ");
            }
            e=0;
        }
    }
}
