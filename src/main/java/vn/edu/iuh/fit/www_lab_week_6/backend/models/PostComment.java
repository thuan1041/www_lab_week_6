package vn.edu.iuh.fit.www_lab_week_6.backend.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.util.Set;

@Getter
@Entity
@Table(name = "post_comment")
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "varchar(100)")
    private String title;
    @Column(columnDefinition = "tinyint(1)")
    private Boolean published;
    @Column(columnDefinition = "text")
    private String content;
    @Column(columnDefinition = "datetime")
    private Instant publishedAt;
    @Column(columnDefinition = "datetime")
    private Instant createAt;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post ;
    @OneToMany(mappedBy = "parent")
    private Set<PostComment> postComments;
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private PostComment parent;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public PostComment() {
    }

    public PostComment(Post post, String title, Long id, Set<PostComment> postComments, Boolean published, String content, Instant publishedAt, Instant createAt, PostComment parent, User user) {
        this.post = post;
        this.title = title;
        this.id = id;
        this.postComments = postComments;
        this.published = published;
        this.content = content;
        this.publishedAt = publishedAt;
        this.createAt = createAt;
        this.parent = parent;
        this.user = user;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPostComments(Set<PostComment> postComments) {
        this.postComments = postComments;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public void setParent(PostComment parent) {
        this.parent = parent;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "post=" + post +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", postComments=" + postComments +
                ", published=" + published +
                ", content='" + content + '\'' +
                ", publishedAt=" + publishedAt +
                ", createAt=" + createAt +
                ", parent=" + parent +
                ", user=" + user +
                '}';
    }
}
