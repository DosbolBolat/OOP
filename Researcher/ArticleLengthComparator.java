package OOP.Researcher;

import java.util.Comparator;

public class ArticleLengthComparator implements Comparator<ResearchPaper> {
    public int compare(ResearchPaper paper1, ResearchPaper paper2) {
        return Integer.compare(paper1.getPages(), paper2.getPages());
    }
}
