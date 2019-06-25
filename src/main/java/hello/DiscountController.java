package hello;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {

    private DiscountFileData discountFileData = new DiscountFileData() ;

    @RequestMapping("/discount")
    public int selectAfterDiscountAmount(@RequestParam(value="userType", defaultValue="Standard") String userType, @RequestParam(value="amount", defaultValue = "1050") int amount) {
    	

        List<Discount> discountList = discountFileData.selectDiscountList();
    	
    	int discountValue = 0;
    	for(Discount d  :  discountList ) {
    		
    		if(d.getType().equals(userType)) {
    			if(amount > d.getStartRange())
    			{
    				 int discountAmount = (amount <= d.getEndRange() ) ? amount - d.getStartRange() : d.getEndRange() - d.getStartRange() ;
    				discountValue = discountValue + (discountAmount * d.getDiscountValue() / 100); 
    			}
    		}
    		
    	}
    	
    	return amount - discountValue;
    }

}