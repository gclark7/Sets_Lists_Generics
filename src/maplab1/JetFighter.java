/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maplab1;

import java.util.Objects;

/**
 *
 * @author gclark7
 */
public class JetFighter {
    private final int MAX_THRUST=20;
    private final int MIN_THRUST=1;
    private final int MAX_WEIGHT=5000;
    private final int MIN_WEIGHT=2000;
    private int thrust;
    private int weight;
    private String name;
    private String jetID;
    public static int jetCount=0;
    
    public JetFighter(String name){
        jetCount++;
        thrust=MIN_THRUST;
        weight=MIN_WEIGHT;
        this.name=name;
        jetID=name+jetCount;
        
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJetID() {
        return jetID;
    }

    public void setJetID(String jetID) {
        this.jetID = jetID;
    }

    public static int getJetCount() {
        return jetCount;
    }

    public static void setJetCount(int jetCount) {
        JetFighter.jetCount = jetCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.jetID);
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
        final JetFighter other = (JetFighter) obj;
        if (!Objects.equals(this.jetID, other.jetID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JetFighter{" + "name=" + name + ", jetID=" + jetID + '}';
    }
    
    
    
}
