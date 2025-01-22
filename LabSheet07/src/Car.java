
public class Car {
	
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car(){
		companyName = "Unknow";
		modelName = "Unknow";
		year = 2000;
		mileage = 0.0;

	}
	
	Car(String companyName, String modelName,int year,double mileage){
		this.companyName = companyName;;
		this.modelName = modelName;
		
		this.year = year >= 1886? year:2000;
		this.mileage = mileage;
		
	}
	
	
	public void setCompanyName (String companyName) {
		
		if (companyName != null && !companyName.trim().isEmpty()) {
			this.companyName =companyName;
			
		}else {
			
			System.out.println("Error: Invalid company or model name!");
		}	
		
	}	
    public void setModelName (String modelName) {
		
		if (modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
			
		}else {
			
			System.out.println("Error: Invalid company or model name!");
		}
    }
    public void setYear(int year) {
    	if (year >= 1886) {
    		    this.year = year;		
    	}else {
    		System.out.println("Error: Invalid year!");   		
    	}
    	  	
    }
    
    public String getCompanyName() {
		return this.companyName;
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public int getYear() {
		return this.year;
	}
    public String toString() {
    	return "Comoany Name:"+this.companyName
    	       +"\nModel Name:"+this.modelName
    	       +"\nYear:"+this.year
    	       +"\nMileage:"+this.mileage;
    	
    }
 
}
