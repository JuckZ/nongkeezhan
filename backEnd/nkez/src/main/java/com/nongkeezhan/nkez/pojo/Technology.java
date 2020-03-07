package com.nongkeezhan.nkez.pojo;

public class Technology extends TechnologyKey {
    private String techologyTitle;

    private String techologyPicture;

    public String getTechologyTitle() {
        return techologyTitle;
    }

    public void setTechologyTitle(String techologyTitle) {
        this.techologyTitle = techologyTitle == null ? null : techologyTitle.trim();
    }

    public String getTechologyPicture() {
        return techologyPicture;
    }

    public void setTechologyPicture(String techologyPicture) {
        this.techologyPicture = techologyPicture == null ? null : techologyPicture.trim();
    }

    @Override
    public String toString() {
        return "Technology{" +
                "techologyTitle='" + techologyTitle + '\'' +
                ", techologyPicture='" + techologyPicture + '\'' +
                '}';
    }
}