public class Student {

        private String name;
        private String surname;
        private String patronymic;
        private int[] marks = new int[3];

        Student(String name,String surn, String pat){
            this.name = name;
            this.surname = surn;
            this.patronymic = pat;
        }


/// Get and Set methods //

        public void setInfoMark(int mark){
            this.marks[0] = mark;
        }
        public void setMathMark(int mark){
            this.marks[1] = mark;
        }
        public void setAlgMark(int mark){
            this.marks[2] = mark;
        }


        public String getName() {
            return this.name;
        }
        public String getSurname(){
            return this.surname;
        }
        public String getPatronymic(){
            return this.patronymic;
        }
        public String getFullName(){
            return this.name+" "+this.surname+" "+this.patronymic;
        }
        public String getShortName() {
            return this.surname + " " + this.name.charAt(0) + "." + this.patronymic.charAt(0) + ".";
        }
        public String getInfoMark(){
            return "Информатика: "+marks[0];
        }
        public String getMathMark(){
            return "Мат анализ: "+marks[1];
        }
        public String getAlgMark(){
            return "Алгебра: "+marks[2];
        }




    }

