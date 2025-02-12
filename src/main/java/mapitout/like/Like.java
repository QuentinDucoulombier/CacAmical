package mapitout.like;


import java.util.Date;

import mapitout.caca.Caca;
import mapitout.user.User;
import jakarta.persistence.*;

@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "likeId")
    private Long LikeId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "cacaId")
    private Caca caca;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "likeDate")
    private Date likeDate;

    // Constructors, getters, and setters

    public Like() {
        // Default constructor
    }

    public Like(User user, Caca caca, Date likeDate) {
        this.user = user;
        this.caca = caca;
        this.likeDate = likeDate;
    }

    // Getters and setters for the fields
    public Long getLikeId() {
        return LikeId;
    }
    public void setLikeId(Long likeId) {
        LikeId = likeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Caca getCaca() {
        return caca;
    }

    public void setCaca(Caca caca) {
        this.caca = caca;
    }

    public Date getLikeDate() {
        return likeDate;
    }

    public void setLikeDate(Date likeDate) {
        this.likeDate = likeDate;
    }

    @PrePersist
    public void beforeSave() {
        likeDate = new Date();
    }
}
