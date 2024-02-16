public class Student {
    public long studentId;
    public String courseCode;
    public long semester;
    public long grade;
    public String status;

    public Student(long studentId, String courseCode, long semester, long grade, String status) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.semester = semester;
        this.grade = grade;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courseCode='" + courseCode + '\'' +
                ", semester=" + semester +
                ", grade=" + grade +
                ", status='" + status + '\'' +
                '}';
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public long getSemester() {
        return semester;
    }

    public void setSemester(long semester) {
        this.semester = semester;
    }

    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
