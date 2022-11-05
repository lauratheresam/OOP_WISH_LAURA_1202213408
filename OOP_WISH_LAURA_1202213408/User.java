public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String Name;
    Int Number;

    public void setName (String Name){
        this.Name = Name;
    }

    public void setNumber (Int Number){
        this.Number = Number;
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void message () {
        system.out.println("Name = " + Name);
        system.out.println("Phone number = " + Number);
        system.out.println("You are succesfully registered!");
    }


}
