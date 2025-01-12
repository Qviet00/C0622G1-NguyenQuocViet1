package ss_19_String_Regex.Post3.model;

import ss_16_IO_Text_File.Post3.model.Person;

public class Teacher extends Person {
    private String qualification;

    public Teacher() {
    }

    public Teacher(String qualification) {
        this.qualification = qualification;
    }



    public Teacher(int id, String name, String dateOfBirth, String sex, String qualification) {
        super(id, name, dateOfBirth, sex);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s",this.getId(),this.getName(),this.getDateOfBirth(),this.getSex(),this.qualification);
    }
}
