package Fabrica;




/**
 *
 * @author Usuario
 */
public class Carro2 {
    public static void main(String[] args) {
       Carro meuCarro= new Carro("Roxo","Trilha","AXD 1826",4);     
       Carro criouCarro = new Carro();
       Pessoa person  = new Pessoa();
        System.out.println("A cor do caro é: "+ meuCarro.getCor()+"\nO tipo é: "+ meuCarro.getModelo()+"\nA placa é: "+meuCarro.getPlaca()+"\nNumero de portas é: "+meuCarro.numeroDePortas());
         meuCarro.setDono(person);
         person.setNome("Leonardo");
         person.setIdade(38);
         person.setSexo("Masculino");
          System.out.println("Propietario: "+meuCarro.getDono().getNome());
          System.out.println("Idade do propietario: "+meuCarro.getDono().getIdade());
          System.out.println("Sexo: "+meuCarro.getDono().getSexo());
          person.setCarro(criouCarro);
          person.ligarCarro();
          person.setCambioCarro(2);
          meuCarro.setFarol(true);
          meuCarro.getFarol();
    }
}
