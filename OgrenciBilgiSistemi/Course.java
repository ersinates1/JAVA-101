package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozlu;

    Course(String name,String code,String prefix) {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        double note=0;
        double sozlu=0;

    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }
    void printTeacher(){
        this.teacher.print();
    }
}

