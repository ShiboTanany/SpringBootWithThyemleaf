package www.personalwebsite.com.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import www.personalwebsite.com.Services.ProjectService;
import www.personalwebsite.com.entities.Project;
import www.personalwebsite.com.entities.Skill;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Controller
public class ProjectController {
    @Autowired
    private ProjectService projectService;


    public ProjectService getProjectService() {
        return projectService;
    }

    public void setProjectService(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(value = "/project/insert", method = RequestMethod.POST)
    public ResponseEntity<Project> saveProject(@RequestBody Project project) {
        projectService.insertNewProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/project/allProjects", method = RequestMethod.POST)
    public ResponseEntity<List<Project>> getProjects() {
        return new ResponseEntity<List<Project>>(projectService.getAllProjects(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/project/getProject", method = RequestMethod.POST)
    public ResponseEntity<Project> getProject(@RequestBody Project project) {
        Project projectOutput = projectService.getProject(project.getId());
        HttpStatus httpStatus = projectOutput != null ? HttpStatus.ACCEPTED : HttpStatus.NO_CONTENT;
        return new ResponseEntity<Project>(project, httpStatus);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome(Map<String, Object> model,HttpServletRequest httpRequest) {

        Enumeration<String> headerNames=httpRequest.getHeaderNames();
        Map<String, String> map = new HashMap<>();


        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = httpRequest.getHeader(key);
            map.put(key, value);
        }
        System.out.println(httpRequest.getRemoteAddr());
        map.forEach((s, s2) -> System.out.println(s+"***"+s2));


        List<Skill>  skills=new ArrayList<>();
        skills.add(new Skill(1,"Java","excellent"));
        skills.add(new Skill(2,"Hibernate","veryGood"));
        skills.add(new Skill(3,"Spring","good"));
        skills.add(new Skill(3,"Hadoop","medium"));
        skills.add(new Skill(3,"Spring Cloud ","good"));
        skills.add(new Skill(3,"spring cache","knoweldge"));
        skills.add(new Skill(3,"spring","heardAboutIt"));
        model.put("skills", skills);

        model.put("projects", "");
        model.put("", "");
        return "index";
    }
    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String showBLog(Map<String, Object> model) {
        model.put("", "");
        return "blog";
    }

    @RequestMapping(value = "/files/cv", method = RequestMethod.GET)
    public void getFile(

            HttpServletResponse response) throws IOException {
        String src= "main/resources/templates/files/cv.pdf";
        InputStream is = new FileInputStream(src);
        IOUtils.copy(is, response.getOutputStream());
        response.flushBuffer();
    }

    @RequestMapping(value = "/contactUs", method = RequestMethod.POST)
    public String sendContactUS(HttpServletRequest httpRequest) {

        Enumeration<String> headerNames=httpRequest.getHeaderNames();
        Map<String, String> map = new HashMap<>();


        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = httpRequest.getHeader(key);
            map.put(key, value);
        }
        System.out.println(httpRequest.getRemoteAddr());
       map.forEach((s, s2) -> System.out.println(s+"***"+s2));


        System.out.println(httpRequest.getParameter("contactName"));
              return "blog";
    }


}
