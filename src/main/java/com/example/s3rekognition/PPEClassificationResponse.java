package com.example.s3rekognition;

import java.io.Serializable;
import java.util.HashMap;

public class PPEClassificationResponse  implements Serializable  {

    private String fileName;
    private boolean violation;
    private int personCount;
    public PPEClassificationResponse(String fileName, int personCount, boolean violation) {
        this.fileName = fileName;
        this.personCount = personCount;
        this.violation = violation;
    }

    public PPEClassificationResponse(String fileName, int personCount) {
        this.fileName = fileName;
        this.personCount = personCount;
    }

    public String getFileName() {
        return fileName;
    }

    public boolean isViolation() {
        return violation;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setViolation(boolean violation) {
        this.violation = violation;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }
}
