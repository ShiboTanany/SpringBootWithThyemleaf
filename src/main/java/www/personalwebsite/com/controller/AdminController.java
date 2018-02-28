package www.personalwebsite.com.controller;

import org.hibernate.jpa.internal.schemagen.ScriptTargetOutputToFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/Admins/admin")
public class AdminController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome() {
        return "AdminHome";

    }



}
