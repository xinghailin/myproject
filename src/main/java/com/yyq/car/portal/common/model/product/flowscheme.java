package com.yyq.car.portal.common.model.product;

import java.util.Date;

public class flowscheme {
    private Integer id;

    private Integer userid;

    private String username;

    private String taskatatus;

    private Integer taskid;

    private Integer tasktype;

    private Integer tasktype1;

    private String nopasscause;

    private Date createtime;

    private String taskname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTaskatatus() {
        return taskatatus;
    }

    public void setTaskatatus(String taskatatus) {
        this.taskatatus = taskatatus == null ? null : taskatatus.trim();
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getTasktype() {
        return tasktype;
    }

    public void setTasktype(Integer tasktype) {
        this.tasktype = tasktype;
    }

    public Integer getTasktype1() {
        return tasktype1;
    }

    public void setTasktype1(Integer tasktype1) {
        this.tasktype1 = tasktype1;
    }

    public String getNopasscause() {
        return nopasscause;
    }

    public void setNopasscause(String nopasscause) {
        this.nopasscause = nopasscause == null ? null : nopasscause.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", taskatatus=").append(taskatatus);
        sb.append(", taskid=").append(taskid);
        sb.append(", tasktype=").append(tasktype);
        sb.append(", tasktype1=").append(tasktype1);
        sb.append(", nopasscause=").append(nopasscause);
        sb.append(", createtime=").append(createtime);
        sb.append(", taskname=").append(taskname);
        sb.append("]");
        return sb.toString();
    }
}