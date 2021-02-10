import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    public Main() {
        setTitle("Course Management System");
        setSize(1000, 782);
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0xff7c1f));
        panel.setBounds(0, 0, 985, 100);
        panel.setLayout(new BorderLayout());
        add(panel);

        JMenu file = new JMenu("File");
        JMenuItem back = new JMenuItem("Back");
        file.add(back);

        JMenuItem exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
        exit.addActionListener(e -> System.exit(0));
        file.add(exit);

        JPanel mainMenu = new JPanel();
        JButton admin = new JButton("Admin");
        JButton student = new JButton("Student");
        JButton instructor = new JButton("Instructor");

        admin.setFocusable(false);
        student.setFocusable(false);
        instructor.setFocusable(false);

        admin.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        student.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        instructor.setFont(new Font("Comic Sans", Font.PLAIN, 28));

        admin.setForeground(new Color(0xff7c1f));
        student.setForeground(new Color(0xff7c1f));
        instructor.setForeground(new Color(0xff7c1f));

        admin.setBackground(new Color(0x067eed));
        student.setBackground(new Color(0x067eed));
        instructor.setBackground(new Color(0x067eed));

        mainMenu.add(admin);
        mainMenu.add(student);
        mainMenu.add(instructor);

        mainMenu.setLayout(new GridLayout(3, 1));
        add(mainMenu);
        mainMenu.setBounds(0, 100, 985, 621);

        JPanel adminPanel = new JPanel();
        JButton addCourse = new JButton("Add course");
        JButton addModule = new JButton("Add module");
        JButton editCourse = new JButton("Edit course name");
        JButton editModule = new JButton("Edit module name");
        JButton cancelCourse = new JButton("Cancel course");
        JButton restartCourse = new JButton("Restart course");
        JButton deleteCourse = new JButton("Delete course");
        JButton reportCard = new JButton("Generate Report Card");
        adminPanel.add(addCourse);
        adminPanel.add(addModule);
        adminPanel.add(editCourse);
        adminPanel.add(editModule);
        adminPanel.add(cancelCourse);
        adminPanel.add(restartCourse);
        adminPanel.add(deleteCourse);
        adminPanel.add(reportCard);

        addCourse.setFocusable(false);
        addModule.setFocusable(false);
        editCourse.setFocusable(false);
        editModule.setFocusable(false);
        cancelCourse.setFocusable(false);
        restartCourse.setFocusable(false);
        deleteCourse.setFocusable(false);
        reportCard.setFocusable(false);

        addCourse.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        addModule.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        editCourse.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        editModule.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        cancelCourse.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        restartCourse.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        deleteCourse.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        reportCard.setFont(new Font("Comic Sans", Font.PLAIN, 28));

        addCourse.setForeground(new Color(0xff7c1f));
        addModule.setForeground(new Color(0xff7c1f));
        editCourse.setForeground(new Color(0xff7c1f));
        editModule.setForeground(new Color(0xff7c1f));
        cancelCourse.setForeground(new Color(0xff7c1f));
        restartCourse.setForeground(new Color(0xff7c1f));
        deleteCourse.setForeground(new Color(0xff7c1f));
        reportCard.setForeground(new Color(0xff7c1f));

        addCourse.setBackground(new Color(0x067eed));
        addModule.setBackground(new Color(0x067eed));
        editCourse.setBackground(new Color(0x067eed));
        editModule.setBackground(new Color(0x067eed));
        cancelCourse.setBackground(new Color(0x067eed));
        restartCourse.setBackground(new Color(0x067eed));
        deleteCourse.setBackground(new Color(0x067eed));
        reportCard.setBackground(new Color(0x067eed));

        adminPanel.setBounds(0, 100, 985, 620);
        adminPanel.setLayout(new GridLayout(4, 2));
        add(adminPanel);
        adminPanel.setVisible(false);


        JPanel studentPanel = new JPanel();
        studentPanel.setBounds(0, 100, 985, 620);
        studentPanel.setLayout(new GridLayout(4, 2));
        JButton enrollToCourse = new JButton("Enroll to course");
        enrollToCourse.addActionListener(e -> System.out.println("Enrolled to course"));
        JButton enrollToModule = new JButton("Enroll to module");
        enrollToModule.addActionListener(e -> System.out.println("Enrolled to module"));
        JButton seeModules = new JButton("See modules");
        seeModules.addActionListener(e -> System.out.println("Modules"));
        JButton seeInstructors = new JButton("See instructors");
        seeInstructors.addActionListener(e -> System.out.println("Instructors"));

        enrollToCourse.setFocusable(false);
        enrollToModule.setFocusable(false);
        seeModules.setFocusable(false);
        seeInstructors.setFocusable(false);

        enrollToCourse.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        enrollToModule.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        seeModules.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        seeInstructors.setFont(new Font("Comic Sans", Font.PLAIN, 28));

        enrollToCourse.setForeground(new Color(0xff7c1f));
        enrollToModule.setForeground(new Color(0xff7c1f));
        seeModules.setForeground(new Color(0xff7c1f));
        seeInstructors.setForeground(new Color(0xff7c1f));

        enrollToCourse.setBackground(new Color(0x067eed));
        enrollToModule.setBackground(new Color(0x067eed));
        seeModules.setBackground(new Color(0x067eed));
        seeInstructors.setBackground(new Color(0x067eed));

        studentPanel.add(enrollToCourse);
        studentPanel.add(enrollToModule);
        studentPanel.add(seeModules);
        studentPanel.add(seeInstructors);
        add(studentPanel);
        studentPanel.setVisible(false);

        JPanel instructorPanel = new JPanel();
        instructorPanel.setBounds(0, 100, 985, 621);
        instructorPanel.setLayout(new GridLayout(3, 1));
        JButton assignedModules = new JButton("See assigned modules");
        assignedModules.addActionListener(e -> System.out.println("Course Added"));
        JButton seeStudents = new JButton("See students");
        seeStudents.addActionListener(e -> System.out.println("Module Added"));
        JButton provideMarks = new JButton("Provide marks to student");
        provideMarks.addActionListener(e -> System.out.println("Course name edited"));

        assignedModules.setFocusable(false);
        seeStudents.setFocusable(false);
        provideMarks.setFocusable(false);

        assignedModules.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        seeStudents.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        provideMarks.setFont(new Font("Comic Sans", Font.PLAIN, 28));

        assignedModules.setForeground(new Color(0xff7c1f));
        seeStudents.setForeground(new Color(0xff7c1f));
        provideMarks.setForeground(new Color(0xff7c1f));

        assignedModules.setBackground(new Color(0x067eed));
        seeStudents.setBackground(new Color(0x067eed));
        provideMarks.setBackground(new Color(0x067eed));

        instructorPanel.add(assignedModules);
        instructorPanel.add(seeStudents);
        instructorPanel.add(provideMarks);
        add(instructorPanel);
        instructorPanel.setVisible(false);

        JLabel title = new JLabel();
        title.setText("Main Menu");
        title.setForeground(new Color(0xeeeeee));
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Comic Sans", Font.BOLD, 40));
        panel.add(title);

        admin.addActionListener(e -> {
            mainMenu.setVisible(false);
            studentPanel.setVisible(false);
            instructorPanel.setVisible(false);
            adminPanel.setVisible(true);
            title.setText("Admin");
        });
        student.addActionListener(e -> {
            mainMenu.setVisible(false);
            adminPanel.setVisible(false);
            instructorPanel.setVisible(false);
            studentPanel.setVisible(true);
            title.setText("Student");
        });
        instructor.addActionListener(e -> {
            mainMenu.setVisible(false);
            adminPanel.setVisible(false);
            studentPanel.setVisible(false);
            instructorPanel.setVisible(true);
            title.setText("Instructor");
        });

        JLabel addCourseLabel = new JLabel("Enter course name: ");
        addCourseLabel.setFont(new Font("Comic Sans", Font.PLAIN, 40));
        JTextField addCourseTextField = new JTextField();
        addCourseTextField.setPreferredSize(new Dimension(500, 60));
        addCourseTextField.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        JButton submitCourse = new JButton("✔");
        submitCourse.setPreferredSize(new Dimension(100, 60));
        submitCourse.setFocusable(false);
        submitCourse.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        submitCourse.setForeground(new Color(0xff7c1f));
        submitCourse.setBackground(new Color(0x067eed));
        JPanel a1 = new JPanel();
        a1.setLayout(new FlowLayout(FlowLayout.LEADING));
        a1.add(addCourseLabel);
        a1.add(addCourseTextField);
        a1.add(submitCourse);
        a1.setVisible(false);
        a1.setBounds(0, 100, 985, 621);
        addCourse.addActionListener(e -> {
            adminPanel.setVisible(false);
            a1.setVisible(true);
            title.setText("Add course");
        });
        add(a1);

        JLabel addModuleLabel = new JLabel("Enter module name: ");
        addModuleLabel.setFont(new Font("Comic Sans", Font.PLAIN, 40));
        JTextField addModuleTextField = new JTextField();
        addModuleTextField.setPreferredSize(new Dimension(500, 60));
        addModuleTextField.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        JButton submitModule = new JButton("✔");
        submitModule.setPreferredSize(new Dimension(100, 60));
        submitModule.setFocusable(false);
        submitModule.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        submitModule.setForeground(new Color(0xff7c1f));
        submitModule.setBackground(new Color(0x067eed));
        JPanel a2 = new JPanel();
        a2.setLayout(new FlowLayout(FlowLayout.LEADING));
        a2.add(addModuleLabel);
        a2.add(addModuleTextField);
        a2.add(submitModule);
        a2.setVisible(false);
        a2.setBounds(0, 100, 985, 621);
        addModule.addActionListener(e -> {
            adminPanel.setVisible(false);
            a2.setVisible(true);
            title.setText("Add module");
        });
        add(a2);


        JLabel editCourseLabel = new JLabel("Enter course name: ");
        editCourseLabel.setFont(new Font("Comic Sans", Font.PLAIN, 40));
        JTextField editCourseTextField = new JTextField();
        editCourseTextField.setPreferredSize(new Dimension(500, 60));
        editCourseTextField.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        JButton editCourseName = new JButton("✔");
        editCourseName.setPreferredSize(new Dimension(100, 60));
        editCourseName.setFocusable(false);
        editCourseName.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        editCourseName.setForeground(new Color(0xff7c1f));
        editCourseName.setBackground(new Color(0x067eed));
        editCourseLabel.setBounds(0,100,400,60);
        editCourseTextField.setBounds(400,100,400,60);
        editCourseName.setBounds(600,100,100,60);
        JPanel a3 = new JPanel();
        a3.setLayout(null);
        a3.add(editCourseLabel);
        a3.add(editCourseTextField);
        a3.add(editCourseName);
        a3.setVisible(false);
        a3.setBounds(0, 100, 985, 621);
        editCourse.addActionListener(e -> {
            adminPanel.setVisible(false);
            a3.setVisible(true);
            title.setText("Edit course name");
        });
        add(a3);


        JLabel editModuleLabel = new JLabel("Enter module name: ");
        editModuleLabel.setFont(new Font("Comic Sans", Font.PLAIN, 40));
        JTextField editModuleTextField = new JTextField();
        editModuleTextField.setPreferredSize(new Dimension(500, 60));
        editModuleTextField.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        JButton editModuleName = new JButton("✔");
        editModuleName.setPreferredSize(new Dimension(100, 60));
        editModuleName.setFocusable(false);
        editModuleName.setFont(new Font("Comic Sans", Font.PLAIN, 28));
        editModuleName.setForeground(new Color(0xff7c1f));
        editModuleName.setBackground(new Color(0x067eed));
        JPanel a4 = new JPanel();
        a4.setLayout(new FlowLayout(FlowLayout.LEADING));
        a4.add(editModuleLabel);
        a4.add(editModuleTextField);
        a4.add(editModuleName);
        a4.setVisible(false);
        a4.setBounds(0, 100, 985, 621);
        editModule.addActionListener(e -> {
            adminPanel.setVisible(false);
            a4.setVisible(true);
            title.setText("Edit module name");
        });
        add(a4);

        back.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK));
        back.addActionListener(e -> {
                adminPanel.setVisible(false);
                studentPanel.setVisible(false);
                instructorPanel.setVisible(false);
                a1.setVisible(false);
                a2.setVisible(false);
                mainMenu.setVisible(true);
                title.setText("Main Menu");

        });
        JMenuBar header = new JMenuBar();
        header.add(file);
        setJMenuBar(header);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }

}
