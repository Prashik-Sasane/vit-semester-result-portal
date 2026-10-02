package com.vit.result.model;

import jakarta.persistence.*;

@Entity
@Table(name = "results")
public class ResultRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String registerNumber;
    private String semester;

    private double dataStructuresMSE;
    private double dataStructuresESE;
    private double dbmsMSE;
    private double dbmsESE;
    private double osMSE;
    private double osESE;
    private double cnMSE;
    private double cnESE;

    private double totalMarks;
    private double percentage;
    private String grade;
    private String status;

    public ResultRecord() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getRegisterNumber() { return registerNumber; }
    public void setRegisterNumber(String registerNumber) { this.registerNumber = registerNumber; }

    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }

    public double getDataStructuresMSE() { return dataStructuresMSE; }
    public void setDataStructuresMSE(double dataStructuresMSE) { this.dataStructuresMSE = dataStructuresMSE; }

    public double getDataStructuresESE() { return dataStructuresESE; }
    public void setDataStructuresESE(double dataStructuresESE) { this.dataStructuresESE = dataStructuresESE; }

    public double getDbmsMSE() { return dbmsMSE; }
    public void setDbmsMSE(double dbmsMSE) { this.dbmsMSE = dbmsMSE; }

    public double getDbmsESE() { return dbmsESE; }
    public void setDbmsESE(double dbmsESE) { this.dbmsESE = dbmsESE; }

    public double getOsMSE() { return osMSE; }
    public void setOsMSE(double osMSE) { this.osMSE = osMSE; }

    public double getOsESE() { return osESE; }
    public void setOsESE(double osESE) { this.osESE = osESE; }

    public double getCnMSE() { return cnMSE; }
    public void setCnMSE(double cnMSE) { this.cnMSE = cnMSE; }

    public double getCnESE() { return cnESE; }
    public void setCnESE(double cnESE) { this.cnESE = cnESE; }

    public double getTotalMarks() { return totalMarks; }
    public void setTotalMarks(double totalMarks) { this.totalMarks = totalMarks; }

    public double getPercentage() { return percentage; }
    public void setPercentage(double percentage) { this.percentage = percentage; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
