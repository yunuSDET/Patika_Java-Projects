package Task_039_StudentGradingSystem;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    double matVerbalWeight; // Matematik dersi sözlü not ağırlığı
    double fizikVerbalWeight; // Fizik dersi sözlü not ağırlığı
    double kimyaVerbalWeight; // Kimya dersi sözlü not ağırlığı

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya,
            double matVerbalWeight, double fizikVerbalWeight, double kimyaVerbalWeight) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matVerbalWeight = matVerbalWeight;
        this.fizikVerbalWeight = fizikVerbalWeight;
        this.kimyaVerbalWeight = kimyaVerbalWeight;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int matVerbal, int fizikVerbal, int kimyaVerbal) {
        // Diğer not eklemeleri
        // ...

        // Sözlü notları ağırlıklarıyla çarp
        if (matVerbal >= 0 && matVerbal <= 100) {
            this.mat.note = (int) (mat * (1 - matVerbalWeight) + matVerbal * matVerbalWeight);
        }

        if (fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.fizik.note = (int) (fizik * (1 - fizikVerbalWeight) + fizikVerbal * fizikVerbalWeight);
        }

        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimya.note = (int) (kimya * (1 - kimyaVerbalWeight) + kimyaVerbal * kimyaVerbalWeight);
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
