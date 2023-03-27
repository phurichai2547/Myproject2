package exam;

import java.lang.reflect.Method;

import exam.person2.isInvalid;
// 2 //
public class Department {
    private final String title ; 
    private final int code ;
    Person[] staff ;
    private int count ;
    private static int nextcode = 400 ;
// 2.1 //    
public Department(String title) {
        this.title = isInvalid(title) ? "SUKHON" : title  ; 
        // " isinvalid " เอาไว้เช็คค่า null || blank ถ้า default ให้ returnเป็นชื่อรร.เก่า ถ้าไม่ deflaut ใส่ค่า title //       
        this.code = nextcode++ ;
        staff = new Person[10+24] ;
    }
// 2.2 //
public String getTitle() {
    return title;
}

public int getCode() {
    return code;
}

public int getCount() {
    return count;
}
// 2.3 //
public boolean addStaff(String firstname , String lastname , int type) {
    if (count == this.staff.length && isInvalid(firstname) && isInvalid(lastname))
    return false;
    staff[count++] = new Person(firstname, lastname, type) ; // เหมือนกับ person // 
    return true ; 
} 
    private boolean  isInvalid (String name) { // link มาจาก person เพื่อดักจับค่า null || blank //
    return name == null || name.isBlank();
} 
// 2.4 //
public int getTypeCount (int type) {
    int result = 0 ;
    for (int i = 0; i < this.count; i++) {
        if (staff[i].getType() == type)
        result++;
    }
    return result;
}
// 2.5 //
public int[] getAllCodes {
   if (count == 0)
   return null;
   int [] result = new int [count] ;
   for (int i = 0; i < this.count; i++) {
    result[i] = staff[i].getCode() ;
   } 
   return result ;
}
// 2.6 //
public Person getStaff (int code) {
    for (int i = 0; i < this.count; i++) {
        if (this.staff[i].getcode() == code)
        return staff[i] ;
    }
    return null ;
}
// 2.7 //
@Override
public String toString() {
    return String.format(format :"[Department: %d (%s) %d", this.code , this.title , this.count) ;
}
// 2.8 //
public int[] getAllTypes() {
    if (count == 0)
    return null ;
    int[] tame = new int[this.count] ;
    for (int i = 0; i < this.count; i++) {
        tame[i] = staff[i].getType() ;
    }
    Array.sort(tame) ;
    int size = 0 ;

    for (int i = 0; i < this.count; i++) {  //[1,1,1,2,3,4]
        if (tame[size] != tame[i])
            tame[++size] = tame[i] ;
    }
    return Arrays.copyOfRange(tame , from:0 , size) ;
}
}