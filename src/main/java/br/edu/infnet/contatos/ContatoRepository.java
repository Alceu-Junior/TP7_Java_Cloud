/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.contatos;

import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Repository;


@Repository
public class ContatoRepository {
    
    private HashMap<Integer, Contato> contatos;
    
    public ContatoRepository() {
        contatos = new HashMap<>();
        contatos.put(1, new Contato(1, "Alceu Lima", "alceu@alceu.com", "43331212"));
        contatos.put(1, new Contato(2, "Osvaldo Inf", "osvaldo@alceu.com", "43431212"));
        contatos.put(1, new Contato(3, "Renan Inf", "renan@alceu.com", "43331232"));
    }
    
    public Collection<Contato>listar() {
        
        return this.contatos.values();
    }
    
    public Contato obter(int id) {
        
        return this.contatos.get(id);
    }
    
}
