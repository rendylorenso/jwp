package com.uts.jwp.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Courses {

    @NotBlank(message = "courseCode name is required")
    private String courseCode;

    @NotBlank(message = "CourseName is required")
    @Size(min = 5, max = 10)
    private String courseName;

    @NotNull(message = "TotSKS is required")
    private int totSKS;

    @NotBlank(message = "Faculty is required")
    private String faculty;

    public Courses() {

    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTotSKS() {
        return totSKS;
    }

    public void setTotSKS(int totSKS) {
        this.totSKS = totSKS;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}
