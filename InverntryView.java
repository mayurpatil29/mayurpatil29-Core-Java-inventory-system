package InvertyOfProduct;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InverntryView {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner ans = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		InventryManageControl invenManage = new InventryManageControl();
		System.out.println("welcome to inverty management system");
		
		    while(true) {
			System.out.println("to perform a operation");
			System.out.println("1. add products.\n2. to remove a product.\n3. to update a product.\n4. display invery");
			int nextInt = ans.nextInt();
			switch (nextInt) {
			case 1:
				System.out.println("enter product id");
				int productID = ans.nextInt();
				ans.nextLine();
				System.out.println("enter product name");
				String productName = ans.nextLine();
				System.out.println("enter product price");
				float productPrice  = ans.nextFloat();
				System.out.println("enter product quanity");
				int productquantity  = ans.nextInt();
				Date dateTostore = new Date();
				String date = format.format(dateTostore);
				InventModel allItems = new InventModel(productID, productName, date, productPrice, productquantity);
				
				boolean invent = invenManage.addInvent(allItems);
				if(invent) {
					System.out.println("Successfully addd");
				}else {
					System.out.println("operation fails");
					
				}
				break;
				
			case 2:
				System.out.println("enter a id for remove ");
				int nextInt2 = ans.nextInt();
				boolean removeInvent = invenManage.removeInvent(nextInt2);
				if(removeInvent) {
					System.out.println("Successfully remove");
				}else {
					System.out.println("operation fails");
					
				}
				break;
			case 3:
				System.out.println("enter a product id to update a quantity");
				int nextInt3 = ans.nextInt();
				System.out.println("enter a updated a quantity");
				int nextInt4 = ans.nextInt();
				
				boolean updateInevent = invenManage.updateInevent(nextInt3, nextInt4);
				if(updateInevent) {
					System.out.println("Successfully update");
				}else {
					System.out.println("operation fails");
					
				}
				break;
			case 4:
				System.out.println("to show all the inventry");
				invenManage.showInvent();
			
				break;
			 default:
				break;
			}
			
		}
		
	
	
	}
}

