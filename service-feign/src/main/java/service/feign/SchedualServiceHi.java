package service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Civin
 * Created: 2018-05-15 下午9:59
 * Email :  s_huanqiang@jiedaibao.com
 */
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {

	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
