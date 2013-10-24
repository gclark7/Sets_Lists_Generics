package comparisons;


import java.util.*;


/**
 * Taken from GenericsAndSets from Jim L.
 * play with implements Comparable
 * override compareTo(Object target);
 * @author gclark7
 */
public class EmployeeComparisons implements Comparable{
    private String lastName;
    private String firstName;
    private String ssn;

    public EmployeeComparisons(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeeComparisons other = (EmployeeComparisons) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

    /**
     * 10/24/2013 playing with the comparesTo() method
     * @param o
     * @return comparable int result: -1,0,1
     */
    public int compareTo(Object o){
        /**
         * Strings have a built in compareTo() method
         * If we use a String as a comparison we can call the String attribute to compareTo()
         * as the return.<br/>
         * 
         * Otherwise we need to write code to compare an object to an object
         * We can use a 3rd party library :: Apache Jarkarta Commons Lang
         */
        
        //must cast Object to the appropriate object
        final int BEFORE=-1;
        final int SAME=0;
        final int AFTER=1;
        
        int result=0;
        
        return result;
    }
    
}
