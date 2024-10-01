public class Main {
    public static void main(String[] args) {
        Aile benimAilem = new Aile();

        AileUyesi kayinbaba = new AileUyesi("Raşit",50,"Baba");
        AileUyesi anne = new AileUyesi("Songül",40,"Anne");
        AileUyesi kardes = new AileUyesi("Burak",15,"kardeş");
        AileUyesi kardes1 = new AileUyesi("Ömer",19,"kardeş");
        AileUyesi es = new AileUyesi("Batuhan",26,"Eş");


        benimAilem.addUye(kayinbaba);
        benimAilem.addUye(anne);

        benimAilem.addUye(kardes);
        benimAilem.addUye(kardes1);
        benimAilem.addUye(es);

        benimAilem.printFamilyInfo();
    }
}