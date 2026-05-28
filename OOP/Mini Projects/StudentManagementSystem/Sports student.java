class SportsStudent extends Student {

    SportsStudent(int id, String name, double marks) {
        super(id, name, marks);
    }

    @Override
    String grade() {

        if (getMarks() >= 75)
            return "A";

        else if (getMarks() >= 50)
            return "B";

        else
            return "C";
    }
}
