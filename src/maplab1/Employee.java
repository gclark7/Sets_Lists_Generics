package maplab1;

import java.util.*;

//This is for the CompareToBuilder
import org.apache.commons.lang3.builder.CompareToBuilder;//Apache Jakarta Commons Lang
/**
 * Taken from GenericsAndSets from Jim L.
 * play with implements Comparable
 * override compareTo(Object target);
 * @author gclark7
 */
public class Employee implements Comparable{
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

    @Override
    public int compareTo(Object o) {
        /*
         * comparTo uses the integers -1, 0, 1 to produce the result before, same, after
         */
        Employee other = (Employee)o;
        
        return new CompareToBuilder()
               .append(this.ssn, other.ssn)
               .toComparison();
    }


    
}
