package vn.edu.iuh.fit.www_lab_week_6.backend.models;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Set;
@Entity
@Table(name = "user")
public class User {
    @Column(name ="mobile", length = 15)
    private String mobile;
    @Column(name ="lastLogin")
    private Instant lastLogin;
    private String lastName;
    private String intro;
    private String profile;
    private Instant registerdAt;
    private Set<PostComment> comments;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    private String middleName;
    private Set<Post> posts;
    private String firstName;
    private String email;

    public User() {
    }

    public User(String mobile, Instant lastLogin, String lastName, String intro, String profile, Instant registerdAt, Set<PostComment> comments, long id, String middleName, Set<Post> posts, String firstName, String email) {
        this.mobile = mobile;
        this.lastLogin = lastLogin;
        this.lastName = lastName;
        this.intro = intro;
        this.profile = profile;
        this.registerdAt = registerdAt;
        this.comments = comments;
        this.id = id;
        this.middleName = middleName;
        this.posts = posts;
        this.firstName = firstName;
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Instant getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Instant lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Instant getRegisterdAt() {
        return registerdAt;
    }

    public void setRegisterdAt(Instant registerdAt) {
        this.registerdAt = registerdAt;
    }

    public Set<PostComment> getComments() {
        return comments;
    }

    public void setComments(Set<PostComment> comments) {
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "mobile='" + mobile + '\'' +
                ", lastLogin=" + lastLogin +
                ", lastName='" + lastName + '\'' +
                ", intro='" + intro + '\'' +
                ", profile='" + profile + '\'' +
                ", registerdAt=" + registerdAt +
                ", comments=" + comments +
                ", id=" + id +
                ", middleName='" + middleName + '\'' +
                ", posts=" + posts +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
