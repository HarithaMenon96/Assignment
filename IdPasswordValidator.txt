package com.deloitte;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MyValidator {
 Pattern patternid,patternpass;
 Matcher matcherid,matcherpass;
 String regexid = "^(\\d{3}-?\\d{2}-?\\d{4})$";
 String regexpass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#$%^&*]).{8,}$";
  public MyValidator() {
 patternid = Pattern.compile(regexid);
 patternpass = Pattern.compile(regexpass);
}
 private boolean validateId(String id) {
 matcherid = patternid.matcher(id);
 return matcherid.matches();
 }
 
 private boolean validatePass(String pass) {
 matcherpass = patternpass.matcher(pass);
 return matcherpass.matches();
 }
 
 public static void main(String[] args) {
 MyValidator nv = new MyValidator();
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter ID");
 String id = scan.nextLine();
 boolean validid = nv.validateId(id);
 if(validid) {
  System.out.println("Enter password");
  String pass = scan.nextLine();
  boolean validpass = nv.validatePass(pass);
  if(validpass)
   System.out.println("Username and password valid");
  else
   System.out.println("Passwod Invalid");
 }
 else
  System.out.println("Username not valid");
 }
 
}


