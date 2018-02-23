package www.personalwebsite.com.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.personalwebsite.com.entities.Project;
import www.personalwebsite.com.repository.ProjectRepository;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ProjectRepository getProjectRepository() {
        return projectRepository;
    }

    public void setProjectRepository(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void insertNewProject(Project project){

        projectRepository.save(project);
    }
    public List<Project> getAllProjects(){

        return projectRepository.findAll();
    }
    public Project getProject (int id ){
        return projectRepository.findOne(id);
    }
}
