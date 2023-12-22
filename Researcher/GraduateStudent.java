package OOP.Researcher;
import OOP.UserSystem.User;
public class GraduateStudent extends User {
    int HIndex;

    public GraduateStudent(String username, String password, int HIndex) {
        super(username, password);
        this.HIndex = HIndex;
    }
}
