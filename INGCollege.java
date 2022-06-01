import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * INGCollege consists of GUI for Academic and NonAcademicCourse class.
 * Written By: Bimal khatri
 * Group: C4
 * Date: 17th, August 2021
 */
public class INGCollege
{
    //Declaring arraylist, frame, panels, textFields, Buttons and textAreas.
    private JFrame jf;

    private JPanel jpAc;
    private JPanel jpNAc;

    private JTextField courseIDAcTf;
    private JTextField courseNameAcTf;
    private JTextField durationAcTf;
    private JTextField courseLeaderAcTf;
    private JTextField lecturerNameAcTf;
    private JTextField levelAcTf;
    private JTextField creditAcTf;
    private JTextField startDateAcTf;
    private JTextField completionDateAcTf;
    private JTextField numberOfAssessmentsAcTf;

    private JTextField courseIDNAcTf;
    private JTextField courseNameNAcTf;
    private JTextField durationNAcTf;
    private JTextField courseLeaderNAcTf;
    private JTextField instructorNameNAcTf;
    private JTextField startDateNAcTf;
    private JTextField completionDateNAcTf;
    private JTextField examNAcTf;
    private JTextField prerequisiteNAcTf;

    private JTextArea displayAcTa;
    private JTextArea displayNAcTa;

    private JButton addAcJb;
    private JButton registerAcJb;
    private JButton displayAcJb;
    private JButton clearAcJb;

    private JButton addNAcJb;
    private JButton registerNAcJb;
    private JButton displayNAcJb;
    private JButton clearNAcJb;
    private JButton removeNAcJb;

    private ArrayList<Course> courses;

    /**Constructor of INGCollege Class.*/
    public INGCollege()
    {
        //Initializing frame and setting borderLayout to it.
        jf = new JFrame("Course Registration");
        jf.setLayout(new BorderLayout());
        jf.setSize(1000, 1000);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Initializing Panels.
        jpAc = new JPanel();
        jpAc.setSize(1000, 1000);
        jpNAc = new JPanel();
        jpNAc.setSize(1000, 1000);

        //Initializing ArrayList.
        courses = new ArrayList<Course>();

        //Initializing  TextField.
        courseIDAcTf = new JTextField(20);
        courseNameAcTf = new JTextField(20);
        durationAcTf = new JTextField(20);
        courseLeaderAcTf = new JTextField(20);
        lecturerNameAcTf = new JTextField(20);
        levelAcTf = new JTextField(20);
        creditAcTf = new JTextField(20);
        startDateAcTf = new JTextField(20);
        completionDateAcTf = new JTextField(20);
        numberOfAssessmentsAcTf = new JTextField(20);
        displayAcTa = new JTextArea(10,30);
        displayAcTa.setEditable(false);

        courseIDNAcTf = new JTextField(20);
        courseNameNAcTf = new JTextField(20);
        durationNAcTf = new JTextField(20);
        prerequisiteNAcTf = new JTextField(20);
        courseLeaderNAcTf = new JTextField(20);
        instructorNameNAcTf = new JTextField(20);
        startDateNAcTf = new JTextField(20);
        completionDateNAcTf = new JTextField(20);
        examNAcTf = new JTextField(20);
        displayNAcTa = new JTextArea(10,30);
        displayNAcTa.setEditable(false);

        //Initializing  Buttons.
        addAcJb = new JButton("Add");
        registerAcJb = new JButton("Register");
        displayAcJb = new JButton("Display");
        clearAcJb = new JButton("Clear");

        addNAcJb = new JButton("Add");
        registerNAcJb = new JButton("Register");
        displayNAcJb = new JButton("Display");
        clearNAcJb = new JButton("Clear");
        removeNAcJb = new JButton("Remove");
    }

