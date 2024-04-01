import java.util.ArrayList;

    class Student {
        public String fname;
        public String iname;
        public String indexNumber;
        public String email;
        public String address;
        public ArrayList<Double> grades = new ArrayList<>();

        public Student(String fname, String iname, String indexNumber, String email, String address) {
            this.fname = fname;
            this.iname = iname;
            this.indexNumber = indexNumber;
            this.email = email;
            this.address = address;
        }


            public double LiczenieSumy () {
                int suma = 0;
                for (double num : grades) {
                    suma += num;
                }
                return suma;
            }

            public double Srednia () throws IllegalArgumentException {
                if (this.grades.isEmpty())
                    throw new IllegalArgumentException("Student nie ma ocen");
                else if (grades.size() > 20)
                    throw new IllegalArgumentException("Student może mieć maksymalnie 20 ocen.");
                return LiczenieSumy() / grades.size();
            }
        }

        class StudentGroup {
            public String nazwa;
            public ArrayList<Student> studenci;
            public StudentGroup(String nazwa) {
                this.nazwa = nazwa;
                this.studenci = new ArrayList<>();
            }

            public void dodajStudenta(Student nowystudent) {
                studenci.add(nowystudent);
            }
            public int LiczbaStudentow() {
                return studenci.size();
            }

            public void RozmiarGrup() throws IllegalArgumentException {
                if (LiczbaStudentow() >= 15) {
                    throw new IllegalArgumentException("Maksymalnie 15 studentów w grupie.");
                }
            }
            public void powtorzenia(Student nowystudent)throws IllegalArgumentException {
                for (Student student : studenci) {
                    if (nowystudent.equals(student)) {
                        throw new IllegalArgumentException("Student jest już w grupie.");
                    }
                }
            }
    }