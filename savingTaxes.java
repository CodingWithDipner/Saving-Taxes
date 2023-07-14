import java.util.Scanner;

public class savingTaxes {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
        int T=sc.nextInt();
    
        for(int i=1;i<=T;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
        
            int Z=X-Y;
            System.out.println(Z);
       
        }
    }
}
