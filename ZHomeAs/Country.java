package ZHomeAs;

public class Country {
	private String code;
    private String name;
    private int regionId;

    Country()
    {
    	// TODO Auto-generated method stub
    }
    public Country(String code, String name, int regionId) {
        this.code = code;
        this.name = name;
        this.regionId = regionId;
    }
    
    public String getCode() {
    	return code;
    }
    
    public String getName() {
        return name;
    }

    public int getRegionId() {
        return regionId;
    }
}
