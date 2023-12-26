package OOP.Researcher;
import OOP.UserSystem.Employee;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Researcher implements Comparable<Researcher>, Supervisor{
    private String name;
    private ResearchProject researchPapers;

    public Researcher(String name) {
        this.name = name;
    }

    public void addResearchPaper(ResearchPaper paper) {
        researchPapers.setPublishedPapers(paper);
    }

    public void printPapers(Comparator<ResearchPaper> comparator) {
        researchPapers.getPublishedPapers().sort(comparator);
        for (ResearchPaper paper : researchPapers.getPublishedPapers()) {
            System.out.println(paper);
        }
    }
    @Override
    public int compareTo(Researcher o) {
        return this.name.compareTo(o.name);
    }

    public int calculateHIndex(List<ResearchPaper> papers) {
        Collections.sort(papers, Collections.reverseOrder());

        int hIndex = 0;
        for (int i = 0; i < papers.size(); i++) {
            int citations = papers.get(i).getCitations();
            if (citations >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }
        return hIndex;
    }
}
