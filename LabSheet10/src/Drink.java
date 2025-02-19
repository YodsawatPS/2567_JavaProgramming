
public class Drink {
	private int type;
	private char size;
	
	Drink(int type ,char size){
		this.type = type;
		this.size = size;		
	}
	
	Drink(){
		this(0, ' ');
		
	}
	
	public String getTypeName() {
		if(type == 1) {
			return "Hot";			
		}else if (type == 2) {
			return "Cold";		
		}
		return null;	
	}
	
	public int getTypePrice() {
		if(type == 1) {
			return
					10;			
		}else if (type == 2) {
			return 20;		
		}
		return 0;		
	}
	

}
