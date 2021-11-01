package com.afif.pbo.modul4.latihan;

public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    public String getName(){
        return name;
    }
    public void setName( String temp ){
        name = temp;
    }
    public double getAverage(){
        double result = 0;
        result = ( mathGrade+englishGrade+scienceGrade )/3;
        return result;
    }
    public static int getStudentCount(){
        return studentCount;
    }
}
