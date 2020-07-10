package com.dpwork.springboot.bean;

import java.util.Date;
import java.util.List;

/**
 * Description: springboot
 * Created by DP on 2020/2/21 21:41
 */
public class Project {
    private Integer id;
    private String projectName;
    private ProjectCategory projectCategory;
    private Integer projectExpectedTime;
    private Employee projectCreater;
    private Integer projectStatus;
    private Date projectCreateTime;
    private List<Task> taskList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProjectCategory getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(ProjectCategory projectCategory) {
        this.projectCategory = projectCategory;
    }

    public Integer getProjectExpectedTime() {
        return projectExpectedTime;
    }

    public void setProjectExpectedTime(Integer projectExpectedTime) {
        this.projectExpectedTime = projectExpectedTime;
    }

    public Employee getProjectCreater() {
        return projectCreater;
    }

    public void setProjectCreater(Employee projectCreater) {
        this.projectCreater = projectCreater;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Date getProjectCreateTime() {
        return projectCreateTime;
    }

    public void setProjectCreateTime(Date projectCreateTime) {
        this.projectCreateTime = projectCreateTime;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectCategory=" + projectCategory +
                ", projectExpectedTime=" + projectExpectedTime +
                ", projectCreater=" + projectCreater +
                ", projectStatus=" + projectStatus +
                ", projectCreateTime=" + projectCreateTime +
                ", taskList=" + taskList +
                '}';
    }
}
