public class Person {

    private String firstName;
    private String lastName;
    private int age=0;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setAge(int age){
        if(age<0 || age>100){
            this.age=0;
        }
        else{
            this.age=age;
        }
    }

    public boolean isTeen(){
        if(this.age>12 && this.age<20){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFullName(){
        if(!firstName.isEmpty() && !lastName.isEmpty()){
            return firstName+ " "+lastName;
        } else if (!firstName.isEmpty() && lastName.isEmpty()) {
            return firstName;

        }
        else{
            return lastName;
        }

    }




}
