package www.personalwebsite.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.personalwebsite.com.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer>{

}
