/**
 * Course is a Parent class.
 * Name : Bimal khatri
 * Date : 15th may, 2021
 */
public class Course
{
    //Instance variable .
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
    /**Parameterized constructor of Course with courseID, courseName and Duration as parameters.*/
    public Course(String courseID, String courseName, int duration)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
        courseLeader = "";
    }
    
    /**getter method  for all the variable of course class.*/
    public String getCourseID()
    {
        return courseID;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public String getCourseLeader()
    {
        return courseLeader;
    }
    
    public int getDuration()
    {
        return duration;
    }
    
    /** setter method to set Course Leader name .*/
    public void setCourseLeader(String courseLeader){
        this.courseLeader= courseLeader;
    }
    
    /**A method to display course name ,course ID, duration  and also course leader if course leader is set.*/
    public void display()
    {
        System.out.println("The courseID is             :   "+ courseID);
        System.out.println("The course name is          :   "+ courseName);
        System.out.println("The duration is             :   "+ duration);
        if(courseLeader != "") {
            System.out.println("The course leader is        :   "+courseLeader);
        }
    }
}