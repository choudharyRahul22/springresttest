package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping(value="/", produces = "application/json; charset=UTF-8")
    public Map<Integer,String> index() {
    	Map<Integer,String> map = new HashMap<>();
    	map.put(1, "Rahul");
    	map.put(2, "Choudhary");
        return map;
    }
    
}
