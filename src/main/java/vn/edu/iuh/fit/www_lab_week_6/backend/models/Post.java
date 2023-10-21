package vn.edu.iuh.fit.www_lab_week_6.backend.models;

import jakarta.persistence.Entity;

import java.time.Instant;
import java.util.Set;

@Entity
public class Post {
    private long id;
    private Boolean published;
    private String content;
    private Post parent;
    private String metaTitle;
    private String summary;
    private Instant createAt;
    private Set<Post> posts;
    private String title;
    private User author;
    private Instant updatedAt;
    private Instant publishedAt;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getPublishedAt() {
        return publishedAt;
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
