package Modell;

public interface DAO<T> {

public void Excluir(T id);
public void Alterar(T usuario);
public void Incluir(T usuario);
public Usuario Buscar(T id);
public Usuario BuscarTodos(T usuario);

}
