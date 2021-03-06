package edu.iu.order.service.dao;

import java.util.List;

import edu.iu.order.service.entity.Customer;
import edu.iu.order.service.entity.Orders;

public interface EntityDAO {

	public void saveEntity(Object entity) throws Exception;
	
	public List<Customer> getCustomers() throws Exception;
	
	public List<Orders> getOrdersForCustomer(Integer customerId) throws Exception;
}
