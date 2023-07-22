import java.util.*;

public class prac{
    public void calc(int id){
        int[] EmpId = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
		String[] EmpName = { "Abc", "Opqr", "Ghi", "Wxyz", "Jklmn", "Stuv", "Def" };
		String[] JoinDate = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000","12/06/2006" };
		char[] DesigCode = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
		String[] Department = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
		double[] Basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
		double[] HRA = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
		double[] IT = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
		char[] DesignationCode = { 'e', 'c', 'k', 'r', 'm' };
		String[] Designation = { "Engineer", "Consultant", "Clerk", "Receptionist", "Manager" };
		double[] DA = { 20000, 32000, 12000, 15000, 40000 };
        for (int i = 0; i < EmpId.length; i++) {
			if (EmpId[i] == id) {
				System.out.println("Emp Id\tEmp Name  Department\tDesignation\tDA\tSalary");
				System.out.print(EmpId[i]+"\t"+EmpName[i]+"\t\t"+Department[i]);
				for (int j = 0; j < DesignationCode.length; j++) {
					if (DesigCode[i] == DesignationCode[j]) {
						System.out.print("\t"+Designation[j]+"\t"+DA[i]+"\t");
						double sum = Basic[i]+HRA[i]+DA[j]-IT[i];
						System.out.println(sum);
					}
				}
			}
		}
    }

	public static void main(String[] args) {
        prac obj = new prac();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
        switch (id) {
            case 1001: obj.calc(id); break;
            case 1002: obj.calc(id); break;
            case 1003: obj.calc(id); break;
            case 1004: obj.calc(id); break;
            case 1005: obj.calc(id); break;
            case 1006: obj.calc(id); break;
            case 1007: obj.calc(id); break;
            default:
                System.out.println("There is no employee with EmpId: " + id);
                break;
        }
	}
}
