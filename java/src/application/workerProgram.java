package application;

import entities.HourContract;
import entities.Worker;
import entities.workerDepartment;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class workerProgram {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.print("Digite o departamento do empregado: ");
        String departmentName = sc.nextLine();
        System.out.print("Digite os dados do empregado: ");
        System.out.println();
        System.out.print("Nome: ");
        String workerName = sc.nextLine();;
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Salário base: ");
        Double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new workerDepartment(departmentName));

        System.out.print("Quantos contratos possui? ");
        int n = sc.nextInt();

        for (int i=1; i<n+1; i++) {
            System.out.println("Digite os dados do #" + i + " contrato");
            System.out.print("Data (DD/MM/AAAA): ");
            sc.nextLine();
            Date contractDate = sdf.parse(sc.nextLine());
            System.out.print("Valor por hora: ");
            Double contractHourValue = sc.nextDouble();
            System.out.print("Horas trabalhadas: ");
            Integer contractHours = sc.nextInt();

            HourContract newContract = new HourContract(contractDate, contractHourValue, contractHours);
            worker.addContract(newContract); //ASSOCIA O CONTRATO COM O TRABALHADOR
        }

        System.out.println();
        System.out.print("Digite o mês para busca (MM/AAAA): ");
        String readMonth = sc.next();
        int mes = Integer.parseInt(readMonth.substring(0, 2)); //recorta mes
        int ano = Integer.parseInt(readMonth.substring(3)); //recorta ano
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println(worker.income(ano, mes));

        sc.close();
    }

}
