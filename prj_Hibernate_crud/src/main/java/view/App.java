package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	String txtId  = JOptionPane.showInputDialog( "Digite o Registro do Cliente: " );
    	int regID = Integer.parseInt(txtId);
    	String txtCPF = JOptionPane.showInputDialog( "Digite CPF do Cliente (000.000.000-000): " );
    	String txtRG = JOptionPane.showInputDialog( "Digite RG do Cliente: " );
    	String txtNome = JOptionPane.showInputDialog( "Digite o nome do cliente: " );
    	String txtNasc = JOptionPane.showInputDialog( "Digite A data de Nascimento do Cliente: " );
    	
    	 Cliente cliente = new Cliente();
         cliente.setCpf(txtCPF);
         cliente.setId(regID);
         cliente.setNome(txtNome);
         cliente.setRg(txtRG);
         cliente.setNasc(txtNasc);
         ClienteJpaDAO.getInstance().merge(cliente);
         System.out.println("Objetos salvo com sucesso!!!");
    }
}
