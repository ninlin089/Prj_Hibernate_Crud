package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "cliente")
public class Cliente {
 
         @Id
         private int id;
         @Column
         private String nome;
         @Column
         private String cpf;
         @Column
         private String rg;
         @Column
         private String data_nasc;
         
         public int getId() {
                   return id;
         }
         public void setId(int id) {
                   this.id = id;
         }
         public String getNome() {
                   return nome;
         }
         public void setNome(String nome) {
                   this.nome = nome;
         }
         public String getCpf() {
                   return cpf;
         }
         public void setCpf(String cpf) {
                   this.cpf = cpf;
         }
         public String getRg() {
                   return rg;
         }
         public void setRg(String rg) {
                   this.rg = rg;
         }
         
         public String getNasc() {
        	 return data_nasc;
         }
         
         public void setNasc(String Nasc) {
        	 this.data_nasc = Nasc;
         }
}