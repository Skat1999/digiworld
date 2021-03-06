package digiworld.store;

public class Product {
	
	private int ID;
	private String Name;
	private int Service;
	private String Description;
	private float Price;
	private int DiscountPercentage;
	private String Region;
	private boolean Is_DLC;
	private String category;
	
	
	public Product(int ID, String Name, int Service, String Description, float Price, int DiscountPercentage, String Region, boolean Is_DLC, String category)
	{
		this.ID = ID;
		this.Name = Name;
		this.Service = Service;
		this.Description = Description;
		this.Price = Price;
		this.DiscountPercentage = DiscountPercentage;
		this.Region = Region;
		this.Is_DLC = Is_DLC;
		this.category = category;
				
				
				
	}

	public int getID()
	{
		return this.ID;
	}
	
	public String getName()
	{
		return this.Name;
	}
	
	
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public int getService()
	{
		return this.Service;
	}
	
	public void setService(int Service)
	{
		this.Service = Service;
	}
	
	public String getDescription()
	{
		return this.Description;
	}

	public void setDescription(String Description)
	{
		this.Description = Description;
	}
	
	public float getPrice()
	{
		return this.Price;
	}
	
	public void setPrice(float Price)
	{
		this.Price = Price;
	}
	
	public int getDiscount()
	{
		return this.DiscountPercentage;
	}
	
	public void setDiscount(int Percentage)
	{
		this.DiscountPercentage = Percentage;
	}
	
	public String getRegion() 
	{
		return this.Region;
	}
	
	public int getStock()
	{
		return ProductUtils.countKeysStock(this.ID);
	}
	
	public void setRegion(String Region)
	{
		this.Region = Region;
	}
	
	public boolean IsDLC()
	{
		return this.Is_DLC;
	}
	
	public void setDLC(boolean isDLC)
	{
		this.Is_DLC = isDLC;
	}
	
	public float getDiscountPrice()
	{
		if(this.DiscountPercentage > 0)
		{
			float finalprice = this.Price;
			finalprice = finalprice - (finalprice * this.DiscountPercentage / 100);
			
			return finalprice;
		} else { return this.Price; } 
	}
}

