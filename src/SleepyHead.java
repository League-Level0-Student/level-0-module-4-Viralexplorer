//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         */
        
         int week= JOptionPane.showConfirmDialog(null, "is it a weekday? ", "",JOptionPane.YES_NO_OPTION);
        
         System.out.println(week);
     
         int vacation= JOptionPane.showConfirmDialog(null, "is it a vacatiom? ", "",JOptionPane.YES_NO_OPTION);
         
         System.out.println(vacation);
    
         
if (week==0 && vacation==1){
	JOptionPane.showMessageDialog(null, "Wake up sleepy head");
}
if(vacation ==0 && week==1 ){
	JOptionPane.showMessageDialog(null, "sleep in");
}
        /*
         * Print "sleep in" if it is a vacation or a weekend. If it's a weekday,
         * print "get up lazybones!" If it is a weekday, and we are on vacation,
         * print "sleep in".
         */
    }
}
