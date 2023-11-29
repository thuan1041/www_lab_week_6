package vn.edu.iuh.fit.www_lab_week_6.backend.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.util.Set;

@Getter
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name= "published", columnDefinition = "bit(1)")
    private Boolean published;
    @Column(name = "content", columnDefinition = "tinytext")
    private String content;
    @ManyToOne()
    @JoinColumn(name = "parent_id")
    private Post parent;
    @Column(name = "mata_title", columnDefinition = "varchar(100)")
    private String metaTitle;
    @Column(name = "summary", columnDefinition = "tinytext")
    private String summary;
    @Column(columnDefinition = "datetime")
    private Instant createAt;
    @Column(columnDefinition = "datetime")
    private String title;
    @Column(columnDefinition = "datetime")
    private Instant updatedAt;
    @Column(columnDefinition = "datetime")
    private Instant publishedAt;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    @OneToMany(mappedBy = "parent")
    private Set<Post> posts;

    public Post() {
    }

    public Post(long id, Boolean published, String content, Post parent, String metaTitle, String summary, Instant createAt, Set<Post> posts, String title, User author, Instant updatedAt, Instant publishedAt) {
        this.id = id;
        this.published = published;
        this.content = content;
        this.parent = parent;
        this.metaTitle = metaTitle;
        this.summary = summary;
        this.createAt = createAt;
        this.posts = posts;
        this.title = title;
        this.author = author;
        this.updatedAt = updatedAt;
        this.publishedAt = publishedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", published=" + published +
                ", content='" + content + '\'' +
                ", parent=" + parent +
                ", metaTitle='" + metaTitle + '\'' +
                ", summary='" + summary + '\'' +
                ", createAt=" + createAt +
                ", posts=" + posts +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", updatedAt=" + updatedAt +
                ", publishedAt=" + publishedAt +
                '}';
    }
}
