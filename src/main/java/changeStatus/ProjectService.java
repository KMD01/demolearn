package changeStatus;

import javax.persistence.EntityNotFoundException;

public class ProjectService {

    Project project;
    ProjectRepository projectRepository;

    public void changeStatus(Project project){
        project.setStatus(project.isActive()
                ? Status.INACTIVE
                : Status.ACTIVE);
    }

    public Project getOneAccount(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Account with id " + id + " doesn't exist"));
    }


}
