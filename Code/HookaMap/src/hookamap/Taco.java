/*
 * Program:HookaMap
 * This:Taco.java
 * Author:Nicholas Johnston
 * Date:4/11/2016
 * Purpose:Something something something
 */
package hookamap;

import java.util.Objects;

/**
 *
 * @author thedo
 */
public class Taco 
{
    int id;
    String name;
    
    public Taco(String name, int id)
    {
        this.name =name;
        this.id = id;
    }
    public String toString()
    {
        return(id + ": " + name);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Taco other = (Taco) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
