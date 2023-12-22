package OOP.Transcript.Transcript;

import OOP.Courses.Course;
import OOP.Transcript.Mark;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Transcript {
    private HashMap<Course, Mark> courseMarkHashMap;
    private Double GPA;


    public Transcript(HashMap<Course, Mark> courseMarkHashMap) {
        this.courseMarkHashMap = courseMarkHashMap;
    }

    public HashMap<Course, Mark> getCourseMarkHashMap() {
        return courseMarkHashMap;
    }

    public void setCourseMarkHashMap(HashMap<Course, Mark> courseMarkHashMap) {
        this.courseMarkHashMap = courseMarkHashMap;
    }


    public Double calculateOverallGPA(){
        double totalQualityPoints = 0;
        int totalCredits = 0;

        for (Map.Entry<Course, Mark> entry : courseMarkHashMap.entrySet()) {
            Course course = entry.getKey();
            Mark mark = entry.getValue();

            int creditHours = course.getCreditsNumber();
            Double gradePoints = mark.CalculateGP();

            totalQualityPoints += creditHours * gradePoints;
            totalCredits += creditHours;
        }

        if (totalCredits == 0) {
            return 0.0;
        }

        GPA = totalQualityPoints / totalCredits;
        return GPA;
    }
}
