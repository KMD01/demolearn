package generalSolutions;

import javax.persistence.EntityNotFoundException;

public class generalSolutions {

    Project project;
    ProjectRepository projectRepository;

 /*   public void changeStatus(Project project){
        project.setStatus(project.isActive()
                ? Status.INACTIVE
                : Status.ACTIVE);
        ProjectRepository.saveAndFlush(project);
    }*/

  /*  public Project getOneAccount(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Account with id " + id + " doesn't exist"));
    }*/


}
