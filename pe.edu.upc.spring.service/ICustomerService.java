package pe.edu.upc.spring.service;

import java.util.List;

import pe.edu.upc.spring.model.Customer;


public interface ICustomerService {
	public boolean insert(Customer customer);

	public boolean update(Customer customer) ;

	public void delete(int idcustomer) ;

	List<Customer> listar() ;

	List<Customer> buscarNombreCustomer(String nameCustomer);

	List<Customer> buscarDniCustomer(String dniCustomer);

	List<Customer> buscarIdCustomer(int idCustomer);


}
