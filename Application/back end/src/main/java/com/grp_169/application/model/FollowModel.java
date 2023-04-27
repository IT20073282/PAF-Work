package com.grp_169.application.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Follow")

public class FollowModel{
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name ="PersonID")
    private Integer pid;

    @Column (name = "FollowerID")
    private Integer fid;

    private Integer isFollow;

    private Integer isFriend;

    public FollowModel(){

    }

    public FollowModel(Integer pid, Integer fid, Integer isFollow, Integer isFriend) {
        this.pid = pid;
        this.fid = fid;
        this.isFollow = isFollow;
        this.isFriend = isFriend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getIsFollow() {
        return isFollow;
    }

    public void setIsFollow(Integer isFollow) {
        this.isFollow = isFollow;
    }

    public Integer getIsFriend() {
        return isFriend;
    }

    public void setIsFriend(Integer isFriend) {
        this.isFriend = isFriend;
    }

    

}
