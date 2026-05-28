class RegularStudent extends Student {

    RegularStudent(int id, String name, double marks) {
        super(id, name, marks);
    }

    @Override
    String grade() {

        if (getMarks() >= 80)
            return "A";

        else if (getMarks() >= 60)
            return "B";

        else
            return "C";
    }
}
