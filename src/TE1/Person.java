package TE1;

/**
 * * @author      Abrahem Gh
 */
public class Person{
    private  String name;
    /**
     * Constructs a Person with no name in it.
     */
    public Person(){

    }

    /**
     * Returns the name.
     *
     * @return  the name of the person currently
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name of the Person Object.
     * The {@code name} argument length must be nonempty
     *
     * @param      name   the name to  be set.
     * @throws     NullPointerException  if the
     *               {@code name} argument is null.
     *
     * @throws     IllegalArgumentException if the {@code name} argument is empty
     */
    public void setName(String name) {
        if(name== null ){
            throw new NullPointerException();
        } else
        if (name.isEmpty()){
            throw new IllegalArgumentException();
        }else
            this.name = name;
    }
    /**
     * Prints  "My name is" + the name in current object
     */
    public void  writeName(){
        Printer.YELLOW_BRIGHT("My name is "+this.getName());
    }
}
