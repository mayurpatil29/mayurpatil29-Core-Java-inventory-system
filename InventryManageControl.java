package InvertyOfProduct;

import java.util.HashMap;

public class InventryManageControl {
	private HashMap<Integer, InventModel> inventory = new HashMap<>();
	
	public boolean addInvent(InventModel inventryItems) {
		if(inventryItems!=null) {
			inventory.put(inventryItems.getId(), inventryItems);
			return true;
			
		}else {
			return false;
		}
		
		
	}
	public boolean removeInvent(int inventryItems) {
		if(inventory.get(inventryItems)!=null) {
			
			inventory.remove(inventryItems);
			return true;
			
		}
		else {
			return false;
		}
	}
	
	
	public InventModel getInevnt(InventModel inventItems) {
		
		return inventory.get(inventItems.getId());
		
		
	}
	public boolean updateInevent(int inventID,int invertyQuanity ) {
		InventModel inventModel = inventory.get(inventID);
		if(inventModel!=null) {
			inventModel.setQuanity(invertyQuanity);
			return true;
		}else {
			return false;
		}
	}
	
	public void showInvent() {
		if(inventory.isEmpty()) {
			System.out.println("the inventry is empty");
		}else {
			inventory.values().forEach(System.out::println);
		
		}
		
	}
	
	
	
}
