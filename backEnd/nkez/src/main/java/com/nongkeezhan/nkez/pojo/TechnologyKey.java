package com.nongkeezhan.nkez.pojo;

public class TechnologyKey {
    protected String techologyId;

    protected String professorId;

    public String getTechologyId() {
        return techologyId;
    }

    public void setTechologyId(String techologyId) {
        this.techologyId = techologyId == null ? null : techologyId.trim();
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId == null ? null : professorId.trim();
    }

    @Override
    public String toString() {
        return "TechnologyKey{" +
                "techologyId='" + techologyId + '\'' +
                ", professorId='" + professorId + '\'' +
                '}';
    }
}