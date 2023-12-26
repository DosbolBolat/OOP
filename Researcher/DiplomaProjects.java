package OOP.Researcher;
public class DiplomaProjects {
    private ResearchProject Project;
    private GraduateStudent GraduateStudent;

    public ResearchProject getListOfProject() {
        return this.Project;
    }


    public void setListOfProject(ResearchProject ListOfProject) {
        this.Project = ListOfProject;
    }

    public GraduateStudent getGraduateStudent() {
        return this.GraduateStudent;
    }

    public void setGraduateStudent(GraduateStudent  GraduateStudent) {
        this.GraduateStudent = GraduateStudent;
    }


    public void publishProject() {
        if (Project != null) {
            System.out.println("Project Published: " + Project.getTopicName());
            GraduateStudent.addPublishedProject(Project);
        } else {
            System.out.println("No project to publish.");
        }
    }
}
