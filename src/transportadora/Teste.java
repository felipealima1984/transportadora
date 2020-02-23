package transportadora;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Transportadoras t1 = new Transportadoras();
		t1.setEmail("teste@teste.com");
		t1.setNome("Teste 1");
		t1.setEmpresa("Empresa 1");
		t1.setTelefone("8182828282");
		t1.setCelular("81818181811");
		t1.setWhatsapp("81982828282");
		t1.setModal("Modal teste 1");
		t1.setCep("53456-234");
		t1.setUf("UF");
		t1.setCidade("Recife");
		t1.setBairro("Centro");
		t1.setEndereco("Rua de teste");
		t1.setNumero("71");
		
		Controller con = new Controller();
		//Salva o teste
		//con.salvar(t1);
		//remove o teste
		//con.remover(t1);
		
		List<Transportadoras> transportadoras = con.listar();
		
		for (int i = 0; i < transportadoras.size(); i++) {
			System.out.println(transportadoras.get(i).getEmpresa() + transportadoras.get(i).getTelefone() + transportadoras.get(i).getWhatsapp() + transportadoras.get(i).getEmail()  );
		}

	}

}
