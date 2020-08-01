class Student {
    //instance variables

    private String first;
    private String middle;
    private String last;

    //setNames which set the instance variables
    public void setNames(String first, String middle, String last) {
        this.first  = first;
        this.middle = middle;
        this.last = last;
    }

    //return "First Name" + "Middle name initial" + "Last Name"

    public String getFullName() {
        return first + " " + middle.charAt(0) + ". " + last;
    }

}