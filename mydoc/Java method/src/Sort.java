import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int n,temp;
        System.out.println("");
        n= sc. nextInt();
        int a[]= new int[n];
        System.out.println("");
        
        for(int i=0; i < n; i++)
        { 
        	a[i] = sc. nextInt();
        }
        for(int i=0; i<n; i++)
        {
        	for(int j = i+1; j < n; j++)
        	{
        		if(a[i] > a[j])
        				{
        					temp =a[i];
        					a[i] = a[j];
        					a[j] = temp;
        				}
        	}
        }
        

	}

}
