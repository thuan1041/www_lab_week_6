package vn.edu.iuh.fit.www_lab_week_6.backend.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.util.Set;
@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(20)")
    private long id;
    @Column(name ="mobile", columnDefinition = "varchar(15)")
    private String mobile;
    @Column(name ="lastLogin")
    private Instant lastLogin;
    @Column(name = "last_name", columnDefinition = "varchar(50)")
    private String lastName;
    @Column(columnDefinition = "tinytext")
    private String intro;
    @Column(columnDefinition = "text")
    private String profile;
    @Column(name = "registerd_at",columnDefinition = "varchar(32)")
    private Instant registerdAt;
    @Column(name = "first_name", columnDefinition = "varchar(50)")
    private String firstName;
    @Column(name = "middle_name", columnDefinition = "varchar(50)")
    private String middleName;
    @Column(columnDefinition = "varchar(50)")
    private String email;
    @OneToMany(mappedBy = "user")
    private Set<PostComment> comments;
    @OneToMany(mappedBy = "author")
    private Set<Post> posts;


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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setLastLogin(Instant lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setRegisterdAt(Instant registerdAt) {
        this.registerdAt = registerdAt;
    }

    public void setComments(Set<PostComment> comments) {
        this.comments = comments;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
