package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import util.CacheUtil;

@Controller
@RequestMapping("/helloThree")
public class HelloThree 
{
	@RequestMapping("/redis")
    public String redisTest() {
	try {
	    boolean b = CacheUtil.setString("123", "redis");//向redis里存字符串 key-value
	    System.out.println(b);//true成功，
	    System.out.println(CacheUtil.getString("123"));//从radis里取数据 key
	} catch (Exception e) {
	    e.printStackTrace();
	    return "hello";
	}
	return "hello";
    }
}