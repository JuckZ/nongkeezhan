package com.nongkeezhan.nkez.pojo;

public class Professor {
    private String professorId;

    private String professorName;

    private String professorPosition;

    private String professorYjfx;

    private String professorZl;

    private String professorPicture;

    @Override
    public String toString() {
        return "Professor{" +
                "professorId='" + professorId + '\'' +
                ", professorName='" + professorName + '\'' +
                ", professorPosition='" + professorPosition + '\'' +
                ", professorYjfx='" + professorYjfx + '\'' +
                ", professorZl='" + professorZl + '\'' +
                ", professorPicture='" + professorPicture + '\'' +
                ", professorCategory='" + professorCategory + '\'' +
                '}';
    }

    private String professorCategory;

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId == null ? null : professorId.trim();
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName == null ? null : professorName.trim();
    }

    public String getProfessorPosition() {
        return professorPosition;
    }

    public void setProfessorPosition(String professorPosition) {
        this.professorPosition = professorPosition == null ? null : professorPosition.trim();
    }

    public String getProfessorYjfx() {
        return professorYjfx;
    }

    public void setProfessorYjfx(String professorYjfx) {
        this.professorYjfx = professorYjfx == null ? null : professorYjfx.trim();
    }

    public String getProfessorZl() {
        return professorZl;
    }

    public void setProfessorZl(String professorZl) {
        this.professorZl = professorZl == null ? null : professorZl.trim();
    }

    public String getProfessorPicture() {
        return professorPicture;
    }

    public void setProfessorPicture(String professorPicture) {
        this.professorPicture = professorPicture == null ? null : professorPicture.trim();
    }

    public String getProfessorCategory() {
        return professorCategory;
    }

    public void setProfessorCategory(String professorCategory) {
        this.professorCategory = professorCategory == null ? null : professorCategory.trim();
    }
}