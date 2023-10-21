package vn.edu.iuh.fit.www_lab_week_6.backend.models;

import java.time.Instant;
import java.util.Set;

public class PostComment {
    private Post post ;
    private String title;
    private Long id;
    private Set<PostComment> postComments;
    private Boolean published;
    private String content;
    private Instant publishedAt;
    private Instant createAt;
    private PostComment parent;
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

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<PostComment> getPostComments() {
        return postComments;
    }

    public void setPostComments(Set<PostComment> postComments) {
        this.postComments = postComments;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public PostComment getParent() {
        return parent;
    }

    public void setParent(PostComment parent) {
        this.parent = parent;
    }

    public User getUser() {
        return user;
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
