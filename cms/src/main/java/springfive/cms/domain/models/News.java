package springfive.cms.domain.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="news")
public class News {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy="uuid")
    String id;

    String title;

    String content;

    @ManyToOne
    User author;

    @ElementCollection
    Set<User> mandatoryReviewers = new HashSet<>();

    @OneToMany
    Set<Review> reviewers = new HashSet<>();

    @ElementCollection
    Set<Category> categories = new HashSet<>();

    @ElementCollection
    Set<Tag> tag = new HashSet<>();


    public Boolean revised(){
        return this.mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
                .anyMatch(review -> reviewer.id.equals(review.userId) && "approved".equals(review.status)));
    }

    public Review review(String userId, String status){
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }
}