    /**Method to create GUI Panel for AcademicCourse Class.*/
    public void academicGui()
    {
        GridBagLayout gblAc = new GridBagLayout();
        GridBagConstraints gbcAc = new GridBagConstraints();
        jpAc.setLayout(gblAc);                             //Setting GridBagLayout to AcademicCourse Panel.
        gbcAc.fill = GridBagConstraints.BOTH;

        // Adding components to the AcademicCourse Panel.
        gbcAc.insets = new Insets(5, 20, 10, 20);
        gbcAc.gridy++;
        gbcAc.gridx = 2;
        JLabel jl = new JLabel("Academic Course");
        jl.setForeground(Color.blue);                             //Font Color is set to blue.
        jl.setFont(new Font("Serif",Font.BOLD,20));   //Setting font.
        jpAc.add(jl, gbcAc);

        gbcAc.insets = new Insets(2, 2, 2, 2);
        gbcAc.gridwidth = 1;
        gbcAc.gridy++;
        gbcAc.gridx = 0;
        jpAc.add(new JLabel("Course ID : "), gbcAc);
        gbcAc.gridx = 1;
        jpAc.add(courseIDAcTf, gbcAc);
        gbcAc.gridx = 3;
        jpAc.add(new JLabel("Course Name : "), gbcAc);
        gbcAc.gridx = 4;
        jpAc.add(courseNameAcTf, gbcAc);

        gbcAc.gridy++;
        gbcAc.gridx = 0;
        jpAc.add(new JLabel("Duration : "), gbcAc);
        gbcAc.gridx = 1;
        jpAc.add(durationAcTf, gbcAc);
        gbcAc.gridx = 3;
        jpAc.add(new JLabel("Level : "), gbcAc);
        gbcAc.gridx = 4;
        jpAc.add(levelAcTf, gbcAc);

        gbcAc.gridy++;
        gbcAc.gridx = 0;
        jpAc.add(new JLabel("Credit : "), gbcAc);
        gbcAc.gridx = 1;
        jpAc.add(creditAcTf, gbcAc);
        gbcAc.gridx = 3;
        jpAc.add(new JLabel("No. Of Assessments : "), gbcAc);
        gbcAc.gridx = 4;
        jpAc.add(numberOfAssessmentsAcTf, gbcAc);

        gbcAc.gridy++;
        gbcAc.gridx = 4;
        gbcAc.fill = GridBagConstraints.CENTER;
        jpAc.add(addAcJb, gbcAc);

        gbcAc.fill = GridBagConstraints.BOTH;

        gbcAc.gridy++;
        gbcAc.gridx = 0;
        jpAc.add(new JLabel("Course Leader : "), gbcAc);
        gbcAc.gridx = 1;
        jpAc.add(courseLeaderAcTf, gbcAc);
        gbcAc.gridx = 3;
        jpAc.add(new JLabel("Lecturer Name : "), gbcAc);
        gbcAc.gridx = 4;
        jpAc.add(lecturerNameAcTf, gbcAc);

        gbcAc.gridy++;
        gbcAc.gridx = 0;
        jpAc.add(new JLabel("Starting Date : "), gbcAc);
        gbcAc.gridx = 1;
        jpAc.add(startDateAcTf, gbcAc);
        gbcAc.gridx = 3;
        jpAc.add(new JLabel("Completion Date : "), gbcAc);
        gbcAc.gridx = 4;
        jpAc.add(completionDateAcTf, gbcAc);

        gbcAc.fill = GridBagConstraints.CENTER;
        gbcAc.gridy++;
        gbcAc.gridx = 4;
        jpAc.add(registerAcJb, gbcAc);

        gbcAc.gridy++;
        gbcAc.gridwidth = 2;
        gbcAc.gridheight= 2;
        gbcAc.gridx = 0;
        JScrollPane jsP = new JScrollPane(displayAcTa);     // adding display area to scroll pane.
        jpAc.add(jsP, gbcAc);                               // Adding ScrollPane to AcademicCourse Panel.
        gbcAc.gridwidth = 1;
        gbcAc.gridheight= 1;
        gbcAc.gridx = 3;
        jpAc.add(displayAcJb, gbcAc);
        gbcAc.gridx = 4;
        jpAc.add(clearAcJb, gbcAc);

        //Action Listener for add button of AcademicCourse's GUI.
        addAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (courseIDAcTf.getText().isEmpty() || courseNameAcTf.getText().isEmpty() || durationAcTf.getText().isEmpty() || levelAcTf.getText().isEmpty() || creditAcTf.getText().isEmpty() || numberOfAssessmentsAcTf.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(jf, "Please! Enter all the required fields.");
                        return;
                    }

                    int courseID = Integer.parseInt(courseIDAcTf.getText());      //This will take courseID as integer and if not it will throw exception.

                    if (courseID > courses.size()) {                    //condition will be true if courseID is greater than arraylist's size.
                        JOptionPane.showMessageDialog(jf, "Please insert a valid courses ID starting from 0.");
                        return;
                    }

                    if (courseID < courses.size()) {                //condition will be true if courseID is less than arraylist size.
                        if (courseID == courses.size()-1 && courses.get(courseID) instanceof AcademicCourse) {
                            JOptionPane.showMessageDialog(jf, "Course ID is already added.");           // This will be displayed if same courseID is added one after another and is of academicCourse.
                            }
                        else {
                            JOptionPane.showMessageDialog(jf, "Course ID is already inserted. Please check course ID again.");
                        }
                        return;
                    }

                    AcademicCourse academicCourse = new AcademicCourse(courseIDAcTf.getText(), courseNameAcTf.getText(), Integer.parseInt(durationAcTf.getText()), levelAcTf.getText(), creditAcTf.getText(), Integer.parseInt(numberOfAssessmentsAcTf.getText()));
                    courses.add(courseID, academicCourse);              // academicCourse object is added to the arraylist where courseID is used as index.
                    JOptionPane.showMessageDialog(jf, "Successfully added.");
                }
                catch (Exception ex) {
                    try {
                        Integer.parseInt(courseIDAcTf.getText());
                    } catch (Exception exx) {
                        JOptionPane.showMessageDialog(jf, "Invalid Course ID!");
                    }

                    try {
                        Integer.parseInt(durationAcTf.getText());
                    } catch (Exception exx) {
                        JOptionPane.showMessageDialog(jf, "Invalid duration!");
                    }

                    try {
                        Integer.parseInt(numberOfAssessmentsAcTf.getText());
                    } catch (Exception exx) {
                        JOptionPane.showMessageDialog(jf, "Invalid number of assessments!");
                    }
                }
            }
        });

        //Action Listener for register button of AcademicCourse's GUI.
        registerAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (courseIDAcTf.getText().isEmpty() || courseLeaderAcTf.getText().isEmpty() || lecturerNameAcTf.getText().isEmpty() || startDateAcTf.getText().isEmpty() || completionDateAcTf.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(jf, "Please! Enter all the required fields.");
                        return;
                    }

                    int courseID = Integer.parseInt(courseIDAcTf.getText());            //This will take the courseID as integer and if not it will throw exception.

                    if (courseID >= courses.size()) {           //Condition will be true if courseID is greater or equals to arraylist's size.
                        JOptionPane.showMessageDialog(jf, "CourseID does not exist. Please add courseID to register.");
                        return;
                    }

                    if (courses.get(courseID) instanceof AcademicCourse) {
                        AcademicCourse academicCourse = (AcademicCourse) courses.get(courseID);
                        if (academicCourse.isIsRegistered() == true) {
                            JOptionPane.showMessageDialog(jf, "Already Registered.");
                            return;
                        }

                        academicCourse.register(courseIDAcTf.getText(), courseLeaderAcTf.getText(), lecturerNameAcTf.getText(), startDateAcTf.getText(), completionDateAcTf.getText());
                        JOptionPane.showMessageDialog(jf, "Successfully registered.");
                    }
                    else {
                        JOptionPane.showMessageDialog(jf, "CourseID is not present in this Course.");
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(jf, "Invalid Course ID!");
                }
            }
        });

        //Action Listener for display button of AcademicCourse's GUI.
        displayAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder builder = new StringBuilder();
                for (Course course : courses) {
                    if (course instanceof AcademicCourse) {
                        AcademicCourse academicCourse = (AcademicCourse) course;
                        builder.append("Course Id is : " + academicCourse.getCourseID());
                        builder.append("\nCourse Name is : " + academicCourse.getCourseName());
                        builder.append("\nCourse Duration is : " + academicCourse.getDuration());
                        builder.append("\nCourse Level is : " + academicCourse.getLevel());
                        builder.append("\nCredit is : " + academicCourse.getCredit());
                        builder.append("\nNo of assessments is : " + academicCourse.getNumberOfAssessments());
                        builder.append("\nCourse leader is : " + academicCourse.getCourseLeader());
                        builder.append("\nLecturer Name is : " + academicCourse.getLecturerName());
                        builder.append("\nStarting Date is : " + academicCourse.getStartingDate());
                        builder.append("\nCompletion Date is : " + academicCourse.getCompletionDate());
                        builder.append("\n\n");
                    }
                }
                if (builder.isEmpty()) {
                    displayAcTa.setText("No data available.");
                } else {
                    displayAcTa.setText(String.valueOf(builder));
                }
            }
        });

        //Action Listener for clear button of AcademicCourse's GUI.
        clearAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseIDAcTf.setText("");
                courseNameAcTf.setText("");
                durationAcTf.setText("");
                courseLeaderAcTf.setText("");
                lecturerNameAcTf.setText("");
                levelAcTf.setText("");
                creditAcTf.setText("");
                startDateAcTf.setText("");
                completionDateAcTf.setText("");
                numberOfAssessmentsAcTf.setText("");
            }
        });

        jf.add(jpAc, BorderLayout.NORTH);    //AcademicCourse Panel is added to north region of Frame.
        jf.setVisible(true);
    }

    /**Method to create GUI Panel for Non-AcademicCourse Class*/
    public void nonAcademicGui()
    {
        GridBagLayout gblNAc = new GridBagLayout();
        GridBagConstraints gbcNAc = new GridBagConstraints();
        jpNAc.setLayout(gblNAc);                               //setting girdBagLayout to NonAcademicCourse panel.
        gbcNAc.fill = GridBagConstraints.BOTH;

        //Adding components to NonAcademicCourse Panel.
        gbcNAc.insets = new Insets(10, 20, 10, 20);
        gbcNAc.gridy++;
        gbcNAc.gridx = 2;
        JLabel jl = new JLabel("Non-Academic Course");
        jl.setForeground(Color.blue);                               //Font color is set to blue.
        jl.setFont(new Font("Serif",Font.BOLD,20));     //setting font.
        jpNAc.add(jl, gbcNAc);

        gbcNAc.insets = new Insets(2, 2, 2, 2);
        gbcNAc.gridwidth = 1;
        gbcNAc.gridy++;
        gbcNAc.gridx = 0;
        jpNAc.add(new JLabel("Course ID : "), gbcNAc);
        gbcNAc.gridx = 1;
        jpNAc.add(courseIDNAcTf, gbcNAc);
        gbcNAc.gridx = 3;
        jpNAc.add(new JLabel("Course Name : "), gbcNAc);
        gbcNAc.gridx = 4;
        jpNAc.add(courseNameNAcTf, gbcNAc);

        gbcNAc.gridy++;
        gbcNAc.gridx = 0;
        jpNAc.add(new JLabel("Duration : "), gbcNAc);
        gbcNAc.gridx = 1;
        jpNAc.add(durationNAcTf, gbcNAc);
        gbcNAc.gridx = 3;
        jpNAc.add(new JLabel("Prerequisite : "), gbcNAc);
        gbcNAc.gridx = 4;
        jpNAc.add(prerequisiteNAcTf, gbcNAc);

        gbcNAc.gridy++;
        gbcNAc.gridx = 4;
        gbcNAc.fill = GridBagConstraints.CENTER;
        jpNAc.add(addNAcJb, gbcNAc);

        gbcNAc.fill = GridBagConstraints.BOTH;

        gbcNAc.gridy++;
        gbcNAc.gridx = 0;
        jpNAc.add(new JLabel("Course Leader : "), gbcNAc);
        gbcNAc.gridx = 1;
        jpNAc.add(courseLeaderNAcTf, gbcNAc);
        gbcNAc.gridx = 3;
        jpNAc.add(new JLabel("Instructor Name : "), gbcNAc);
        gbcNAc.gridx = 4;
        jpNAc.add(instructorNameNAcTf, gbcNAc);

        gbcNAc.gridy++;
        gbcNAc.gridx = 0;
        jpNAc.add(new JLabel("Starting Date : "), gbcNAc);
        gbcNAc.gridx = 1;
        jpNAc.add(startDateNAcTf, gbcNAc);
        gbcNAc.gridx = 3;
        jpNAc.add(new JLabel("Completion Date : "), gbcNAc);
        gbcNAc.gridx = 4;
        jpNAc.add(completionDateNAcTf, gbcNAc);

        gbcNAc.gridy++;
        gbcNAc.gridx = 0;
        jpNAc.add(new JLabel("Exam Date : "), gbcNAc);
        gbcNAc.gridx = 1;
        jpNAc.add(examNAcTf, gbcNAc);

        gbcNAc.fill = GridBagConstraints.CENTER;

        gbcNAc.gridy++;
        gbcNAc.gridx = 3;
        jpNAc.add(registerNAcJb, gbcNAc);
        gbcNAc.gridx = 4;
        jpNAc.add(removeNAcJb, gbcNAc);

        gbcNAc.gridy++;
        gbcNAc.gridwidth = 2;
        gbcNAc.gridheight= 2;
        gbcNAc.gridx = 0;
        JScrollPane jsP = new JScrollPane(displayNAcTa);            //Adding display Area to scrollPane
        jpNAc.add(jsP, gbcNAc);                             //Adding scrollPane to NonAcademicCourse Panel.
        gbcNAc.gridwidth = 1;
        gbcNAc.gridheight= 1;
        gbcNAc.gridx = 3;
        jpNAc.add(displayNAcJb, gbcNAc);
        gbcNAc.gridx = 4;
        jpNAc.add(clearNAcJb, gbcNAc);

        //Action Listener for add button of NonAcademicCourse's GUI.
        addNAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (courseIDNAcTf.getText().isEmpty() || courseNameNAcTf.getText().isEmpty() || durationNAcTf.getText().isEmpty() || prerequisiteNAcTf.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(jf, "Please! Enter all the required fields.");
                        return;
                    }

                    int courseID = Integer.parseInt(courseIDNAcTf.getText());           //This will take courseID as integer and if not it will throw exception.

                    if (courseID > courses.size()) {            //condition will be true if courseID is greater than arraylist's size.
                        JOptionPane.showMessageDialog(jf, "Please insert a valid CourseID starting from 0.");
                        return;
                    }

                    if (courseID < courses.size()) {                //condition will be true if courseID is less than arraylist's size.
                        if (courseID == courses.size()-1 && courses.get(courseID) instanceof NonAcademicCourse) {
                            JOptionPane.showMessageDialog(jf, "Course ID is already added.");           // This will be displayed if same courseID is added one after another and is of NonAcademicCourse.
                        }
                        else {
                            JOptionPane.showMessageDialog(jf, "Course ID is already inserted. Please check course ID again.");
                        }
                        return;
                    }

                    NonAcademicCourse nonAcademicCourse = new NonAcademicCourse(courseIDNAcTf.getText(), courseNameNAcTf.getText(), Integer.parseInt(durationNAcTf.getText()), prerequisiteNAcTf.getText());
                    courses.add(courseID, nonAcademicCourse);
                    JOptionPane.showMessageDialog(jf, "Successfully added.");
                } catch (Exception ex) {
                    try {
                        Integer.parseInt(courseIDNAcTf.getText());
                    }
                    catch (Exception exx) {
                        JOptionPane.showMessageDialog(jf, "Invalid Course ID!");
                    }
                    try {
                        Integer.parseInt(durationNAcTf.getText());
                    }
                    catch (Exception exx) {
                        JOptionPane.showMessageDialog(jf, "Invalid duration!");
                    }
                }
            }
        });

        //Action Listener for register button of NonAcademicCourse's GUI.
        registerNAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (courseIDNAcTf.getText().isEmpty() || courseLeaderNAcTf.getText().isEmpty() || instructorNameNAcTf.getText().isEmpty() || startDateNAcTf.getText().isEmpty() || completionDateNAcTf.getText().isEmpty() || examNAcTf.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(jf, "Please! Enter all the required fields. ");
                        return;
                    }

                    int courseID = Integer.parseInt(courseIDNAcTf.getText());           //This will take courseID as integer and if not it will throw exception.

                    if (courseID >= courses.size()) {           //Condition will be true if courseID is greater or equals to arraylist's size.
                        JOptionPane.showMessageDialog(jf, "CourseID does not exist. Please add courseID to register.");
                        return;
                    }

                    if (courses.get(courseID) instanceof NonAcademicCourse) {
                        NonAcademicCourse nonAcademicCourse = (NonAcademicCourse) courses.get(courseID);
                        if (nonAcademicCourse.isIsRegistered() == true) {
                            JOptionPane.showMessageDialog(jf, "Already registered.");
                            return;
                        }
                        nonAcademicCourse.register(courseLeaderNAcTf.getText(), instructorNameNAcTf.getText(), startDateNAcTf.getText(), completionDateNAcTf.getText(), examNAcTf.getText());
                        JOptionPane.showMessageDialog(jf, "Successfully registered.");
                    } else {
                        JOptionPane.showMessageDialog(jf, "CourseID is not present in this course.");
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(jf, "Invalid Course ID!");
                }
            }
        });

        //Action Listener for remove button of NonAcademicCourse's GUI.
        removeNAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (courseIDNAcTf.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "Please! Enter Course ID. ");
                    return;
                }
                try {
                    int courseID = Integer.parseInt(courseIDNAcTf.getText());           //It will take courseID as integer and if not throws exception.

                    if (courseID >= courses.size()) {
                        JOptionPane.showMessageDialog(jf, "CourseID does not exist. Please register course ID to remove it.");
                        return;
                    }
                    if (courses.get(courseID) instanceof NonAcademicCourse) {
                        NonAcademicCourse nonAcademicCourse = (NonAcademicCourse) courses.get(courseID);

                        if (nonAcademicCourse.isIsRemoved() == true) {
                            JOptionPane.showMessageDialog(jf, "Already removed.");
                            return;
                        }

                        nonAcademicCourse.remove();
                        JOptionPane.showMessageDialog(jf, "Successfully removed.");
                    } else {
                        JOptionPane.showMessageDialog(jf, "CourseID is not present in this course.");
                    }
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(jf, "Invalid Course ID!");
                }
            }
        });

        //Action Listener for display button of NonAcademicCourse's GUI.
        displayNAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder builder = new StringBuilder();
                for (Course course : courses) {
                    if (course instanceof NonAcademicCourse) {
                        NonAcademicCourse nonAcademicCourse = (NonAcademicCourse) course;
                        builder.append("Course Id is : " + nonAcademicCourse.getCourseID());
                        builder.append("\nCourse Name is : " + nonAcademicCourse.getCourseName());
                        builder.append("\nCourse Duration is : " + nonAcademicCourse.getDuration());
                        builder.append("\nPrerequisite is : " + nonAcademicCourse.getPrerequisite());
                        builder.append("\nCourse Leader is : " + nonAcademicCourse.getCourseLeader());
                        builder.append("\nInstructor Name is : " + nonAcademicCourse.getInstructorName());
                        builder.append("\nStarting Date is : " + nonAcademicCourse.getStartingDate());
                        builder.append("\nCompletion Date is : " + nonAcademicCourse.getCompletionDate());
                        builder.append("\nExam Date is : " + nonAcademicCourse.getExamDate());
                        builder.append("\n\n");
                    }
                }
                if (builder.isEmpty()) {
                    displayNAcTa.setText("No data available.");
                } else {
                    displayNAcTa.setText(String.valueOf(builder));
                }
            }
        });

        //Action Listener for clear button of NonAcademicCourse's GUI.
        clearNAcJb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                courseIDNAcTf.setText("");
                courseNameNAcTf.setText("");
                durationNAcTf.setText("");
                prerequisiteNAcTf.setText("");
                courseLeaderNAcTf.setText("");
                instructorNameNAcTf.setText("");
                startDateNAcTf.setText("");
                completionDateNAcTf.setText("");
                examNAcTf.setText("");
            }
        });

        jf.add(jpNAc, BorderLayout.SOUTH);      //NonAcademicCourse panel is added to the South region of frame.
        jf.setVisible(true);
    }

    public static void main(String[] args)
    {
        INGCollege ing = new INGCollege();
        ing.academicGui();
        ing.nonAcademicGui();
    }
}
