
/* package whatever //do not write package name here */

import java.io.*;

abstract class College {
    abstract void syllabus();

    abstract void exams();
}

class Btech extends College {
    void syllabus() {
        System.out.println(" java , CPP , python, DSA");
    }

    void exams() {
        System.out.println(" we have 16 exam in btech");
    }
}

class Bcom extends College {
    void syllabus() {
        System.out.println(" Math , english, computer basic");
    }

    void exams() {
        System.out.println(" we have 12 exam in Bcom");
    }
}

class Arts extends College {
    void syllabus() {
        System.out.println("Poly sci. , history, geo. , math");
    }

    void exams() {
        System.out.println(" we have 12 exams in arts");
    }
}

class Commers extends College {
    void syllabus() {
        System.out.println(" Tally , basic of math , computer basic");
    }

    void exams() {
        System.out.println(" we have 08 exams in commers");
    }
}

class Abstarctclass {
    public static void main(String[] args) {
        Arts a1 = new Arts();
        Commers c1 = new Commers();
    }
}
