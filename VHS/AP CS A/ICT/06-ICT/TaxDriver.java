public class TaxDriver
{
    public static void main(String[] args)
    {
        Taxes tax = new Taxes(30.0,12.35);
        System.out.println("McGuigy's Tax Readout");
        System.out.println();
        System.out.println("Hours worked: \t\t" + tax.getHoursWorked()+" hrs");
        System.out.println("Hourly rate: \t\t$" + tax.getHourlyRate());
        System.out.println();
        System.out.println("GrossPay: \t\t$" + tax.getGrossPay());
        System.out.println();
        System.out.println("Federal Tax (" + tax.getFEDTAX()*100 + "%):\t$" + tax.getFedTax());
        System.out.println("FICA Tax (" + tax.getFICA()*100 + "%): \t$" + tax.getFicaTax());
        System.out.println("State Tax (" + tax.getSTATETAX()*100 + "%): \t$" + tax.getStateTax());
        System.out.println();
        System.out.println("Net Pay: \t\t$" + tax.calcNetPay());
    }
}