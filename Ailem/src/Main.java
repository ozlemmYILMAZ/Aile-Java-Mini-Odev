public class Main {
    public static void main(String[] args) {
        Aile benimAilem = new Aile();

        AileUyesi baba = new AileUyesi("Ali",50,"Baba");
        AileUyesi anne = new AileUyesi("Gül",40,"Anne");
        AileUyesi kardes = new AileUyesi("Barış",15,"kardeş");
        AileUyesi kardes1 = new AileUyesi("Mehmet",19,"kardeş");
        AileUyesi es = new AileUyesi("Efe",26,"Eş");


        benimAilem.addUye(baba);
        benimAilem.addUye(anne);

        benimAilem.addUye(kardes);
        benimAilem.addUye(kardes1);
        benimAilem.addUye(es);

        benimAilem.printFamilyInfo();
    }
}
