package sk.posam.fsa.discussion;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private Long id;
    private String title;
    private String content;
    private Course course;
    private List<Assignment> assignments = new ArrayList<>();
    private List<VideoMaterial> videoMaterials = new ArrayList<>();

    public List<VideoMaterial> getVideoMaterials() {
        return videoMaterials;
    }
    public void setVideoMaterials(List<VideoMaterial> videoMaterials) {
        this.videoMaterials = videoMaterials;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public Course getCourse() { return course; }

    public void setCourse(Course course) { this.course = course; }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

}
