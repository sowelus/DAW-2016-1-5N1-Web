
package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Cidade;
import java.io.Serializable;

/**
 *
 * @author Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 */
public class CidadeDAO<T> extends DAOGenerico<Cidade>implements Serializable {

    public CidadeDAO(){
        super();
        super.setClassePersistente(Cidade.class);
        super.setOrdem("nome");// ordem padrão
    }

}
