package uz.suyo.redis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;

@RedisHash(value = "cache_item", timeToLive = 600)
public class User implements Serializable {
    @Id
    @Indexed
    @SequenceGenerator(name = "SEQ_GEN", sequenceName = "SEQ_USER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_GEN")
    private Long id;
    private String name;
    private long followers;

    public User() {
    }

    public User(String name, long followers) {
        this.name = name;
        this.followers = followers;
    }

    //standard getters and setters

    @Override
    public String toString() {
        return String.format("User{id=%d, name='%s', followers=%d}", id, name, followers);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFollowers() {
        return followers;
    }

    public void setFollowers(long followers) {
        this.followers = followers;
    }
}
