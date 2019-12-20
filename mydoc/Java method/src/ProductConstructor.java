import java.util.Scanner;
public class ProductConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		
		System.out.println("Enter the product id");
		long id=Integer.parseInt(sc.nextLine());
		p.setId(id);
		
		System.out.println("Enter the product name");
		p.setProductName(sc.nextLine());
		
		System.out.println("Enter the supplier name");
		p.setSupplierName(sc.nextLine());
		
		
		
		
		System.out.println("Product id is :  "+p.getId());
		System.out.println("Product Name is : "+p.getProductName());
		System.out.println("Suplier Name is :"+p.getSupplierName());
		
	}
}
