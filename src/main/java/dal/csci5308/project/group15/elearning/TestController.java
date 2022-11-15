package dal.csci5308.project.group15.elearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController 
{
	@GetMapping("/health")
	public String healthCheck()
	{
		return "OK!";
	}
}