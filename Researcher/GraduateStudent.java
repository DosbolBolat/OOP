package OOP.Researcher;
import OOP.UserSystem.User;

import java.util.ArrayList;
import java.util.List;

public class GraduateStudent extends User{
    private int HIndex;
    private List<ResearchProject> publishedProjects = new ArrayList<>();

    public GraduateStudent(String username, String password) {
        super(username, password);
    }
    public GraduateStudent(String username, String password, int HIndex) {
        super(username, password);
        this.HIndex = HIndex;
    }

    public void addPublishedProject(ResearchProject project) {
        publishedProjects.add(project);
    }

    public List<ResearchProject> getPublishedProjects() {
        return publishedProjects;
    }

}
