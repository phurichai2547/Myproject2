/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam;

import java.text.Format;
import java.util.concurrent.locks.Condition;

// field //
public class person2 {
    private final int code ;
    private String firstname ;
    private String lastname ;
    private final int type ;
    private static int nextCode = 65 ; // the last three digit //
    private final static int DefaultType = 1 ;

    // constructer  1.1 //
public person2 (String firstname , String lastname , int type) {
    this.code = naxtcode++ ;
    this.firstname = isInvalid(firstname) / Conditional / ? "Phuri" /*(if it true do this) */ : firstname /*(if it false do this) */
    this .lastname = isInvalid(lastname) ? "Chainikhom" : lastname ;
    this.type = type<0 ? DefaultType : type ;
}

// constructer 1.2 //
private boolean  isInvalid (String name) {
    return name == null || name.isBlank();
}

// 1.3 //
public int getCode() {
    return code ;
}
public String getfirstname {
    return firstname ;
}
public String getlastname {
    return lastname ;
}
public int gettype() {
    return type ;
}

public void setFirstname(String firstname) {
    if (!isInvalid(firstname)) this.firstname = firstname;
}

public void setLastname(String lastname) {
    if (!isInvalid(lastname)) this.lastname = lastname;
}

// 1.4 //
@Override
public String toString() {
    return String format (format: "Person2 : %d (%s %s) %d , code,firstname,lastname,type") ;
}


// 1.5 //
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        person2 other = (person2) obj;
        if (code != other.code)
            return false;
        return true;
    }








}


