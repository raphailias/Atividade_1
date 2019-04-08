public class Main {
    public static void main(String[] args) {

        Cartoes c1 = new Cartoes(0.2,1234,"VISA","NUBANK",1,300219,0225,766,1702,5502,454545);
        Cartoes c2 = new Cartoes(0.2,55,"MasterCard","NUBANK",2,300219,0244,566,5421,56589,21025);
        Cartoes c3 = new Cartoes(0.2,22,"MasterCard","Nubank",1,300118,0304,999,5641,55789,22385);
        Carteiras car1 = new Carteiras(22,"charlote",453,c1,c2);
        Carteiras car2 = new Carteiras(33,"bendita",5555,null,c3);
        Usuarios u1 = new Usuarios("carlos","carlos@gmail.com",46686642,"17/02/1998",c1,c2,car1);
        Usuarios u2 = new Usuarios("Robson","robsonplay@gmail.com",36536,"05/02/90",c3,null,car2);
        Vendas v1 = new Vendas(u1,car1,c1,1500);
        Vendas v2 = new Vendas(u2,car2,c3,3000);
        System.out.println(v1.vendas());
        System.out.println(u1.pegarDados());
        System.out.println(v2.vendas());
        System.out.println(u2.pegarDados());






    }

}
