package www.personalwebsite.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import www.personalwebsite.com.entities.Project;
import www.personalwebsite.com.entities.Skill;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class DefaultController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome(Map<String, Object> model, HttpServletRequest httpRequest) {

        Enumeration<String> headerNames = httpRequest.getHeaderNames();
        Map<String, String> map = new HashMap<>();


        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = httpRequest.getHeader(key);
            map.put(key, value);
        }
        System.out.println(httpRequest.getRemoteAddr());
        map.forEach((s, s2) -> System.out.println(s + "***" + s2));


        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill(1, "Java", "excellent"));
        skills.add(new Skill(2, "Hibernate", "veryGood"));
        skills.add(new Skill(3, "Spring", "good"));
        skills.add(new Skill(3, "Hadoop", "medium"));
        skills.add(new Skill(3, "Spring Cloud ", "good"));
        skills.add(new Skill(3, "spring cache", "knoweldge"));
        skills.add(new Skill(3, "spring", "heardAboutIt"));
        model.put("skills", skills);


        List<Project> projects = new ArrayList<>();
        projects.add(new Project("Stage Mandrine", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 12", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 13", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 14", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 15", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 16", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 17", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 18", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 19", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 20", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 21", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));

        projects.add(new Project("Stage 22", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        projects.add(new Project("Stage 23", "https://github.com/ShiboTanany/stage_mandarine-",
                "Test description", "images/portfolio/console.jpg", new Date()
                .toString()));
        model.put("projects", projects);
        model.put("", "");
        return "index";
    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String getLoginPage() {
//
//            return "login";
//
//    }


}
