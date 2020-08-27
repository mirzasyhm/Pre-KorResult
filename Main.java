/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentresult;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        //Set for all decimalformat to be used
        DecimalFormat df = new DecimalFormat("#0.00");
        DecimalFormat df2 = new DecimalFormat("#0");
        DecimalFormat df3 = new DecimalFormat("#00.00");

        //Declaring all variable
        //(-pchm//pop//icc//kl//kc//cl/cla//bd) are all the shortform for coursename
        //Declare for grade
        String name, statuspchm = null, gradepchm, gradepop = null, gradeicc, gradekc, gradekl, gradecl = null, gradecla = null, gradebd = null;
        // Declare for status
        String statuspop = null, statusicc, statuskc, statuskl, statuscl = null, statuscla = null, statusbd = null;
        //declare variable for choosing program
        int prog;
        //Declare for pt(Point), totalpt(totalpoint),cw(coursework), fm(finalmark
        double ptpchm, totalpt, gpa, cgpa, ptcla = 0, ptbd = 0;
        double ptpop = 0, pticc, ptkc, ptkl, ptcl = 0, totalptpop = 0, totalpticc, totalptkc, totalptkl, totalptcl = 0, totalptpchm, totalptcla = 0, totalbd = 0, totalptbd = 0;
        double cwpop = 0, fmpop = 0, totalpop = 0, cwcl = 0, fmcl = 0, totalcl = 0;
        double cwcla = 0, fmcla = 0, totalcla = 0;
        double cwbd = 0, fmbd = 0;
        // declare variable for student id
        long id;


        //prompt for student name
        System.out.println("Please enter your name:");
        //get student name
        name = scanner.nextLine();
        System.out.println("");

        //prompt for student id
        System.out.println("Please enter your student id:");
        //get student id
        id = scanner.nextLong();
        System.out.println("");
        //prompt for course
        System.out.println("Please enter your program based on the code:");
        System.out.println("1 - Pre-Korea [Engineering]");
        System.out.println("2 - Pre-Korea [Animation]");
        //get course
        prog = scanner.nextInt();

        System.out.println("");
       
        //Prompting for PCHM mark
        System.out.println("[You are going to enter your coursework mark and final mark for every subject]");
        System.out.println("");
        System.out.println("Subject: IDP01103 - INTRODUCTION TO PC HARDWARE AND MAINTENANCE ");
        System.out.println("Coursework mark:");
        double cwpchm = scanner.nextDouble();
        System.out.println("Final mark:");
        double fmpchm = scanner.nextDouble();
        //calculate total mark
        double totalpchm = ((cwpchm / 100) * 50) + ((fmpchm / 100) * 50);
        //Find grade, status and point for the subject
        if (totalpchm >= 80) {
            gradepchm = "A";
            statuspchm = "PASS";
            ptpchm = 4.00;
        } else if (totalpchm >= 75) {
            gradepchm = "A-";
            statuspchm = "PASS";
            ptpchm = 3.67;
        } else if (totalpchm >= 70) {
            gradepchm = "B+";
            statuspchm = "PASS";
            ptpchm = 3.33;
        } else if (totalpchm >= 65) {
            gradepchm = "B";
            statuspchm = "PASS";
            ptpchm = 3.00;
        } else if (totalpchm >= 60) {
            gradepchm = "B-";
            statuspchm = "PASS";
            ptpchm = 2.67;
        } else if (totalpchm >= 55) {
            gradepchm = "C+";
            statuspchm = "PASS";
            ptpchm = 2.33;
        } else if (totalpchm >= 50) {
            gradepchm = "C";
            statuspchm = "PASS";
            ptpchm = 2.00;
        } else if (totalpchm >= 45) {
            gradepchm = "C-";
            statuspchm = "PASS";
            ptpchm = 1.67;
        } else if (totalpchm >= 40) {
            gradepchm = "D";
            statuspchm = "PASS";
            ptpchm = 1.00;
        } else {
            gradepchm = "F";
            statuspchm = "FAIL";
            ptpchm = 0.00;
        }
        //calculate total point
        totalptpchm = ptpchm * 3;
        
        //Since there are animation and engineering course, hence the difference prompting mark for subject are needed
        //Prompting for either animation or engineering subject mark.
        if (prog == 1) {
            System.out.println("");
            System.out.println("Subject: IDP01203 - PRINCIPLES OF PROGRAMMING ");
            System.out.println("Coursework mark:");
            cwpop = scanner.nextDouble();
            System.out.println("Final mark:");
            fmpop = scanner.nextDouble();
            //calculate total mark
            totalpop = ((cwpop / 100) * 50) + ((fmpop / 100) * 50);
            //Find grade, status and point for the subject
            if (totalpop >= 80) {
                gradepop = "A";
                statuspop = "PASS";
                ptpop = 4.00;
            } else if (totalpop >= 75) {
                gradepop = "A-";
                statuspop = "PASS";
                ptpop = 3.67;
            } else if (totalpop >= 70) {
                gradepop = "B+";
                statuspop = "PASS";
                ptpop = 3.33;
            } else if (totalpop >= 65) {
                gradepop = "B";
                statuspop = "PASS";
                ptpop = 3.00;
            } else if (totalpop >= 60) {
                gradepop = "B-";
                statuspop = "PASS";
                ptpop = 2.67;
            } else if (totalpop >= 55) {
                gradepop = "C+";
                statuspop = "PASS";
                ptpop = 2.33;
            } else if (totalpop >= 50) {
                gradepop = "C";
                statuspop = "PASS";
                ptpop = 2.00;
            } else if (totalpop >= 45) {
                gradepop = "C-";
                statuspop = "PASS";
                ptpop = 1.67;
            } else if (totalpop >= 40) {
                gradepop = "D";
                statuspop = "PASS";
                ptpop = 1.00;
            } else {
                gradepop = "F";
                statuspop = "FAIL";
                ptpop = 0.00;
            }
            //calculate total point
            totalptpop = ptpop * 3;
        } else {
            System.out.println("");
            System.out.println("Subject: IDP07303 - CINEMATIC LANGUAGE AND APPRECIATION ");
            System.out.println("Coursework mark:");
            cwcla = scanner.nextDouble();
            System.out.println("Final mark:");
            fmcla = scanner.nextDouble();
            //calculate total mark
            totalcla = ((cwcla / 100) * 50) + ((fmcla / 100) * 50);
            //Find grade, status and point for the subject
            if (totalcla >= 80) {
                gradecla = "A";
                statuscla = "PASS";
                ptcla = 4.00;
            } else if (totalcla >= 75) {
                gradecla = "A-";
                statuscla = "PASS";
                ptcla = 3.67;
            } else if (totalcla >= 70) {
                gradecla = "B+";
                statuscla = "PASS";
                ptcla = 3.33;
            } else if (totalcla >= 65) {
                gradecla = "B";
                statuscla = "PASS";
                ptcla = 3.00;
            } else if (totalcla >= 60) {
                gradecla = "B-";
                statuscla = "PASS";
                ptcla = 2.67;
            } else if (totalcla >= 55) {
                gradecla = "C+";
                statuscla = "PASS";
                ptcla = 2.33;
            } else if (totalcla >= 50) {
                gradecla = "C";
                statuscla = "PASS";
                ptcla = 2.00;
            } else if (totalcla >= 45) {
                gradecla = "C-";
                statuscla = "PASS";
                ptcla = 1.67;
            } else if (totalcla >= 40) {
                gradecla = "D";
                statuscla = "PASS";
                ptcla = 1.00;
            } else {
                gradecla = "F";
                statuscla = "FAIL";
                ptcla = 0.00;
            }
            //calculate total point
            totalptcla = ptcla * 3;
        }
        //Prompting for next subject
        System.out.println("");
        System.out.println("Subject: IDP06904 - KOREAN LANGUAGE 1 ");
        System.out.println("Coursework mark:");
        double cwkl = scanner.nextDouble();
        System.out.println("Final mark:");
        double fmkl = scanner.nextDouble();
        //calculate total mark
        double totalkl = ((cwkl / 100) * 50) + ((fmkl / 100) * 50);
        //Find grade, status and point for the subject
        if (totalkl >= 80) {
            gradekl = "A";
            statuskl = "PASS";
            ptkl = 4.00;
        } else if (totalkl >= 75) {
            gradekl = "A-";
            statuskl = "PASS";
            ptkl = 3.67;
        } else if (totalkl >= 70) {
            gradekl = "B+";
            statuskl = "PASS";
            ptkl = 3.33;
        } else if (totalkl >= 65) {
            gradekl = "B";
            statuskl = "PASS";
            ptkl = 3.00;
        } else if (totalkl >= 60) {
            gradekl = "B-";
            statuskl = "PASS";
            ptkl = 2.67;
        } else if (totalkl >= 55) {
            gradekl = "C+";
            statuskl = "PASS";
            ptkl = 2.33;
        } else if (totalkl >= 50) {
            gradekl = "C";
            statuskl = "PASS";
            ptkl = 2.00;
        } else if (totalkl >= 45) {
            gradekl = "C-";
            statuskl = "PASS";
            ptkl = 1.67;
        } else if (totalkl >= 40) {
            gradekl = "D";
            statuskl = "PASS";
            ptkl = 1.00;
        } else {
            gradekl = "F";
            statuskl = "FAIL";
            ptkl = 0.00;
        }
        //calculate total point
        totalptkl = ptkl * 4;

        System.out.println("");
        System.out.println("Subject: IDP07004 - KOREAN COMMUNICATION 1 ");
        System.out.println("Coursework mark:");
        double cwkc = scanner.nextDouble();
        System.out.println("Final mark:");
        double fmkc = scanner.nextDouble();
        //calculate total mark
        double totalkc = ((cwkc / 100) * 50) + ((fmkc / 100) * 50);
        //Find grade, status and point for the subject
        if (totalkc >= 80) {
            gradekc = "A";
            statuskc = "PASS";
            ptkc = 4.00;
        } else if (totalkc >= 75) {
            gradekc = "A-";
            statuskc = "PASS";
            ptkc = 3.67;
        } else if (totalkc >= 70) {
            gradekc = "B+";
            statuskc = "PASS";
            ptkc = 3.33;
        } else if (totalkc >= 65) {
            gradekc = "B";
            statuskc = "PASS";
            ptkc = 3.00;
        } else if (totalkc >= 60) {
            gradekc = "B-";
            statuskc = "PASS";
            ptkc = 2.67;
        } else if (totalkc >= 55) {
            gradekc = "C+";
            statuskc = "PASS";
            ptkc = 2.33;
        } else if (totalkc >= 50) {
            gradekc = "C";
            statuskc = "PASS";
            ptkc = 2.00;
        } else if (totalkc >= 45) {
            gradekc = "C-";
            statuskc = "PASS";
            ptkc = 1.67;
        } else if (totalkc >= 40) {
            gradekc = "D";
            statuskc = "PASS";
            ptkc = 1.00;
        } else {
            gradekc = "F";
            statuskc = "FAIL";
            ptkc = 0.00;
        }
        //calculate total point
        totalptkc = ptkc * 4;
        if (prog == 1) {
            System.out.println("");
            System.out.println("Subject: IDP07104 - CALCULUS 1");
            System.out.println("Coursework mark:");
            cwcl = scanner.nextDouble();
            System.out.println("Final mark:");
            fmcl = scanner.nextDouble();
            //calculate total mark
            totalcl = ((cwcl / 100) * 50) + ((fmcl / 100) * 50);
            //Find grade, status and point for the subject
            if (totalcl >= 80) {
                gradecl = "A";
                statuscl = "PASS";
                ptcl = 4.00;
            } else if (totalcl >= 75) {
                gradecl = "A-";
                statuscl = "PASS";
                ptcl = 3.67;
            } else if (totalcl >= 70) {
                gradecl = "B+";
                statuscl = "PASS";
                ptcl = 3.33;
            } else if (totalcl >= 65) {
                gradecl = "B";
                statuscl = "PASS";
                ptcl = 3.00;
            } else if (totalcl >= 60) {
                gradecl = "B-";
                statuscl = "PASS";
                ptcl = 2.67;
            } else if (totalcl >= 55) {
                gradecl = "C+";
                statuscl = "PASS";
                ptcl = 2.33;
            } else if (totalcl >= 50) {
                gradecl = "C";
                statuscl = "PASS";
                ptcl = 2.00;
            } else if (totalcl >= 45) {
                gradecl = "C-";
                statuscl = "PASS";
                ptcl = 1.67;
            } else if (totalcl >= 40) {
                gradecl = "D";
                statuscl = "PASS";
                ptcl = 1.00;
            } else {
                gradecl = "F";
                statuscl = "FAIL";
                ptcl = 0.00;
            }
            //calculate total point
            totalptcl = ptcl * 4;
        } else {
            System.out.println("");
            System.out.println("Subject: IDP08704 - BASIC DRAWING");
            System.out.println("Coursework mark:");
            cwbd = scanner.nextDouble();
            System.out.println("Final mark:");
            fmbd = scanner.nextDouble();
            //calculate total mark
            totalbd = ((cwbd / 100) * 50) + ((fmbd / 100) * 50);
            //Find grade, status and point for the subject
            if (totalbd >= 80) {
                gradebd = "A";
                statusbd = "PASS";
                ptbd = 4.00;
            } else if (totalbd >= 75) {
                gradebd = "A-";
                statusbd = "PASS";
                ptbd = 3.67;
            } else if (totalbd >= 70) {
                gradebd = "B+";
                statusbd = "PASS";
                ptbd = 3.33;
            } else if (totalbd >= 65) {
                gradebd = "B";
                statusbd = "PASS";
                ptbd = 3.00;
            } else if (totalbd >= 60) {
                gradebd = "B-";
                statusbd = "PASS";
                ptbd = 2.67;
            } else if (totalbd >= 55) {
                gradebd = "C+";
                statusbd = "PASS";
                ptbd = 2.33;
            } else if (totalbd >= 50) {
                gradebd = "C";
                statusbd = "PASS";
                ptbd = 2.00;
            } else if (totalbd >= 45) {
                gradebd = "C-";
                statusbd = "PASS";
                ptbd = 1.67;
            } else if (totalbd >= 40) {
                gradebd = "D";
                statusbd = "PASS";
                ptbd = 1.00;
            } else {
                gradebd = "F";
                statusbd = "FAIL";
                ptbd = 0.00;
            }
            //calculate total point
            totalptbd = ptbd * 4;
        }
        //Prompting and get for the last subject mark
        System.out.println("");
        System.out.println("Subject: IDP07202 - INTRODUCTION TO INTERCULTURAL COMMUNICATION ");
        System.out.println("Coursework mark:");
        double cwicc = scanner.nextDouble();
        System.out.println("Final mark:");
        double fmicc = scanner.nextDouble();
        //calculate total mark
        double totalicc = ((cwicc / 100) * 50) + ((fmicc / 100) * 50);
        //Find grade, status and point for the subject
        if (totalicc >= 80) {
            gradeicc = "A";
            statusicc = "PASS";
            pticc = 4.00;
        } else if (totalicc >= 75) {
            gradeicc = "A-";
            statusicc = "PASS";
            pticc = 3.67;
        } else if (totalicc >= 70) {
            gradeicc = "B+";
            statusicc = "PASS";
            pticc = 3.33;
        } else if (totalicc >= 65) {
            gradeicc = "B";
            statusicc = "PASS";
            pticc = 3.00;
        } else if (totalicc >= 60) {
            gradeicc = "B-";
            statusicc = "PASS";
            pticc = 2.67;
        } else if (totalicc >= 55) {
            gradeicc = "C+";
            statusicc = "PASS";
            pticc = 2.33;
        } else if (totalicc >= 50) {
            gradeicc = "C";
            statusicc = "PASS";
            pticc = 2.00;
        } else if (totalicc >= 45) {
            gradeicc = "C-";
            statusicc = "PASS";
            pticc = 1.67;
        } else if (totalicc >= 40) {
            gradeicc = "D";
            statusicc = "PASS";
            pticc = 1.00;
        } else {
            gradeicc = "F";
            statusicc = "FAIL";
            pticc = 0.00;
        }
        //calculate total point
        totalpticc = pticc * 2;

        //calculate gpa
        totalpt = totalptpop + totalpticc + totalptkc + totalptkl + totalptcl + totalptpchm;
        gpa = totalpt / 20;
        //Since this is the first semester, hence the cgpa=gpa
        cgpa = gpa;

        //Display the result
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t   " + "University Kuala Lumpur");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "Result Slip Semester July 2020");
        System.out.println("_________________________________________________________________________________________________________________________________________________________");
        System.out.println("Name        : " + name);
        System.out.println("Student ID  : " + id);
        //Display either pre-kor eng or animation
        if (prog == 1) {
            System.out.println("Program     : Pre-Korea [Engineering]");
        } else {
            System.out.println("Program     : Pre-Korea [Animation]");
        }
        System.out.println("Semester    : 1");
        System.out.println("_________________________________________________________________________________________________________________________________________________________");
        System.out.println("                                                                Credit Hour\tGrade\tPoint\tCoursework     " + "Final\tTotal\tStatus\tTotal Point");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. IDP01103 - INTRODUCTION TO PC HARDWARE AND MAINTENANCE            3" + "\t" + "\t " + gradepchm + "\t " + df.format(ptpchm) + "\t   " + df2.format(cwpchm) + "\t" + "\t" + df2.format(fmpchm) + "\t " + df2.format(totalpchm) + "\t " + statuspchm + "\t   " + df3.format(totalptpchm));
        if (prog == 1) {
            System.out.println("2. IDP01203 - PRINCIPLES OF PROGRAMMING                              3" + "\t" + "\t " + gradepop + "\t " + df.format(ptpop) + "\t   " + df2.format(cwpop) + "\t" + "\t" + df2.format(fmpop) + "\t " + df2.format(totalpop) + "\t " + statuspop + "\t   " + df3.format(totalptpop));
        } else {
            System.out.println("2. IDP07303 - CINEMATIC LANGUAGE AND APPRECIATION                    3" + "\t" + "\t " + gradecla + "\t " + df.format(ptcla) + "\t   " + df2.format(cwcla) + "\t" + "\t" + df2.format(fmcla) + "\t " + df2.format(totalcla) + "\t " + statuscla + "\t   " + df3.format(totalptcla));
        }
        System.out.println("3. IDP06904 - KOREAN LANGUAGE 1                                      4" + "\t" + "\t " + gradekl + "\t " + df.format(ptkl) + "\t   " + df2.format(cwkl) + "\t" + "\t" + df2.format(fmkl) + "\t " + df2.format(totalkl) + "\t " + statuskl + "\t   " + df3.format(totalptkl));
        System.out.println("4. IDP07004 - KOREAN COMMUNICATION 1                                 4" + "\t" + "\t " + gradekc + "\t " + df.format(ptkc) + "\t   " + df2.format(cwkc) + "\t" + "\t" + df2.format(fmkc) + "\t " + df2.format(totalkc) + "\t " + statuskc + "\t   " + df3.format(totalptkc));
        if (prog == 1) {
            System.out.println("5. IDP07104 - CALCULUS 1                                             4" + "\t" + "\t " + gradecl + "\t " + df.format(ptcl) + "\t   " + df2.format(cwcl) + "\t" + "\t" + df2.format(fmcl) + "\t " + df2.format(totalcl) + "\t " + statuscl + "\t   " + df3.format(totalptcl));
        } else {
            System.out.println("5. IDP08704 - BASIC DRAWING                                          4" + "\t" + "\t " + gradebd + "\t " + df.format(ptbd) + "\t   " + df2.format(cwbd) + "\t" + "\t" + df2.format(fmbd) + "\t " + df2.format(totalbd) + "\t " + statusbd + "\t   " + df3.format(totalptbd));
        }
        System.out.println("6. IDP07202 - INTRODUCTION TO INTERCULTURAL COMMUNICATION            2" + "\t" + "\t " + gradeicc + "\t " + df.format(pticc) + "\t   " + df2.format(cwicc) + "\t" + "\t" + df2.format(fmicc) + "\t " + df2.format(totalicc) + "\t " + statusicc + "\t   " + df3.format(totalpticc));
        System.out.println("_________________________________________________________________________________________________________________________________________________________");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "Total" + "\t" + "\t" + "    20" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t   " + df.format(totalpt));
        System.out.println("");
        System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "GPA: " + df.format(gpa) + "\t" + "\t" + "\t" + "CGPA: " + df.format(cgpa));

    }
}
