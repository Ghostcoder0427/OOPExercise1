package oopexercise1;

/**
 * @author Best Friend @ Racque Cordeta|Ronald Velasquez Reforma
 */
class Bicycle {
// Data Member

    private String ownerName;
    private String tagNo;

//Constructor: Initialzes the data member
    public Bicycle() {
        ownerName = "Unknown";
    }

    public Bicycle(String tagNo, String name) {
        this.tagNo = tagNo;
        ownerName = name;
    }
//Returns the name of this bicycle's owner

    public String getOwnerName() {
        return ownerName;
    }
//Assigns the name of this bicycle's owner

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String gettagNo() {
        return tagNo;
    }

    public void settagNo(String tagNo) {
        this.tagNo = tagNo;
    }

}
