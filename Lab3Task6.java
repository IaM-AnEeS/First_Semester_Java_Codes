
public class Lab3Task6 {
    public static void main(String[] args) {
     double job_salary=(5*7*24)*15.50;
        System.out.println("The money you earn in 5weeks before tax :  $"+job_salary);
        double tax=(job_salary*14)/100;
        System.out.println("Tax on your salary : $"+tax);
        double After_tax=job_salary-tax;
        System.out.println("Your salary after tax : $"+After_tax);
        double clothes=After_tax*10/100;
        System.out.println("Money you spend on clothes and buying other accessories : $"+clothes);
        double School_supplies=((After_tax-clothes)*1)/100;
        System.out.println("Money you spend to buy school supplies : $"+School_supplies);
        double Savings_bonds=(((After_tax-clothes)-School_supplies)*25)/100;
        System.out.println("Money you spend to buy Savings bonds : $"+Savings_bonds);
        double Parents_bonds=(Savings_bonds*0.50);
        System.out.println("Money your parents spends to buy additional saving bonds : $"+Parents_bonds);
        double AmountLeft=((((After_tax-clothes)-School_supplies)-Savings_bonds)-Parents_bonds);
        System.out.println("Money left : $"+AmountLeft);




    }
}
