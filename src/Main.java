import java.util.Scanner;
/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/
public class Main {
    public static void main(String[] args){

        String userName, sys_userName="patika", password, sys_password="java";
        Scanner inp = new Scanner(System.in);

        System.out.print("Username: ");
        userName = inp.nextLine();
        System.out.print("Password: ");
        password = inp.nextLine();

        if(userName.equals(sys_userName) && password.equals(sys_password)){
            System.out.println("You entered the system.");
        }
        else if (userName.equals(sys_userName) && !password.equals(sys_password)){
            System.out.println("Invalid password");
            System.out.print("If you want to reset your password enter 'y': ");
            String control = "y", q_control;
            q_control = inp.nextLine();
            if(q_control.equals(control)){
                System.out.print("Enter your new password: ");
                //String tempPassword = inp.nextLine();
                password = inp.nextLine();
                if(password.equals(sys_password)){
                    System.out.println("Could not create password!");
                }else {
                    System.out.println("Password is created.");
                    sys_password = password;
                }
            }
            else {
                System.out.println("Session done.");
            }
        }
        else{
            System.out.println("Your informations are invalid.");
        }

    }
}