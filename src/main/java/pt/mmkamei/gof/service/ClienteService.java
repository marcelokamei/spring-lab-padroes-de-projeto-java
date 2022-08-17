package pt.mmkamei.gof.service;

import pt.mmkamei.gof.model.Cliente;

/**
 * Interface que define o padrao Strategy no domínio de cliente.
 * Com isso, se necessário, podemos ter múltiplas implementações dessa mesma interface.
 *
 * @author marcelokamei
 */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
