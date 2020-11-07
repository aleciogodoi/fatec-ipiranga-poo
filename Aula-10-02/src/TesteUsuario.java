import java.util.ArrayList;

public class TesteUsuario {

	public static void main(String[] args) {
		
		UsuarioDAO usuDAO1 = new UsuarioDAO();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		
		usuDAO1.insert(new Usuario (101,"Ana","ana@gmail.com","(11) 5555-0000","Rua abc, 1542"));
		usuDAO1.insert(new Usuario (102,"Beatriz","beatriz@gmail.com","(11) 2222-0000","Rua Xpto, 1542"));
		usuDAO1.insert(new Usuario (103,"Antonio","antonio@gmail.com","(11) 4444-0000","Rua Ykm, 42"));
		usuDAO1.insert(new Usuario (104,"Carlos","carlos@gmail.com","(11) 1111-0000","Rua Arilindo, 21"));
			
		usuarios = usuDAO1.getUsuarios();
		for (Usuario usuario: usuarios) {
			System.out.println(usuario);
		}

		
		/*
		Usuario usu1 = new Usuario();
		UsuarioDAO usuDAO1 = new UsuarioDAO();

		usu1 = usuDAO1.select("b","nome");
		System.out.println(usu1);

		usu1 = usuDAO1.select("x","email");
		System.out.println(usu1);
		
		usu1 = usuDAO1.select(1001);
		System.out.println(usu1);

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = usuDAO1.getUsuarios();
		
		System.out.println(usuarios.toString());
		
		/*
		usu1.setIdUsuario(1001);
		usu1.setNome("Alécio");
		usu1.setEndereco("Rua abc, 123");
		usu1.setTelefone("(11)9999-0182");
		usu1.setEmail("alecio.godoi@gmail.com");
		
		
		usuDAO1.insert(usu1);
		
		//usu1.setEndereco("Rua Jaboatão, 12 Apto 1038");
		//usuDAO1.update(usu1);
		
		//usuDAO1.delete(usu1.getIdUsuario());
		 
		*/
	}

}
