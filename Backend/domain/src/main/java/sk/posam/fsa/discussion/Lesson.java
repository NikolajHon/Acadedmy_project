package sk.posam.fsa.discussion;

public class Lesson {
    private Long id;
    private String title;
    private String content;
    private Course course;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public Course getCourse() { return course; }

    public void setCourse(Course course) { this.course = course; }
}
