import java.util.Scanner;
public class ProductDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Product p= new Product();
		
		System.out.println("Enter the product id");
		long id= Integer.parseInt(s.nextLine());
		p.setId(id);
		
		
		System.out.println("Enter the product name");
		p.setProductName(s.nextLine());
		
		System.out.println("Enter the supplier name");
		p.setSupplierName(s.nextLine());
		
		System.out.println("Product id is : "+p.getId());
		System.out.println("Product Name is : "+p.getProductName());
		System.out.println("Supplier Name is : "+p.getSupplierName());
	
		
		
		
	}

}
