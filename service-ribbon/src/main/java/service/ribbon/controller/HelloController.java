package service.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ribbon.service.HelloService;

/**
 * @author Civin
 * Created: 2018-05-15 下午9:35
 * Email :  s_huanqiang@jiedaibao.com
 */
@RestController
public class HelloController {

	@Autowired
	HelloService helloService;
	@RequestMapping(value = "/hi")

	public String hi(@RequestParam String name){
		return helloService.hiService(name);
	}
}
