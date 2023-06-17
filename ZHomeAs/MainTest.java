package ZHomeAs;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 

public class MainTest {

    public static void main(String[] args) {
        List<Region> regions = new ArrayList<>();
        regions.add(new Region(1, "Europe"));
        regions.add(new Region(2, "Americas"));
        regions.add(new Region(3, "Asia"));
        regions.add(new Region(4, "Middle East and Africa"));

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("IT", "Italy", 1));
        countries.add(new Country("JP", "Japan", 3));
        countries.add(new Country("US", "United States of America", 2));
        countries.add(new Country("CA", "Canada", 2));
        countries.add(new Country("CN", "China", 3));
        countries.add(new Country("IN", "India", 3));
        countries.add(new Country("AU", "Australia", 3));
        countries.add(new Country("ZW", "Zimbabwe", 4));
        countries.add(new Country("SG", "Singapore", 3));
        countries.add(new Country("UK", "United Kingdom", 1));
        countries.add(new Country("FR", "France", 1));
        countries.add(new Country("DE", "Germany", 1));
        countries.add(new Country("ZM", "Zambia", 4));
        countries.add(new Country("EG", "Egypt", 4));
        countries.add(new Country("BR", "Brazil", 2));
        countries.add(new Country("CH", "Switzerland", 1));
        countries.add(new Country("NL", "Netherlands", 1));
        countries.add(new Country("MX", "Mexico", 2));
        countries.add(new Country("KW", "Kuwait", 4));
        countries.add(new Country("IL", "Israel", 4));
        countries.add(new Country("DK", "Denmark", 1));
        countries.add(new Country("HK", "HongKong", 3));
        countries.add(new Country("NG", "Nigeria", 4));
        countries.add(new Country("AR", "Argentina", 2));
        countries.add(new Country("BE", "Belgium", 1));

        
        for (Region region : regions) {
            List<Country> countriesInRegion = countries.stream()
                    .filter(country -> country.getRegionId() == region.getId())
                    .collect(Collectors.toList());

            for (Country country : countriesInRegion) {
                region.addCountry(country);
            }
        }
        
        // Print the countries region-wise
        for (Region region : regions) {
            region.printCountries();
            // int countryCount = region.getCountryCount();
            //System.out.println("Number of countries in " + region.getName() + ": " + countryCount);
            System.out.println();
        }

        
        // Count countries in a region
        int regionId = 3;
        for (Region region : regions) {
            if (region.getId() == regionId) {
//                region.printCountries();
                int countryCount = region.getCountryCount();
                System.out.println("Number of countries in " + region.getName() + ": " + countryCount);
                System.out.println();
                break;
            }
        }

        // Accept region ID and print all countries belonging to that region
           regionId = 4;
        for (Region region : regions) {
            if (region.getId() == regionId) {
                region.printCountries();
                break;
            }
        }
        
    }
}

