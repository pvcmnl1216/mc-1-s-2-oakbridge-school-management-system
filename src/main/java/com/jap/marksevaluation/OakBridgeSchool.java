package com.jap.marksevaluation;

public class OakBridgeSchool {
    public static void main(String[] args) {

        //Object of OakBridgeSchool class is created
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Initialize the arrays with 10 values of marks for each subject
        int[] math = {88,89,100,70,60,80,35,3,25,56};
        int[] science = {80,83,99,67,56,84,38,9,32,65};
        int[] english = {90,98,100,65,54,82,40,13,45,67};
        // The total number of subjects
        int noOfSubjects = 3;
        // Initialize names of 10 Students
        String[] studentNames = {"Michelle","Katie","Rob","Tina","Tom","Sam","Ria","Pam","Leena","Leo"};
        // Initialize roll numbers of 10 Students
        int[] rollNos = {102,109,101,103,104,108,110,105,106,107};
        // Call the methods to calculate total marks and average marks
        oakBridgeSchool = new OakBridgeSchool();
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math, science, english);
        int rollNo = rollNos[0];
        String studentN = studentNames[0];
        int[] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks, noOfSubjects);
        // Display the marks and average marks of each student
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Student Name :: " + studentNames[0] + " || Roll Number :: " + rollNos[0]);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("The Total Marks   - " + totalMarks[0] + "/300");
        System.out.println("The Average Marks - " + averageMarks[0]);
        System.out.println("-------------------------------------------------------------------");

        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);

        // Display the average marks scored by the class in subjects
        System.out.println("Average Science marks scored by thr class is : " + averageScienceMarks);
        System.out.println("Average Math marks scored by thr class is    : " + averageMathMarks);
        System.out.println("Average English marks scored by thr class is : " + averageEnglishMarks);
    }
    public int[] calculateTotalMarks(int[] math, int[] science, int[] english) {
        int i = 0;
        if (i < math.length && i < science.length && i < english.length) {
            int[] totalMarks = new int[math.length];
            for (i = 0; i < math.length; i++) {
                totalMarks[i] = math[i] + science[i] + english[i];
            }
            return totalMarks;
        } else return null;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects) {
        int i = 0;
        if (i < totalMarks.length && noOfSubjects == 3) {
            int[] average = new int[totalMarks.length];
            for (i = 0; i < totalMarks.length; i++) {
                average[i] = totalMarks[i] / noOfSubjects;
            }
            return average;
        } else return null;
    }

    public int calculateAverageScienceMarks(int[] science) {
        int i = 0;
        if (i < science.length) {
            int average = 0;
            int sum = 0;
            int count = 0;
            for (i = 0; i < science.length; i++) {
                sum = sum + science[i];
                ++count;
            }
            average = sum / count;
            return average;
        } else return -1;
    }

    public int calculateAverageEnglishMarks(int[] english) {
        int i = 0;
        if (i < english.length) {
            int average = 0;
            int sum = 0;
            int count = 0;
            for (i = 0; i < english.length; i++) {
                sum = sum + english[i];
                ++count;
            }
            average = sum / count;
            return average;
        } else return -1;
    }

    public int calculateAverageMathMarks(int[] math) {
        int i = 0;
        if (i < math.length) {
            int average = 0;
            int sum = 0;
            int count = 0;
            for (i = 0; i < math.length; i++) {
                sum = sum + math[i];
                ++count;
            }
            average = sum / count;
            return average;
        }else return -1;
    }
}