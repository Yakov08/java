package authors;

public class Author {
    private char gender;
    private String email;
    private String name;
    public Author(char gender, String name, String email){
        this.gender = gender;
        this.name = name;
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                ", name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender + '}';
    }
}