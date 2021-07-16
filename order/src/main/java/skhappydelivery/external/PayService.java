
package skhappydelivery.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="Pay", url="http://localhost:8085")
public interface PayService {
 
    @RequestMapping(method= RequestMethod.GET, path="/pays")
    public void pay(@RequestBody Pay pay);


    @RequestMapping(method= RequestMethod.POST, path="/payed")
    public void payed(@RequestBody Payed Payed);



}