import java.util.Scanner;
public class DisplayGenCdetails{

     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
        Traniee n= new Traniee(969143,"John");
        Traniee n1= new Traniee(969144,"Priya");
        
        System.out.println("Enter the number of GenCs");
        int gen=Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<gen;i++) {
              System.out.println("Enter Employee Id");
              int empId=Integer.parseInt(sc.nextLine());
              n.setEmpId(empId);
              
              System.out.println("Enter name");
              String name=sc.nextLine();
              n1.setName(name);
              
              }
        n.display();
        n1.display();
     }

}





