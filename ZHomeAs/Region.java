package ZHomeAs;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private int id;
    private String name;
    private List<Country> countries;

    Region()
    {
    	// TODO Auto-generated method stub
    }
    public Region(int id, String name) {
        this.id = id;
        this.name = name;
        this.countries = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public int getCountryCount() {
        return countries.size();
    }

    public void printCountries() {
        System.out.println("Countries in " + name + ":");
        countries.forEach(country -> System.out.println(country.getName()));
    }
    public String getName() {
       return name;
     }
	public int getId() { 
		return id;
	}
}
