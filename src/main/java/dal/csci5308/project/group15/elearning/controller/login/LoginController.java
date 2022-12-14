package dal.csci5308.project.group15.elearning.controller.login;

import dal.csci5308.project.group15.elearning.factory.authUser.AuthUserUserFactory;
import dal.csci5308.project.group15.elearning.factory.authUser.IAuthUserFactory;
import dal.csci5308.project.group15.elearning.security.IAuthUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController
{
    @RequestMapping("/")
    public String login()
    {
        IAuthUserFactory authFactory = AuthUserUserFactory.instance();
        IAuthUser authUser = authFactory.makeAuthUser();

        if(authUser.isAdmin())
        {
            System.out.println("admin");
            return "redirect:/registerUser";
        }
        else if(authUser.isProfessor())
        {
            System.out.println("professor");
            return "redirect:/professor/dashboard";
        }
        else if(authUser.isStudent())
        {
            System.out.println("student");
            return "redirect:/student/dashboard";
        }

        return "redirect:/login";
    }
}
