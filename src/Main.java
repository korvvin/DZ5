public class Main {
    public static void main(String[] args) {
    //task1
        String firstName ="Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName+' '+firstName+' '+middleName;
        System.out.println("ФИО сотрудника — "+fullName);
    //task2
        String upName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+upName);
    //task3
        fullName = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника — "+fullName);
    }
}