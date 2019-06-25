package hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DiscountFileData {
	
	
		String csvFile = "C://Jignesh/country.csv";
        String line = "";
        String cvsSplitBy = ",";
        
        private List<Discount> discountList = new ArrayList<Discount>() ; 

        public  List<Discount> selectDiscountList() {
        	
        	if(discountList.isEmpty()) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] discountDetails = line.split(cvsSplitBy);
                discountList.add(new Discount(discountDetails[0], Integer.parseInt(discountDetails[1]),  Integer.parseInt(discountDetails[2]),  Integer.parseInt(discountDetails[3])));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        	}
        	
		return discountList;
	}
}