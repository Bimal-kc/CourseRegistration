/**
 *  Academic-Course is a subclass of Course class.
 * Name : Bimal khatri
 * Date : 16th may, 2021
 */
public class AcademicCourse extends Course
{
    //Instance variables.
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    /**Parameterized constructor of AcademicCourse with courseID, courseName, duration, level, credit and numberOfAssessments as parameters.*/
    public AcademicCourse(String courseID, String courseName, int duration, String level,  String credit, int numberOfAssessments)
    {
        super(courseID, courseName, duration);       // It will call the constructor of course class.
        this.level = level;
        this.credit = credit;
        this.numberOfAssessments = numberOfAssessments;
        this.lecturerName = "";
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
    }
    
    /**getter methods for all the variables of Academic Course.*/
    public String getLecturerName()
    {
        return lecturerName;
    }
    
    public String getLevel()
    {
        return level;
    }
    
    public String getCredit()
    {
        return credit;
    }
    
    public String getStartingDate()
    {
        return startingDate;
    }
    
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    public int getNumberOfAssessments()
    {
        return numberOfAssessments;
    }
    
    public boolean isIsRegistered()   
    {
     return isRegistered;
    }
    
    /**setter method to set lecturer name and number of assessments for Academic Course.*/
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName = lecturerName;
    }
    
    public void setNumberOfAssessments(int numberOfAssessments)
    {
        this.numberOfAssessments = numberOfAssessments;
    }
    
    /**Parameterized method to register the academic course*/
    public void register(String text, String courseLeader, String lecturerName, String startingDate, String completionDate)
    {
        if(isRegistered == true) {
            System.out.println("          Your course is already registered.");
            System.out.println("The lecturer name is        :   "+ lecturerName);
            System.out.println("The starting date is        :   "+ startingDate);
            System.out.println("The completion date is      :   "+ completionDate);
        }
        else{
            super.setCourseLeader(courseLeader);
            this.lecturerName = lecturerName;
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
        }
    }
    
    /** A method to display the Academic course.*/
    public void display()
    {
        super.display();
        if(isRegistered == true) {
            System.out.println("The lecturer name is        :   "+ lecturerName);
            System.out.println("The level is                :   " +level);
            System.out.println("The credit is               :   " +credit);
            System.out.println("The starting date is        :   "+ startingDate);
            System.out.println("The completion date is      :   "+ completionDate);
            System.out.println("The number of assessment is :   " +numberOfAssessments);
        }
    }
}