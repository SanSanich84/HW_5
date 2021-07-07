package HomeWork_5;



public class employee {
   String FIO, position, eMail, telephone;
   Float salary;
   Integer age;


    public void consoleOut(){
        System.out.println(" Ф.И.О.: " + this.FIO + "\n " + "Возраст: " + this.age + "\n " + "Должность: " + this.position + "\n " + "Зарплата: " + this.salary + " руб. " + "\n " + "Номер телефона: " + this.telephone + "\n " + "Адрес электронной почты: : " + this.eMail);
        System.out.println();
    }
}
