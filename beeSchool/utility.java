import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class utility {

    private List<Subject> subjects;
    private List<Student> students;

    public utility()
    {
        this.subjects = new ArrayList<Subject>();
        this.students = new ArrayList<Student>();
    }

    //Print Menu
    public void displayMenu(Scanner s)
    {
        String[] optionArray = new String[]{" Insert New Subjet", " View All Subject", " Insert New Student", " View all Student", " Insert Student Score", " View Student Score", " Exit"};

        while (true) {
            System.out.println("\nBee School");
            System.out.println("======================================");

            for (int i = 0; i < optionArray.length; i++) {
                System.out.println((i + 1) + "." + optionArray[i]);
            }

            System.out.print("Choose menu: ");
            int input = s.nextInt();
            switch (input) {
                case 1:
                    this.newSubject(s);
                    break;

                case 2:
                    this.viewSub();
                    break;

                case 3:
                    this.newStudent(s);
                    break;

                case 4:
                    this.viewStudent();
                    break;

                case 5:
                    this.newStudentScore(s);
                    break;

                case 6:
                    this.viewStudentScore();
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    continue;
            }
        }
    }


    public void newSubject(Scanner s)
    {
        Subject subject = new Subject();

        checkSubject:
        while (true)
        {
            System.out.printf("Input subject name [3-25 characters | ends with 'Subject']: ");
            String inputSub = s.nextLine();
            int subjectIndex = inputSub.indexOf(" Subject");

            if (subjectIndex != -1 && inputSub.substring(0, subjectIndex).length() >= 3 && inputSub.substring(0, subjectIndex).length() <= 25)
            {
                //Check if unique
                for (Subject sub : this.subjects)
                {
                    if (sub.getName().equals(inputSub))
                    {
                        System.out.print("Subject already exists!");
                        continue checkSubject;
                    }
                }
                subject.setName(inputSub);
                break;
            }
        }

        //Enter category
        while(true)
        {
            System.out.print("Input subject category [Main | Elective]: ");
            String inputCat = s.nextLine();
            if (inputCat.equalsIgnoreCase("Main") || inputCat.equalsIgnoreCase("Elective"))
            {
                subject.setCategory(inputCat);
                break;
            }
        }

        //Insert ID
        subject.setId(this.generateID("SB", this.subjects));

        //Add to list
        this.subjects.add(subject);

        System.out.println("\nSuccess insert new subject!");
    }


    public void viewSub()
    {

        if (this.subjects.size() == 0)
        {
            System.out.println("No Data!");
        }

        else
            {
                System.out.println("Subject ID           Subject Name           Subject Category");
                System.out.println("=============================================================");
                for (Subject subject : this.subjects)
                {
                    System.out.println(subject.getId() + "        " + subject.getName() + "        " + subject.getCategory());
                }
                System.out.println("=============================================================");
            }
    }


    public void newStudent(Scanner s)
    {
        Student student = new Student();

        //user input new student
        while(true)
        {
            System.out.println("Input student name [3-25 characters]: ");
            String inputName = s.nextLine();

            if (inputName.length() >= 3 && inputName.length() <= 25)
            {
                student.setName(inputName);
                break;
            }
        }

        //user input student gender
        while (true) {
            System.out.println("Input student gender [Male | Female]: ");
            String inputGender = s.nextLine();

            if (inputGender.equalsIgnoreCase("Male") || inputGender.equalsIgnoreCase("Female"))
            {
                student.setGender(inputGender);
                break;
            }
        }

        //Student ID
        student.setId(this.generateID("ST", this.students));

        //Add student to list
        this.students.add(student);

        System.out.println("\nSuccess insert new student!");
    }


    public void viewStudent()
    {
        if (this.students.size() == 0)
        {
            System.out.println("No Data!");
        }

        else
            {
            System.out.println("Student ID           Student Name           Student Gender");
            System.out.println("=============================================================");
            for (Student student : this.students)
            {
                System.out.println(student.getId() + "        " + student.getName() + "        " + student.getGender());
            }
            System.out.println("=============================================================");
            }
    }


    public void newStudentScore(Scanner s)
    {
        if (this.students.size() != 0 && this.subjects.size() != 0)
        {
            System.out.println("Student Data:");
            this.viewSub();
            System.out.println("Subject Data:");
            this.viewStudent();

            //Enter student ID
            Student student;
            studentID:
            while(true)
            {
                System.out.println("Input student ID:");
                String checkStudentID = s.nextLine();

                //Check student ID
                for (Student std : this.students)
                {
                    if (checkStudentID.equals(std.getId()))
                    {
                        student = std;
                        break studentID;
                    }
                }
            }

            //Enter subject ID
            Subject subject = null;
            while (true)
            {
                System.out.println("Input subject ID:");
                String checkSubjectID = s.nextLine();

                //Check subject ID
                boolean exists = false;
                for(Subject sbj : this.subjects)
                {
                    if(sbj.getId().equals(checkSubjectID))
                    {
                        subject = sbj;
                        exists = true;
                        break;
                    }
                }

                if(exists)
                {
                    //Check if subject already has a score
                    if (student.getScore(checkSubjectID) != -1)
                    {
                        System.out.println("Subject score already inserted!");
                    }

                    else
                        {
                            break;
                        }
                }
            }

            Score score = new Score();
            score.setSubject(subject);

            while(true)
            {
                System.out.print("Input score [0-100]: ");
                String inputScore = s.nextLine();

                //String to Integer
                int inputtedScore = Integer.parseInt(inputScore);

                if (inputtedScore >= 0 && inputtedScore <= 100)
                {
                    score.setValue(inputtedScore);
                    break;
                }
            }

            //Generate score id
            score.setId(this.generateID("SC", student.getScoreList()));

            //Save score data
            student.setScoreList(score);

            System.out.println("Success inset student score!");

        }

        else
            {
            System.out.println("Student and Subject data must exists!");
            }

        }


    public void viewStudentScore()
    {
        for (Student student : this.students)
        {
            System.out.println("Student ID	Student Name			Student Gender");
            System.out.println("=================================================================");
            System.out.println(student.getId() + "		" + student.getName() + "			" + student.getGender());
            System.out.println();
            System.out.println("Scores: ");
            System.out.println("-----------------------------------------------------------------");
            if (student.getScoreList().size() == 0)
            {
                System.out.println("No Data");
            }
            else
            {
                for (Score score : student.getScoreList())
                {
                    System.out.println(score.getId() + "		" + score.getSubject().getName() + "			" + Integer.toString(score.getValue()));
                }
            }
            System.out.println("=================================================================");
        }
    }


    public String generateID(String suffix, List<?> list)
    {
        String num = Integer.toString(list.size() + 1);

        if (num.length() < 3)
        {
            int length = num.length();

            for (int i=0; i<3-length; i++)
            {
                num = "0" + num;
            }
        }
        return suffix + num;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        utility main = new utility();
        main.displayMenu(sc);
        }

    }

