package OOP.Researcher;
import java.util.Vector;

public class ResearchProject{
    private String TopicName;

    private Vector<ResearchPaper> publishedPapers;

    private Vector<Researcher> participant;

    public ResearchProject(String topicName) {
        TopicName = topicName;
    }

    public String getTopicName() {
        return this.TopicName;
    }

    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public Vector<ResearchPaper> getPublishedPapers() {
        return this.publishedPapers;
    }

    public void setPublishedPapers(ResearchPaper paper) {
        this.publishedPapers.add(paper);
    }

    public Vector<Researcher> getParticipant() {
        return this.participant;
    }

    public void setParticipant(Vector<Researcher> participant) {
        this.participant = participant;
    }

    public void addParticipant(Researcher researcher) throws CustomException {
        if (!researcher.getClass().equals(Researcher.class)) {
            throw new CustomException("Only researchers can participate in the project.");
        }
        participant.add(researcher);
    }
}
