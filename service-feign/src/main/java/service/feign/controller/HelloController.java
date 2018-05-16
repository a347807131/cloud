package service.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.feign.SchedualServiceHi;

/**
 * @author Civin
 * Created: 2018-05-15 下午10:00
 * Email :  s_huanqiang@jiedaibao.com
 */
@RestController
public class HelloController {

	@Autowired
	SchedualServiceHi schedualServiceHi;
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String sayHi(@RequestParam String name){
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}
