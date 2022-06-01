/**
 *  Non-Academic Course is a subclass of Course class.
 * Name : Bimal khatri
 * Date : 17th may, 2021
 */
public class NonAcademicCourse extends Course
{
    //instance variable of non-academic course class
    private String instructorName;
    private String startingDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    /**Parameterized constructor of Non-AcademicCourse with courseID, courseName, duration and prerequisite as parameters.*/
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite)
    {
        super(courseID, courseName, duration);     // It will call the constructor of course class.
        this.prerequisite = prerequisite;
        startingDate = "";
        completionDate = "";
        examDate = "";
        isRegistered = false;
        isRemoved = false;
    }
    
    /**getter methods for all the variables of non-academic course class.*/
    public String getInstructorName()
    {
        return instructorName;
    }
    
    public String getStartingDate()
    {
        return startingDate;
    }
    
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    public String getExamDate()
    {
        return examDate;
    }
    
    public String getPrerequisite()
    {
        return prerequisite;
    }
    
    public boolean isIsRegistered()
    {
        return isRegistered;
    }
    
    public boolean isIsRemoved()
    {
        return isRemoved;
    }
    
    /**setter method to set the instructor name for non-academic course class.*/
    public void setInstructorName(String instructorName)
    {
        if(isRegistered == false) {
            this.instructorName = instructorName;
        }
        else{
            System.out.println("You have already registered your Non-Academic course. So,instructor name cannot be changed.");
        }
    }
    
    /**Parameterized method to register the non-academic course*/
    public void register(String courseLeader, String instructorName, String startingDate, String completionDate, String examDate)
    {
        if(isRegistered == false) {
            super.setCourseLeader(courseLeader);
            setInstructorName(instructorName);
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            isRegistered = true;
        }
        else{
            System.out.println("You have already registered your Non-Academic course.");
        }
    }
    
    /** A method to remove the non-academic course.*/
    public void remove()
    {
        if(isRemoved == true) {
            System.out.println("You have already removed your Non-Academic course.");
        }
        else{                        //It is initialized if non-academic course is not removed.
            super.setCourseLeader("");     //It will call the setCourseLeader method of course class.
            instructorName = "";
            startingDate = "";             // startingDate is assigned to "".
            completionDate = "";           // competionDate is assigned to "".
            examDate = "";                 // examDate is assigned to "".
            isRegistered = false;          // isRegistered is assigned to false.
            isRemoved = true;             // isRemoved is assigned to false.
        }
    }
    
    /** A method to display the non-academic course.*/
    public void display()
    {
        super.display();     // It will call the display method of course class.
        if(isRegistered == true) {      //It is displayed if the non-academic course is registered.
            System.out.println("The instructor name is      :   "+ instructorName);
            System.out.println("The starting date is        :   "+ startingDate);
            System.out.println("The completion date is      :   "+ completionDate);
            System.out.println("The exam date is            :   "+examDate);
        }
    }
}  